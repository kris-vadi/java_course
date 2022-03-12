package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Highlander");
        car.setColor("White");
        car.setYear(2016);

        System.out.println("Модель автомобиля: " + car.getModel() +
                "\nавтомобиля: " + car.getColor() +
                "\nГод выпуска автомобиля: " + car.getYear());
        car.info();
        System.out.println(car.yearDifference(2022));

        Motorbike moto = new Motorbike("Honda", "Red", 2006);

        System.out.println("Модель матоцикла: " + moto.getModel() +
                "\nЦвет матоцикла: " + moto.getColor() +
                "\nГод выпуска матоцикла: " + moto.getYear());
        moto.info();
        System.out.println(moto.yearDifference(1989));
    }
}
