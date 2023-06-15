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

public class CategoriaDeGastosDAO implements ICategoriaDeGastosDAO{


    private Connection conexao = null;

    public CategoriaDeGastosDAO() throws Exception {
        conexao = ConexaoBD.getConexao();
    }

    public void inserir(CategoriaDeGastos categoria) throws SQLException {
        String sql = "INSERT INTO CategoriaDeGastos (descricaoMarca) VALUES (?)";
        try ( PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, categoria.getDescricaoMarca());
            stmt.executeUpdate();
        }
    }

    public void atualizar(CategoriaDeGastos categoria) throws SQLException {
        String sql = "UPDATE CategoriaDeGastos SET descricaoMarca = ? WHERE Id = ?";
        try ( PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, categoria.getDescricaoMarca());
            stmt.setInt(2, categoria.getId());
            stmt.executeUpdate();
        }
    }

    public void excluir(int id) throws SQLException {
        String sql = "DELETE FROM CategoriaDeGastos WHERE Id = ?";
        try ( PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, id);
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
                    categoria.setDescricaoMarca(rs.getString("descricaoMarca"));
                    return categoria;
                }
            }
        }
        return null;
    }

    public List<CategoriaDeGastos> listarTodos() throws SQLException {
        List<CategoriaDeGastos> categorias = new ArrayList<>();
        String sql = "SELECT * FROM CategoriaDeGastos";
        try ( PreparedStatement stmt = conexao.prepareStatement(sql);  ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                CategoriaDeGastos categoria = new CategoriaDeGastos();
                categoria.setId(rs.getInt("Id"));
                categoria.setDescricaoMarca(rs.getString("descricaoMarca"));
                categorias.add(categoria);
            }
        }
        return categorias;
    }
}
