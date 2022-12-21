package com.bd.epbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL{
    public ConexaoMySQL() {}

    public static String status = "Não conectou...";

    private static final String SERVERNAME = "localhost";
    private static final String MYDATABASE ="mysql";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://" + SERVERNAME + "/" + MYDATABASE;
    private static final String USER = "user";
    private static final String PASSWORD = "senha";

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Connection connection = null;

        try{
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USER, PASSWORD);

            if (connection != null) {
                status = ("STATUS--->Conectado com sucesso!");
            } else {
                status = ("STATUS--->Não foi possivel realizar conexão");
            }
            return connection;

        }catch(ClassNotFoundException | SQLException ex){
            System.out.println("O driver expecificado nao foi encontrado.");
            return null;
        }
    }

    public static String statusConection() {
        return status;
    }

    public static boolean FecharConexao() throws SQLException, ClassNotFoundException {
        ConexaoMySQL.getConnection().close();
        return true;
    }

    public static java.sql.Connection ReiniciarConexao() throws SQLException, ClassNotFoundException {
        FecharConexao();
        return ConexaoMySQL.getConnection();
    }

}