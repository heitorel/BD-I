select Nome_Organizacao, COUNT(Nome_Organizacao) AS MEDIACOES
from organizacao_mediadora
group by Nome_Organizacao
order by MEDIACOES
LIMIT 5