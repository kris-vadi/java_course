package day11.task2;

public class Task2 {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Paladin paladin = new Paladin();
        Magician magician = new Magician();
        Shaman shaman = new Shaman();

        warrior.physicalAttack(paladin);//1
        System.out.println(paladin);

        paladin.physicalAttack(magician);//2
        System.out.println(magician);

        shaman.healTeammate(magician);//3
        System.out.println(magician);

        magician.magicalAttack(paladin);//4
        System.out.println(paladin);

        shaman.physicalAttack(warrior);//5
        System.out.println(warrior);

        paladin.healHimself();//6
        System.out.println(paladin);

        System.out.println();
        for (int i = 0; i < 5; i++) {
            warrior.physicalAttack(magician);
            System.out.println(magician);
        }
    }
}
