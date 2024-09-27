package org.acme.Book;

import io.ebean.DB;
import io.ebean.Query;
import io.smallrye.common.constraint.NotNull;
import jakarta.enterprise.context.ApplicationScoped;
import lombok.extern.slf4j.Slf4j;
import org.acme.Book.query.QBook;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Slf4j
@ApplicationScoped
public class BookRepository {

    public List<Book> getAll() {
        return DB.find(Book.class)
                .findList();
    }

    public void create(Book book) {
        DB.save(book);
    }

    public Book getByUUID(UUID uuid) {
        Book book = new Book();
        book = DB.find(Book.class)
                .where()
                .eq("id", uuid)
                .findOne();
        return book;
    }

    public Optional<Book> getById(UUID id) {
        Optional<Book> result = new QBook()
                .id.equalTo(id)
                .findOneOrEmpty();
        return result;
    }

    /**
     * Make as much of the model NOT NULL as we can - prefer DB columns to have the NOT NULL constraint if possible. Reduce the amount of 3 valued logic required - have a "tighter" model
     */
    @NotNull
    public void delete(UUID id) {
        DB.delete(getByUUID(id));
    }
}
