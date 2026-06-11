CREATE DATABASE Wiproemploey_db;
Show databases;
select database();
use Wiproemploey_db;

CREATE TABLE Wiproemploye(
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(80),
    department VARCHAR(100),
    salary DECIMAL(10,2),
    email VARCHAR(200),
    joining_date DATE
);

Select * from Wiproemploye;
INSERT INTO Wiproemploye(emp_id, emp_name, department, salary, email, joining_date)
values
(102, 'Aman', 'IT', 60000, 'aman@gmail.com', '2026-06-22'),
(103, 'Rahul', 'CSE', 60000, 'rahul@gmail.com', '2026-6-22'),
(104, 'Priya', 'CSE', 60000, 'priya@gmail.com', '2026-06-22'),
(105, 'Sneha', 'IT', 60000, 'sneha@gmail.com', '2026-06-22');

SELECT * FROM Wiproemploye WHERE department = 'IT';

UPDATE Wiproemploye SET salary = 70000 WHERE department = 'CSE';

DELETE FROM Wiproemploye WHERE emp_id = 104;

SELECT * FROM Wiproemploye ORDER BY salary DESC;

SELECT * FROM Wiproemploye ORDER BY salary DESC LIMIT 2;

SELECT COUNT(*) AS total_employees FROM Wiproemploye;

SELECT AVG(salary) AS average_salary FROM Wiproemploye;

SELECT MAX(salary) AS highest_salary, MIN(salary) AS lowest_salary FROM Wiproemploye;

SELECT department, COUNT(*) AS total FROM Wiproemploye GROUP BY department;

SELECT department , COUNT(*) AS total FROM Wiproemploye GROUP BY department HAVING COUNT(*) > 1

SELECT * FROM Wiproemploye WHERE email IS NULL;

SELECT * FROM Wiproemploye WHERE emp_name LIKE 'R%';

SELECT * FROM Wiproemploye WHERE salary BETWEEN 40000 AND 60000;

SELECT * FROM Wiproemploye WHERE department IN ('CSE', 'IT');

ALTER TABLE Wiproemploye ADD mobile_number VARCHAR(15);

ALTER TABLE Wiproemploye RENAME COLUMN emp_name TO employee_name;


CREATE TABLE Department (
    dept_id INT PRIMARY KEY,
    dept_name VARCHAR(50),
    manager_name VARCHAR(50)
);


