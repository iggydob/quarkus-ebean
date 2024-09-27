package org.acme.Author;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Path("/authors")
@RequiredArgsConstructor
public class AuthorResource {

    @Inject
    AuthorRepository authorRepository;

    @GET
    public List<Author> getAll() {
        return authorRepository.getAll();
    }

    @POST
    @Path ("/create")
    public void create(Author author) {
        authorRepository.create(author);
    }
}
