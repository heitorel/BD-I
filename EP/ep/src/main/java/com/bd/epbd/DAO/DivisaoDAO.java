package com.bd.epbd.DAO;

import com.bd.epbd.ConexaoMySQL;
import com.bd.epbd.bean.Divisao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DivisaoDAO {

    public DivisaoDAO() {
    }

    ConexaoMySQL con = new ConexaoMySQL();

    public void CadastraDivisao(Integer id, Integer baixas, Integer barcos, Integer homens, Integer tanques, Integer avioes, Integer idGrupoArmado, Integer idChefeMilitar) throws SQLException, ClassNotFoundException{

        Connection connection = con.getConnection();

        PreparedStatement stmt = null;

        Divisao divisao = new Divisao(id,baixas,barcos,homens,tanques,avioes,idGrupoArmado,idChefeMilitar);

        try{
            stmt = connection.prepareStatement("INSERT INTO DIVISAO VALUES (?,?,?,?,?,?,?,?)");

            stmt.setInt(1, divisao.getId());
            stmt.setInt(2, divisao.getBaixas());
            stmt.setInt(3, divisao.getBarcos());
            stmt.setInt(4, divisao.getHomens());
            stmt.setInt(5, divisao.getTanques());
            stmt.setInt(6, divisao.getAvioes());
            stmt.setInt(7, divisao.getIdGrupoArmado());
            stmt.setInt(8, divisao.getIdChefeMilitar());
            stmt.executeUpdate();

        }catch(SQLException ex){
            Logger.getLogger(ConflitosBelicosDAO.class.getName()).log(Level.SEVERE, null, ex);

        } finally{
            con.FecharConexao();

        }

    }

}
