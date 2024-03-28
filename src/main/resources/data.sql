-- Inserções para a tabela actors
INSERT INTO actors (birthdate, country, name)
VALUES ('1990-01-01', 'Brasil', 'Vinicius Gugelmin'),
       ('1985-05-12', 'Estados Unidos', 'John Doe'),
       ('1988-09-20', 'França', 'Marie Leblanc'),
       ('1976-03-28', 'Alemanha', 'Hans Müller'),
       ('1995-11-15', 'Espanha', 'Sofia Martinez');

-- Inserções para a tabela directors
INSERT INTO directors (birthdate, country, name)
VALUES ('1975-08-10', 'Brasil', 'Pedro Almodóvar'),
       ('1980-04-22', 'Estados Unidos', 'Steven Spielberg'),
       ('1972-12-05', 'França', 'Jean-Luc Godard'),
       ('1989-06-30', 'Alemanha', 'Lars von Trier'),
       ('1965-10-18', 'Itália', 'Federico Fellini');

-- Inserções para a tabela franchises
INSERT INTO franchises (name)
VALUES ('Star Wars'),
       ('Harry Potter'),
       ('Marvel Cinematic Universe'),
       ('Jurassic Park'),
       ('James Bond');

-- Inserções para a tabela genres
INSERT INTO genres (name)
VALUES ('Ação'),
       ('Comédia'),
       ('Drama'),
       ('Ficção Científica'),
       ('Suspense');

-- Inserções para a tabela studios
INSERT INTO studios (country, name)
VALUES ('Estados Unidos', 'Warner Bros.'),
       ('Reino Unido', 'BBC Films'),
       ('França', 'Gaumont Film Company'),
       ('Alemanha', 'Studio Babelsberg'),
       ('Japão', 'Toho Studios');

-- Inserções para a tabela streammings
INSERT INTO streammings (name, url)
VALUES ('Netflix', 'https://www.netflix.com'),
       ('Amazon Prime Video', 'https://www.amazon.com/Prime-Video'),
       ('Disney+', 'https://www.disneyplus.com'),
       ('Hulu', 'https://www.hulu.com'),
       ('HBO Max', 'https://www.hbomax.com');

-- Inserções para a tabela movies
INSERT INTO movies (runtime, franchise_id, genre_id, imdbid, released, studio_id, country, language, awards, poster,
                    title, plot)
VALUES (120.5, 1, 1, DEFAULT, '2023-05-15', 1, 'Estados Unidos', 'Inglês', 'Oscar de Melhor Filme',
        'https://example.com/poster1.jpg', 'Star Wars: A Nova Ordem',
        'Uma nova ameaça surge na galáxia e os heróis devem se unir para enfrentá-la.'),
       (135.0, 2, 2, DEFAULT, '2020-07-07', 2, 'Reino Unido', 'Inglês', 'BAFTA de Melhor Roteiro Adaptado',
        'https://example.com/poster2.jpg', 'Harry Potter e a Pedra Filosofal',
        'Um jovem bruxo descobre seu destino na escola de magia de Hogwarts.'),
       (150.2, 3, 3, DEFAULT, '2012-05-04', 3, 'Estados Unidos', 'Inglês',
        'Indicações ao Oscar de Melhor Filme e Melhor Direção de Arte', 'https://example.com/poster3.jpg',
        'Os Vingadores', 'Os super-heróis da Marvel se reúnem para combater uma ameaça global.'),
       (128.7, 4, 4, DEFAULT, '1993-06-11', 4, 'Estados Unidos', 'Inglês',
        'Três Oscars: Melhor Som, Melhor Edição de Som e Melhores Efeitos Visuais', 'https://example.com/poster4.jpg',
        'Parque dos Dinossauros',
        'Um parque temático de dinossauros se torna uma armadilha mortal para seus visitantes.'),
       (146.9, 5, 5, DEFAULT, '2006-11-17', 5, 'Reino Unido', 'Inglês', 'Oscar de Melhor Canção Original',
        'https://example.com/poster5.jpg', '007 - Cassino Royale',
        'O agente secreto James Bond é enviado em uma missão para derrotar um banqueiro privado terrorista.');

-- Inserções para a tabela users
INSERT INTO users (name)
VALUES ('Alice'),
       ('Bob'),
       ('Charlie'),
       ('Diana'),
       ('Eve');

