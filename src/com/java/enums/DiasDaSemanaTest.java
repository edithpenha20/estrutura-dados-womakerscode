package com.java.enums;

public class DiasDaSemanaTest {

    public static void main(String[] args) {

        System.out.println(Enum.valueOf(DiasDaSemana.class, "DOMINGO"));

        DiasDaSemana dia = Enum.valueOf(DiasDaSemana.class, "DOMINGO");

        System.out.println(dia);
    }
}
