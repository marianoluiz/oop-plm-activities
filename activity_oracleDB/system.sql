-- A. ROLES AND PRIVILEDGES

-- 1.
CREATE ROLE plm_developers;

GRANT CREATE SESSION TO plm_developers;
GRANT UNLIMITED TABLESPACE TO plm_developers;
GRANT CREATE ANY TABLE TO plm_developers;
GRANT CREATE ANY VIEW TO plm_developers;
GRANT CREATE SYNONYM TO plm_developers;

CREATE ROLE plm_testers;
GRANT CREATE SESSION TO plm_testers;
GRANT UNLIMITED TABLESPACE TO plm_testers;
GRANT SELECT ANY TABLE TO plm_testers;

  SELECT * FROM DBA_ROLES;
  -- to view dba_roles in gui click views >> dba >> security >> roles
  
-- 2. Create 2 users (francis and jose) and assign the role plm_developers.
CREATE USER francis IDENTIFIED BY francis;
CREATE USER jose IDENTIFIED BY jose;

GRANT plm_developers TO francis, jose;

-- 3. Create 2 users (maria and josefa) and assign the role plm_testers.
CREATE USER maria IDENTIFIED BY maria;
CREATE USER josefa IDENTIFIED BY josefa;

GRANT plm_testers TO maria, josefa;

-- B. DATABASE AND TABLE CREATION

-- 1. Create a user (PLM_INFO_SYSTEM) and assign the role plm_developers.
CREATE USER PLM_INFO_SYSTEM IDENTIFIED BY PLM_INFO_SYSTEM;
GRANT plm_developers TO PLM_INFO_SYSTEM;


CREATE TABLESPACE DATA_PLM_INFO_SYSTEM
  DATAFILE 'C:\\OracleDB\\OracleData\\DATA_PLM_INFO_SYSTEM.dbf' SIZE 10M AUTOEXTEND ON NEXT 10M MAXSIZE UNLIMITED;

ALTER USER PLM_INFO_SYSTEM DEFAULT TABLESPACE DATA_PLM_INFO_SYSTEM;

ALTER USER PLM_INFO_SYSTEM QUOTA UNLIMITED ON DATA_PLM_INFO_SYSTEM;

-- see all table space
SELECT TABLESPACE_NAME, STATUS, CONTENTS FROM DBA_TABLESPACES;
-- drop table space
DROP TABLESPACE PLM_INFO_SYSTEM INCLUDING CONTENTS AND DATAFILES;