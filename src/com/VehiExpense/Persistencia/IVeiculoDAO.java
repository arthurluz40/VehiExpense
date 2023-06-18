/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.VehiExpense.Persistencia;

import com.VehiExpense.modelos.Veiculo;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Canto
 */
public interface IVeiculoDAO {

    public void inserir(Veiculo veiculo) throws SQLException;

    public void excluir(Veiculo veiculo) throws SQLException;

    public ArrayList<Veiculo> listaVeiculos() throws SQLException;

    public Veiculo buscarPorPlaca(String placa) throws SQLException;

    public void atualizar(Veiculo veiculo) throws SQLException;

}
