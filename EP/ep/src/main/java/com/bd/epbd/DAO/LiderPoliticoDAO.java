package com.bd.epbd.DAO;

import com.bd.epbd.ConexaoMySQL;
import com.bd.epbd.bean.ConflitoBelico;
import com.bd.epbd.bean.LiderPolitico;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LiderPoliticoDAO {

    public LiderPoliticoDAO() {
    }
    ConexaoMySQL con = new ConexaoMySQL();

    public void CadastraLiderPolitco(String nome, String apoios, Integer idDivisao, Integer idGrupoArmado)
            throws SQLException, ClassNotFoundException{

        Connection connection = con.getConnection();

        PreparedStatement stmt = null;

        LiderPolitico liderPolitico = new LiderPolitico(nome,apoios,idDivisao,idGrupoArmado);

        try{
            stmt = connection.prepareStatement("INSERT INTO LIDER_POLITICO VALUES (?,?,?,?)");

            stmt.setString(1, liderPolitico.getNome());
            stmt.setString(2, liderPolitico.getApoios());
            stmt.setInt(3, liderPolitico.getIdDivisao());
            stmt.setInt(4, liderPolitico.getIdGrupoArmado());
            stmt.executeUpdate();

        }catch(SQLException ex){
            Logger.getLogger(ConflitosBelicosDAO.class.getName()).log(Level.SEVERE, null, ex);

        } finally{
            con.FecharConexao();

        }

    }
}
