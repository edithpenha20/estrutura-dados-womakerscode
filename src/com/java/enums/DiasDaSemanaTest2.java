package com.java.enums;

public class DiasDaSemanaTest2 {

    public static void main(String[] args) {

        DiasDaSemana[] dias = DiasDaSemana.values();

        for (int i=0; i<dias.length; i++){
            System.out.println(dias[i]);
        }

        for (DiasDaSemana dia : DiasDaSemana.values()){
            System.out.println(dia);
        }


    }
}
