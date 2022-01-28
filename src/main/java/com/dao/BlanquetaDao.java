package com.dao;

import com.infra.ConnectionFactory;
import com.model.Blanqueta;
import com.model.Maquina;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BlanquetaDao implements IBlanquetaDao{

    @Override
    public Blanqueta salvar(Blanqueta blanqueta) {
        try (Connection connection = ConnectionFactory.getconection()){
            String sql = "insert into Blanqueta (localizacao, faca,repeticoes,maquina,obs) values (?,?,?,?,?)";
            PreparedStatement ps =  connection.prepareStatement(sql);

            ps.setString(1,blanqueta.getLocalizacao());
            ps.setString(2,blanqueta.getFaca());
            ps.setInt(3,blanqueta.getRepeticoes());
            ps.setString(4,blanqueta.getMaquina().toString());
            ps.setString(5, blanqueta.getObs());
            ps.executeUpdate();

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
    public void deletar(String  localizacao) {
        String sql = "delete from blanqueta where localizacao = ?";
        try(Connection connection = ConnectionFactory.getconection()){

            PreparedStatement ps  = connection.prepareStatement(sql);
            ps.setString(1,localizacao);
            ps.execute();
        }catch (SQLException sqlException){
            throw new RuntimeException(sqlException);
        }

    }

    @Override
    public List<Blanqueta> todas() {
        String sql = "select * from blanqueta";
        List<Blanqueta> li = new ArrayList<>();
        Blanqueta b=null;
        try(Connection connection = ConnectionFactory.getconection()){
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                String localizacao =rs.getString("localizacao");
                Maquina maquina = Maquina.valueOf(rs.getString("maquina"));
                String faca =  rs.getString("faca");
                String obs = rs.getString("obs");
                int repeticoes = rs.getInt("repeticoes");
                int id = rs.getInt("id");

                b = new Blanqueta(localizacao,maquina,faca,obs, repeticoes,id  );
                li.add(b);
            }
        }catch (SQLException sqlException){
            throw new RuntimeException(sqlException);
        }
        return li;
    }

    @Override
    public Optional<Blanqueta> acharPorPosicao(String posicao) {
        String sql = "select * from blanqueta where localizacao = " +this.toSqlString(posicao);
        Blanqueta blanqueta = new Blanqueta();
        try(Connection connection = ConnectionFactory.getconection()) {
            PreparedStatement ps = connection.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                blanqueta.setRepeticoes(rs.getInt("repeticoes"));
                blanqueta.setLocalizacao(rs.getString("localizacao"));
                blanqueta.setFaca(rs.getString("faca"));
                blanqueta.setMaquina(Maquina.valueOf(rs.getString("maquina")));
                blanqueta.setObs(rs.getString("obs"));
                blanqueta.setId(rs.getInt("id"));
            }

        }catch (SQLException sqlException)
        {
            throw new RuntimeException(sqlException);
        }
        return Optional.ofNullable(blanqueta);
    }

    @Override
    public List<Blanqueta> acharPorMaquina(Maquina manquina) {
        return null;
    }

    @Override
    public String toSqlString(String string) {
        string =string.toUpperCase();
        return "'"+string+"'";
    }
}
