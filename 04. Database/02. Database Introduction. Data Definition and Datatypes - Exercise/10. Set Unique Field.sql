ALTER TABLE `users`
DROP PRIMARY KEY,
ADD CONSTRAINT PK_users
PRIMARY KEY(`id`);

ALTER TABLE `users`
ADD CONSTRAINT UK_username UNIQUE(`username`); 
