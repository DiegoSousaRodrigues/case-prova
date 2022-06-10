package br.com.dao.impl;

import br.com.dao.BairroDao;
import br.com.entity.Bairro;

import javax.persistence.EntityManager;

public class BairroDaoImpl extends GenericDaoImpl<Bairro, Integer> implements BairroDao {
    public BairroDaoImpl(
            EntityManager em) {
        super(em);

    }
}
