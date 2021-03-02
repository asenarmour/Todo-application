create table users(
id bigserial primary key not null,
name varchar(50),
email varchar(50)
);

create table todo(
todo_id bigserial primary key not null,
user_id bigserial not null,
todo_name varchar(256) not null,
deadline Timestamp
);

alter table todo add constraint users_fk_key foreign key(user_id) references users(id);

drop table todo_master ;