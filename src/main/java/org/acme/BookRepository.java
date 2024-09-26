package org.acme;

import io.ebean.DB;
import jakarta.enterprise.context.ApplicationScoped;
import lombok.extern.slf4j.Slf4j;
import org.acme.query.QBook;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Slf4j
@ApplicationScoped
public class BookRepository {

    public List<Book> getAll() {
        return new QBook()
                .orderBy()
                .year.asc()
                .findList();
    }

    public void create(Book book) {
        DB.save(book);
    }

    public Book getByUUID(UUID uuid) {
        return DB.find(Book.class)
                .where()
                .eq("id", uuid)
                .findOne();
    }

    public Optional<Book> getById(UUID id) {
        Optional<Book> result = new QBook()
                .id.equalTo(id)
                .findOneOrEmpty();
        return result;
    }

    public void delete(UUID id) {
        DB.delete(getByUUID(id));
    }
}
