ALTER TABLE topicos
MODIFY COLUMN mensaje VARCHAR(200) NOT NULL;

ALTER TABLE topicos
ADD CONSTRAINT unique_titulo_mensaje UNIQUE (titulo, mensaje);