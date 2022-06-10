package br.com.main;
/*
Diego Sousa rm87910
Giovana Nelo rm88936
*/

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.dao.BairroDao;
import br.com.dao.CidadeDao;
import br.com.dao.EstadoDao;
import br.com.dao.LogradouroDao;
import br.com.dao.TipoLogradouroDao;
import br.com.dao.impl.*;
import br.com.entity.Bairro;
import br.com.entity.Cidade;
import br.com.entity.Estado;
import br.com.entity.Logradouro;
import br.com.entity.TipoLogradouro;
import br.com.exception.CommitException;
import br.com.singleton.EntityManagerFactorySingleton;

public class Main {
    public static void main(String[] args) throws CommitException {
        EntityManagerFactory fabrica = EntityManagerFactorySingleton.getInstance();

        EntityManager em = fabrica.createEntityManager();

        EstadoDao estadoDao = new EstadoDaoImpl(em);
        Estado estado = new Estado("São Paulo", "SP");
        estadoDao.cadastrar(estado);
        estadoDao.commit();

        CidadeDao cidadeDao = new CidadeDaoImpl(em);
        Cidade cidade = new Cidade(estado, "Osasco");
        cidadeDao.cadastrar(cidade);
        cidadeDao.commit();

        BairroDao bairroDao = new BairroDaoImpl(em);
        Bairro bairro = new Bairro(cidade, "Bela Vista");
        bairroDao.cadastrar(bairro);
        bairroDao.commit();

        TipoLogradouroDao tipoLogradouroDao = new TipoLogradouroDaoImpl(em);
        TipoLogradouro tipoLogradouro = new TipoLogradouro("Casa");
        tipoLogradouroDao.cadastrar(tipoLogradouro);
        tipoLogradouroDao.commit();

        LogradouroDao logradouroDao = new LogradouroDaoImpl(em);
        Logradouro logradouro = new Logradouro(tipoLogradouro, bairro, 1, "Casa", 0000000);
        logradouroDao.cadastrar(logradouro);
        logradouroDao.commit();

    }
}
