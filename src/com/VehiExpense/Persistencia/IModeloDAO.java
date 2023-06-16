/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.VehiExpense.Persistencia;

import com.VehiExpense.modelos.Modelo;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Canto
 */
public interface IModeloDAO {

    public void inserir(Modelo modelo) throws SQLException;

    public void atualizar(Modelo modelo) throws SQLException;

    public void excluir(Modelo modelo) throws SQLException;

    public ArrayList<Modelo> listaModelos() throws SQLException;

    public Modelo buscarPorId(int id) throws SQLException;
}
