-- SELECT * FROM luizcarlosdb.cliente;
 -- use luizcarlosdb;
 -- describe cliente;
-- insert into cliente(nome, endereco, telefone, email)
-- values('Luiz Jr', 'Rua 10, 34', '2333-4453', 'lulu@lulu.com')
-- select * from cliente;
-- alter table usuario add column perfil char(30) not null;
-- a instrução abaixo seleciona e ordena por nome todos os clientes cadastrados
-- select * from cliente order by nomecli;
-- O BLOCO DE INSTRUÇÕES ABAIXO FAZ A SELEÇÃO E UNIÃO ENTRE DUAS TABELAS
-- OSER É UMA VARIAVEL QUE CONTEM OS CAMPOS DESEJADOS DA TABELA OS
-- CLI É OUTRA VARIÁVEL QUE CONTÉM OS CAMPOS DESEJADOS DA TABELA CLIENTE
-- select
-- OSER.os,data_os,tipo,situacao,equipamento,valor,
-- CLI.nomecli,telefonecli
-- from os as OSER
-- inner join cliente as CLI
-- on (CLI.idcli = OSER.idcliente);


