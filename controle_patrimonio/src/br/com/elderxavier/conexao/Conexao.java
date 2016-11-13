/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.elderxavier.conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    public static Connection conexao;

    public static Connection getConexao() {
        /*String user = "root";
        String password = "";
        String local = "localhost";
        String database = "controle_patrimonio";*/
        
        //Blue Mix
        String user = "b20cd57c18a7ad";
        String password = "35f40b38";
        String local = "us-cdbr-iron-east-04.cleardb.net";
        String database = "ad_97cbd6d6c847956";
        
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conexao = DriverManager.getConnection("jdbc:mysql://" + local + "/" + database + "?" + "user=" + user + "&password=" + password);            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return conexao;
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
