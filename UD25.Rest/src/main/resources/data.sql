DROP table IF EXISTS empleados;

create table empleados (
id int(5) auto_increment primary key,
nombre varchar(100),
trabajo ENUM('Junior','Mid','Senior'),
salario int(5)
);

insert into empleados (nombre,trabajo,salario) values ('Sergi','Junior',1000);
insert into empleados (nombre,trabajo,salario) values ('Adrian','Junior',1000);
insert into empleados (nombre,trabajo,salario) values ('Jose','Senior',3000);
insert into empleados (nombre,trabajo,salario) values ('Luis','Mid',2000);
insert into empleados (nombre,trabajo,salario) values ('Antonio','Mid',2000);