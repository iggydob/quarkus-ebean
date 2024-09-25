package org.acme;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

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
}

