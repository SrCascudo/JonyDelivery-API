CREATE TABLE cliente (
  id bigserial not null,
  nome varchar(120) not null,
  email varchar(120) not null,
  telefone varchar(11),
  dtcadastro timestamp,
  dtalteracao timestamp,
  registro integer,

  primary key (id)
);