package com.java.enums;

public class Data {

    private int dia;
    private int mes;
    private int ano;
    private DiasDaSemana diaSemana;

    public Data() {
        super();
    }

    public Data(int dia, int mes, int ano, DiasDaSemana diaSemana) {
        super();
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.diaSemana = diaSemana;
    }
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public DiasDaSemana getDiaSemana() {
        return diaSemana;
    }
    public void setDiaSemana(DiasDaSemana diaSemana) {
        this.diaSemana = diaSemana;
    }
}
