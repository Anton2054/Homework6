package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        System.out.println("Boss");
        boss.setHp(1500);
        boss.setDamage(500);
        boss.weapon.setWeaponName("Автомат ");
        boss.weapon.setWeaponType("AK74");
        boss.printlnfo();


        System.out.println("---------------------------");

        System.out.println("Skeleton");
        Skeleton skeleton = new Skeleton();
        skeleton.setHp(500);
        skeleton.setDamage(350);
        skeleton.weapon.setWeaponType("Железный лук");
        skeleton.weapon.setWeaponName("100 LV");
        skeleton.printlnfo();


        System.out.println("---------------------------");

        System.out.println("Skeleton ");
        Skeleton skeleton2 = new Skeleton();
        skeleton2.setHp(350);
        skeleton2.setDamage(100);
        skeleton2.weapon.setWeaponType("Алмазный лук");
        skeleton2.weapon.setWeaponName("100 LV");
        skeleton2.printlnfo();


        System.out.println("----------------------------");


    }
}
