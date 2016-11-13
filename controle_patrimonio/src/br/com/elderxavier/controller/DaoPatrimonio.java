package br.com.elderxavier.controller;

import br.com.elderxavier.conexao.Conexao;
import br.com.elderxavier.model.ControlePatrimonio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author elder
 */
public class DaoPatrimonio {

    Connection conexao = new Conexao().getConexao();
    DateFormat dateformate = new SimpleDateFormat("dd/MM/yyyy");

    public void DaoPatrimonio() {

    }

    public long Inserir(ControlePatrimonio patrimonio) {
        long ret = 0;
        String sql = "INSERT INTO patrimonio ";
        sql += "(codigo, nome, descricao, composicao, localizacao, valor, data, estado, foto, criado) ";
        sql += "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            Date date = this.dateformate.parse(patrimonio.getData());
            PreparedStatement stmt = this.conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, patrimonio.getCodigo());
            stmt.setString(2, patrimonio.getNome());
            stmt.setString(3, patrimonio.getDescricao());
            stmt.setString(4, patrimonio.getComposicao());
            stmt.setString(5, patrimonio.getLocalizacao());
            stmt.setDouble(6, patrimonio.getValor());
            stmt.setTimestamp(7, new Timestamp(date.getTime()));
            stmt.setString(8, patrimonio.getEstado());
            stmt.setString(9, patrimonio.getFoto());
            stmt.setTimestamp(10, new Timestamp(System.currentTimeMillis()));            
            int affectedRows = stmt.executeUpdate();
            ResultSet generatedKeys;
            generatedKeys = stmt.getGeneratedKeys();
            if (generatedKeys.next()) {
                ret = generatedKeys.getLong(1);
            }
            generatedKeys.close();
            stmt.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            return ret;
        }
    }

    public long Atualizar(ControlePatrimonio patrimonio, String id) {
        long ret = 0;
        String sql = "UPDATE patrimonio SET ";
        sql += "codigo = ?,";
        sql += "nome =?,";
        sql += "descricao =?,";
        sql += "composicao =?,";
        sql += "localizacao =?,";
        sql += "valor =?,";
        sql += "data =?,";
        sql += "estado =?,";
        sql += "foto =?,";
        sql += "atualizado =?";
        sql += " WHERE id = ?";
        try {
            Date date = this.dateformate.parse(patrimonio.getData());
            PreparedStatement stmt = this.conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, patrimonio.getCodigo());
            stmt.setString(2, patrimonio.getNome());
            stmt.setString(3, patrimonio.getDescricao());
            stmt.setString(4, patrimonio.getComposicao());
            stmt.setString(5, patrimonio.getLocalizacao());
            stmt.setDouble(6, patrimonio.getValor());
            stmt.setTimestamp(7, new Timestamp(date.getTime()));
            stmt.setString(8, patrimonio.getEstado());
            stmt.setString(9, patrimonio.getFoto());
            stmt.setTimestamp(10, new Timestamp(System.currentTimeMillis()));
            stmt.setString(11, id);
            ret = stmt.executeUpdate();            
            stmt.close();
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            ex.printStackTrace();            
        }finally {
            return ret;
        }
    }

    public long Excluir( String id) {
        long ret = 0;
        String sql = "DELETE FROM patrimonio WHERE id = ?";
        try {
            PreparedStatement stmt = this.conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setInt(1, Integer.parseInt(id));
            int affectedRows = stmt.executeUpdate();
            ResultSet generatedKeys;
            generatedKeys = stmt.getGeneratedKeys();
            if (generatedKeys.next()) {
                ret = generatedKeys.getLong(1);
            }
            generatedKeys.close();
            stmt.close();
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            ex.printStackTrace();            
        }finally {
            return ret;
        }
    }

    public List<ControlePatrimonio> getListar() {
        List<ControlePatrimonio> minhalista = new ArrayList<ControlePatrimonio>();
        String sql = "SELECT * FROM patrimonio";
        try {
            PreparedStatement stmt = this.conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                ControlePatrimonio patrimonio = new ControlePatrimonio();
                patrimonio.setId(rs.getInt("id"));
                patrimonio.setCodigo(rs.getString("codigo"));
                patrimonio.setNome(rs.getString("nome"));
                patrimonio.setDescricao(rs.getString("descricao"));
                patrimonio.setComposicao(rs.getString("composicao"));
                patrimonio.setLocalizacao(rs.getString("localizacao"));
                patrimonio.setValor(rs.getDouble("valor"));
                
                DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                DateFormat dfn = new SimpleDateFormat("dd/MM/yyyy");
                
                patrimonio.setData( dfn.format( df.parse( rs.getString("data") ) ) );                
                patrimonio.setEstado(rs.getString("estado"));
                patrimonio.setFoto(rs.getString("foto"));

                minhalista.add(patrimonio);
            }
            rs.close();
            stmt.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            ex.printStackTrace();
        } finally {
            return minhalista;
        }

    }    
    
    public List<ControlePatrimonio> getPesquisar( String search) {
        List<ControlePatrimonio> minhalista = new ArrayList<ControlePatrimonio>();
        String sql = "SELECT * FROM patrimonio  WHERE " + search;        
        try {
            PreparedStatement stmt = this.conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                ControlePatrimonio patrimonio = new ControlePatrimonio();
                patrimonio.setId(rs.getInt("id"));
                patrimonio.setCodigo(rs.getString("codigo"));
                patrimonio.setNome(rs.getString("nome"));
                patrimonio.setDescricao(rs.getString("descricao"));
                patrimonio.setComposicao(rs.getString("composicao"));
                patrimonio.setLocalizacao(rs.getString("localizacao"));
                patrimonio.setValor(rs.getDouble("valor"));
                
                DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                DateFormat dfn = new SimpleDateFormat("dd/MM/yyyy");
                
                patrimonio.setData( dfn.format( df.parse( rs.getString("data") ) ) );                
                patrimonio.setEstado(rs.getString("estado"));
                patrimonio.setFoto(rs.getString("foto"));

                minhalista.add(patrimonio);
            }
            rs.close();
            stmt.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            ex.printStackTrace();
        } finally {
            return minhalista;
        }

    }    
    

}
