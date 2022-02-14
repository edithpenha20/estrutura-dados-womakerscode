package com.estruturas.pilha.testes;

import com.estruturas.pilha.Pilha;

public class Aula16 {

    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<Integer>();

        System.out.println(pilha.estaVazia());

        pilha.empilha(1);

        System.out.println(pilha.estaVazia());

    }

}
