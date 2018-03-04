CREATE TABLE student(
	id IDENTITY,
	name VARCHAR(50),
	address VARCHAR(255),
	email VARCHAR(50),
	phoneNumber VARCHAR(15),
	
	CONSTRAINT pk_category_id PRIMARY KEY (id)

);

CREATE TABLE teacher(
	id IDENTITY,
	code VARCHAR(50),
	name VARCHAR(50),
	email VARCHAR(50),
	education VARCHAR(50),
	exprience_years INT,
	department_id INT,
	is_active BOOLEAN,
	
	CONSTRAINT pk_teacher_id PRIMARY KEY (id),
 	CONSTRAINT fk_product_department_id FOREIGN KEY (department_id) REFERENCES department (id)
)

CREATE TABLE department(
	id IDENTITY,
	name VARCHAR(50),
	extension VARCHAR(10),
	is_active BOOLEAN,
	
	CONSTRAINT pk_department_id PRIMARY KEY(id)
	

)





