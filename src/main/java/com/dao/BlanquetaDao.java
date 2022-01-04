package com.dao;

import com.infra.ConnectionFactory;
import com.objects.Blanqueta;
import com.objects.Maquina;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class BlanquetaDao implements IBlanquetaDao{

    @Override
    public Blanqueta salvar(Blanqueta blanqueta) {
        try (Connection connection = ConnectionFactory.getconection()){
            String sql = "insert into Blanqueta (localizacao, faca,repeticoes) values (?,?,?)";
            PreparedStatement preparedStatement =  connection.prepareStatement(sql);

            preparedStatement.setString(1,blanqueta.getLocalizacao());
            preparedStatement.setString(2,blanqueta.getFaca());
            preparedStatement.setInt(3,blanqueta.getRepeticoes());

            preparedStatement.execute();

        }catch (SQLException ex){
            throw new RuntimeException(ex);
        }
        return blanqueta;
    }

    @Override
    public Blanqueta atualizar(Blanqueta blanqueta) {
        return null;
    }

    @Override
    public void deletar(long id) {

    }

    @Override
    public List<Blanqueta> todas() {
        return null;
    }

    @Override
    public Optional<Blanqueta> acharPorPosicao(String posicao) {
        return Optional.empty();
    }

    @Override
    public List<Blanqueta> acharPorMaquina(Maquina manquina) {
        return null;
    }
}
