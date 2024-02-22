CREATE TABLE Carte (
	id_carte INT PRIMARY KEY,
	couleur VARCHAR(20),
	valeur INT
	
);

CREATE TABLE Main (
	id_main INT PRIMARY KEY,
    valeurTotal INT,
    nbCartes INT

);

CREATE TABLE Joueur (
	id_joueur INT PRIMARY KEY ,
	username VARCHAR(25)	,
	solde INT,
	id_main	INT ,
	FOREIGN KEY (id_main) REFERENCES main(id_main)

);

CREATE TABLE Croupier ( 
	id_croupier INT PRIMARY KEY ,
	valeurTotalLimit INT ,
	id_main INT,
	FOREIGN KEY (id_main) REFERENCES main(id_main)
	
);

CREATE TABLE PaquetCarte (
	id_paquetCarte INT PRIMARY KEY ,
	taille INT	
);