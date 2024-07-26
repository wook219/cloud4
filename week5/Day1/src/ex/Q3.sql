-- DESC 명령어를 통해 정의된 kickboards 테이블을 확인할 수 있습니다.
DESC kickboards;

-- kickboards 테이블에 member_birthday 컬럼을 추가하세요.
ALTER TABLE kickboards ADD COLUMN member_birthday DATE NULL;

-- rental_date 속성의 데이터 타입을 TIME으로 수정하세요
ALTER TABLE kickboards MODIFY rental_date TIME;

-- member_id와 kickboard_id 컬럼의 제약 조건을 NOT NULL로 수정하세요.
ALTER TABLE kickboards MODIFY member_id VARCHAR(16) NOT NULL;
ALTER TABLE kickboards MODIFY kickboard_id VARCHAR(16) NOT NULL;

-- kickboard_id와 kickboard_brand 컬럼의 이름을 변경하세요.
ALTER TABLE kickboards CHANGE kickboard_id id VARCHAR(16) NOT NULL;
ALTER TABLE kickboards CHANGE kickboard_brand brand VARCHAR(16);

-- distance 컬럼을 삭제하세요.
ALTER TABLE kickboards DROP COLUMN distance;

-- kickboards 테이블의 이름을 kickboard로 수정하세요.
ALTER TABLE kickboards RENAME kickboard;

-- 수정된 kickboard 테이블의 구조를 확인해봅니다. 제출 시 아래 주석을 해제하세요.
DESC kickboard;