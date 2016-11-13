/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import br.com.elderxavier.helpers.Helper;
import javax.swing.JOptionPane;

/**
 *
 * @author elder
 */
public class TesteMain {
    
    public static void main(String[] args) {
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
        
        
        
        //dao.Inserir(controle);
        
        
        //dao.Atualizar(controle, "1");
        */
        
        //new Conexao().TestaConexao();
        /*DaoPatrimonio dao = new  DaoPatrimonio();
        List<ControlePatrimonio> minhalista = dao.getListar();
        for( ControlePatrimonio p : minhalista){
            System.out.println(p.getData());
        }*/
        /*try {
            //DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
            

            //String sdate = "09/08/1980";             
            //Date date;

            //date =  df.parse(sdate);
            //DateFormat dfn = new SimpleDateFormat("dd/mm/yyyy");
            

            //System.out.println( df.format(date) );
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            DateFormat dfn = new SimpleDateFormat("dd/MM/yyyy");
            String sdate = "2016-04-09 00:11:00.0";
            //Date date;
            //date =  df.parse(sdate);
            java.sql.Date date;
            //Timestamp ts = new Timestamp(date.getTime());
            
            //date =  ts;
            String d = dfn.format( df.parse(sdate) );
            
            System.out.println( dfn.format( df.parse(sdate) ) );
        } catch (ParseException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        //System.err.println( Helper.IsNumeric("10"));
        //System.err.println( Helper.IsNumeric("a"));
        
        
        /*String t = "100,00";
        Double d = Double.parseDouble(t.replaceAll(",", ".") );
        System.err.println(d); */
        
        //String t = "100.0";
        //t = t.replaceAll("[.]", ",");
        //String p = t.split(".")[0];
        
        //String[] parts = t.split("[.]");
        
        //System.out.println(parts[0]);
        
        //double d = 0;
        
       // System.out.println(  Helper.getDecimalString(d));
       
       /*int op = JOptionPane.showConfirmDialog(null,"Excluir Registro ?", "Cancelar", JOptionPane.YES_NO_OPTION);
            if ( op == JOptionPane.YES_OPTION){
                //System.exit(0);
                JOptionPane.showMessageDialog(null, "Registro Excluido");
            }
        */
        System.out.println("OK teste");
    }
    
}
