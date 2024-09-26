package org.acme;

import jakarta.inject.Singleton;
import lombok.RequiredArgsConstructor;

@Singleton
@RequiredArgsConstructor
public class BookMapper {

    public Book mapToBook(BookDto bookDto) {
        Book book = new Book();

        book.setTitle(bookDto.getTitle());
        book.setYear(bookDto.getYear());
        book.setAuthorId(bookDto.getAuthorId());
        book.setDeleted(false);

        return book;
    }
}
