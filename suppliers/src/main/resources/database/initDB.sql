CREATE TABLE IF NOT EXISTS suppliers (
    id serial primary key,
    name varchar(40) NOT NULL,
    account char(20) NOT NULL,
    address varchar(40) default NULL
);