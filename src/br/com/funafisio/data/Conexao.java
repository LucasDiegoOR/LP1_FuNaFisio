package br.com.funafisio.data;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    public Connection con;

    public Conexao() throws Exception {
        String url = "jdbc:postgresql://localhost:5432/bdFuNaFisio";
        Class.forName("org.postgresql.Driver");
        con = DriverManager.getConnection(url, "postgres", "postdba");
        System.out.println("Conectado!");
    }

    public Connection getConnection() {
        return con;
    }
}
