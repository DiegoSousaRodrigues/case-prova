package br.com.dao.impl;

import br.com.dao.LogradouroDao;
import br.com.entity.Logradouro;

import javax.persistence.EntityManager;

public class LogradouroDaoImpl extends GenericDaoImpl<Logradouro, Integer> implements LogradouroDao{
    public LogradouroDaoImpl(EntityManager em) {
        super(em);
    }
}
