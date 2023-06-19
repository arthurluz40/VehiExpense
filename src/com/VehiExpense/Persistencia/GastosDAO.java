/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.VehiExpense.Persistencia;

import com.VehiExpense.conexao.ConexaoBD;
import com.VehiExpense.modelos.Gastos;
import com.VehiExpense.modelos.Veiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author arthu
 */
public class GastosDAO implements IGastosDAO {

    private Connection conexao = null;

    public GastosDAO() throws Exception {
        conexao = ConexaoBD.getConexao();
    }

    public void inserir(Gastos gastos) throws SQLException {
        String sql = "INSERT INTO gastos (descricao, data, valor, placa, idcategoria) VALUES (   ?, ?, ?, ?, ?)";
        try ( PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setString(1, gastos.getDescricao());
            stmt.setString(2, gastos.getData());
            stmt.setDouble(3, gastos.getValor());
            stmt.setString(4, gastos.getPlaca());
            stmt.setInt(5, gastos.getIdCategoria());
            stmt.executeUpdate();
        }
    }
@Override
    public Gastos buscarPorPlaca(String placa) throws SQLException {
        String sql = "SELECT * FROM gastos WHERE placa = ?";
        try ( PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, placa);
            try ( ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    Gastos gastos = new Gastos();
                    //ModeloDAO modeloDAO = new ModeloDAO();
                gastos.setId(rs.getInt("id"));
                gastos.setDescricao(rs.getString("descricao"));
                gastos.setData(rs.getString("data"));
                gastos.setValor(rs.getDouble("foto"));
                gastos.setPlaca(rs.getString("placa"));
                gastos.setIdCategoria(rs.getInt("idcategoria"));
                    return gastos;
                }
            } catch (Exception e) {
            }
        }
        return null;
    }

    @Override
    public ArrayList<Gastos> listaGastos() throws SQLException {
        ArrayList<Gastos> gasto = new ArrayList<>();
        String sql = "SELECT * FROM gastos";
        try ( PreparedStatement stmt = conexao.prepareStatement(sql);  ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                //VeiculoDAO veiculo = new VeiculoDAO();
                Gastos gastos = new Gastos();
                //GastosDAO gastosDAO = new GastosDAO();
                gastos.setId(rs.getInt("id"));
                gastos.setDescricao(rs.getString("descricao"));
                gastos.setData(rs.getString("data"));
                gastos.setValor(rs.getDouble("foto"));
                gastos.setPlaca(rs.getString("placa"));
                gastos.setIdCategoria(rs.getInt("idcategoria"));

                //veiculo.setMarcaDoModelo(marca.buscarPorId((rs.getInt("idmarca"))));
                gasto.add(gastos);
                //System.out.println(veiculo);
                //System.out.println(veiculos);
            }
        } catch (Exception e) {

        }
        return gasto;

    }

}
