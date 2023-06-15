/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.VehiExpense.modelos;

/**
 *
 * @author aluno
 */
public class Gastos {
    public class Gasto {
    private int id;
    private String descricao;
    private String categoria;
    private double valor;
    private String data;

    // Construtor, getters e setters

        public Gasto() {
        }

        public Gasto(int id, String descricao, String categoria, double valor, String data) {
            this.id = id;
            this.descricao = descricao;
            this.categoria = categoria;
            this.valor = valor;
            this.data = data;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getDescricao() {
            return descricao;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        public String getCategoria() {
            return categoria;
        }

        public void setCategoria(String categoria) {
            this.categoria = categoria;
        }

        public double getValor() {
            return valor;
        }

        public void setValor(double valor) {
            this.valor = valor;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }
    
}

    
}
