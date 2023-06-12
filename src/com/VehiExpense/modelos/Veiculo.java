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
    
    private int idVeiculo = 0;
    private Marca marca;
    private Modelo modelo;
    private String placa ="";
    private String ano="";
    private String renavam ="";
    private String situacao ="";
    
    public Veiculo(){
        
    }
    public Veiculo(int idVeiculo,Marca marca,Modelo modelo,String placa,String ano,String renavam,String situacao){
        this.idVeiculo=idVeiculo;
        this.marca=marca;
        this.modelo=modelo;
        this.placa=placa;
        this.ano =ano;
        this.renavam=renavam;
        this.situacao=situacao;
    }

    public int getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(int idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        return "Veiculo{" + "idVeiculo=" + idVeiculo + ", marca=" + marca + ", modelo=" + modelo + ", placa=" + placa + ", ano=" + ano + ", renavam=" + renavam + ", situacao=" + situacao + '}';
    }
    
    
    
}
