--drop table time_record
--drop table employee

--CREATE TABLES
--create table employee(
--   employee_id INT AUTO_INCREMENT PRIMARY KEY,
--   name VARCHAR(50),
--   role VARCHAR(50),
--   salary DECIMAL(10, 2)
--   wage DECIMAL(10, 2)
--   type clob
--);
--
--create table time_record(
--   time_record_id INT AUTO_INCREMENT PRIMARY KEY,
--   employee_id int,
--   checkin_date timestamp,
--   checout_date timestamp,
--   FOREIGN KEY (employee_id) REFERENCES employee(employee_id)
--);

-- INSERT TABLES
INSERT INTO tb_employee(name,role,salary,wage) VALUES ('Pedro Silva', 'Developer', 50, 'hourly');
INSERT INTO tb_employee(name,role,salary,wage) VALUES ('Ana Costa', 'Developer', 5000, 'salaried');
INSERT INTO tb_employee(name,role,type) VALUES ('Sergio Oliveira', 'Developer', 'volunteer');

insert into tb_time_record(employee_id,checkin_date,checkout_date) values (1,'2023-12-04T08:00:00-03:00','2023-12-04T12:00:00-03:00');
insert into tb_time_record(employee_id,checkin_date,checkout_date) values (1,'2023-12-04T14:00:00-03:00','2023-12-04T18:00:00-03:00');
insert into tb_time_record(employee_id,checkin_date,checkout_date) values (1,'2023-12-05T08:00:00-03:00','2023-12-05T12:00:00-03:00');
insert into tb_time_record(employee_id,checkin_date,checkout_date) values (1,'2023-12-05T14:00:00-03:00','2023-12-05T18:00:00-03:00');
insert into tb_time_record(employee_id,checkin_date,checkout_date) values (1,'2023-12-06T08:00:00-03:00','2023-12-06T12:00:00-03:00');
insert into tb_time_record(employee_id,checkin_date,checkout_date) values (1,'2023-12-06T14:00:00-03:00','2023-12-06T18:00:00-03:00');
insert into tb_time_record(employee_id,checkin_date,checkout_date) values (1,'2023-12-07T08:00:00-03:00','2023-12-07T12:00:00-03:00');
insert into tb_time_record(employee_id,checkin_date,checkout_date) values (1,'2023-12-07T14:00:00-03:00','2023-12-07T18:00:00-03:00');
insert into tb_time_record(employee_id,checkin_date,checkout_date) values (1,'2023-12-08T08:00:00-03:00','2023-12-08T12:00:00-03:00');
insert into tb_time_record(employee_id,checkin_date,checkout_date) values (1,'2023-12-08T14:00:00-03:00','2023-12-08T18:00:00-03:00');

insert into tb_time_record(employee_id,checkin_date,checkout_date) values (2,'2023-12-04T08:00:00-03:00','2023-12-04T12:00:00-03:00');
insert into tb_time_record(employee_id,checkin_date,checkout_date) values (2,'2023-12-04T14:00:00-03:00','2023-12-04T18:00:00-03:00');
insert into tb_time_record(employee_id,checkin_date,checkout_date) values (2,'2023-12-05T08:00:00-03:00','2023-12-05T12:00:00-03:00');
insert into tb_time_record(employee_id,checkin_date,checkout_date) values (2,'2023-12-05T14:00:00-03:00','2023-12-05T18:00:00-03:00');
insert into tb_time_record(employee_id,checkin_date,checkout_date) values (2,'2023-12-06T08:00:00-03:00','2023-12-06T12:00:00-03:00');
insert into tb_time_record(employee_id,checkin_date,checkout_date) values (2,'2023-12-06T14:00:00-03:00','2023-12-06T18:00:00-03:00');
insert into tb_time_record(employee_id,checkin_date,checkout_date) values (2,'2023-12-07T08:00:00-03:00','2023-12-07T12:00:00-03:00');
insert into tb_time_record(employee_id,checkin_date,checkout_date) values (2,'2023-12-07T14:00:00-03:00','2023-12-07T18:00:00-03:00');
insert into tb_time_record(employee_id,checkin_date,checkout_date) values (2,'2023-12-08T08:00:00-03:00','2023-12-08T12:00:00-03:00');
insert into tb_time_record(employee_id,checkin_date,checkout_date) values (2,'2023-12-08T14:00:00-03:00','2023-12-08T18:00:00-03:00');