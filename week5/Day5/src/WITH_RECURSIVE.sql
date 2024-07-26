WITH RECURSIVE CTE(member_id, manager_id, lvl)
AS(
	SELECT member_id, manager_id, 0 as lvl
	FROM MEMBER
	WHERE manager_id is NULL
	UNION ALL
	SELECT a.member_id, a.manager_id, b.lvl + 1
	FROM MEMBER a
	JOIN CTE AS b
	ON a.manager_id = b.member_id
)

SELECT member_id, manager_id, lvl
FROM CTE
ORDER BY member_id, lvl;