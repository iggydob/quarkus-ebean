package org.acme.Author;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.acme.BaseDomain;
import org.acme.Book.Book;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(schema = "public", name = "authors")
public class Author extends BaseDomain {

    @Column(name = "full_name")
    private String fullName;

    /**
     * The <code>mappedBy</code> attribute should be defined in most @OneToMany. The mappedBy attribute effectively refers to the other side of the relationship.
     */

    @OneToMany(/*fetch = FetchType.LAZY*/
            mappedBy = "author")
    private List<Book> books;
}
