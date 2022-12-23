package com.bd.epbd;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL{
    public ConexaoMySQL() {}

    public static String status = "Não conectou...";

    private static final String SERVERNAME = "localhost:3306";
    private static final String MYDATABASE ="conflitos_belicos";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://" + SERVERNAME + "/" + MYDATABASE;
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Connection connection = null;

        try{
            Class.forName(DRIVER);
            System.out.println("aqui");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);

            if (connection != null) {
                status = ("STATUS--->Conectado com sucesso!");
            } else {
                status = ("STATUS--->Não foi possivel realizar conexão");
            }
            return connection;

        }catch(ClassNotFoundException | SQLException ex){
            System.out.println("O driver especificado nao foi encontrado. \n" + ex.toString());
            return null;
        }
    }

    public static String statusConection() {
        return status;
    }

    public static void FecharConexao() throws SQLException, ClassNotFoundException {
        ConexaoMySQL.getConnection().close();
    }

    public static java.sql.Connection ReiniciarConexao() throws SQLException, ClassNotFoundException {
        FecharConexao();
        return ConexaoMySQL.getConnection();
    }

}