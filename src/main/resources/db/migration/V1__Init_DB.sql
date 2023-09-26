create table access_level
(
    access_level_id   integer not null auto_increment,
    access_level_name varchar(255),
    primary key (access_level_id)
);

create table users
(
    access_level_id integer,
    user_id         integer                             not null auto_increment,
    created_at      TIMESTAMP DEFAULT CURRENT_TIMESTAMP not null,
    user_email      varchar(255),
    user_name       varchar(255),
    user_phone      varchar(255),
    user_surname    varchar(255),
    primary key (user_id)
);

alter table users
    add constraint FKbrraj8cpshru3qmwrpdknvves foreign key (access_level_id) references access_level (access_level_id);