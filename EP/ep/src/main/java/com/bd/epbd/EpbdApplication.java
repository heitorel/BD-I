package com.bd.epbd;


import com.bd.epbd.DAO.*;
import com.bd.epbd.bean.*;
import com.bd.epbd.util.HistogramaConflitos;

import java.sql.Date;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EpbdApplication {

	public static void main(String[] args) throws SQLException, ClassNotFoundException, ParseException {

		DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");

		ConflitosBelicosDAO conflitoBelicoDAO = new ConflitosBelicosDAO();
		DivisaoDAO divisaoDAO = new DivisaoDAO();
		ChefeMilitarDAO chefeMilitarDAO = new ChefeMilitarDAO();
		GrupoMilitarDAO grupoMilitarDAO = new GrupoMilitarDAO();
		LiderPoliticoDAO liderPoliticoDAO = new LiderPoliticoDAO();

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite que você deseja!\n\nCadastrar coisas = 1;\nVer resultados = 2;");
		Integer resp = sc.nextInt();

		if (resp == 1) {
			//---CADASTRAR

			//Divisao
			System.out.print("\n Cadastrar uma Divisão: \n");

			System.out.print("\n ID:");
			Integer idDiviao = sc.nextInt();
			System.out.print("\n BAIXAS:");
			Integer baixasDiviao = sc.nextInt();
			System.out.print("\n BARCOS:");
			Integer barcosDiviao = sc.nextInt();
			System.out.print("\n HOMENS:");
			Integer homensDiviao = sc.nextInt();
			System.out.print("\n TANQUES:");
			Integer tanquesDiviao = sc.nextInt();
			System.out.print("\n AVIOES:");
			Integer avioesDiviao = sc.nextInt();
			System.out.print("\n ID GRUPO ARMADO:");
			Integer idGrupoArmadoDiviao = sc.nextInt();
			System.out.print("\n ID CHEFE MILITAR:");
			Integer idChefeMilitarDiviao = sc.nextInt();

			divisaoDAO.CadastraDivisao(idDiviao, baixasDiviao, barcosDiviao, homensDiviao, tanquesDiviao, avioesDiviao, idGrupoArmadoDiviao, idChefeMilitarDiviao);

			//Conflito Belico
			System.out.print("\n Cadastrar um Conflito Bélico: \n");

			System.out.print("\n ID:");
			Integer idConflito = sc.nextInt();
			System.out.print("\n MORTOS:");
			Integer mortosConflito = sc.nextInt();
			System.out.print("\n FERIDOS:");
			Integer feridosConflito = sc.nextInt();
			System.out.print("\n TIPO:");
			String tipoConflito = sc.nextLine();
			System.out.print("\n ID GRUPO:");
			Integer idGrupoConflito = sc.nextInt();
			System.out.print("\n TERRITORIAL:");
			Integer flag_territorialGrupoConflito = sc.nextInt();
			System.out.print("\n RELIGIOSO:");
			Integer flag_religiosoGrupoConflito = sc.nextInt();
			System.out.print("\n ECONOMICO:");
			Integer flag_economicoGrupoConflito = sc.nextInt();
			System.out.print("\n RACIAL:");
			Integer flag_racialgrupoConflito = sc.nextInt();

			conflitoBelicoDAO.CadastraConflito(idConflito, mortosConflito, feridosConflito, tipoConflito,
					idGrupoConflito, flag_territorialGrupoConflito, flag_religiosoGrupoConflito,
					flag_economicoGrupoConflito, flag_racialgrupoConflito);

			//Lider Politico
			System.out.print("\n Cadastrar um Lider Politico: \n");

			System.out.print("\n NOME:");
			String nomeLiderPolitico = sc.nextLine();
			System.out.print("\n APOIOS:");
			String apoiosLiderPolitico = sc.nextLine();
			System.out.print("\n ID DIVISAO:");
			Integer idDivisaoLiderPolitico = sc.nextInt();
			System.out.print("\n ID GRUPO ARMADO:");
			Integer idGrupoArmadoLiderPolitico = sc.nextInt();

			liderPoliticoDAO.CadastraLiderPolitco(nomeLiderPolitico, apoiosLiderPolitico,
					idDivisaoLiderPolitico, idGrupoArmadoLiderPolitico);

			//Grupo Militar
			System.out.print("\n Cadastrar um Grupo Militar: \n");

			System.out.print("\n ID:");
			Integer idGrupoMilitar = sc.nextInt();
			System.out.print("\n CONFLITOS:");
			Integer conflitosGrupoMilitar = sc.nextInt();
			System.out.print("\n NOME:");
			String nomeGrupoMilitar = sc.nextLine();
			System.out.print("\n DATA SAIDA:");
			Date dataSGrupoMilitar = new Date(fmt.parse(sc.nextLine()).getTime());
			System.out.print("\n DATA ENTRADA:");
			Date dataEGrupoMilitar =  new Date(fmt.parse(sc.nextLine()).getTime());

			grupoMilitarDAO.CadastraGrupoMilitar(idGrupoMilitar, conflitosGrupoMilitar, nomeGrupoMilitar,
					dataSGrupoMilitar, dataEGrupoMilitar);

			//Chefe Militar
			System.out.print("\n Cadastrar um Chefe Militar: \n");

			System.out.print("\n ID:");
			Integer idChefeMilitar = sc.nextInt();
			System.out.print("\n HIERARQUIA:");
			String hierarquiaChefeMilitar = sc.nextLine();
			System.out.print("\n ID DIVISÃO:");
			Integer idDivisaoChefeMilitar = sc.nextInt();
			System.out.print("\n NOME LIDER POLITICO:");
			String nomeLiderPoliticoChefeMilitar = sc.nextLine();

			chefeMilitarDAO.CadastraChefeMilitar(idChefeMilitar, hierarquiaChefeMilitar,
					idDivisaoChefeMilitar, nomeLiderPoliticoChefeMilitar);

		}
		if (resp == 2) {
			//---EXPOR RESULTADOS

			//I
			System.out.println("\n i. Gerar um gráfico, histograma, por tipo de conflito e número de conflitos: \n");
			HistogramaConflitos histogramaConflitos = new HistogramaConflitos();
			histogramaConflitos.CriarHistograma();

			//II
			System.out.println("\n ii. Listar os traficantes e os grupos armados (Nome) " +
					"para os quais os traficantes fornecem armas 'Barret M82' ou 'M200 intervention': \n");
			ForneceArmasDAO forneceArmasDAO = new ForneceArmasDAO();
			List<ForneceArmas> forneceArmas = forneceArmasDAO.listaForneceArmasEspecificas();
			for (ForneceArmas relacao : forneceArmas) {
				relacao.toString();
			}

			//III
			System.out.println("\n iii. Listar os 5 maiores conflitos em número de mortos: \n");
			List<ConflitoBelico> conflitosMaisMortes = conflitoBelicoDAO.listaConflitosMaisMortes();
			for (ConflitoBelico conflitoBelico : conflitosMaisMortes) {
				conflitoBelico.toString();
			}

			//IV
			System.out.println("\n iv. Listar as 5 maiores organizações em número de mediações: \n");
			OrganizacaoMediadoraDAO organizacaoMediadoraDAO = new OrganizacaoMediadoraDAO();
			List<OrganizacaoMediadora> organizacoesMaisMediadoras = organizacaoMediadoraDAO.listaOrganizacoesMaisMediadoras();
			for (OrganizacaoMediadora organizacaoMediadora : organizacoesMaisMediadoras) {
				organizacaoMediadora.toString();
			}

			//V
			System.out.println("\n v. Listar os 5 maiores grupos armados com maior número de armas fornecidos: \n");
			GrupoArmadoDAO grupoArmadoDAO = new GrupoArmadoDAO();
			List<GrupoArmado> gruposArmadosMaisFornecedores = grupoArmadoDAO.listaGrupoArmadoMaisFornecedor();
			for (GrupoArmado grupoArmado : gruposArmadosMaisFornecedores) {
				grupoArmado.toString();
			}

			//VI
			System.out.println("\n vi. Listar o país e número de conflitos com maior número de conflitos religiosos: \n");
			List<PaisesConflitos> PaisesConflitos = conflitoBelicoDAO.listaPaisesMaisConflitosReligiosos();
			for (PaisesConflitos paiseConflito : PaisesConflitos) {
				paiseConflito.toString();
			}
		}
	}
}
