package day11.task1;

public class Warehouse {
    private long countPickedOrders;
    private long countDeliveredOrders;

    public long getCountPickedOrders() {
        return countPickedOrders;
    }

    public long getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    @Override
    public String toString() {
        return "Количество собранных заказов " + countPickedOrders + " доставленных заказов " + countDeliveredOrders;
    }

    public void addPickedOrder() {
        countPickedOrders ++;
    }

    public void addDeliveredOrder() {
        countDeliveredOrders ++;
    }
}
