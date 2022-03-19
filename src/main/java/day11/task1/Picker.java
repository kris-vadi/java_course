package day11.task1;

public class Picker implements Worker {
    private int salary;
    private boolean isPayed;
    Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
        salary = 0;
        isPayed = false;
    }

    public int getSalary() {
        return salary;
    }

    public boolean getIsPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Заработная плата: " + salary + " ,и был ли выплачен бонус: " + isPayed;
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.addPickedOrder();
    }

    @Override
    public void bonus() {
        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }

        if (!isPayed && warehouse.getCountPickedOrders() >= 10000) {
            salary += 70000;
            isPayed = true;
        } else System.out.println("Бонус пока не доступен");

    }
}
