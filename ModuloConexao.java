package br.com.luizcarlos.ordemdeservico.dal;

import java.sql.*;


public class ModuloConexao {

    // metodo responsavel por estabelecer a conexão com o banco de dados.
    public static Connection conector() {
        java.sql.Connection conexao = null;
        // a linha abaixo chama o driver 
        String driver;
        driver = "com.mysql.jdbc.Driver";
        // Armazenando Informações referentes ao BD
        String url = "jdbc:mysql://localhost:3306/luizcarlosdb";
        String user = "root";
        String password = "admin";
        // estabelecendo a conexão com o bd
        try {
            Class.forName(driver);
            conexao =   DriverManager.getConnection(url, user, password);
            return conexao;
                      
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
            return null;
        }
    }
}
