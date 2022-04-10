package com.company;

public class Main {

    public static void main(String[] args) {
	    Boss boss = new Boss();
	    boss.setDamage(-90);
	    boss.setProtection("Physical");
        System.out.println(boss.getDamage() + " " + boss.getProtection());
    }

}
