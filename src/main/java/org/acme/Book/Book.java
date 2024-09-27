package org.acme.Book;

import io.ebean.annotation.SoftDelete;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.acme.BaseDomain;

import java.util.UUID;

/**
 * Ebean does not need a default constructor and this means we can give our entity bean a constructor that takes arguments. Typically the arguments are properties that should always be supplied when creating a new bean of that type (and by implication are typically non-nullable).
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(schema = "public", name = "books")
public class Book extends BaseDomain {

    private String title;
    private Integer year;

    @Column(name = "author_id")
    private Integer authorId;

    /**
     * Add a boolean property to your entity beans to indicate the deleted state. This property must be a boolean type with a true value meaning that the row/bean has been logically deleted.
     */
    @SoftDelete
    private Boolean deleted;
}
