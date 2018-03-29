package Ecapsulation;

public class EnchencedPlayer {

    private String name;
    private int health = 100;
    private String weapon;

    public EnchencedPlayer(String name, int health, String weapon) {
        this.name = name;

        if (health > 0 && health <= 200) {
            this.health = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.health = this.health - damage;
        if(this.health <= 0){
            System.out.println("Player knocked out");
            // reduces hp
        }

    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public String getWeapon() {
        return weapon;
    }
}
