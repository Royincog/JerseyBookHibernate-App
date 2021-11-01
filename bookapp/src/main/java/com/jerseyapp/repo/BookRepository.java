package com.jerseyapp.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import com.jerseyapp.model.Book;

@Transactional(Transactional.TxType.SUPPORTS)
public class BookRepository {

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("booksPU");
	private EntityManager em = emf.createEntityManager();
	
	@Transactional(Transactional.TxType.REQUIRED)
	public void createBook(Book book) {
		em.getTransaction().begin();
		em.persist(book);
		em.getTransaction().commit();
	}
	
	public void close() {
		emf.close();
	}
	
	public List<Book> showListofBooks(){
		TypedQuery<Book> query = em.createQuery("SELECT b FROM Book b",Book.class);
		return query.getResultList();
	}

	public void deleteBook(int bookId) {
		em.getTransaction().begin();
		em.remove(em.getReference(Book.class, bookId));
		em.getTransaction().commit();
	}
	
}
