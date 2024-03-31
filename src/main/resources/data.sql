INSERT INTO actors (birthdate, country, name)
VALUES ('1990-01-01', 'Brasil', 'Vinicius Gugelmin'),
       ('1985-05-12', 'Estados Unidos', 'John Doe'),
       ('1988-09-20', 'França', 'Marie Leblanc'),
       ('1976-03-28', 'Alemanha', 'Hans Müller'),
       ('1995-11-15', 'Espanha', 'Sofia Martinez');

INSERT INTO directors (birthdate, country, name)
VALUES ('1975-08-10', 'Brasil', 'Pedro Almodóvar'),
       ('1980-04-22', 'Estados Unidos', 'Steven Spielberg'),
       ('1972-12-05', 'França', 'Jean-Luc Godard'),
       ('1989-06-30', 'Alemanha', 'Lars von Trier'),
       ('1965-10-18', 'Itália', 'Federico Fellini');

INSERT INTO franchises (name)
VALUES ('Star Wars'),
       ('Harry Potter'),
       ('Marvel Cinematic Universe'),
       ('Jurassic Park'),
       ('James Bond');

INSERT INTO genres (name)
VALUES ('Ação'),
       ('Comédia'),
       ('Drama'),
       ('Ficção Científica'),
       ('Suspense');

INSERT INTO streammings (name, url)
VALUES ('Netflix', 'https://www.netflix.com'),
       ('Amazon Prime Video', 'https://www.amazon.com/Prime-Video'),
       ('Disney+', 'https://www.disneyplus.com'),
       ('Hulu', 'https://www.hulu.com'),
       ('HBO Max', 'https://www.hbomax.com');

INSERT INTO studios (country, name)
VALUES ('Estados Unidos', 'Warner Bros.'),
       ('Reino Unido', 'BBC Films'),
       ('França', 'Gaumont Film Company'),
       ('Alemanha', 'Studio Babelsberg'),
       ('Japão', 'Toho Studios');

INSERT INTO movies (awards, country, language, plot, poster, released, runtime, title, franchise_id, genre_id,
                    studio_id)
VALUES ('Oscar de Melhor Filme', 'Estados Unidos', 'Inglês',
        'Uma nova ameaça surge na galáxia e os heróis devem se unir para enfrentá-la.',
        'https://example.com/poster1.jpg', '2023-05-15', 120.5, 'Star Wars: A Nova Ordem', 1, 1, 1),
       ('BAFTA de Melhor Roteiro Adaptado', 'Reino Unido', 'Inglês',
        'Um jovem bruxo descobre seu destino na escola de magia de Hogwarts.', 'https://example.com/poster2.jpg',
        '2020-07-07', 135.0, 'Harry Potter e a Pedra Filosofal', 2, 2, 2),
       ('Indicações ao Oscar de Melhor Filme e Melhor Direção de Arte', 'Estados Unidos', 'Inglês',
        'Os super-heróis da Marvel se reúnem para combater uma ameaça global.', 'https://example.com/poster3.jpg',
        '2012-05-04', 150.2, 'Os Vingadores', 3, 3, 3),
       ('Três Oscars: Melhor Som, Melhor Edição de Som e Melhores Efeitos Visuais', 'Estados Unidos', 'Inglês',
        'Um parque temático de dinossauros se torna uma armadilha mortal para seus visitantes.',
        'https://example.com/poster4.jpg', '1993-06-11', 128.7, 'Parque dos Dinossauros', 4, 4, 4),
       ('Oscar de Melhor Canção Original', 'Reino Unido', 'Inglês',
        'O agente secreto James Bond é enviado em uma missão para derrotar um banqueiro privado terrorista.',
        'https://example.com/poster5.jpg', '2006-11-17', 146.9, '007 - Cassino Royale', 5, 5, 5);

INSERT INTO users (name)
VALUES ('Alice'),
       ('Bob'),
       ('Charlie'),
       ('Diana'),
       ('Eve');

INSERT INTO movie_actor (movie_id, actor_id)
VALUES (1, 1),
       (2, 2),
       (3, 3),
       (4, 4),
       (5, 5);

INSERT INTO movie_director (movie_id, director_id)
VALUES (1, 1),
       (2, 2),
       (3, 3),
       (4, 4),
       (5, 5);

INSERT INTO movie_streamming (movie_id, streamming_id)
VALUES (1, 1),
       (2, 2),
       (3, 3),
       (4, 4),
       (5, 5);

INSERT INTO movie_user (user_id, movie_id)
VALUES (1, 1),
       (2, 2),
       (3, 3),
       (4, 4),
       (5, 5);
