package br.com.dao.impl;

import br.com.dao.CidadeDao;
import br.com.entity.Cidade;

import javax.persistence.EntityManager;

public class CidadeDaoImpl extends GenericDaoImpl<Cidade, Integer> implements CidadeDao {
    public CidadeDaoImpl(EntityManager em) {
        super(em);
    }
}

