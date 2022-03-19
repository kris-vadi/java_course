package day11.task2;

public class Paladin extends Hero implements Healer{

    private int healHimself = 25;
    private int healTeammate = 10;

    public Paladin() {
        super();
        physDef = 0.5;
        magicDef = 0.2;
        physAtt = 15;
    }

    @Override
    public void healHimself() {
        if ( health + healHimself <= MAX_HEALTH) {
            health += healHimself;
        } else health = MAX_HEALTH;
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + healTeammate <= MAX_HEALTH) {
            hero.health += healTeammate;
        } else hero.health = MAX_HEALTH;
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}
