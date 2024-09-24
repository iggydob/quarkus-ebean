package org.acme;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import lombok.RequiredArgsConstructor;
import org.jboss.resteasy.reactive.RestForm;

import java.util.List;
import java.util.UUID;

@Path("/api")
@RequiredArgsConstructor
public class GreetingResource {

    @Inject
    BookRepository bookRepository;

//    @Inject
//    public GreetingResource(BookRepository bookRepository) {
//        this.bookRepository = bookRepository;
//    }

    @GET
    @Path("/hello")
    public String hello() {
        return "Hello from Quarkus REST";
    }

    @GET
    @Path("/{id}")
    public Book getById(@PathParam("id") UUID id) {
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
