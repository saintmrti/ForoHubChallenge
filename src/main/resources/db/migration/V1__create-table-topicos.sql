create table topicos (
    id bigint not null auto_increment,
    f_registro datetime not null,
    titulo varchar(50) not null,
    mensaje varchar(200),
    status int not null,
    autor varchar(50) not null,
    curso varchar(40) not null,
    primary key (id)
);