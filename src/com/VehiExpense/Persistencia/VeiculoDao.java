/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.VehiExpense.Persistencia;

import com.VehiExpense.conexao.ConexaoBD;
import com.VehiExpense.modelos.Veiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author arthu
 */
public class VeiculoDAO implements IVeiculoDAO{

    private Connection conexao = null;

    public VeiculoDAO() throws Exception {
        conexao = ConexaoBD.getConexao();
    }

    public void inserir(Veiculo veiculo) throws SQLException {
        String sql = "INSERT INTO carro (placa, renavam, ano, foto, tipodecombustivel, kilometragematual, cpf, idmodelo) VALUES ( ? , ?, ?, ?, ?, ?, ?, ?)";
        try ( PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, veiculo.getPlaca());
            stmt.setString(2, veiculo.getRenavam());
            stmt.setInt(3, veiculo.getAno());
            stmt.setString(4, veiculo.getFoto());
            stmt.setString(5, veiculo.getTipoDeCombustivel());
            stmt.setDouble(6, veiculo.getKilometragemAtual());
            stmt.setString(7, veiculo.getCPF());
            stmt.setObject(8, veiculo.getIdModelo().getId());
            stmt.executeUpdate();
        }
    }

}
