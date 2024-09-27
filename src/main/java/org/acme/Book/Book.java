package org.acme.Book;

import io.ebean.annotation.SoftDelete;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.acme.Author.Author;
import org.acme.BaseDomain;

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

    /**
     * <p>JPA mapping encourages the use of <code>FetchType.EAGER</code> and <code>LAZY</code> which is contrary to Ebean's query approach which instead looks to optimise the queries per use case (and provides automatic query tuning by profiling the application).
     * <p>The use of <code>EAGER</code> <code>LAZY</code> mapping annotations is generally not useful when using Ebean.
     */
    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    /**
     * Add a boolean property to your entity beans to indicate the deleted state. This property must be a boolean type with a true value meaning that the row/bean has been logically deleted.
     */
    @SoftDelete
    private Boolean deleted;
}
