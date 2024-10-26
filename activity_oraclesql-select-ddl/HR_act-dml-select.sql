-- usernmae: HR
-- password: hr

-- 1. Display the employee id, surname and firstname whose employee id is equal to 110. 
SELECT employee_id
      , last_name
      , first_name
  FROM HR.EMPLOYEES
WHERE employee_id = 110;

-- 2. Display the employee id, surname, firstname, manager id, job id and salary whose manager id is equal to 100.
SELECT employee_id
      , last_name
      , first_name
      , manager_id
      , job_id
      , salary
  FROM HR.employees
 WHERE manager_id = 100;

-- 3. Display the employee id, surname, firstname and hire date of all employees whose hire dates are between January 01, 2005 
-- and Dec. 31, 2010. 
SELECT employee_id
      , last_name
      , first_name
      , hire_date
  FROM HR.EMPLOYEES
 WHERE hire_date BETWEEN '01-01-2005' AND '12-31-2010';


 -- 4. Display all fields of hr.employees whose salaries are greater or equal to 10,000. 
SELECT *
  FROM HR.employees
 WHERE salary  >= 10000;

 -- 5. Display the employee id, surname, firstname, hire date and salary of all employees whose hire dates are between January 01, 2020 and Dec. 31, 2024 or salaries are in the range of 100 to 15000. 
SELECT employee_id
      , last_name
      , first_name
      , hire_date
      , salary
  FROM HR.EMPLOYEES
 WHERE hire_date BETWEEN '01-01-2020' AND '12-31-2024' OR salary BETWEEN 100 AND 15000;

 -- 6.  Display the employee id, surname, firstname, hire date, salary, job id and department id of all employees whose job ids contain a string ‘CLERK’ and department ids equal to 10,20,30,40 and 50. 
SELECT employee_id
      , last_name
      , first_name
      , hire_date
      , salary
      , job_id
      , department_id
  FROM HR.employees
 WHERE job_id  LIKE '%CLERK%' AND department_id in (10, 20, 30, 40, 50);
 
 -- 7. Display the employee id, surname, firstname, hire date, salary, job id, department id and the 
-- below condition (name the derived column as Remarks): 
-- If commission_pct is null then make it 0 else display the commission_pct. 

SELECT employee_id
      , last_name
      , first_name
      , hire_date
      , salary
      , job_id
      , department_id
      , NVL(commission_pct, 0) AS Remarks
  FROM hr.employees;
 
 
-- 8. Repeat question # 4 and add a derived column (alternale_email) by getting only the first 5 
-- letters of an employee’s surname and firstname. Concatenate this by adding ‘@plm.edu.ph’. 
-- Example:    ATIEN_FRANC@plm_edu.ph 
-- Note: If there are surnames that contain space/s, delete it. 
-- Example: De Los Santos  ->  DELOS 

  -- used alias to avoid ' SELECT * then comma, '  error
SELECT emp.*,
       UPPER(SUBSTR(REPLACE(emp.last_name, ' ', ''), 1, 5) || '_' ||
       SUBSTR(REPLACE(emp.first_name, ' ', ''), 1, 5)) || '@plm.edu.ph' alternate_email
  FROM HR.employees emp
 WHERE emp.salary >= 10000;
 
    -- check: 
SELECT emp.*,
       (UPPER(emp.last_name || '_' || (emp.first_name)) || '@plm.edu.ph') alternate_email
  FROM HR.employees emp
 WHERE emp.salary >= 10000;
 
 -- 9. Repeat question # 5 by adding a derived column (salary_increase) by increasing the  employee’s salary by 10%. 
-- Example: Employee’s salary = 10,000 then salary_increase = 11,000. 

SELECT employee_id
      , last_name
      , first_name
      , hire_date
      , salary
      , salary *1.10 AS salary_increase
  FROM hr.employees
 WHERE hire_date BETWEEN '01-01-2020' AND '12-31-2024' OR salary BETWEEN 100 AND 15000;
 
-- 10. Repeat question # 1 and the output should have surnames and firstnames arranged ascendingly. 
 
SELECT employee_id
      , last_name
      , first_name
  FROM HR.employees
 WHERE employee_id = 110
 ORDER BY last_name ASC, first_name ASC;
    -- When you specify multiple columns in the ORDER BY clause, SQL first sorts the results by the first column you mention.
    -- If there are ties (i.e., multiple rows have the same value in the first column), SQL will then sort those tied rows based on the second column
 
-- 11. Modify the commission_pct of all employees to 0 whose manager id is equal to 101,102,103 and 104. 
 
UPDATE hr.employees
   SET COMMISSION_PCT = 0
 WHERE MANAGER_ID IN (101,102,103,104);


 -- 12. Modify the salary of all employees to 20,000 whose job_ids are IT_PROG and commission_pct is NULL.

UPDATE HR.employees
   SET salary = 20000
 WHERE job_id = 'IT_PROG' AND commission_pct IS NULL;
 
  -- SHOWING
SELECT *
  FROM HR.employees
 WHERE job_id = 'IT_PROG' AND commission_pct IS NULL;
 
 -- 13.Modify  manager id to 100, salary to 25000 and email to ‘default@plm.edu.ph’ 
 -- whose employee ids are 101 to 110 and their hire dates are between Jan, 01, 1900 to Dec. 31, 2024.
 
UPDATE hr.employees
   SET manager_id = 100,
    salary = 25000,
    email = 'default' || employee_id || '@plm.edu.ph'
 WHERE employee_id BETWEEN 101 AND 110
   AND hire_date BETWEEN '01-01-1900' AND '12-31-2024';

-- 14. Delete all employee records whose manager ids are 120,121,122 and123 or job_ids are ‘AD_PRES’.

UPDATE HR.departments
   SET manager_id = NULL
 WHERE department_name = 'Executive';

UPDATE HR.employees
   SET manager_id = NULL
 WHERE manager_id = 100;

DELETE FROM HR.employees
 WHERE manager_id IN (120, 121, 122, 123) OR job_id = 'AD_PRES';
 
-- 15. Delete all employee records whose salaries are 0 to 5000 and department ids are 10,20,50,70 and 90. 

UPDATE hr.departments
   SET manager_id = NULL
 WHERE manager_id IN (
       SELECT employee_id FROM HR.EMPLOYEES
       WHERE salary BETWEEN 0 AND 5000
         AND department_id IN (10, 20, 50, 70, 90) 
 );

DELETE FROM hr.job_history 
 WHERE employee_id IN (
       SELECT employee_id 
         FROM hr.employees 
        WHERE salary >= 0 AND salary <= 5000 
          AND department_id IN (10, 20, 50, 70, 90)
);

DELETE FROM hr.employees
 WHERE salary >= 0 AND salary <= 5000
   AND department_id IN (10, 20, 50, 70, 90);

  -- SELECT constraint_name, table_name, constraint_type, r_constraint_name
  -- FROM user_constraints
  -- WHERE constraint_name = 'JHIST_EMP_FK';
 
-- 16. Delete all records in JOBS table whose job ids have the string ‘AD’ anywhere on it. (Provide the error message and explain.) 
-- ERROR: ORA02292
DELETE FROM jobs
 WHERE job_id LIKE '%AD%';

-- 17. Delete all employee records whose employee ids are not equal to 131,132,133,134 and 150. 

UPDATE hr.departments
   SET manager_id = NULL
 WHERE manager_id IN (
    SELECT employee_id FROM HR.EMPLOYEES
     WHERE employee_id NOT IN (131, 132, 133, 134, 150)
 );
 
DELETE FROM hr.job_history
 WHERE employee_id IN (
  SELECT employee_id FROM HR.EMPLOYEES
   WHERE employee_id NOT IN (131, 132, 133, 134, 150)
);

DELETE FROM hr.employees
 WHERE employee_id NOT IN (131, 132, 133, 134, 150);
-- 18. Rollback everything you made in #s 11 to 17. 
ROLLBACK;


-- 19 .  explain 

UPDATE hr.employees 
SET commission_pct = 0 
WHERE commission_pct IS NULL; 

SELECT * 
FROM hr.employees 
WHERE commission_pct IS NULL; 

ROLLBACK; 

SELECT * 
FROM hr.employees 
WHERE commission_pct IS NULL; 

-- 20. explain

UPDATE hr.employees 
   SET commission_pct = 0 
 WHERE commission_pct IS NULL;
 
SELECT * 
  FROM hr.employees 
 WHERE commission_pct IS NULL;
 
COMMIT; 

SELECT * 
  FROM hr.employees 
 WHERE commission_pct IS NULL; 



