/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.VehiExpense.Persistencia;

import com.VehiExpense.modelos.Modelo;
import java.sql.SQLException;

/**
 *
 * @author Canto
 */
public interface IModeloDAO {
    public void inserir(Modelo modelo) throws SQLException;
}
