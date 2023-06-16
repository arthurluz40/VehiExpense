/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.VehiExpense.modelos;

/**
 *
 * @author arthu
 */
public class Modelo {

    //Atributos
    private int id = 0;
    private String descricao = "";
    private String url = "";
    private int marca;

    //Metodos
    public Modelo(int id, String descricao, String url, int marca) {
        this.id = id;
        this.descricao = descricao;
        this.url = url;
        this.marca = marca;
    }

    public Modelo() {
    }

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Modelo{" + "id=" + id + ", descricao=" + descricao + ", url=" + url + ", marca=" + marca + '}';
    }

}
