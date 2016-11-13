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
    }

}
