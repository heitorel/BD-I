SELECT "conflitos_economicos" as TIPO, count(ID_Conflito) as OCORRENCIA
FROM conflitos_economicos
UNION
SELECT "conflitos_racial" as TIPO, count(ID_Conflito) as OCORRENCIA
FROM conflitos_racial
UNION
SELECT "conflitos_religiosos" as TIPO, count(ID_Conflito) as OCORRENCIA
FROM conflitos_religiosos
UNION
SELECT "conflitos_territoriais" as TIPO, count(ID_Conflito) as OCORRENCIA
FROM conflitos_territoriais
