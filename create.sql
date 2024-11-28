
CREATE TABLE Bills (
    id SERIAL PRIMARY KEY,
    description VARCHAR(255),
    amount INT,
    bill_date VARCHAR(255),
    deadline VARCHAR(255)
);

CREATE TABLE Domain (
    domin_id SERIAL PRIMARY KEY,
    program VARCHAR(255)
);


CREATE TABLE DomainBillDetails (
    id SERIAL PRIMARY KEY,
    description VARCHAR(255),
    amount INT,
    bill_date VARCHAR(255),
    deadline VARCHAR(255),
    domain_id INT
);


CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    email VARCHAR(255) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL
);

CREATE TABLE student (
    student_id VARCHAR(255) PRIMARY KEY,
    domain_id INT 
    
);



CREATE TABLE studentbilldetails (
    id SERIAL PRIMARY KEY,
    description VARCHAR(255),
    amount INT,
    bill_date VARCHAR(255),
    deadline VARCHAR(255),
    student_id VARCHAR(255)
    );



CREATE TABLE studentbills (
    id SERIAL PRIMARY KEY,
    bill_id INT NOT NULL,
    student_id VARCHAR(255) NOT NULL
    );



CREATE TABLE user (
    employee_id SERIAL PRIMARY KEY,
    full_name VARCHAR(255),
    email VARCHAR(255) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL
);
