package kap5.ki1;

public class Creeper {

    private String name;
    private int health;
    private int explosionPower;

    public Creeper() {
        this("name", 100, 0);
    }

    public Creeper(String name, int health, int explosionPower) {
        this.name = name;
        setHealth(health);
        this.explosionPower = explosionPower;
    }

    public void setHealth(int health) {
        if (health < 0) {
            this.health = 0;
        } else {
            this.health = health;
        }
        //this.health = health < 0 ? 0 : health;
    }


    public void explode() {
        System.out.println(name + " " + explosionPower);
    }

    public void takeDamage(int damage) {
        if (this.health - damage < 0) {
            this.health = 0;
        } else {
            this.health = this.health - damage;
        }
    }

    public void zeigeStatus() {
        System.out.println(getStatus());
    }

    public String getStatus() {
        return name + ", health: " + health + ", explosionPower: " + explosionPower;
    }

    public static void main(String[] args) {
        Creeper creeper = new Creeper("MinecraftCreeper", 10, 5);
        System.out.println(creeper.getStatus());
        creeper.takeDamage(3);
        System.out.println(creeper.getStatus());
        creeper.explode();

        creeper.zeigeStatus();
    }

}
