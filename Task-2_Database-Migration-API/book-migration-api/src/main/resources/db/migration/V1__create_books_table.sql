CREATE TABLE books (
                       id BIGINT PRIMARY KEY AUTO_INCREMENT,
                       title VARCHAR(255) NOT NULL,
                       isbn VARCHAR(20) UNIQUE,
                       published_year INT
);