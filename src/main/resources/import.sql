-- This file allow to write SQL commands that will be emitted in test and dev.
-- The commands are commented as their support depends of the database
INSERT INTO public.books (id, title, year, author_id)
VALUES ('419fb9d0-bd6b-4491-8d4b-aeb2ceaa2ede', 'Philosopher''s Stone', 1997, 1),
       ('f1a87829-2006-4b38-a662-3619c00ea8c3', 'Chamber of Secrets', 1998, 1),
       ('de6d54e8-95d0-4987-994f-75f2954f11e1', 'Prisoner Of Azkaban', 1999, 1),
       ('3416e3c4-532f-4c86-9294-70b65a34e9ee', 'Goblet of Fire', 2000, 1),
       ('fa837426-7477-4215-a3fe-d5cba43f9e98', 'Order of the Phoenix', 2003, 1),
       ('917cd519-d005-4cab-8fe9-42886739b023', 'Half-Blood Prince', 2005, 1),
       ('e54a50d7-8f72-479f-9314-299c4c9c8a4c', 'Deathly Hallows', 2007, 1),
       ('0372888e-e68b-4f36-a022-e194d671ebbf', 'The Hobbit', 1937, 2),
       ('e930a45e-77c2-4800-b14b-9cf003eb5194', 'The Children of Húrin', 2007, 2),
       ('ee8d2080-10e9-4007-9f4b-1d1a3d63a137', 'The Silmarillion', 1977, 2);