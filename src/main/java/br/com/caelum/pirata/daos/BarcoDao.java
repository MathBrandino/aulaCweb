package br.com.caelum.pirata.daos;

import javax.persistence.EntityManager;

import br.com.caelum.pirata.models.Barco;
import br.com.caelum.vraptor.ioc.Component;

@Component
public class BarcoDao extends Dao<Barco>{

	public BarcoDao(EntityManager manager) {
		super(manager);
	}

}
