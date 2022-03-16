package day7;

public class Airplane {
    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String manufacturer, int year, int length, int weight){
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        fuel = 0;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public double getFuel() {
        return fuel;
    }

    public void info(){
        System.out.println("Изготовитель: " + manufacturer + ", год выпуска: " + year + ", длина: " +
                this.length + ", вес: " + weight + ", количество топлива в баке: " + fuel);
    }

    public void fillUp (int inputFuel){
        fuel += inputFuel;
    }

    public static void compareAirplanes (Airplane airplane1, Airplane airplane2) {
        if (airplane1.length > airplane2.length){
            System.out.println("Длина у первого самолета " + airplane1.manufacturer + "(" + airplane1.year + " года) больше, чем у вторго.");
        } else  if (airplane1.length < airplane2.length){
            System.out.println("Длина у второго самолета " + airplane2.manufacturer + "(" + airplane2.year + " года) больше, чем  у первого.");
        } else {
            System.out.println("Длины самолетов равны");
        }
    }
}
