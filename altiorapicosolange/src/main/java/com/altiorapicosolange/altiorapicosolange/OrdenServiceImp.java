package com.altiorapicosolange.altiorapicosolange;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrdenServiceImp implements OrdenService {

	@Autowired
	private OrdenRepositorio repositorioO;
	@Autowired
	EntityManagerFactory emf;

	
	@Override
	public List<OrdenByCliente> listarOrdenesCliente(int code) {
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery(
				"SELECT new com.altiorapicosolange.altiorapicosolange.OrdenByCliente (e.numeroOrden as numeroOrden, concat(c.nombreCliente, ' ', c.apellidoCliente) as nombreCliente, a.barCodeArticulo as barCodeArticulo, "
						+ "a.nombreArticulo as nombreArticulo, e.fechaOrden as fechaOrden) " + "FROM article_order e "
						+ "LEFT JOIN article_order_detail od on od.ord_code = e.numeroOrden "
						+ "LEFT JOIN client c on c.codeCliente = e.codeClienteOrden "
						+ "LEFT JOIN article a on a.codeArticulo = od.ord_art_code "
						+ "WHERE e.codeClienteOrden = :code");
		query.setParameter("code", code);
		@SuppressWarnings("unchecked")
		List<OrdenByCliente> resultList = (List<OrdenByCliente>) query.getResultList();
		for(int i=0; i<resultList.size(); i++) {
			System.out.print("query: " + resultList.get(i));
		}
		em.close();
		return resultList;
	}

	@Override
	public Orden crearOrden(Orden ord) {		
		return repositorioO.save(ord);
	}
	
	@Override
	public void actualizarStock(int codeArt, double stockNuevo){
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Query queryArt = em.createQuery(
				"UPDATE article a set a.stockArticulo = :stockNuevo where a.codeArticulo = :codeArt");
		queryArt.setParameter("codeArt", codeArt);
		queryArt.setParameter("stockNuevo", stockNuevo);
		queryArt.executeUpdate();
		em.getTransaction().commit();
		em.close();
	}
}
