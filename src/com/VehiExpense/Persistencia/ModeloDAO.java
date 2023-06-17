/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.VehiExpense.Persistencia;

import com.VehiExpense.modelos.Modelo;
import com.VehiExpense.conexao.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
        String sql = "INSERT INTO modelo (descricaomodleo, foto, idmarca) VALUES ( ? , ?, ?)";
        try ( PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, modelo.getDescricao());
            stmt.setString(2, modelo.getFoto());
            stmt.setObject(3, modelo.getMarcaDoModelo().getId());
            stmt.executeUpdate();
        }
    }

    public void atualizar(Modelo modelo) throws SQLException {
        String sql = "UPDATE modelo SET descricaomodleo = ?, foto = ? WHERE Id = ?";
        try ( PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, modelo.getDescricao());
            stmt.setString(2, modelo.getFoto());
            stmt.setInt(3, modelo.getId());
            stmt.executeUpdate();
        }
    }
    
        public void excluir(Modelo modelo) throws SQLException {
        String sql = "DELETE FROM modelo WHERE Id = ?";
        try ( PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, modelo.getId());
            stmt.executeUpdate();
        }
    }

    @Override
    public ArrayList<Modelo> listaModelos() throws SQLException {
        ArrayList<Modelo> modelos = new ArrayList<>();
        String sql = "SELECT * FROM modelo";
        try ( PreparedStatement stmt = conexao.prepareStatement(sql);  ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                MarcaDAO marca = new MarcaDAO();
                Modelo modelo = new Modelo();
                modelo.setId(rs.getInt("Id"));
                modelo.setDescricao(rs.getString("descricaomodleo"));
                modelo.setFoto(rs.getString("foto"));
                modelo.setMarcaDoModelo(marca.buscarPorId((rs.getInt("idmarca"))));
                modelos.add(modelo);
            }
        } catch (Exception e) {

        }
        return modelos;
    }

    @Override
    public Modelo buscarPorId(int id) throws SQLException {
        String sql = "SELECT * FROM modelo WHERE Id = ?";
        try ( PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try ( ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    Modelo modelo = new Modelo();
                    MarcaDAO marca = new MarcaDAO();
                    modelo.setId(rs.getInt("Id"));
                    modelo.setFoto(rs.getString("foto"));
                    modelo.setDescricao(rs.getString("descricaoModleo"));
                    modelo.setMarcaDoModelo(marca.buscarPorId((rs.getInt("idmarca"))));
                    return modelo;
                }
            } catch (Exception e) {
            }
        }
        return null;
    }

}
