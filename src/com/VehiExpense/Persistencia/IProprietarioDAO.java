/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.VehiExpense.Persistencia;

import com.VehiExpense.modelos.Proprietario;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public interface IProprietarioDAO {
    public void inserir(Proprietario proprietario) throws SQLException;
    public void atualizar(Proprietario proprietario) throws SQLException;
    public void excluir(String CPF) throws SQLException;
    public Proprietario buscarPorCPF(String CPF) throws SQLException;
    public ArrayList<Proprietario> listarTodos() throws SQLException;
}
