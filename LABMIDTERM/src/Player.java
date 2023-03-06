
public class Player {
    private final String name;
    private final int attackDamage = 2;
    private Houses houses;
    private int hp = 20;
    private int mana = 50;

    public Player(String name) {
        this.name = name;
    }
    public Player(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp <= 0) {
            this.hp = 0;
        } if (hp >= 20) {
            this.hp = 20;
        }
        this.hp = hp;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        if (mana <= 0) {
            this.hp = 0;
        } if (mana >= 50) {
            this.mana = 50;
        }
        this.mana = mana;
    }
    
    public String getName() {
        return name;
    }
    public int getAttackDamage() {
        return attackDamage;
    }

    public Houses getHouses() {
        return houses;
    }

    public void setHouses(Houses houses) {
        this.houses = houses;
    }

    @Override
    public String toString() {
        return "[Player] : " +name+ " HP: "+hp+ " Mana: "+mana+  "|| "+houses;
    }
    public boolean equals(Player player) {
        return (player.getName().equals(this.name)) && (player.getHouses().equals(houses));
    }
    public void attack(Player target, Spell spell) {
        if (getHouses() instanceof Gryffindor) {
            ((Gryffindor)houses).attackSpell(this, target, spell);
        } else if (getHouses() instanceof Hufflepuff) {
            ((Hufflepuff)houses).attackSpell(this, target, spell);
        }
        if (target.getHp() == 0) {
            System.out.println("[DEAD]: " + target.getName() + " was killed by " + getName());
        }
    }
    public void protectFromPlayer(Player target) {
        if (getHouses() instanceof Gryffindor) {
            ((Gryffindor)houses).defense(this, target);
        } else if (getHouses() instanceof Hufflepuff) {
            ((Hufflepuff)houses).defense(this, target);
        }
    }
}
