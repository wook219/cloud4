-- INNER JOIN
SELECT 컬럼명
FROM 테이블명
INNER JOIN 연겷할 테이블
;

SELECT *
FROM rental
INNER JOIN user
;

-- INNER JOIN 조건 적용
SELECT 컬럼명
FROM 테이블명
INNER JOIN 연겷할 테이블
ON 연결한 조건 컬럼
;

SELECT *
FROM rental
INNER JOIN user
ON user.id = retal.user_id
;

-- LEFT JOIN
SELECT 검색할 컬럼
FROM 테이블명
LEFT JOIN 연결할 테이블명
ON 조건
;

-- user 테이블을 모두 출력하되 모든 user테이블의 id와 rental테이블의 user_id가 겹치도록 합친다.
SELECT *
FROM user
LEFT JOIN rental
ON user.id = rental.user_id
;

-- RIGHT JOIN
SELECT 검색할 컬럼
FROM 테이블명
LEFT JOIN 연결할 테이블명
ON 조건
;

-- rental 테이블을 모두 출력하되 모든 rental테이블의 user_id와 user테이블의 id가 겹치도록 합친다.
SELECT *
FROM user
RIGHT JOIN rental
ON user.id = rental.user_id
;