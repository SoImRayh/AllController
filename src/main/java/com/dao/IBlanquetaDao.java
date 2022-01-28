package com.dao;

import com.model.Blanqueta;
import com.model.Maquina;

import java.util.List;
import java.util.Optional;

public interface IBlanquetaDao {
    Blanqueta salvar(Blanqueta blanqueta);
    Blanqueta atualizar(Blanqueta blanqueta);
    void deletar(String lozalizacao);
    List<Blanqueta> todas();
    Optional<Blanqueta> acharPorPosicao(String posicao);
    List<Blanqueta> acharPorMaquina(Maquina manquina);
    String toSqlString(String string);
}
