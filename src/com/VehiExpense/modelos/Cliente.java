/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.VehiExpense.modelos;

/**
 *
 * @author aluno
 */
public class Cliente{
    private int idClientePF =0;
    private String nome = "";
    private String email = "";
    private String CPF = "";

    public Cliente() {
    }
    
    public Cliente(int idClientePF, String nome, String email,String CPF) {
        this.idClientePF = idClientePF;
        this.nome = nome;
        this.email = email;
        this.CPF=CPF;
    }

    public int getIdClientePF() {
        return idClientePF;
    }

    public void setIdClientePF(int idClientePF) {
        this.idClientePF = idClientePF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    
    
    
    
    
    
}