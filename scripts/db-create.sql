DROP user IF EXISTS fierita;
CREATE USER fierita WITH ENCRYPTED PASSWORD 'contratame';

CREATE DATABASE linktrackerdb
 WITH OWNER = fierita;

GRANT ALL PRIVILEGES ON DATABASE linktrackerdb TO fierita;
-- Table: link  fisrt connect to linktracker db with \c
\c linktrackerdb fierita

CREATE TABLE link (
  id bigserial NOT NULL,
  url_target character varying(255) ,
  expiration timestamp without time zone,
  clicks integer,
  shortened character varying(255),
  CONSTRAINT link_pkey PRIMARY KEY (id)
) TABLESPACE pg_default;
ALTER TABLE link OWNER to fierita;

INSERT INTO link (id, url_target, expiration, clicks, shortened, token, valid) 
  VALUES (1, 'https://www.example.com', '2020-10-18 00:00:00', 3, 'http://localhost:8080/l/a', 1234567890, 1 );

SELECT * FROM link;
