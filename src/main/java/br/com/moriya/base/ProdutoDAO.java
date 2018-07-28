package br.com.moriya.base;

import javax.persistence.EntityManager;

import br.com.moriya.framework.persistence.DaoJpa2;
import br.com.moriya.modelo.Produto;

public class ProdutoDAO extends DaoJpa2<Produto>{

	public ProdutoDAO(EntityManager entityManager) {
        super(Produto.class, entityManager);
    }
}
