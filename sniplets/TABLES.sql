CREATE TABLE teste (
	id int(11) NOT NULL AUTO_INCREMENT,
	image BLOB,
	descricao TEXT,
	PRIMARY KEY(id)
)


/*Table patrimonio*/

DROP TABLE patrimonio;
CREATE TABLE patrimonio (
	id int(11) NOT NULL AUTO_INCREMENT,	
	codigo varchar(50),
	nome TEXT,
	descricao TEXT,
	composicao TEXT,
	localizacao TEXT,
	valor TEXT,
	data TIMESTAMP,
	Estado TEXT,
	foto TEXT,
    UNIQUE KEY(codigo),
	PRIMARY KEY(id)
)