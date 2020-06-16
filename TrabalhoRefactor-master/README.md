README


### SQL
```
CREATE TABLE `Livros` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(45) DEFAULT NULL,
  `author` varchar(45) DEFAULT NULL,
  `gender` varchar(45) DEFAULT NULL,
  `year` int(11) DEFAULT NULL,
  `isRead` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1


INSERT INTO `Livros` VALUES (1,'zezin','Tolkien','Aventura',1950,1),(2,'Clube da Luta','Chuck ','Aventura',1998,1),(3,'Harry Potter','Rowling','Aventura',2001,0),(4,'Don Quixote	','Miguel de Cervantes	','Aventura',1900,0);
```


### Alterar a string de conexão com o banco
https://github.com/lesimoes/TrabalhoRefactor/blob/master/src/Enum/EDataBase.java



### Avaliação:
Cada refactaoração vale de 1pt a 2pts

Criar um documento (README) ou comentar no código os pontos de refatoração
 e justificar.
 

Dica: https://refactoring.guru/pt-br
Magic Numbers,
ENUMS,
Singleton,
Factory,
