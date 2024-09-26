package kap5.ki1;

public class Creeper {

    private String name;
    private int health;
    private int explosionPower;

    public Creeper(String name, int health, int explosionPower) {
        this.name = name;
        this.health = health;
        this.explosionPower = explosionPower;
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

    public String getStatus() {
        return  name + ", health: " + health + ", explosionPower: " + explosionPower;
    }

    public static void main(String[] args) {
        Creeper creeper = new Creeper("MinecraftCreeper", 10, 5);
        System.out.println(creeper.getStatus());
        creeper.takeDamage(3);
        System.out.println(creeper.getStatus());
        creeper.explode();
    }

}
