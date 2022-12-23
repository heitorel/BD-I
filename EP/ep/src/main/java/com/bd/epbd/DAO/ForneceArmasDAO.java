package com.bd.epbd.DAO;

import com.bd.epbd.ConexaoMySQL;
import com.bd.epbd.bean.ConflitoBelico;
import com.bd.epbd.bean.ForneceArmas;
import com.bd.epbd.util.LerSQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ForneceArmasDAO {

    public ForneceArmasDAO() {
    }
    static ConexaoMySQL con = new ConexaoMySQL();

    public List<ForneceArmas> listaForneceArmasEspecificas () throws SQLException, ClassNotFoundException{
        Connection connection = con.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<ForneceArmas> forneceArmas = new ArrayList<>();

        try{
            stmt = connection.prepareStatement(LerSQL.query("query_ii"));
            rs = stmt.executeQuery();

            while(rs.next()){
                ForneceArmas forneceArmasEspecificas = new ForneceArmas();

                forneceArmasEspecificas.setTraficante(rs.getString("Traficante"));
                forneceArmasEspecificas.setID_Grupo_Armado(rs.getInt("ID_Grupo_Armado"));
                forneceArmas.add(forneceArmasEspecificas);
            }

        }catch(SQLException ex){
            Logger.getLogger(ConflitosBelicosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        con.FecharConexao();
        return forneceArmas;
    }
}
