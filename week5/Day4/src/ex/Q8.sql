SELECT * FROM emp;
-- 각 부서별 급여를 제일 많이 받는 사원의 월급을 받는 사원들을 조회하는 쿼리를 작성해주세요.
SELECT e1.*
FROM emp e1, (SELECT deptno, MAX(sal) max_sal
              FROM emp
              GROUP BY deptno) e2
WHERE e1.sal = e2.max_sal
;