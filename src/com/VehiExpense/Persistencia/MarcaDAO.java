/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.VehiExpense.Persistencia;

import com.VehiExpense.conexao.ConexaoBD;
import com.VehiExpense.modelos.Marca;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;
/**
 *
 * @author Canto
 */
public class MarcaDAO implements IMarcaDAO {

    private Connection conexao = null;

    public MarcaDAO() throws Exception {
        conexao = ConexaoBD.getConexao();
    }

    public void inserir(Marca marca) throws SQLException {
        String sql = "INSERT INTO marca (descricaoMarca, foto) VALUES ( ? , ? )";
        try ( PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, marca.getDescricao());
            stmt.setString(2, marca.getUrl());
            stmt.executeUpdate();
        }
    }

    public void atualizar(Marca marca) throws SQLException {
        String sql = "UPDATE marca SET descricaoMarca = ?, foto = ? WHERE Id = ?";
        try ( PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, marca.getDescricao());
            stmt.setString(2, marca.getUrl());
            stmt.setInt(3, marca.getId());
            stmt.executeUpdate();
        }
    }

    public void excluir(Marca marca) throws SQLException {
        String sql = "DELETE FROM marca WHERE Id = ?";
        try ( PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, marca.getId());
            stmt.executeUpdate();
        }
    }

    @Override
    public ArrayList<Marca> listaMarcas() throws SQLException {
        ArrayList<Marca> marcas = new ArrayList<>();
        String sql = "SELECT * FROM marca";
        try ( PreparedStatement stmt = conexao.prepareStatement(sql);  ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Marca marca = new Marca();
                marca.setId(rs.getInt("Id"));
                marca.setDescricao(rs.getString("descricaomarca"));
                marca.setUrl(rs.getString("foto"));
                marcas.add(marca);
            }
        }
        return marcas;
    }
    
    
    

}
