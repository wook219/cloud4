-- CREATE
CREATE TABLE 테이블명(속성1 데이터타입1, 속성2 데이터타입2, ...);

-- ALTER
--컬럼 추가
ALTER TABLE 테이블명 ADD COLUMN 컬럼명 데이터타입 제약조건;
 -- 컬럼 수정
ALTER TABLE 테이블명 MODIFY COLUMN 컬럼명 데이터타입 제약조건;
 -- 컬럼 이름 변경
ALTER TABLE 테이블명 CHANGE COLUMN 기존컬럼명 새로운컬럼명 데이터타입 제약조건;
-- 컬럼 삭제
ALTER TABLE 테이블명 DROP COLUMN 컬럼명;
-- 테이블 이름 변경
ALTER TABLE 기존테이블명 RENAME 새로운 테이블명;

-- DROP
-- 테이블 삭제
DROP TABLE 테이블명;

-- TRUNCATE
-- 테이블 삭제
TRUNCATE TABLE 테이블명;