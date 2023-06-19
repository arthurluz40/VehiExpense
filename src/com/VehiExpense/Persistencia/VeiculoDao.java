
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
import java.util.ArrayList;

/**
 *
 * @author arthu
 */
public class VeiculoDAO implements IVeiculoDAO {

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
            stmt.setInt(8, veiculo.getIdModelo());
            stmt.executeUpdate();
        }
    }

    public void atualizar(Veiculo veiculo) throws SQLException {
        String sql = "UPDATE carro SET renavam = ?, ano = ?, foto = ?, tipodecombustivel = ?, kilometragematual = ?, cpf = ?, idmodelo = ? WHERE placa = ?";
        try ( PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setString(1, veiculo.getRenavam());
            stmt.setInt(2, veiculo.getAno());
            stmt.setString(3, veiculo.getFoto());
            stmt.setString(4, veiculo.getTipoDeCombustivel());
            stmt.setDouble(5, veiculo.getKilometragemAtual());
            stmt.setString(6, veiculo.getCPF());
            stmt.setInt(7, veiculo.getIdModelo());
            stmt.setString(8, veiculo.getPlaca());
            stmt.executeUpdate();
        }
    }

    @Override
    public void excluir(Veiculo veiculo) throws SQLException {
        String sql = "DELETE FROM carro WHERE placa = ?";
        try ( PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, veiculo.getPlaca());
            stmt.executeUpdate();
        }
    }

    @Override
    public ArrayList<Veiculo> listaVeiculos() throws SQLException {
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        String sql = "SELECT * FROM carro";
        try ( PreparedStatement stmt = conexao.prepareStatement(sql);  ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                //VeiculoDAO veiculo = new VeiculoDAO();
                Veiculo veiculo = new Veiculo();
                ModeloDAO modeloDAO = new ModeloDAO();
                veiculo.setPlaca(rs.getString("placa"));
                veiculo.setRenavam(rs.getString("renavam"));
                veiculo.setAno(rs.getInt("ano"));
                veiculo.setFoto(rs.getString("foto"));
                veiculo.setTipoDeCombustivel(rs.getString("tipodecombustivel"));
                veiculo.setKilometragemAtual(rs.getDouble("kilometragematual"));
                veiculo.setCPF(rs.getString("CPF"));
                veiculo.setIdModelo(modeloDAO.buscarPorId((rs.getInt("idmodelo"))).getId());

                //veiculo.setMarcaDoModelo(marca.buscarPorId((rs.getInt("idmarca"))));
                veiculos.add(veiculo);
                //System.out.println(veiculo);
                //System.out.println(veiculos);
            }
        } catch (Exception e) {

        }
        return veiculos;

    }

    @Override
    public Veiculo buscarPorPlaca(String placa) throws SQLException {
        String sql = "SELECT * FROM carro WHERE placa = ?";
        try ( PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, placa);
            try ( ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    Veiculo veiculo = new Veiculo();
                    ModeloDAO modeloDAO = new ModeloDAO();
                    veiculo.setPlaca(rs.getString("placa"));
                    veiculo.setRenavam(rs.getString("renavam"));
                    veiculo.setAno(rs.getInt("ano"));
                    veiculo.setFoto(rs.getString("foto"));
                    veiculo.setTipoDeCombustivel(rs.getString("tipodecombustivel"));
                    veiculo.setKilometragemAtual(rs.getDouble("kilometragematual"));
                    veiculo.setCPF(rs.getString("cpf"));
                    veiculo.setIdModelo(modeloDAO.buscarPorId((rs.getInt("idmodelo"))).getId());
                    return veiculo;
                }
            } catch (Exception e) {
            }
        }
        return null;
    }

}
