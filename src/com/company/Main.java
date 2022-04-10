package com.company;

public class Main {

    public static void main(String[] args) {
	    Boss boss = new Boss(120, 40, "Physical" );
        System.out.println(boss.getHealth() + " " + boss.getDamage() + " " + boss.getProtection());
    }

}
