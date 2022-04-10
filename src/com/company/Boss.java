package com.company;

public class Boss {
    private int health;
    private int damage;
    private String protection;


    public Boss(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public Boss(int health, int damage, String protection) {
        this.health = health;
        this.damage = damage;
        this.protection = protection;
    }

    public void setHealth(int health) {
        if (health < 0) {
            System.out.println("The health must be positive");
        } else {
            this.health = health;
        }

    }
    public void setDamage(int damage) {
        if (damage < 0) {
        System.out.println("The value must be positive");
        } else {
            this.damage = damage;
        }

    }

    public void setProtection(String protection) {
        this.protection = protection;
    }

    public int getHealth() {
        return this.health;
    }

    public int getDamage() {
        return this.damage;
    }

    public String getProtection() {
        return this.protection;
    }
}

