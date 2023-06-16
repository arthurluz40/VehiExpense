/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.VehiExpense.Persistencia;

import com.VehiExpense.modelos.CategoriaDeGastos;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public interface ICategoriaDeGastosDAO {
    public void inserir(CategoriaDeGastos categoria) throws SQLException;
    public void atualizar(CategoriaDeGastos categoria) throws SQLException;
    public void excluir(CategoriaDeGastos categoria) throws SQLException;
    public CategoriaDeGastos buscarPorId(int id) throws SQLException;
    public ArrayList<CategoriaDeGastos> listaCategoriaDeGastos() throws SQLException;
    
}
