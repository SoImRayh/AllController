package com.dao;

import com.infra.ConnectionFactory;
import com.objects.Empresa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

public class EmpresaDao implements IEmpresaDao{

    @Override
    public Empresa salvar(Empresa empresa) {
        String sql = "insert into empresa(nome) values(?)";
        try(Connection connection = ConnectionFactory.getconection()){
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, empresa.getNome().toUpperCase(Locale.ROOT));
            preparedStatement.executeUpdate();


        }catch (SQLException sqlException){
            throw new RuntimeException(sqlException);
        }
        return null;
    }

    @Override
    public void excluir(Integer id) {

        String sql = "delete from empresa where id = ?";
        try (Connection connection = ConnectionFactory.getconection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);

            preparedStatement.execute();

        } catch (SQLException sqlException) {
            throw new RuntimeException(sqlException);
        }

    }

    @Override
    public List<Empresa> pesquisarTodas() {
        List<Empresa> lista = new ArrayList<>();
        Empresa empresa;
        String sql = "select * from empresa";
        try(Connection connection = ConnectionFactory.getconection()){
            PreparedStatement preparedStatement =  connection.prepareStatement(sql);

            ResultSet rs = preparedStatement.executeQuery();

            while(rs.next()){
                empresa = new Empresa(rs.getString("nome"),rs.getInt("id"));
                lista.add(empresa);

            }
        }catch (SQLException sqlException){
            throw new RuntimeException(sqlException);
        }
        return lista;
    }

    @Override
    public Optional<Empresa> pesquisarNome(String string) {
        String sql = "select * from empresa where nome = ?";
        Empresa e = null;
        try(Connection connection = ConnectionFactory.getconection()){
            PreparedStatement   ps = connection.prepareStatement(sql);
            ps.setString(1,string.toUpperCase(Locale.ROOT));

            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                e = new Empresa(rs.getString("nome"),rs.getInt("id"));
            }
        }catch (SQLException sqlException){
            throw new RuntimeException(sqlException);
        }
        return Optional.ofNullable(e);
    }
}
