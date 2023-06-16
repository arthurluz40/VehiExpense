/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.VehiExpense.modelos;

/**
 *
 * @author aluno
 */
public class CategoriaDeGastos {
    private int id;
    private String descricaoCategoriaDeGastos;

    public CategoriaDeGastos() {
    }

    public CategoriaDeGastos(int id, String descricaoCategoriaDeGastos) {
        this.id = id;
        this.descricaoCategoriaDeGastos = descricaoCategoriaDeGastos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricaoCategoriaDeGasto() {
        return descricaoCategoriaDeGastos;
    }

    public void setDescricaoCategoriaDeGasto(String descricaoCategoriaDeGastos) {
        this.descricaoCategoriaDeGastos = descricaoCategoriaDeGastos;
    }
}

