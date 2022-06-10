package br.com.dao.impl;

import br.com.dao.EstadoDao;
import br.com.entity.Estado;
import java.util.List;
import javax.persistence.EntityManager;

public class EstadoDaoImpl extends GenericDaoImpl<Estado, Integer> implements EstadoDao {
    public EstadoDaoImpl(EntityManager entityManager) {
        super(entityManager);
    }

    public List<Estado> buscarPorParteNome(String nome) {
        return em.createQuery("from Estado e where lower(e.name) like lower(:n) order by e.name", Estado.class)
                .setParameter("n", "%" + nome + "%")
                .getResultList();
    }
}
