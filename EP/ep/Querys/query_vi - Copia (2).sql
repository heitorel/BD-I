SELECT conflitos_territoriais.ID_Conflito, CONFLITO_RELIGIOSO.QUANTIDADE
FROM conflitos_territoriais
inner JOIN (SELECT conflitos_religiosos.ID_Conflito, COUNT(ID_Conflito) AS QUANTIDADE
FROM conflitos_religiosos
order by QUANTIDADE
LIMIT 1)
AS CONFLITO_RELIGIOSO
ON conflitos_territoriais.ID_Conflito = CONFLITO_RELIGIOSO.ID_Conflito