package br.com.dao.impl;

import br.com.dao.GenericDao;
import br.com.exception.CommitException;
import br.com.exception.IdNotFoundException;

import javax.persistence.EntityManager;
import java.lang.reflect.ParameterizedType;

public abstract class GenericDaoImpl<T, K> implements GenericDao<T, K> {

    protected EntityManager em;

    private Class<T> clazz;

    @SuppressWarnings("all")
    public GenericDaoImpl(EntityManager em) {
        this.em = em;
        this.clazz = (Class<T>)
                ((ParameterizedType) getClass().getGenericSuperclass())
                        .getActualTypeArguments()[0];
    }

    public void cadastrar(T entidade) {
        em.persist(entidade);
    }

    public void atualizar(T entidade) {
        em.merge(entidade);
    }

    public T buscar(K id) throws IdNotFoundException {
        T entidade = em.find(clazz, id);
        if (entidade == null) {
            throw new IdNotFoundException();
        }
        return entidade;
    }

    public void deletar(K id) throws IdNotFoundException {
        em.remove(buscar(id));
    }

    public void commit() throws CommitException {
        try {
            em.getTransaction().begin();
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
            throw new CommitException();
        }
    }
}
