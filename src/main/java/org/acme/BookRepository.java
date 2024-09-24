package org.acme;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;
import java.util.UUID;

@ApplicationScoped
public class BookRepository {
    @Inject
    SessionFactory sessionFactory;

    public List<Book> getAll() {
        try (Session session = sessionFactory.openSession()) {
            Query<Book> query = session.createQuery("FROM Book", Book.class);
            return query.list();
        }
    }

    public void create(Book book) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.persist(book);
            session.getTransaction().commit();
        }
    }

    public Book getById(UUID id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Book.class, id);
        }
    }
}
