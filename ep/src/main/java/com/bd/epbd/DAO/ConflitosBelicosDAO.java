package com.bd.epbd.DAO;

import com.bd.epbd.ConexaoMySQL;
import com.bd.epbd.bean.ConflitoBelico;
import com.bd.epbd.bean.Divisao;
import com.bd.epbd.bean.OcorrenciaTiposConflitos;
import com.bd.epbd.bean.PaisesConflitos;
import com.bd.epbd.util.LerSQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConflitosBelicosDAO {

    public ConflitosBelicosDAO() {
    }
    static ConexaoMySQL con = new ConexaoMySQL();

    public List<ConflitoBelico> listaConflitosMaisMortes () throws SQLException, ClassNotFoundException{
        Connection connection = con.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<ConflitoBelico> conflitosMaisMortes = new ArrayList<>();

        try{
            stmt = connection.prepareStatement(LerSQL.query("query_iii"));
            rs = stmt.executeQuery();

            while(rs.next()){
                ConflitoBelico conflitoBelico = new ConflitoBelico();

                conflitoBelico.setId(rs.getInt("ID_Conflito"));
                conflitoBelico.setMortos(rs.getInt("QUANTIDADE"));
                conflitosMaisMortes.add(conflitoBelico);
            }

        }catch(SQLException ex){
            Logger.getLogger(ConflitosBelicosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        con.FecharConexao();
        return conflitosMaisMortes;
    }

    public List<PaisesConflitos> listaPaisesMaisConflitosReligiosos () throws SQLException, ClassNotFoundException{
        Connection connection = con.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<PaisesConflitos> paisesConflitos = new ArrayList<>();

        try{
            stmt = connection.prepareStatement(LerSQL.query("query_vi"));
            rs = stmt.executeQuery();

            while(rs.next()){
                PaisesConflitos paisConflito = new PaisesConflitos();

                paisConflito.setNome(rs.getInt("ID_Conflito"));
                paisConflito.setQuantidade(rs.getInt("QUANTIDADE"));
                paisesConflitos.add(paisConflito);
            }

        }catch(SQLException ex){
            Logger.getLogger(ConflitosBelicosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        con.FecharConexao();
        return paisesConflitos;
    }

    public static List<OcorrenciaTiposConflitos> listaOcorrenciaTiposConflitos() throws SQLException, ClassNotFoundException{
        Connection connection = con.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<OcorrenciaTiposConflitos> ocorrenciasTiposConflitos = new ArrayList<>();

        try{
            stmt = connection.prepareStatement(LerSQL.query("query_vi"));
            rs = stmt.executeQuery();

            while(rs.next()){
                OcorrenciaTiposConflitos ocorrenciaTipoConflito = new OcorrenciaTiposConflitos();

                ocorrenciaTipoConflito.setTipo(rs.getString("TIPO"));
                ocorrenciaTipoConflito.setOcorrencia(rs.getInt("OCORRENCIA"));
                ocorrenciasTiposConflitos.add(ocorrenciaTipoConflito);
            }

        }catch(SQLException ex){
            Logger.getLogger(ConflitosBelicosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        con.FecharConexao();
        return ocorrenciasTiposConflitos;
    }

    public void CadastraConflito(Integer id, Integer mortos, Integer feridos, String tipo, Integer idGrupo)
            throws SQLException, ClassNotFoundException{

        Connection connection = con.getConnection();

        PreparedStatement stmt = null;

        ConflitoBelico conflitoBelico = new ConflitoBelico(id,mortos,feridos,idGrupo);

        try{
            stmt = connection.prepareStatement("INSERT INTO CONFLITO VALUES (?,?,?,?)");

            stmt.setInt(1, conflitoBelico.getId());
            stmt.setInt(2, conflitoBelico.getMortos());
            stmt.setInt(3, conflitoBelico.getFeridos());
            stmt.setInt(4, conflitoBelico.getIdGrupo());
            stmt.executeUpdate();

        }catch(SQLException ex){
            Logger.getLogger(ConflitosBelicosDAO.class.getName()).log(Level.SEVERE, null, ex);

        } finally{
            con.FecharConexao();

        }
    }
}
