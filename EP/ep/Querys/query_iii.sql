SELECT ID_Conflito, SUM(Mortos) as QUANTIDADE
FROM conflito
group by ID_Conflito
order by QUANTIDADE
LIMIT 5
