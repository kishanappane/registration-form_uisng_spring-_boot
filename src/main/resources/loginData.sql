create table user(
id integer not null auto_increment,
user_id VARCHAR(255),
user_pswd VARCHAR(255),
primary key(id),
unique key `user_id` (`user_id`)
);


insert into user(user_id, user_pswd)
values('admin', hex(aes_encrypt('root', 'secret')));


select cast(aes_decrypt(unhex(`user_pswd`), 'secret') as char(50)) from user where user_id='admin';