CREATE TABLE GRADE (
  sy                VARCHAR (10)  NOT NULL
  , semester        VARCHAR (3)   NOT NULL
  , subject_code    VARCHAR (10)  NOT NULL
  , student_no      VARCHAR (10)  NOT NULL
  , grade           DECIMAL (5,2) DEFAULT 0.00
  , block_no        VARCHAR (10)  NOT NULL
  , CONSTRAINT      subject_code_fk1 FOREIGN KEY (subject_code)  REFERENCES SUBJECT(subject_code)
  , CONSTRAINT      student_no_fk1   FOREIGN KEY (student_no)    REFERENCES STUDENT(student_no)
  , CONSTRAINT      block_no_fk1     FOREIGN KEY (block_no)      REFERENCES schedule(block_no)
  , CONSTRAINT      comp_key_pk      PRIMARY KEY (sy, semester, subject_code, student_no, block_no)
);

CREATE TABLE schedule (
  block_no        VARCHAR (10) NOT NULL
  , sy            VARCHAR (10) NOT NULL
  , semester      VARCHAR (3)  NOT NULL
  , room          VARCHAR (10) DEFAULT ' '
  , time          VARCHAR (20) DEFAULT ' '
  , day           VARCHAR (10) DEFAULT ' '
  , faculty_no    VARCHAR (10) NOT NULL
  , subject_code  VARCHAR (10) NOT NULL
  , CONSTRAINT    block_no_schedule_pk PRIMARY KEY (block_no)
  , CONSTRAINT    faculty_no_fk1       FOREIGN KEY (faculty_no)   REFERENCES FACULTY(faculty_no)
  , CONSTRAINT    subject_code_fk2     FOREIGN KEY (subject_code) REFERENCES SUBJECT(subject_code)
);


INSERT INTO SCHEDULE (sy, semester, block_no, room, time, day, faculty_no, subject_code)
  VALUES ('2024-2025', '1st', 'CS21', 'COMP3', '8:00AM - 1:00PM', 'S', 1, 'CSC 0212.1');
INSERT INTO SCHEDULE (sy, semester, block_no, room, time, day, faculty_no,  subject_code)
  VALUES ('2024-2025', '1st', 'CS23', 'COMP2', '1:00PM - 6:00PM', 'S', 5, 'ICC 0105');
INSERT INTO SCHEDULE (sy, semester, block_no, room, time, day, faculty_no,  subject_code)
  VALUES ('2024-2025', '1st', 'CS22', 'COMP4', '1:00PM - 6:00PM', 'M', 2, 'CSC 0224');


INSERT INTO GRADE (sy, semester, subject_code, student_no, grade, block_no)
  VALUES ('2024-2025', '1st', 'CSC 0212.1', 1, 2.25, 'CS21');
INSERT INTO GRADE (sy, semester, subject_code, student_no, grade, block_no)
  VALUES ('2024-2025', '1st', 'ICC 0105', 2, 2.25, 'CS23');
INSERT INTO GRADE (sy, semester, subject_code, student_no, grade, block_no)
  VALUES ('2024-2025', '1st', 'CSC 0224', 3, 2.25, 'CS22');
  
SELECT * FROM SCHEDULE;
SELECT * FROM GRADE;

--BLOCK NUMBER, STUDENT NUMBER, SUBJECT CODE
