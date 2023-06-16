/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.VehiExpense.Persistencia;

import com.VehiExpense.modelos.Marca;
import java.sql.SQLException;

/**
 *
 * @author Canto
 */
public interface IMarcaDAO {
    public void inserir(Marca marca) throws SQLException;
    public void atualizar(Marca marca) throws SQLException;
    public void excluir(int id) throws SQLException;
}
