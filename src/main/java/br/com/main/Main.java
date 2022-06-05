package br.com.main;


import br.com.dao.EstadoDao;
import br.com.dao.impl.EstadoDaoImpl;
import br.com.entity.Estado;
import br.com.exception.CommitException;
import br.com.singleton.EntityManagerFactorySingleton;

import javax.persistence.*;

public class Main {
    public static void main(String[] args) throws CommitException {
        EntityManagerFactory fabrica = EntityManagerFactorySingleton.getInstance();

        EntityManager em = fabrica.createEntityManager();

        EstadoDao estadoDao = new EstadoDaoImpl(em);

        Estado estado = new Estado("São Paulo", "SP");

        estadoDao.cadastrar(estado);
        estadoDao.commit();

    }
}
