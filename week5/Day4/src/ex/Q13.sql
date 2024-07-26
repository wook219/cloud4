-- 아래는 REQUEST, REQUEST_DTL 테이블에 대한 구조를 보여줍니다. 테이블을 수정하실 필요는 없습니다.
DESC REQUEST;
DESC REQUEST_DTL;

-- 1. 요청상태가 FAILED인 요청 데이터를 조회하는 쿼리를 작성해보세요.
SELECT request_id
FROM REQUEST
WHERE request_status = 'FAILED'
;

-- 2. 위에서 작성한 쿼리를 서브쿼리로 이용하여 REQUEST_DTL 테이블에서 요청 상세를 조회하는 쿼리를 작성해보세요.
SELECT request_dtl_id, request_id, request_name, request_content
FROM REQUEST_DTL
WHERE (SELECT request_id
       FROM REQUEST
       WHERE request_status = 'FAILED');