package br.com.dao.impl;

import br.com.dao.EstadoDao;
import br.com.entity.Estado;

import javax.persistence.EntityManager;

public class EstadoDaoImpl extends GenericDaoImpl<Estado, Integer> implements EstadoDao {
    public EstadoDaoImpl(EntityManager em) {
        super(em);
    }
}
