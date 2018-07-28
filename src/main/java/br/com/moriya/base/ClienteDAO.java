package br.com.moriya.base;

import br.com.moriya.framework.persistence.DaoJpa2;
import br.com.moriya.modelo.Cliente;

import javax.persistence.EntityManager;

/**
 *
 * @author Jose Alves
 */
public class ClienteDAO extends DaoJpa2<Cliente>{

    public ClienteDAO(EntityManager entityManager) {
        super(Cliente.class, entityManager);
    }
    
}
