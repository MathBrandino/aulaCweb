package br.com.caelum.pirata.daos;

import javax.persistence.EntityManager;

import br.com.caelum.pirata.models.Categoria;
import br.com.caelum.vraptor.ioc.Component;

@Component
public class CategoriaDao extends Dao<Categoria> {

	public CategoriaDao(EntityManager manager) {
		super(manager);
	}
	
}
