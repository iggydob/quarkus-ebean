package org.acme;

import io.ebean.DB;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.acme.query.QBook;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@ApplicationScoped
public class BookRepository {

    public List<Book> getAll() {
        return new QBook()
                .findList();
    }

    public void create(Book book) {

    }

    public Optional<Book> getById(UUID id) {
        Optional<Book> result = new QBook()
                .id.equalTo(id)
                .findOneOrEmpty();
        return result;
    }
}
