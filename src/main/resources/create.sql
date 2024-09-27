CREATE TABLE public.authors
(
    id            UUID NOT NULL,
    version       BIGINT,
    when_created  TIMESTAMP with time zone,
    when_modified TIMESTAMP with time zone,
    full_name     VARCHAR(255),
    CONSTRAINT pk_authors PRIMARY KEY (id)
);

alter table authors
    owner to portal;

CREATE TABLE public.books
(
    id            UUID NOT NULL,
    version       BIGINT,
    when_created  TIMESTAMP with time zone,
    when_modified TIMESTAMP with time zone,
    title         VARCHAR(255),
    year          INTEGER,
    author_id     UUID,
    deleted       BOOLEAN,
    CONSTRAINT pk_books PRIMARY KEY (id)
);

ALTER TABLE public.books
    ADD CONSTRAINT FK_BOOKS_ON_AUTHOR FOREIGN KEY (author_id) REFERENCES public.authors (id);

alter table books
    owner to portal;