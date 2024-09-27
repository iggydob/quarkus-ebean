package org.acme.Book;

import jakarta.inject.Singleton;
import lombok.RequiredArgsConstructor;
import org.acme.Author.AuthorRepository;

@Singleton
@RequiredArgsConstructor
public class BookMapper {

    private final AuthorRepository authorRepository;

    public Book mapToBook(BookDto bookDto) {
        Book book = new Book();

        book.setTitle(bookDto.getTitle());
        book.setYear(bookDto.getYear());
        book.setAuthor(authorRepository.getAuthorById(bookDto.getAuthorId()));
        book.setDeleted(false);

        return book;
    }
}
