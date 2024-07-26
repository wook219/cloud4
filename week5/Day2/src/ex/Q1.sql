-- 정의되어 있는 테이블을 확인해보세요.
DESC customer;

-- 1차 정규화를 적용하세요.
DELETE FROM customer
WHERE customer_name = '김민준'
;

INSERT INTO customer (customer_id, customer_name, rental_time, rental_location, brand, model_year, price_per_minute, basic_price, company)
VALUES ('kmax6', '김민준', '2020-08-20 13:01:02', '서울시 강남구 역삼동', 'boardkick', 2015, 100, 1000, 'elice')
;

INSERT INTO customer (customer_id, customer_name, rental_time, rental_location, brand, model_year, price_per_minute, basic_price, company)
VALUES ('kmax6', '김민준', '2020-09-01 20:39:52', '서울시 강남구 역삼동', 'boardkick', 2015, 100, 1000, 'elice')
;

-- 정규화된 결과를 확인해보세요.
SELECT * FROM customer;
