-- GROUP BY
SELECT 검색할 컬럼
FROM 테이블명
GROUP BY 기준 컬럼
;

SELECT user_id, COUNT(*)
FROM rental
GROUP BY user_id
;

-- GROUP BY HAVING
SELECT 검색할 컬럼
FROM 테이블명
GROUP BY 기준 컬럼
HAVING 조건
;

SELECT user_id, COUNT(*)
FROM rental
GROUP BY user_id
HAVING COUNT(user_id) > 1
;