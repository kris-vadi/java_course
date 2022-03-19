package day11.task2;

public class Shaman extends Hero implements Healer, MagicAttack{

    private int healHimself = 50;
    private int healTeammate = 30;
    private int magicAtt = 15;

    public Shaman() {
        super();
        physDef = 0.2;
        magicDef = 0.2;
        physAtt = 10;
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
    public void magicalAttack(Hero hero) {
        double damage = magicAtt * (1 - hero.magicDef);
        if (hero.health - damage >= MIN_HEALTH) {
            hero.health -= damage;
        } else hero.health = MIN_HEALTH;
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}
