package br.com.caelum.pirata.daos;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;

public abstract class Dao<T> {

	protected EntityManager manager;
	private Class<T> clazz;
	
	@SuppressWarnings("unchecked")
	public Dao(EntityManager manager) {
		this.manager = manager;
		this.clazz = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	public void salva(T objeto) {
		manager.persist(objeto);
	}
	
	public void remove(T objeto) {
		manager.remove(objeto);
	}
	
	public void atualiza(T objeto) {
		manager.merge(objeto);
	}
	
	public T buscaPorId(int id) {
		return manager.find(clazz, id); 
	}
	
	@SuppressWarnings("unchecked")
	public List<T> buscaTodos() {
		return manager.createQuery("from " + clazz).getResultList();
	}
}
