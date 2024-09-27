-- This file allow to write SQL commands that will be emitted in test and dev.
-- The commands are commented as their support depends of the database
INSERT INTO authors (id, version, when_created, when_modified, full_name) VALUES
('5894b2b5-b2fb-44c4-8cf1-9285c90bbef0', 1, '2024-09-27 07:22:59.501000 +00:00', '2024-09-27 07:22:59.501000 +00:00', 'J.R.R. Tolkien'),
('9b082a66-f325-4d04-909b-dbb6bcab5d93', 1, '2024-09-27 07:23:58.254000 +00:00', '2024-09-27 07:23:58.254000 +00:00', 'J. K. Rowling');


INSERT INTO public.books (id, title, year, author_id, deleted, when_created, when_modified, version) VALUES
('8240dfa1-5532-4c45-9e74-7874b9ff780c', 'Philosopher''s Stone', 1997, '9b082a66-f325-4d04-909b-dbb6bcab5d93', false, '2024-09-27 06:44:48.922000 +00:00', '2024-09-27 06:44:48.922000 +00:00', 1),
('88d2ec0e-2b74-49b0-b5ae-18f78b9298c4', 'Chamber of Secrets', 1998, '9b082a66-f325-4d04-909b-dbb6bcab5d93', false, '2024-09-27 06:47:18.103000 +00:00', '2024-09-27 06:47:18.103000 +00:00', 1),
('86c5cc61-e206-4cc6-b583-233dbca2097b', 'Prisoner Of Azkaban', 1999, '9b082a66-f325-4d04-909b-dbb6bcab5d93', false, '2024-09-27 06:47:29.433000 +00:00', '2024-09-27 06:47:29.433000 +00:00', 1),
('24acb6c9-770c-4f19-b413-7a51d10e5859', 'Goblet of Fire', 2000, '9b082a66-f325-4d04-909b-dbb6bcab5d93', false, '2024-09-27 06:47:43.038000 +00:00', '2024-09-27 06:47:43.038000 +00:00', 1),
('99bc88dc-c7a5-4423-bc31-91118e825512', 'Order of the Phoenix', 2003, '9b082a66-f325-4d04-909b-dbb6bcab5d93', false, '2024-09-27 06:47:54.716000 +00:00', '2024-09-27 06:47:54.716000 +00:00', 1),
('42b4b9da-ae4b-4dbe-9e74-14e90b531b9d', 'Half-Blood Prince', 2005, '9b082a66-f325-4d04-909b-dbb6bcab5d93', false, '2024-09-27 06:48:07.225000 +00:00', '2024-09-27 06:48:07.225000 +00:00', 1),
('c9384aad-2f57-4d88-abef-6d86ec1f9a54', 'Deathly Hallows', 2007, '9b082a66-f325-4d04-909b-dbb6bcab5d93', false, '2024-09-27 06:48:18.641000 +00:00', '2024-09-27 06:48:18.641000 +00:00', 1),
('55d56ae7-df08-46c2-9886-6f183349d10d', 'The Hobbit', 1937, '5894b2b5-b2fb-44c4-8cf1-9285c90bbef0', false, '2024-09-27 06:48:40.489000 +00:00', '2024-09-27 06:48:40.489000 +00:00', 1),
('1cc66a43-2ab2-4078-81e8-9093cd336053', 'The Children of Húrin', 2007, '5894b2b5-b2fb-44c4-8cf1-9285c90bbef0', false, '2024-09-27 06:48:56.348000 +00:00', '2024-09-27 06:48:56.348000 +00:00', 1),
('4b54b022-ce32-44b7-82e1-6b78c29b3669', 'The Silmarillion', 1977, '5894b2b5-b2fb-44c4-8cf1-9285c90bbef0', false, '2024-09-27 06:49:10.178000 +00:00', '2024-09-27 06:49:10.178000 +00:00', 1);