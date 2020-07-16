SELECT 
    *
FROM
    funcionarios;

SELECT 
    nome
FROM
    funcionarios;

# liste todos os nomes dos funcionarios que ganham mais de 500 reais
SELECT 
    nome
FROM
    funcionarios
WHERE
    salario > 5000;

#altere o salario do func com matricula 1 para 1200
UPDATE funcionarios 
SET 
    salario = 1200
WHERE
    matricula = 1;

DELETE FROM funcionarios 
WHERE
    salario > 10000; #não executa pois está com safe update
