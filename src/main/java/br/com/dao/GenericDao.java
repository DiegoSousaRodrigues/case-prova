package br.com.dao;

import br.com.exception.CommitException;
import br.com.exception.IdNotFoundException;

public interface GenericDao<T, K> {

    void cadastrar(T entidade);

    void atualizar(T entidade);

    T buscar(K id) throws IdNotFoundException;

    void deletar(K id) throws IdNotFoundException;

    void commit() throws CommitException;

}
