select ID_Grupo_Armado, SUM(Armas_por_traficante) AS ARMAS_FORNECIDAS
from grupo_armado
group by ID_Grupo_Armado
order by ARMAS_FORNECIDAS
LIMIT 5