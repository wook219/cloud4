SELECT MAX(price), MIN(price)
FROM books
WHERE publication_year >= 2001
AND publication_year <= 2003
;