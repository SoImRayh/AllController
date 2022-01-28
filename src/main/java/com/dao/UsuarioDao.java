package com.dao;

import com.infra.ConnectionFactory;
import com.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDao implements IUsuarioDao{


    @Override
    public void cadastrar(User user) {
        String sql = "insert into usuario(cpf,nome,senha,tipo) values (?,?,?,?)";
        try (Connection connection = ConnectionFactory.getconection()){
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1,user.getCpf());
            ps.setString(2,user.getNome());
            ps.setString(3,user.getSenha());
            ps.setBoolean(4,user.isAdminstrador());

            ps.execute();

        }catch (SQLException sqlException){
            throw new RuntimeException(sqlException);
        }
        return;
    }

    @Override
    public void excluir(String cpf) {
        String sql = "delete from usuario where cpf = ?";
        try(Connection connection = ConnectionFactory.getconection()){
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1,cpf);
            ps.executeUpdate();
        }catch (SQLException sqlException){
            throw new RuntimeException(sqlException);
        }
    }

    @Override
    public void Buscar(String nome, String senha){
        String sql = "select from usuario where nome = ? AND senha = ?";
        try(Connection connection = ConnectionFactory.getconection()) {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, nome);
            ps.setString(2, senha);
            ps.executeUpdate();
        }catch (SQLException sqlException){
            throw new RuntimeException(sqlException);
        }
    }
}
