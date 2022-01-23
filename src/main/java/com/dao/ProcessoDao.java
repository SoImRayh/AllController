package com.dao;

import com.infra.ConnectionFactory;
import com.model.Processo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class ProcessoDao implements IProcessoDao {
    @Override
    public Processo salvar(Processo processo) {
        String sql = "Insert into processo (Fk_blanqueta_id, Fk_produto_id, data) values (?, ?, ?) ";
        try(Connection connection = ConnectionFactory.getconection()){
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,processo.getBlanqueta().getLocalizacao());
            preparedStatement.setString(2,processo.getProduto().getCode());
            preparedStatement.setDate(3,java.sql.Date.valueOf(processo.getData().toString()));
        }
        catch (SQLException sqlException){
            throw new RuntimeException(sqlException);
        }
        return null;
    }

    @Override
    public void excluir(Processo processo) {

    }

    @Override
    public Processo Atualizar(Processo processo) {
        return null;
    }

    @Override
    public Optional<Processo> pesquisarID(String id) {
        return Optional.empty();
    }

    @Override
    public List<Processo> todos() {
        return null;
    }
}
