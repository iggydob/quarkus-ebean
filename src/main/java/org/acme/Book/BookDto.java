package org.acme.Book;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@AllArgsConstructor
@Getter
@Setter
public class BookDto {
    private String title;
    private Integer year;
    private UUID authorId;
    private Boolean deleted;
}
