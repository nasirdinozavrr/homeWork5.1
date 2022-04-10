package com.company;

public class Boss {
    private int damage;
    private String protection;

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

    public int getDamage() {
        return this.damage;
    }

    public String getProtection() {
        return this.protection;
    }
}

