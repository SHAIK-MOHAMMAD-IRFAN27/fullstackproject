insert into domain (program) values ("CSE");
insert into domain (program) values ("ECE");



insert into student (student_id,domain_id) values (100,1);
insert into student (student_id,domain_id) values (101,1);
insert into student (student_id,domain_id) values (102,2);

insert into bills(amount,bill_date,deadline) values (1200,"20-11-2024","24-11-2024");


insert into studentbills(bill_id,student_id) values (1,100);

insert into user(employee_id,email,full_name,password) values(1,"sarath@gmail.com","sarath","sarath123");
insert into user(employee_id,email,full_name,password) values(2,"pavan@gmail.com","pavan","sarath123");
