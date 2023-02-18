SELECT * FROM employees;

SELECT id, name, job_id, department_id, salary, sh_clerk, commission_pct, phone_num FROM employees WHERE name = 'David';

SELECT id from employees WHERE sh_clerk = 'Manager';

SELECT * FROM employees WHERE name LIKE '%a%a%';

SELECT * FROM employees WHERE name LIKE '%l' AND LENGTH (name) > 5;

SELECT ROUND ((salary * 1.2) ,2) , '$' FROM employees;

SELECT '$', ROUND (salary + (salary * commission_pct / 100), 2) FROM employees;










