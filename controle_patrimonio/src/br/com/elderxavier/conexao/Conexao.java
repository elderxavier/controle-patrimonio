/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.elderxavier.conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    Connection conexao;

    public Connection getConexao() {
        String user = "root";
        String password = "";
        String local = "localhost";
        String database = "controle_patrimonio";

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            this.conexao = DriverManager.getConnection("jdbc:mysql://" + local + "/" + database + "?" + "user=" + user + "&password=" + password);
            System.out.println("Conectado");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return this.conexao;
    }

    public void TestaConexao() {

        try {
            System.out.println(this.getConexao().toString());
            System.out.println("Conectado");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }    

}
