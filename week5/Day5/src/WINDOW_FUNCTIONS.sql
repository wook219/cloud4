-- 순위 함수
SELECT ID,
     NAME,
     SALARY,
     RANK() OVER (ORDER BY SALARY DESC) RANK,
     DENSE_RANK() OVER (ORDER BY SALARY DESC) DENSED_RANKING,
     ROW_NUMBER() OVER(ORDER BY SALARY DESC) ROW_NUMBER
FROM
     EMPLOYEE

-- 일반 집계 함수
SELECT
	ID, NAME, SALARY,
	AVG(SALARY) OVER(PARTITION BY DEPARTMENT_ID) DEPARTMENT_AVG
FROM
	EMPLOYEE

-- 그룹 내 행 순서 함수
SELECT
	ID, DEPARTMENT_ID, NAME, SALARY,
	FIRST_VALUE(SALARY)
	OVER(PARTITION BY DEPARTMENT_ID ORDER BY SALARY ROWS
	BETWEEN UNBOUNDED PRECEDING AND UNBOUNDED FOLLOWING) DEPARTMENT_MIN_SALARY,
	LAST_VALUE(SALARY)
	OVER(PARTITION BY DEPARTMENT_ID ORDER BY SALARY ROWS
	BETWEEN UNBOUNDED PRECEDING AND UNBOUNDED FOLLOWING) DEPARTMENT_MAX_SALARY
FROM
	EMPLOYEE
ORDER BY
	ID
;

-- 그룹 내 비율 함수
 -- RATIO_TO_REPORT
 SELECT
 	ID, NAME, SALARY,
 	SUM(SALARY) OVER() TOTAL_SALARY,
 	RATIO_TO_REPORT(SALARY) OVER() RATIO_TO_REPORT
 FROM
 	EMPLOYEE;

 -- PERCENT_RANK, CUME_DIST
 SELECT
 	ID, NAME, SALARY,
 	PERCENT_RANK() OVER(ORDER BY SALARY DESC) PERCENT_RANK,
 	ROUND(CUME_DIST() OVER(ORDER BY SALARY DESC), 4) CUME_DIST
 FROM
 	EMPLOYEE

 -- NTILE
 SELECT
 	ID, NAME, SALARY,
 	NTILE(3) OVER(ORDER BY SALARY DESC) NTILE
 FROM
 	EMPLOYEE;

-- 그룹 함수
 -- GROUP BY
 SELECT
 	D.NAME AS DEPARTMENT_NAME,
 	J.NAME AS JOB_NAME,
 	AVG(E.SALARY) AS AVG_SALARY
 FROM
 	EMPLOYEE E
 JOIN
 	DEPARTMENT D
 ON
 	E.DEPARTMENT_ID = D.ID
 JOIN JOB J
 ON
 	E.JOB_ID = J.ID
 GROUP BY
 	D.NAME, J.NAME
 ORDER BY
 	D.NAME, J.NAME
 ;

 -- ROLLUP
 SELECT
 	D.NAME AS DEPARTMENT_NAME,
 	J.NAME AS JOB_NAME
 	AVG(E.SALARY) AS AVG_SALARY
 FROM
 	EMPLOYEE E
 JOIN DEPARTMENT D
 ON
 	E.DEPARTMENT_ID = D.ID
 JOIN JOB J
 ON
 	E.JOB_ID = J.ID
 GROUP BY
 	ROLLUP(D.NAME, J.NAME)
 ;

 -- CUBE
 SELECT
 	D.NAME AS DEPARTMENT_NAME,
 	J.NAME AS JOB_NAME,
 	AVG(E.SALARY) AS AVG SALARY
 FROM EMPLOYEE E
 JOIN DEPARTMENT D
 ON
 	E.DEPARTMENT_ID = D.ID
 JOIN JOB J
 ON
 	E.JOB_ID = J.ID
 GROUP BY
 	CUBE(D.NAME, J.NAME)
 ;

 -- GROUPING SETS
 SELECT
 	D.NAME AS DEPARTMENT_NAME,
 	J.NAME AS JOB_NAME,
 	AVG(E.SALARY) AS AVG_SALARY
 FROM
 	EMPLOYEE E
 JOIN DEPARTMENT D
 ON
 	E.DEPARTMENT_ID = D.ID
 JOIN JOB J
 ON
 	E.JOB_ID = J.ID
 GROUP BY
 	GROUPING SESTS(D.NAME, J.NAME)
 ;
