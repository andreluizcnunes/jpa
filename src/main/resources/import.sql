INSERT INTO tb_departamento (nome) VALUES ('Administrativo');
INSERT INTO tb_departamento (nome) VALUES ('Produção');


INSERT INTO tb_pessoa (nome, salario, departamento_id) VALUES ('Ana', 5000.0, 1);
INSERT INTO tb_pessoa (nome, salario, departamento_id) VALUES ('Joao', 4000.0, 1);
INSERT INTO tb_pessoa (nome, salario, departamento_id) VALUES ('Maria', 6000.0, 2);
INSERT INTO tb_pessoa (nome, salario, departamento_id) VALUES ('Carlos', 3000.0, 2);


INSERT INTO tb_categoria (nome) VALUES ('Livros');
INSERT INTO tb_categoria (nome) VALUES ('Eletrônicos');
INSERT INTO tb_categoria (nome) VALUES ('Computadores');

INSERT INTO tb_produto (nome, preco) VALUES ('The Lord of the Rings', 90.5);
INSERT INTO tb_produto (nome, preco) VALUES ('Smart TV', 2190.0);
INSERT INTO tb_produto (nome, preco) VALUES ('Macbook Pro', 1250.0);
INSERT INTO tb_produto (nome, preco) VALUES ('PC Gamer', 1200.0);

INSERT INTO tb_produto_categoria (produto_id, categoria_id) VALUES (1, 1);
INSERT INTO tb_produto_categoria (produto_id, categoria_id) VALUES (2, 2);
INSERT INTO tb_produto_categoria (produto_id, categoria_id) VALUES (2, 3);
INSERT INTO tb_produto_categoria (produto_id, categoria_id) VALUES (3, 3);
INSERT INTO tb_produto_categoria (produto_id, categoria_id) VALUES (4, 3);
