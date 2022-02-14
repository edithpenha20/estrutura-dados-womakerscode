package com.estruturas.fila.exercicios;

import com.estruturas.fila.FilaComPrioridade;

import java.util.Random;

public class PSNovosPacientes {

    private FilaComPrioridade<Pessoa> fila;
    private int cont = 7;
    private Random prioridade = new Random();

    public PSNovosPacientes(FilaComPrioridade<Pessoa> fila) {
        super();
        this.fila = fila;
    }

    @Override
    public void run() {

        for (int i=0; i<8; i++) {
            try {
                Thread.sleep(8000);
                Pessoa p = new Pessoa("" + cont, prioridade.nextInt(3));
                fila.enfileira(p);
                cont++;
                System.out.println(p + " enfileirada.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}