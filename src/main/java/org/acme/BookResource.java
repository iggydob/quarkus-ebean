package org.acme;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Path("/api")
@RequiredArgsConstructor
public class BookResource {

    @Inject
    BookRepository bookRepository;

    @GET
    @Path("/{id}")
    public Optional<Book> getById(@PathParam("id") UUID id) {
        return bookRepository.getById(id);
    }

    @GET
    public List<Book> getAll() {
        return bookRepository.getAll();
    }

    @POST
    @Path("/create")
//    @Consumes(MediaType.APPLICATION_JSON)
    public void create(Book bookDto) {
        Book book = new Book();
        book.setTitle(bookDto.getTitle());
        book.setYear(bookDto.getYear());
        book.setAuthorId(bookDto.getAuthorId());
        bookRepository.create(book);
    }
}
