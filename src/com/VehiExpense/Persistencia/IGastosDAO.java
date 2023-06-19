/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.VehiExpense.Persistencia;

import com.VehiExpense.modelos.Gastos;
import com.VehiExpense.modelos.Veiculo;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author arthu
 */
public interface IGastosDAO {

    public void inserir(Gastos gastos) throws SQLException;
    public ArrayList<Gastos> listaGastos() throws SQLException;
    public Gastos buscarPorPlaca(String placa) throws SQLException;

}
