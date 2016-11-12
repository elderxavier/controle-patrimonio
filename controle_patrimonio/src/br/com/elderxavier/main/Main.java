/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.elderxavier.main;

import br.com.elderxavier.conexao.Conexao;
import br.com.elderxavier.controller.DaoPatrimonio;
import br.com.elderxavier.helpers.Helper;
import br.com.elderxavier.model.ControlePatrimonio;
import br.com.elderxavier.view.Editar;

import java.sql.Timestamp;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author elder
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Editar.main(args);
        /*Editar editar = new Editar();
        editar.setContentPane(new MyPanel());
        editar.setVisible(true); */

        //Connection con = new Conexao().getConexao();
        /*Timestamp ts = new Timestamp( System.currentTimeMillis() );
        System.err.println( ts.getTime() );
        ControlePatrimonio controle = new ControlePatrimonio();
        
        controle.setCodigo("asdsdfdsfs3");
        controle.setComposicao("Composicao");
        controle.setData("100/11/2016");
        controle.setDescricao("descricao");
        controle.setEstado("Estado");
        controle.setFoto("foto");
        controle.setLocalizacao("localizacao");
        controle.setNome("nome");
        controle.setValor(3.00);
        
        DaoPatrimonio dao = new  DaoPatrimonio();
        
        //dao.Inserir(controle);
        
        
        //dao.Atualizar(controle, "1");
        */
        
        //new Conexao().TestaConexao();
        /*List<ControlePatrimonio> minhalista = dao.getListar();
        for( ControlePatrimonio p : minhalista){
            System.out.println(p.getNome());
        }*/
        /*try {
            DateFormat df = new SimpleDateFormat("dd/mm/yyyy");

            String sdate = "09/08/1980";    // take a string  date
            Date date;

            date =  df.parse(sdate);
            //Timestamp ts = new Timestamp(date.getTime()); // convert gettime from date and assign it to your timestamp.

            System.out.println( df.format(date) );
        } catch (ParseException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //System.err.println( Helper.IsNumeric("10"));
        //System.err.println( Helper.IsNumeric("a"));
        */
        
        /*String t = "100,00";
        Double d = Double.parseDouble(t.replaceAll(",", ".") );
        System.err.println(d); */
    }

}
