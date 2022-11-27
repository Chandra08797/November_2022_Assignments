package com.cb.yash.opp.task8;

public class TestMyClass {
    public static void main(String[] args) {
        Mobile m = new Mobile();
        System.out.println(m.getIdOfProduct());
        System.out.println(m.getManufactureDate());
        System.out.println(m.semiConductorVariety());
        System.out.println();

        LCD lcd = new LCD();
        System.out.println(lcd.getIdOfProduct());
        System.out.println(lcd.getManufactureDate());
        System.out.println(lcd.semiConductorVariety());
        System.out.println();

        Laptop laptop = new Laptop();
        System.out.println(laptop.getIdOfProduct());
        System.out.println(laptop.getManufactureDate());
        System.out.println(laptop.semiConductorVariety());
        System.out.println();
    }
}
