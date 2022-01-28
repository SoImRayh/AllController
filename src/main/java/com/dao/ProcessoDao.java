package com.dao;

import com.infra.ConnectionFactory;
import com.model.Blanqueta;
import com.model.Processo;
import com.model.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProcessoDao implements IProcessoDao {
    @Override
    public Processo salvar(Processo processo) {
        String sql = "Insert into processo (Fk_blanqueta_localizacao, Fk_produto_codigo, data) values (?, ?, ?) ";
        try(Connection connection = ConnectionFactory.getconection()){
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,processo.getBlanqueta().getLocalizacao());
            preparedStatement.setString(2,processo.getProduto().getCode());
            preparedStatement.setDate(3,java.sql.Date.valueOf(processo.getData().toString()));

            preparedStatement.executeUpdate();
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
        BlanquetaDao blanquetaDao = new BlanquetaDao();
        ProdutoDao produtoDao = new ProdutoDao();

        List<Processo> lista= new ArrayList<>();
        Processo processo = new Processo() ;

        String sql = "select * from processo";

        try(Connection connection = ConnectionFactory.getconection())
        {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while(rs.next())
            {
                Blanqueta blanqueta = blanquetaDao.acharPorPosicao(rs.getString("fk_blanqueta_localizacao")).orElseThrow();
                Produto produto = produtoDao.pesquisarPorCodigo(rs.getString("fk_produto_codigo")).orElseThrow();
                LocalDate data = rs.getDate("data").toLocalDate();


                processo.setProduto(produto);
                processo.setBlanqueta(blanqueta);
                processo.setData(data);

                lista.add(processo);
            }
        }
        catch (SQLException sqlException)
        {
            throw new RuntimeException(sqlException);
        }
        return lista;
    }

    @Override
    public List<Processo> pesquisarComFiltro(String pesquisa) {
        String sql = "select * from processo where fk_produto_codigo like ? or ";
        return null;
    }

    @Override
    public List<Processo> filtros(int i ) {
        List<Processo> li = new ArrayList<>();

       if (i == 1 ){
                li = this.todos();
        }

        return li;
    }
}
