package com.dao;

import com.model.Processo;

import java.util.List;
import java.util.Optional;

public class ProcessoDao implements IProcessoDao {
    @Override
    public Processo salvar(Processo processo) {
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
