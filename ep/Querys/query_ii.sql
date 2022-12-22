select FORNECE_ARMAS.Traficante, FORNECE_ARMAS.ID_Grupo_Armado
FROM FORNECE_ARMAS
inner JOIN (SELECT Traficante_de_Armas
FROM POSSUI_ARMA
WHERE Arma in ("Barret M82","M200 intervention")) AS TRAFICANTE_ARMADO
on FORNECE_ARMAS.Traficante = TRAFICANTE_ARMADO.Traficante_de_Armas
