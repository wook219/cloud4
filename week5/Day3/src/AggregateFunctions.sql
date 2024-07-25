-- COUNT
SELECT COUNT(id) FROM book;
SELECT COUNT(*) FROM book;

-- LIMIT
SELECT * FROM book LIMIT 5; -- book테이블에서 데이터 5개만 가져오기
SELECT * FROM book LIMIT 1, 5; -- 2번째 행부터 5개를 가져오기

-- SUM
SELECT SUM(math) FROM grade;

-- AVG
SELECT AVG(korean), AVG(english), AVG(math) FROM grade; -- 국어,영어,수학 평균 조회

-- MAX
SELECT MAX(korean) FROM grade;

--MIN
SELECT MIN(korean) FROM grade;