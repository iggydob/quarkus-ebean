package org.acme.Book;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Path("/books")
@RequiredArgsConstructor
public class BookResource {

    @Inject
    BookRepository bookRepository;

    @Inject
    BookMapper bookMapper;

    @GET
    @Path("/{id}")
    public Optional<Book> getById(
            @PathParam("id") UUID id) {
        System.out.println("Hello world");
        return bookRepository.getById(id);
    }

    @GET
    public List<Book> getAll() {
        return bookRepository.getAll();
    }

    @POST
    @Path("/create")
    public void create(
            BookDto bookDto) {
        bookRepository.create(bookMapper.mapToBook(bookDto));
    }

    @PATCH
    @Path("/delete/{id}")
    public void delete(
            @PathParam("id") UUID id) {
        bookRepository.delete(id);
    }
}
