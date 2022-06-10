package br.com.main;

import br.com.dao.EstadoDao;
import br.com.dao.impl.EstadoDaoImpl;
import br.com.entity.Estado;
import br.com.singleton.EntityManagerFactorySingleton;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

public class Pesquisar {
    public static void main(String[] args) {
        EntityManagerFactory fabrica = EntityManagerFactorySingleton.getInstance();
        EntityManager em = fabrica.createEntityManager();

        EstadoDao estadoDao = new EstadoDaoImpl(em);

        List<Estado> estados = estadoDao.buscarPorParteNome("Sa");

        for (Estado item: estados) {
            System.out.println(item.getName());
        }
    }
}
