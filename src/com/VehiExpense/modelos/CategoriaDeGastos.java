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
    private String descricaoMarca;

    public CategoriaDeGastos() {
    }

    public CategoriaDeGastos(int id, String descricaoMarca) {
        this.id = id;
        this.descricaoMarca = descricaoMarca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricaoMarca() {
        return descricaoMarca;
    }

    public void setDescricaoMarca(String descricaoMarca) {
        this.descricaoMarca = descricaoMarca;
    }
}

