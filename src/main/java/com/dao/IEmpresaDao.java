package com.dao;

import com.model.Empresa;

import java.util.List;
import java.util.Optional;

public interface IEmpresaDao {
    public Empresa  salvar(Empresa empresa);
    public void     excluir(Integer id);
    public List<Empresa> pesquisarTodas();
    public Optional<Empresa> pesquisarNome(String string);

}
