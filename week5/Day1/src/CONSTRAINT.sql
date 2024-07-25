-- NOT NULL
CREATE TABLE customer(
		id VARCHAR(10),
		name VARCHAR(10) NOT NULL
);

INSERT INTO customer (id, name) VALUES('kmax6', '김민준');
INSERT INTO customer (name) VALUES('이서연');

--에러 예시
--INSERT INTO customer (id) VALUES('kmax6);


-- UNIQUE
CREATE TABLE customer(
		id VARCHAR(10) UNIQUE,
		name VARCHAR(10) NOT NULL
);

INSERT INTO customer (id, name) VALUES('kmax6', '김민준');
--에러 예시
--INSERT INTO customer (id, name) VALUES('kmax6', '이서연');

INSERT INTO customer (name) VALUES('김민준');
INSERT INTO customer (name) VALUES('이서연');


-- DEFAULT
CREATE TABLE customer(
		id VARCHAR(10) UNIQUE,
		name VARCHAR(10) NOT NULL,
		address VARCHAR(30) DEFAULT 'No Address'
);

-- address가 'No Address'로 설정됨
INSERT INTO customer (id, name) VALUES('kmax6', '김민준');
-- address가 '서울시 동작구 대방동s'로 설정됨
INSERT INTO customer VALUES('flykite', '이서연', '서울시 동작구 대방동');


--CHECK
CREATE TABLE customer(
		id VARCHAR(10) UNIQUE,
		name VARCHAR(10) NOT NULL,
		address VARCHAR(30) DEFAULT 'No Address',
		age INT CHECK(age >= 19)
);

-- address가 '서울시 동작구 대방동s'로 설정됨
INSERT INTO customer VALUES('kmax6', '김민준', '서울시 동작구 대방동', 20);

-- 에러 예시
-- INSERT INTO customer VALUES('kmax6', '김민준', '서울시 동작구 대방동', 18);


-- 테이블 정의할 때 사용
CONSTRAINT 제약조건이름 제약조건 적용할 속성;

-- 제약 조건 추가
ALTER TABLE 테이븖명
ADD CONSTRAINT 제약조건이름 제약조건(속성);

-- DEFAULT 수정
ALTER TABLE 테이블명
ALTER 속성 SET DEFAULT 기본값;
