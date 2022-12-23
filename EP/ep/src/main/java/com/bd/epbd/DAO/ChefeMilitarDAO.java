package com.bd.epbd.DAO;

import com.bd.epbd.ConexaoMySQL;
import com.bd.epbd.bean.ChefeMilitar;
import com.bd.epbd.bean.LiderPolitico;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChefeMilitarDAO {

    public ChefeMilitarDAO() {
    }
    ConexaoMySQL con = new ConexaoMySQL();

    public void CadastraChefeMilitar(Integer id, String hierarquia, Integer idDivisao, String nomeLiderPolitico)
            throws SQLException, ClassNotFoundException{

        Connection connection = con.getConnection();

        PreparedStatement stmt = null;

        ChefeMilitar chefeMilitar = new ChefeMilitar(id,hierarquia,idDivisao,nomeLiderPolitico);

        try{
            stmt = connection.prepareStatement("INSERT INTO CHEFE_MILITAR VALUES (?,?,?,?)");

            stmt.setInt(1, chefeMilitar.getId());
            stmt.setString(2, chefeMilitar.getHierarquia());
            stmt.setInt(3, chefeMilitar.getIdDivisao());
            stmt.setString(4, chefeMilitar.getNomeLiderPolitico());
            stmt.executeUpdate();

        }catch(SQLException ex){
            Logger.getLogger(ConflitosBelicosDAO.class.getName()).log(Level.SEVERE, null, ex);

        } finally{
            con.FecharConexao();

        }

    }
}
