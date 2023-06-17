/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.VehiExpense.modelos;

/**
 *
 * @author aluno
 */
public class Veiculo {

    private String placa = "";
    private String renavam = "";
    private int ano = 0;
    private String foto = "";
    private String tipoDeCombustivel = "";
    private Double kilometragemAtual = 0.0;
    private String CPF = "";
    private Modelo idModelo;

    public Veiculo() {

    }

    public Veiculo(String placa, String renavam, int ano, String foto, String tipoDeCombustilvel, Double kilometragemAtual, String CPF, Modelo idModelo) {
        this.placa = placa;
        this.renavam = renavam;
        this.ano = ano;
        this.foto = foto;
        this.tipoDeCombustivel = tipoDeCombustilvel;
        this.kilometragemAtual = kilometragemAtual;
        this.CPF = CPF;
        this.idModelo = idModelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }  

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getTipoDeCombustivel() {
        return tipoDeCombustivel;
    }

    public void setTipoDeCombustivel(String tipoDeCombustivel) {
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    public Double getKilometragemAtual() {
        return kilometragemAtual;
    }

    public void setKilometragemAtual(Double kilometragemAtual) {
        this.kilometragemAtual = kilometragemAtual;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Modelo getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(Modelo idModelo) {
        this.idModelo = idModelo;
    }

    @Override
    public String toString() {
        return "Veiculo{" + ", placa=" + placa + ", renavam=" + renavam + ", ano=" + ano + ", foto=" + foto + ", combustível=" + tipoDeCombustivel + ", quilometragem=" + kilometragemAtual + ", CPF=" + CPF + ", IdModelo=" + idModelo + '}';
    }

}
