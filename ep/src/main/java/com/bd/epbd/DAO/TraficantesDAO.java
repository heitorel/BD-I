package com.bd.epbd.DAO;

import com.bd.epbd.ConexaoMySQL;
import com.bd.epbd.bean.Traficante;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TraficantesDAO {

    ConexaoMySQL con = new ConexaoMySQL();


    public List<Traficante> listaTraficantes () throws SQLException, ClassNotFoundException{

        Connection connection = con.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Traficante> traficantes = new ArrayList<>();

        try{
            stmt = connection.prepareStatement("QUERY");
            rs = stmt.executeQuery();

            while(rs.next()){
                Traficante traficante = new Traficante();

                traficante.setId(rs.getInt("id"));
                traficante.setNome(rs.getString("nome"));
                traficantes.add(traficante);
            }

        }catch(SQLException ex){

            Logger.getLogger(TraficantesDAO.class.getName()).log(Level.SEVERE, null, ex);

        }
        return traficantes;
    }

}
