package org.acme.Author;

import io.ebean.DB;
import jakarta.enterprise.context.ApplicationScoped;
import lombok.extern.slf4j.Slf4j;
import org.acme.Author.query.QAuthor;

import java.util.List;
import java.util.UUID;

@Slf4j
@ApplicationScoped
public class AuthorRepository {
    public List<Author> getAll() {
        return new QAuthor()
                .findList();
    }

//    public List<Author> getAll() {
//        return DB.find(Author.class)
//                .fetchLazy("authors","books")
//                .findList();
//    }

    public void create(Author author) {
        DB.save(author);
    }

    public Author getAuthorById(UUID id) {
        return DB.find(Author.class, id);
    }
}
