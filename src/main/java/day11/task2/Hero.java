package day11.task2;

public abstract class Hero implements PhysAttack {
    protected final int MAX_HEALTH = 100;
    protected final int MIN_HEALTH = 0;
    protected int health;
    protected double physDef;
    protected double magicDef;
    protected int physAtt;

    public Hero() {
        health = 100;
    }

    @Override
    public void physicalAttack(Hero hero) {
        double damage = physAtt * (1 - hero.physDef);
        if (hero.health - damage >= MIN_HEALTH) {
            hero.health -= damage;
        } else hero.health = MIN_HEALTH;
    }


}
