-- 단일 행 서브쿼리
SELECT *
FROM employee
WHERE 급여 > (SELECT 급여
						  FROM employee
						  WHERE 사원번호 = 1);

-- 다중 행 서브쿼리(IN)
SELECT *
FROM employee
WHERE 급여 IN(SELECT MAX(급여)
							FROM employee
							GROUP BY 부서번호);

-- 다중 행 서브쿼리(EXISTS)
SELECT NAME
FROM EMPLOYEE A
WHERE EXISTS (SELECT ID
							FROM EMPLOYEE B
							WHERE B.SALARY >= 10000
							AND DEPARTMENT_ID = B.DEPARTMENT_ID);
-- 다중 행 서브쿼리(ALL)
SELECT NAME
FROM EMPLOYEE
WHERE SALARY >= ALL(SELECT ID
										FROM EMPLOYEE B
										WHERE DEPARTMENT_ID = 1);
-- 다중 행 서브쿼리(ANY)
SELECT NAME
FROM EMPLOYEE
WHERE SALARY >= ANY(SELECT ID
										FROM EMPLOYEE B
										WHERE DEPARTMENT_ID = 1);


-- 스칼라 서브쿼리
SELECT students.name, (SELECT math
                       FROM middle_test m
                       WHERE m.student_id = students.student_id) middle avg
FROM students
;
