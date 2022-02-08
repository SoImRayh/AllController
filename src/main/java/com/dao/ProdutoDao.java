package com.dao;

import com.infra.ConnectionFactory;
import com.model.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProdutoDao implements IProdutoDao{
    @Override
    public  Produto salvar(Produto produto) {
        try(Connection conection = ConnectionFactory.getconection() ){
            String sql = "insert into produto(codigo,nome,fk_empresa_id) values(?,?,?)";
            PreparedStatement ps  = conection.prepareStatement(sql);

            ps.setString(1,produto.getCode());
            ps.setString(2, produto.getName());
            ps.setInt(3, produto.getEmpresa());

            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return produto;
    }

    @Override
    public void deletar(Produto produto) {
        String sql = "delete from produto where codigo = ?";
        try(Connection connection = ConnectionFactory.getconection()){
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,"40028922");

            preparedStatement.executeUpdate();

        }catch (SQLException sqlException){
            throw new RuntimeException(sqlException);
        }

    }

    @Override
    public Produto atualizar(Produto produto) {
        String sql = "update produto set codigo = ?, nome = ?, empresa = ? where codigo = ?";
        Produto p;
        try(Connection connection= ConnectionFactory.getconection()){
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

        }catch (SQLException sqlException){
            throw new RuntimeException(sqlException);
        }
        return null;
    }

    @Override
    public List<Produto> todos() {
        List<Produto> lista = new ArrayList<>();
        try(Connection connection = ConnectionFactory.getconection()){
            String sql = "select * from produto";
            PreparedStatement pS = ConnectionFactory.getconection().prepareStatement(sql);


            ResultSet rs = pS.executeQuery();
            while(rs.next()){
                String nome = rs.getString("nome");
                Integer empresa = rs.getInt("fk_empresa_id");
                String codigo = rs.getString("codigo");

                Produto p = new Produto(nome,empresa,codigo);

                lista.add(p);
            }

        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return lista;
    }

    @Override
    public List<Produto> pesquisar(String s) {
        String sql = "select * from produto where ? = ?";
        List<Produto> list = new ArrayList<>();
        try(Connection connection = ConnectionFactory.getconection()){

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,"empresa");
            preparedStatement.setString(2,"brainfarma");

            ResultSet rs = preparedStatement.executeQuery();

            while(rs.next()){
                String nome = rs.getString("nome");
                Integer empresa = rs.getInt(("empresa"));
                String codigo = rs.getString("codigo");

                Produto p = new Produto(nome,empresa,codigo);
                list.add(p);
            }

        }catch(SQLException sqlException){
            throw new RuntimeException(sqlException);
        }
        return list;
    }

    @Override
    public Optional<Produto> pesquisarPorCodigo(String s) {
        s = this.toSqlString(s);
        String sql = "select * from produto where codigo  = "+ s;
        Produto p = new Produto();
        try(Connection connection = ConnectionFactory.getconection()){
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();

            if(rs.next())
            {
                p.setName(rs.getString("nome"));
                p.setEmpresa(rs.getInt("fk_empresa_id"));
                p.setCode(rs.getString("codigo"));
            }
        }catch (SQLException exception){
            throw new RuntimeException(exception);
        }
        return Optional.ofNullable(p);
    }

    @Override
     public String toSqlString(String string) {
       string = string.toUpperCase();
        return "'"+string+"'";
    }

}
