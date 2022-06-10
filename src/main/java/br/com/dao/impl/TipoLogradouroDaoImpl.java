package br.com.dao.impl;

import br.com.dao.TipoLogradouroDao;
import br.com.entity.TipoLogradouro;

import javax.persistence.EntityManager;

public class TipoLogradouroDaoImpl extends GenericDaoImpl<TipoLogradouro, Integer> implements TipoLogradouroDao {
    public TipoLogradouroDaoImpl(EntityManager em) {
        super(em);

    }
}
