CREATE TABLE kysymys(
kysymys_id INT(5) NOT NULL AUTO_INCREMENT,
kysymysteksti varchar(300) NOT NULL,
PRIMARY KEY (kysymys_id)
)Engine="InnoDB" DEFAULT CHARSET=UTF8;

CREATE TABLE vastaus(
vastaus_id INT(5) NOT NULL AUTO_INCREMENT,
kysymys_id INT(5) NOT NULL,
vastausteksti varchar(300) NOT NULL,
vastaaja varchar(30)NOT NULL,
vastausaika TIMESTAMP on update CURRENT_TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
PRIMARY KEY (vastaus_id),
FOREIGN KEY (kysymys_id) REFERENCES kysymys (kysymys_id)
)Engine="InnoDB" DEFAULT CHARSET=UTF8;
