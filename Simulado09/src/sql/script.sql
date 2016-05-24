drop database if exists simulado01;
create database simulado01;
use simulado01;

create table cliente(
	idcliente integer auto_increment,
	nome varchar(50) not null,
	email varchar(50) not null,
	primary key(idcliente));
	
desc cliente;
	
