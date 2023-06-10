CREATE DATABASE escola;

CREATE TABLE alunos (
nome varchar(30),
idade tinyint(3),
altura float,
peso float,
sexo varchar(40),
cpf varchar(14),
data date,
cep varchar(14),
telefone varchar(14),
email varchar(40)
)


CREATE TABLE professores (
nome varchar(30),
idade tinyint(3),
sexo varchar(40),
cpf varchar(14),
data date,
cep varchar(14),
telefone varchar(14),
email varchar(40),
formacao varchar(50),
materia varchar(50)
)


CREATE TABLE lusuarios(
    login VARCHAR(30),
    senha VARCHAR(30)
)
