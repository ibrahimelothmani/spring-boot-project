create table location (
    id       bigint auto_increment
        primary key,
    name     varchar(255) not null,
    latitude double not null,
    longitude double not null,
    user_id  bigint       not null,
    constraint location_users_id_fk
        foreign key (user_id) references users (id)
);