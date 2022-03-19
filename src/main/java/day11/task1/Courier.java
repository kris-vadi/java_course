package day11.task1;

public class Courier implements Worker{
    private int salary;
    private boolean isPayed;
    Warehouse warehouse;

    public Courier(Warehouse warehouse) {
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
        salary += 100;
        warehouse.addDeliveredOrder();
    }

    @Override
    public void bonus() {
        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }

        if (!isPayed && warehouse.getCountDeliveredOrders() >= 10000) {
            salary += 50000;
            isPayed = true;
        } else System.out.println("Бонус пока не доступен");

    }
}
