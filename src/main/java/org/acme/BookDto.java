package org.acme;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class BookDto {
    private String title;
    private Integer year;
    private Integer authorId;
    private Boolean deleted;
}
