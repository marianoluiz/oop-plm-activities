
CONNECT PLM_INFO_SYSTEM/PLM_INFO_SYSTEM;

SELECT * FROM USER_SYS_PRIVS;  -- Check system privileges
SELECT * FROM USER_TAB_PRIVS;   -- Check object privileges

-- a. STUDENT
CREATE TABLE STUDENT (
  student_no NUMBER PRIMARY KEY NOT NULL
  , lastname VARCHAR(100) DEFAULT ' '
  , firstname VARCHAR(100)
  , address VARCHAR(255)
  , email_address VARCHAR(100)
  , gender VARCHAR(1) DEFAULT 'M'
  , birthday DATE
  , course_code VARCHAR(20) -- FK 
  , status VARCHAR(1) DEFAULT 'A'
  , cellno VARCHAR(15) DEFAULT ' '
  , cellno1 VARCHAR(15)
  , CONSTRAINT fk_student_course_code FOREIGN KEY (course_code) REFERENCES COURSE(course_code)
);

-- b. COURSE
CREATE TABLE COURSE (
  course_code VARCHAR(20) PRIMARY KEY NOT NULL
  , description VARCHAR(255) DEFAULT ' '
  , status VARCHAR(1) DEFAULT 'A'
  , college_code VARCHAR(20) -- FK
  ,  CONSTRAINT fk_course_college_code FOREIGN KEY (college_code) REFERENCES COLLEGE(college_code)
);

-- c. COLLEGE
CREATE TABLE COLLEGE (
  college_code VARCHAR(20) PRIMARY KEY NOT NULL
  , description VARCHAR(255) DEFAULT ' '
  , status VARCHAR(1) DEFAULT 'A'
);

-- d. FACULTY
CREATE TABLE FACULTY (
  faculty_no NUMBER PRIMARY KEY NOT NULL
  , lastname VARCHAR(100) DEFAULT ' '
  , firstname VARCHAR(100)
  , address VARCHAR(255)
  , email_address VARCHAR(100)
  , gender VARCHAR(1) DEFAULT 'M'
  , birthdate DATE
  , college_code VARCHAR(20) --FK
  , status VARCHAR(1) DEFAULT 'A'
  , CONSTRAINT fk_faculty_college_code FOREIGN KEY (college_code) REFERENCES COLLEGE(college_code)
);

-- e. SUBJECT
CREATE TABLE SUBJECT (
  subject_code VARCHAR(20) PRIMARY KEY NOT NULL
  , description VARCHAR(255) NOT NULL
  , units NUMBER NOT NULL
  , lec_lab VARCHAR(50)
  , college_code VARCHAR(20) -- FK
  , status VARCHAR(1) DEFAULT 'A'
  , CONSTRAINT fk_subject_college_code FOREIGN KEY (college_code) REFERENCES COLLEGE(college_code)
);

-- 3. Add a new column (status) in SUBJECT table
ALTER TABLE SUBJECT
  ADD status VARCHAR(1) DEFAULT 'A';
  
-- 4. Delete the column cellno1 in STUDENT table
ALTER TABLE STUDENT
  DROP COLUMN cellno1;

-- 5. Change the column width of lastname and firstname to 200 characters.
ALTER TABLE STUDENT  
  MODIFY lastname VARCHAR(200);

ALTER TABLE STUDENT
  MODIFY firstname VARCHAR(200);
  
