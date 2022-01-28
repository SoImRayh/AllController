package com.dao;

import com.model.User;

public interface IUsuarioDao {

    void cadastrar(User user);

    void excluir(String cpf);
}
