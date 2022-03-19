package day11.task2;

public class Magician extends Hero implements MagicAttack{

    int magicAtt = 20;

    public Magician() {
        super();
        physDef = 0;
        magicDef = 0.8;
        physAtt = 5;
    }

    @Override
    public void magicalAttack(Hero hero) {
        double damage = magicAtt * (1 - hero.magicDef);
        if (hero.health - damage >= MIN_HEALTH) {
            hero.health -= damage;
        } else hero.health = MIN_HEALTH;
    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }
}
