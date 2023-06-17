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
    private String foto = "";
    private Marca marcaDoModelo;

    public Modelo() {

    }

    //Metodos
    public Modelo(int id, String descricao, String foto, Marca marcaDoModelo) {
        this.id = id;
        this.descricao = descricao;
        this.foto = foto;
        this.marcaDoModelo = marcaDoModelo;
    }

    public Marca getMarcaDoModelo() {
        return marcaDoModelo;
    }

    public void setMarcaDoModelo(Marca marca) {
        this.marcaDoModelo = marca;
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

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }



    @Override
    public String toString() {
        return "Modelo{" + "id=" + id + ", descricao=" + descricao + ", url=" + foto + ", marca=" + marcaDoModelo + '}';
    }

}
