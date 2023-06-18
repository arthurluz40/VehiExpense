/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.VehiExpense.Persistencia;

import com.VehiExpense.conexao.ConexaoBD;
import com.VehiExpense.modelos.Proprietario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author aluno
 */
public class ProprietarioDAO implements IProprietarioDAO{
      private Connection conexao;

    public ProprietarioDAO() throws Exception  {
        conexao = ConexaoBD.getConexao();
    }

    public void inserir(Proprietario proprietario) throws SQLException {
        String sql = "INSERT INTO Proprietario (CPF, nome, email, CNH, categoriaCNH) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, proprietario.getCpf());
            stmt.setString(2, proprietario.getNome());
            stmt.setString(3, proprietario.getEmail());
            stmt.setInt(4, proprietario.getCnh());
            stmt.setString(5, proprietario.getCategoriaCnh());
            stmt.executeUpdate();
        }
    }

    public void atualizar(Proprietario proprietario) throws SQLException {
        String sql = "UPDATE Proprietario SET nome = ?, email = ?, CNH = ?, categoriaCNH = ? WHERE CPF = ?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, proprietario.getNome());
            stmt.setString(2, proprietario.getEmail());
            stmt.setInt(3, proprietario.getCnh());
            stmt.setString(4, proprietario.getCategoriaCnh());
            stmt.setString(5, proprietario.getCpf());
            stmt.executeUpdate();
        }
    }

    public void excluir(String CPF) throws SQLException {
        String sql = "DELETE FROM Proprietario WHERE CPF = ?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, CPF);
            stmt.executeUpdate();
        }
    }

    public Proprietario buscarPorCPF(String CPF) throws SQLException {
        String sql = "SELECT * FROM Proprietario WHERE CPF = ?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, CPF);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    Proprietario proprietario = new Proprietario();
                    proprietario.setCpf(rs.getString("CPF"));
                    proprietario.setNome(rs.getString("nome"));
                    proprietario.setEmail(rs.getString("email"));
                    proprietario.setCnh(rs.getInt("CNH"));
                    proprietario.setCategoriaCnh(rs.getString("categoriaCNH"));
                    return proprietario;
                }
            }
        }
        return null;
    }

    public ArrayList<Proprietario> listarTodos() throws SQLException {
        ArrayList<Proprietario> proprietarios = new ArrayList<>();
        String sql = "SELECT * FROM Proprietario";
        try (PreparedStatement stmt = conexao.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Proprietario proprietario = new Proprietario();
                proprietario.setCpf(rs.getString("CPF"));
                proprietario.setNome(rs.getString("nome"));
                proprietario.setEmail(rs.getString("email"));
                proprietario.setCnh(rs.getInt("CNH"));
                proprietario.setCategoriaCnh(rs.getString("categoriaCNH"));
                proprietarios.add(proprietario);
            }
        }
        return proprietarios;
    }
}
