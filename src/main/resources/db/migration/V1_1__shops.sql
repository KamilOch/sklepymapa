create sequence shops_id_seq;

create table shops (

id bigint primary key,
name varchar (2048),
street_name varchar (2048),
street_number int

);