package com.dao;

import com.objects.Blanqueta;
import com.objects.Produto;

import java.util.List;
import java.util.Optional;

public interface IProdutoDao {
    Produto salvar(Produto produto);
    void deletar(Produto produto);
    Produto atualizar(Produto produto);
    List<Produto> todos();
    List<Produto> pesquisar(String s);
    Optional<Produto> pesquisarPorCodigo(String s);

}
