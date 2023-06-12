/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.VehiExpense.modelos;

/**
 *
 * @author ejmcc
 */
public class Marca {
    //Atributos
    private int idMarca = 0;
    private String descricao = "";
    private String url = "";
    //Metodos
    public Marca(){
    }
    public Marca(int idMarca, String descricao, String url){
        this.idMarca = idMarca;
        this.descricao = descricao;
        this.url = url;
    }
    public int getId() {
        return idMarca;
    }
    public void setId(int idMarca) {
        this.idMarca = idMarca;
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
        return "Marca{" + "idMarca=" + idMarca + ", descricao=" + descricao + ", url=" + url + '}';
    }
    
}
