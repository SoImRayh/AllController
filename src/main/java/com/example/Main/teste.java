package com.example.Main;

import com.dao.BlanquetaDao;
import com.dao.ProdutoDao;
import com.model.Blanqueta;
import com.model.Produto;

public class teste {
    public static void main(String[] args) {
        ProdutoDao produtoDao = new ProdutoDao();
        BlanquetaDao blanquetaDao = new BlanquetaDao();
        Produto produto = produtoDao.pesquisarPorCodigo("ca2594").orElseThrow();
        Blanqueta blanqueta = blanquetaDao.acharPorPosicao("a25").orElseThrow();

        System.out.println(produto +""+ blanqueta);
    }
}
