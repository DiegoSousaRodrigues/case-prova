package br.com.dao;

import br.com.entity.Estado;

import java.util.List;

public interface EstadoDao extends GenericDao<Estado, Integer> {
    List<Estado> buscarPorParteNome(String nome);
}
