package com.dao;

import com.model.Processo;

import java.util.List;
import java.util.Optional;

public interface IProcessoDao {
    Processo salvar(Processo processo);
    void excluir(Processo processo);
    Processo Atualizar(Processo processo);
    Optional<Processo> pesquisarID(String id);
    List<Processo> todos();

}
