CREATE TABLE IF NOT EXISTS clients (
    id serial primary key,
    first_name varchar(40) NOT NULL,
    middle_name varchar(40) NOT NULL,
    last_name varchar(40) NOT NULL,
    login varchar(25) NOT NULL,
    password varchar(70) NOT NULL,
    email varchar(50) NOT NULL,
    is_active boolean NOT NULL
    );