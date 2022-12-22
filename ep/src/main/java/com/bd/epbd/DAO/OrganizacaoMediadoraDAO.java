package com.bd.epbd.DAO;

import com.bd.epbd.ConexaoMySQL;
import com.bd.epbd.bean.ConflitoBelico;
import com.bd.epbd.bean.OrganizacaoMediadora;
import com.bd.epbd.util.LerSQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OrganizacaoMediadoraDAO {

    public OrganizacaoMediadoraDAO() {
    }

    ConexaoMySQL con = new ConexaoMySQL();

    public List<OrganizacaoMediadora> listaOrganizacoesMaisMediadoras () throws SQLException, ClassNotFoundException{
        Connection connection = con.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<OrganizacaoMediadora> organizacoesMaisMediadoras = new ArrayList<>();

        try{
            stmt = connection.prepareStatement(LerSQL.query("query_iv"));
            rs = stmt.executeQuery();

            while(rs.next()){
                OrganizacaoMediadora organizacaoMediadora = new OrganizacaoMediadora();

                organizacaoMediadora.setNome(rs.getString("Nome_Organizacao"));
                organizacaoMediadora.setMediacoes(rs.getInt("MEDIACOES"));
                organizacoesMaisMediadoras.add(organizacaoMediadora);
            }

        }catch(SQLException ex){
            Logger.getLogger(ConflitosBelicosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        con.FecharConexao();
        return organizacoesMaisMediadoras;
    }

}
