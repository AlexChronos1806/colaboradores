DROP TABLE IF EXISTS setores;
DROP TABLE IF EXISTS colaboradores;

CREATE TABLE setores (
    id IDENTITY AUTO_INCREMENT PRIMARY KEY,
    descricao VARCHAR(20) NOT NULL
);

CREATE TABLE colaboradores (
    id IDENTITY AUTO_INCREMENT  PRIMARY KEY,
    nome VARCHAR(60) NOT NULL,
    cpf VARCHAR(14) NOT NULL,
    telefone VARCHAR(15) NOT NULL,
    email VARCHAR(40) NOT NULL,
    setor_id INT,
    FOREIGN KEY (setor_id) REFERENCES setores(id)
);