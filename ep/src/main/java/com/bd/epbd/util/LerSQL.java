package com.bd.epbd.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class LerSQL {

        public static String query(String ARQUIVO) {

            String curDir = System.getProperty("user.dir");

            String QUERY = "";
            String URL = curDir+"\\Querys\\" + ARQUIVO + ".sql";

            try {
                FileReader arq = new FileReader(URL);
                BufferedReader lerArq = new BufferedReader(arq);

                String linha = lerArq.readLine();
                while (linha != null) {
                    QUERY += linha;
                    linha = lerArq.readLine(); // lê da segunda até a última linha
                }

                arq.close();
            } catch (IOException e) {
                System.err.printf("Erro na abertura do arquivo: %s.\n",
                        e.getMessage());
            }

            return QUERY;
        }
}
