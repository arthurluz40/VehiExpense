/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.VehiExpense.Persistencia;

import com.VehiExpense.modelos.Modelo;
import com.VehiExpense.conexao.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Canto
 */
public class ModeloDAO implements IModeloDAO {

    private Connection conexao = null;

    public ModeloDAO() throws Exception {
        conexao = ConexaoBD.getConexao();
    }

    public void inserir(Modelo modelo) throws SQLException {
        String sql = "INSERT INTO marca (descricaoMarca, foto, idmarca) VALUES ( ? , ?, ?)";
        try ( PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, modelo.getDescricao());
            stmt.setString(2, modelo.getUrl());
            stmt.setObject(3, modelo.getMarca());
            stmt.executeUpdate();
        }
    }

}
