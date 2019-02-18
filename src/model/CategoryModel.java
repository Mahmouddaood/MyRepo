package model;

import entities.Category;

public class CategoryModel extends AbstractModel<Category> {

	
	
	
	public CategoryModel() {
		super(Category.class);
		// TODO Auto-generated constructor stub
	}

	
	/*
	public List<Account> search(String keyword) {
		List<Account> accounts = null;
		Session session = null;
		Transaction transaction = null;
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			org.hibernate.query.Query query = session.createQuery("select a from Account a where a.fullName like :keyword");
			query.setParameter("keyword", "%" + keyword + "%");
			accounts = query.getResultList();
			transaction.commit();
		} catch (Exception e) {
			accounts = null;
			if (transaction != null) {
				transaction.rollback();
			}
		} finally {
			session.close();
		}
		return accounts;
	}*/
	
}
