package model;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import entities.Product;

public class ProductModel extends AbstractModel<Product> {

	
	
	
	public ProductModel() {
		super(Product.class);
		// TODO Auto-generated constructor stub
	}

	
	@SuppressWarnings("unchecked")
	public List<Product> findRelated(Product product) {
		List<Product> products = null;
		Session session = null;
		Transaction transaction = null;
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			products = session.createQuery("select p from Product p where p.id !=:id and p.category=:category").
					setInteger("id", product.getId()).
					setParameter("category", product.getCategory())
					.list();
			
			transaction.commit();
		} catch (Exception e) {
			products = null;
			if (transaction != null) {
				transaction.rollback();
			}
		} finally {
			session.close();
		}
		return products;
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Product> findNewProducts(int n) {
		List<Product> products = null;
		Session session = null;
		Transaction transaction = null;
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			products = session.createQuery("select p from Product p order by p.id desc ").
					setMaxResults(n)
					.list();
			
			transaction.commit();
		} catch (Exception e) {
			products = null;
			if (transaction != null) {
				transaction.rollback();
			}
		} finally {
			session.close();
		}
		return products;
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Product> findFeatured(int n) {
		List<Product> products = null;
		Session session = null;
		Transaction transaction = null;
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			products = session.createQuery("select p from Product p where p.featured =:featured order by p.id desc ").
					setMaxResults(n)
					.setBoolean("featured", true).setMaxResults(n)
					.list();
			
			transaction.commit();
		} catch (Exception e) {
			products = null;
			if (transaction != null) {
				transaction.rollback();
			}
		} finally {
			session.close();
		}
		return products;
	}
	
	
	
	@SuppressWarnings("unchecked")
	public List<Product> findSpecialProducts(boolean featured) {
		List<Product> products = null;
		Session session = null;
		Transaction transaction = null;
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			products = session.createQuery("select p from Product p where p.featured = ?1").setParameter(1, featured).list();
				
			transaction.commit();
		} catch (Exception e) {
			products = null;
			if (transaction != null) {
				transaction.rollback();
			}
		} finally {
			session.close();
		}
		return products;
	}
	

	
}
