/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.VehiExpense.Persistencia;

import com.VehiExpense.conexao.ConexaoBD;
import com.VehiExpense.modelos.CategoriaDeGastos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoriaDeGastosDAO implements ICategoriaDeGastosDAO {

    private Connection conexao = null;

    public CategoriaDeGastosDAO() throws Exception {
        conexao = ConexaoBD.getConexao();
    }

    public void inserir(CategoriaDeGastos categoria) throws SQLException {
        String sql = "INSERT INTO CategoriaDeGastos (descricaoCategoriaDeGastos) VALUES (?)";
        try ( PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, categoria.getDescricaoCategoriaDeGasto());
            stmt.executeUpdate();
        }
    }

    public void atualizar(CategoriaDeGastos categoria) throws SQLException {
        String sql = "UPDATE CategoriaDeGastos SET descricaoCategoriaDeGastos = ? WHERE Id = ?";
        try ( PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, categoria.getDescricaoCategoriaDeGasto());
            stmt.setInt(2, categoria.getId());
            stmt.executeUpdate();
        }
    }

    public void excluir(CategoriaDeGastos categoria) throws SQLException {
        String sql = "DELETE FROM CategoriaDeGastos WHERE Id = ? AND descricaoCategoriaDeGastos = ?";
        try ( PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, categoria.getId());
            stmt.setString(2, categoria.getDescricaoCategoriaDeGasto());
            stmt.executeUpdate();
        }
    }

    public CategoriaDeGastos buscarPorId(int id) throws SQLException {
        String sql = "SELECT * FROM CategoriaDeGastos WHERE Id = ?";
        try ( PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try ( ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    CategoriaDeGastos categoria = new CategoriaDeGastos();
                    categoria.setId(rs.getInt("Id"));
                    categoria.setDescricaoCategoriaDeGasto(rs.getString("descricaoCategoriaDeGastos"));
                    return categoria;
                }
            }
        }
        return null;
    }

    @Override
    public ArrayList<CategoriaDeGastos> listaCategoriaDeGastos() throws SQLException {
        ArrayList<CategoriaDeGastos> categorias = new ArrayList<>();
        String sql = "SELECT * FROM CategoriaDeGastos";
        try ( PreparedStatement stmt = conexao.prepareStatement(sql);  ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                CategoriaDeGastos categoria = new CategoriaDeGastos();
                categoria.setId(rs.getInt("Id"));
                categoria.setDescricaoCategoriaDeGasto(rs.getString("descricaoCategoriaDeGastos"));
                categorias.add(categoria);
            }
        }
        return categorias;
    }
}
