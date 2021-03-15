
DROP TABLE IF EXISTS player;

CREATE TABLE player (
  id BIGINT AUTO_INCREMENT NOT NULL,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  age INT NOT NULL,
  gender VARCHAR(50) NOT NULL, 
  jersey INT NOT NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO player (first_name, last_name, age, gender, jersey) VALUES
  ('Stefan', 'Peter', 28,'Male', 95 ),
  ('Anna', 'Lindgren', 46,'Female', 32),
  ('Olof', 'Palme', 39,'Male', 4),
  ('Juan', 'Johnny', 21,'Female',34 );