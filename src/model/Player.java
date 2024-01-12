package model;

import enums.Weapon;

public class Player {
    private String name;
    private int healthPercentage;
    Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon){
        this.name = name;
        this.healthPercentage = Math.min(Math.max(healthPercentage, 0), 100);
        this.weapon = weapon;
    }

    public int healthRemaining() {
        return healthPercentage;
    }

    public void loseHealth(int damage) {
        healthPercentage -= damage;
        if (healthPercentage <= 0 ) {
            healthPercentage = 0;
            System.out.println(name + " has been knocked out of game");
        }
    }


    public void restoreHealth (int healthPotion) {
        healthPercentage += healthPotion;
        healthPercentage = Math.min(healthPercentage, 100);
    }

}
