create database gamaitau;

use gamaitau;
# Esta linha é um comentário

#DDL - trabalhando somente com a estrutura
CREATE TABLE funcionarios (
    matricula INT AUTO_INCREMENT,
    nome VARCHAR(40) NOT NULL,
    endereco VARCHAR(80),
    PRIMARY KEY (matricula),
    dataadmissao DATE,
    datanascimento DATE,
    departamento VARCHAR(30)
);

CREATE TABLE dependentes (
    codigo INT AUTO_INCREMENT,
    nome VARCHAR(50),
    datanascimento DATE,
    matricula INT,
    PRIMARY KEY (codigo),
    FOREIGN KEY (matricula)
        REFERENCES funcionarios (matricula)
);

CREATE TABLE projetos (
    codigo INT AUTO_INCREMENT,
    PRIMARY KEY (codigo),
    descricao VARCHAR(60),
    datainicio DATE,
    datatermino DATE
);

create table historico_projetos (
	matricula int,
    codigo_projeto int,
    primary key (matricula, codigo_projeto),
    foreign key (matricula) references funcionarios(matricula),
    foreign key (codigo_projeto) references projetos(codigo),
    dataentrada date,
    datasaida date
);

alter table dependentes drop column endereco;

alter table dependentes add matricula int;

drop table dependentes;

# Inserção de dados nas tabelas

insert into funcionarios(matricula, nome, endereco, dataadmissao, datanascimento, departamento, salario) values (null, "Kaka", "Rua Guaratuba", 
str_to_date("17/04/2015","%d/%m/%Y"),
str_to_date("17/04/1980","%d/%m/%Y"), "TI", 1000);

insert into dependentes values (null, "Riq", 
str_to_date("26/02/1992", "%d/%m/%Y"),1);

insert into funcionarios values (null, "De", "Rua Guaira",
str_to_date("17/04/2015","%d/%m/%Y"),
str_to_date("17/04/1980","%d/%m/%Y"), "TI", 1000);

#nomes dos funcionarios e seus dependentes somente os funcionarios que possuem dependentes
SELECT 
    func.nome, dep.nome
FROM
    funcionarios AS func
        INNER JOIN
    dependentes AS dep ON func.matricula = dep.matricula
WHERE
    func.salario > 500;
    
#nomes dos funcionarios e dependentes quando houver
SELECT 
    func.nome, dep.nome
FROM
    funcionarios AS func
        LEFT JOIN
    dependentes AS dep ON func.matricula = dep.matricula
WHERE
    func.salario > 500;
    
SELECT 
    func.nome, dep.nome
FROM
    dependentes AS dep
        Right JOIN
    funcionarios AS func ON func.matricula = dep.matricula
WHERE
    func.salario > 500;
    

#calcule a soma dos salários dos funciónarios
SELECT 
    SUM(salario)
FROM
    funcionarios
where departamento like "T%";






