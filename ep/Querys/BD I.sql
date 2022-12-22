# Queries para criação do banco de dados de Conflitos Belicos para ACH2004 em MySQL
#
# Heitor Lopes Bianchi - 10258730
# Mycaelli Cerqueira de Lima - 10723562

# criar BD

CREATE SCHEMA conflitos_belicos;
USE conflitos_belicos;

# Criar tabelas

CREATE TABLE TIPOS_DE_ARMAS (
    Tipos_de_Arma VARCHAR(50) NOT NULL,
    Nome_Traficante VARCHAR(50) NOT NULL,
    PRIMARY KEY (Tipos_de_Arma)
) ENGINE = innodb;

CREATE TABLE TRAFICANTE_DE_ARMAS (
    Nome_Traficante VARCHAR(50) NOT NULL,    
    Armas_por_traficante INT NOT NULL,
    PRIMARY KEY (Nome_Traficante)
) ENGINE = innodb;

CREATE TABLE POSSUI_ARMA (
    Arma VARCHAR(50) NOT NULL,    
    Traficante_de_Armas VARCHAR(50) NOT NULL, 
    PRIMARY KEY (Arma)
) ENGINE = innodb;

CREATE TABLE ARMA (
    Nome VARCHAR(50) NOT NULL,    
    Capacidade_Destrutiva INT NOT NULL, 
    PRIMARY KEY (Nome)
) ENGINE = innodb;

CREATE TABLE FORNECE_ARMAS (  
    Traficante VARCHAR(50) NOT NULL,  
    ID_Grupo_Armado  INT NOT NULL, 
    PRIMARY KEY (Traficante)
) ENGINE = innodb;

CREATE TABLE GRUPO_ARMADO (   
    ID_Grupo_Armado INT NOT NULL,     
    Traficante_de_Armas VARCHAR(50) NOT NULL, 
    Armas_por_traficante INT NOT NULL,
    Lideres_Politicos VARCHAR(50) NOT NULL,
    PRIMARY KEY (ID_Grupo_Armado)
) ENGINE = innodb;

CREATE TABLE DIVISAO (   
    ID_Divisao INT NOT NULL, 
    Baixas INT NOT NULL, 
    Barcos INT NOT NULL, 
    Homens INT NOT NULL, 
    Tanques INT NOT NULL, 
    Aviões INT NOT NULL,    
    ID_Grupo_Armado  INT NOT NULL, 
    ID_Chefe_Militar INT NOT NULL,
    PRIMARY KEY (ID_Divisao)
) ENGINE = innodb;

CREATE TABLE CHEFE_MILITAR (   
    ID_Chefe_Militar INT NOT NULL, 
    Hierarquia VARCHAR(50) NOT NULL, 
    ID_Divisao INT NOT NULL,
    Nome_Lider_Politico VARCHAR(50) NOT NULL, 
    PRIMARY KEY (ID_Chefe_Militar)
) ENGINE = innodb;

CREATE TABLE LIDER_POLITICO (   
    Nome_Lider_Politico VARCHAR(50) NOT NULL, 
    Apoios VARCHAR(50) NOT NULL,     
    ID_Divisao INT NOT NULL,
    ID_Grupo_Armado  INT NOT NULL, 
    PRIMARY KEY (Nome_Lider_Politico)
) ENGINE = innodb;

CREATE TABLE DIALOGA (  
    Lider_Politico VARCHAR(50) NOT NULL,
    ID_Organizacao_Mediadora INT NOT NULL,
    Nome_Lider_Politico VARCHAR(50) NOT NULL
) ENGINE = innodb;

CREATE TABLE ORGANIZACAO_MEDIADORA (
    ID_Organizacao_Mediadora INT NOT NULL,
    Pessoas_Atuando INT NOT NULL,
    Nome_Organizacao VARCHAR(50) NOT NULL, 
    ID_Grupo INT NOT NULL,
    PRIMARY KEY (ID_Organizacao_Mediadora)
) ENGINE = innodb;

CREATE TABLE GRUPO_MILITAR (  
    ID_Grupo INT NOT NULL, 
    Conflitos VARCHAR(50) NOT NULL,
    Nome VARCHAR(50) NOT NULL,
    Data_Saida DATE NOT NULL,
    Data_Entrada DATE NOT NULL,
    PRIMARY KEY (ID_Grupo)
) ENGINE = innodb;

CREATE TABLE ORGANIZACAO (  
    Nome_Organizacao VARCHAR(50) NOT NULL,   
    ID_Organizacao_Mediadora INT NOT NULL,  
    PRIMARY KEY (Nome_Organizacao)
) ENGINE = innodb;

CREATE TABLE TIPO_DE_ORGANIZACAO (  
    Tipo_de_Organizacao VARCHAR(50) NOT NULL,     
    ID_Organizacao INT NOT NULL, 
    ID_Grupo_Armado  INT NOT NULL, 
    Nome_Organizacao VARCHAR(50) NOT NULL, 
    PRIMARY KEY (ID_Organizacao)
) ENGINE = innodb;

CREATE TABLE TIPO_DE_AJUDA (  
    Tipo_de_Ajuda VARCHAR(50) NOT NULL,     
    ID_Organizacao INT NOT NULL, 
    PRIMARY KEY (ID_Organizacao)
) ENGINE = innodb;

CREATE TABLE PAISES (  
    Paises VARCHAR(50) NOT NULL,   
    ID_Conflito INT NOT NULL, 
    PRIMARY KEY (Paises)
) ENGINE = innodb;

CREATE TABLE CONFLITO (       
    ID_Conflito INT NOT NULL,            
    Mortos INT NOT NULL, 
    Feridos INT NOT NULL, 
    ID_Grupo INT NOT NULL,   
    PRIMARY KEY (ID_Conflito)
) ENGINE = innodb;

CREATE TABLE CONFLITOS_RELIGIOSOS (  
    Religioes VARCHAR(50) NOT NULL ,
    ID_Conflito INT NOT NULL
) ENGINE = innodb;

CREATE TABLE CONFLITOS_TERRITORIAIS (  
    ID_Conflito INT NOT NULL,   
    Regioes VARCHAR(50) NOT NULL 
) ENGINE = innodb;

CREATE TABLE CONFLITOS_ECONOMICOS (    
    ID_Conflito INT NOT NULL,   
    Materias_Primas VARCHAR(50) NOT NULL
) ENGINE = innodb;

CREATE TABLE CONFLITOS_RACIAL (    
    ID_Conflito INT NOT NULL,   
    Etnias VARCHAR(50) NOT NULL
) ENGINE = innodb;

# Criar FOREIGN KEYs

ALTER TABLE TIPOS_DE_ARMAS ADD CONSTRAINT fk_Traficante FOREIGN KEY (Nome_Traficante) REFERENCES TRAFICANTE_DE_ARMAS(Nome_Traficante);

ALTER TABLE FORNECE_ARMAS ADD CONSTRAINT fk_ID_Grupo_Armado FOREIGN KEY (ID_Grupo_Armado) REFERENCES GRUPO_ARMADO(ID_Grupo_Armado);

ALTER TABLE DIVISAO ADD CONSTRAINT fk_ID_Grupo_Armado_i FOREIGN KEY (ID_Grupo_Armado) REFERENCES GRUPO_ARMADO(ID_Grupo_Armado);
ALTER TABLE DIVISAO ADD CONSTRAINT fk_ID_Chefe_Militar FOREIGN KEY (ID_Chefe_Militar) REFERENCES CHEFE_MILITAR(ID_Chefe_Militar);

ALTER TABLE CHEFE_MILITAR ADD CONSTRAINT fk_ID_Divisao FOREIGN KEY (ID_Divisao) REFERENCES DIVISAO(ID_Divisao);
ALTER TABLE CHEFE_MILITAR ADD CONSTRAINT fk_Lider_Politico FOREIGN KEY (Nome_Lider_Politico) REFERENCES LIDER_POLITICO(Nome_Lider_Politico);

ALTER TABLE LIDER_POLITICO ADD CONSTRAINT fk_ID_Divisao_i FOREIGN KEY (ID_Divisao) REFERENCES DIVISAO(ID_Divisao);
ALTER TABLE LIDER_POLITICO ADD CONSTRAINT fk_ID_Grupo_Armado_ii FOREIGN KEY (ID_Grupo_Armado) REFERENCES GRUPO_ARMADO(ID_Grupo_Armado);

ALTER TABLE DIALOGA ADD CONSTRAINT fk_ID_Organizacao_Mediadora FOREIGN KEY (ID_Organizacao_Mediadora) REFERENCES ORGANIZACAO_MEDIADORA(ID_Organizacao_Mediadora);
ALTER TABLE DIALOGA DROP COLUMN Lider_Politico;
ALTER TABLE DIALOGA ADD CONSTRAINT fk_Lider_Politico_i FOREIGN KEY (Nome_Lider_Politico) REFERENCES LIDER_POLITICO(Nome_Lider_Politico);

ALTER TABLE ORGANIZACAO_MEDIADORA ADD CONSTRAINT fk_Nome_Organizacao FOREIGN KEY (Nome_Organizacao) REFERENCES ORGANIZACAO(Nome_Organizacao);
ALTER TABLE ORGANIZACAO_MEDIADORA ADD CONSTRAINT fk_ID_Grupo  FOREIGN KEY (ID_Grupo) REFERENCES GRUPO_MILITAR(ID_Grupo);

ALTER TABLE ORGANIZACAO ADD CONSTRAINT fk_ID_Organizacao_Mediadora_i  FOREIGN KEY (ID_Organizacao_Mediadora) REFERENCES ORGANIZACAO_MEDIADORA(ID_Organizacao_Mediadora);

ALTER TABLE PAISES ADD CONSTRAINT fk_ID_Conflito  FOREIGN KEY (ID_Conflito) REFERENCES CONFLITO(ID_Conflito);

ALTER TABLE CONFLITO ADD CONSTRAINT fk_ID_Grupo_i  FOREIGN KEY (ID_Grupo) REFERENCES GRUPO_MILITAR(ID_Grupo);

ALTER TABLE CONFLITOS_RELIGIOSOS ADD CONSTRAINT fk_ID_Conflito_i  FOREIGN KEY (ID_Conflito) REFERENCES CONFLITO(ID_Conflito);

ALTER TABLE CONFLITOS_TERRITORIAIS ADD CONSTRAINT fk_ID_Conflito_ii  FOREIGN KEY (ID_Conflito) REFERENCES CONFLITO(ID_Conflito);

ALTER TABLE CONFLITOS_ECONOMICOS ADD CONSTRAINT fk_ID_Conflito_iii  FOREIGN KEY (ID_Conflito) REFERENCES CONFLITO(ID_Conflito);

ALTER TABLE CONFLITOS_RACIAL ADD CONSTRAINT fk_ID_Conflito_iv  FOREIGN KEY (ID_Conflito) REFERENCES CONFLITO(ID_Conflito);
