package com.bd.epbd.DAO;

import com.bd.epbd.ConexaoMySQL;
import com.bd.epbd.bean.GrupoMilitar;
import com.bd.epbd.bean.LiderPolitico;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GrupoMilitarDAO {

    public GrupoMilitarDAO() {
    }
    ConexaoMySQL con = new ConexaoMySQL();

    public void CadastraGrupoMilitar(Integer id, Integer conflitos, String nome, Date dataSaida, Date dataEntrada)
            throws SQLException, ClassNotFoundException{

        Connection connection = con.getConnection();

        PreparedStatement stmt = null;

        GrupoMilitar grupoMilitar = new GrupoMilitar(id,conflitos,nome,dataSaida,dataEntrada);

        try{
            stmt = connection.prepareStatement("INSERT INTO GRUPO_MILITAR VALUES (?,?,?,?,?)");

            stmt.setInt(1, grupoMilitar.getId());
            stmt.setInt(2, grupoMilitar.getConflitos());
            stmt.setString(3, grupoMilitar.getNome());
            stmt.setDate(4, grupoMilitar.getDataSaida());
            stmt.setDate(5, grupoMilitar.getDataEntrada());
            stmt.executeUpdate();

        }catch(SQLException ex){
            Logger.getLogger(ConflitosBelicosDAO.class.getName()).log(Level.SEVERE, null, ex);

        } finally{
            con.FecharConexao();

        }

    }

}
