package org.acme.Book;

import io.ebean.annotation.SoftDelete;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
public class Book {
    /**
     * <p>When we annotate a property with <code>@Id</code> Ebean will automatically assign an
     * appropriate <code>Id</code> generator if the type is a <code>number</code> type or <code>UUID</code> type.
     * <p> That is, with Ebean it is effectively redundant to also add the <code>@GeneratedValue</code> annotation.
     * <p> This behaviour can be disabled using idGeneratorAutomatic configuration property.
     */
    @Id
    private UUID id;
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
