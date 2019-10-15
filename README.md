# livraria
Projeto para estudo de programação orientada a objetos em Java.

### Banco de dados
* Criar o banco de dados no PostgreSQL.
``` SQL
CREATE DATABASE livraria;

CREATE TABLE produtos(
id_produto SERIAL,
nome VARCHAR(60),
descricao VARCHAR(60),
valor NUMERIC(12,2),
isbn VARCHAR(20),
CONSTRAINT pk_produtos_id_produto PRIMARY KEY(id_produto)
);
```