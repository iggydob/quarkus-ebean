package org.acme.Author;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.acme.BaseDomain;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(schema = "public", name = "authors")
public class Author extends BaseDomain {

    @Column (name = "full_name")
    private String fullName;

//    @OneToMany(fetch = FetchType.LAZY,
//            mappedBy = "author",
//            cascade = CascadeType.ALL)
//    private List<Book> books;
}
