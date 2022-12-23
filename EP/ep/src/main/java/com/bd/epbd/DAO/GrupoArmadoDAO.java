package com.bd.epbd.DAO;

import com.bd.epbd.ConexaoMySQL;
import com.bd.epbd.bean.GrupoArmado;
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

public class GrupoArmadoDAO {

    public GrupoArmadoDAO() {
    }

    ConexaoMySQL con = new ConexaoMySQL();

    public List<GrupoArmado> listaGrupoArmadoMaisFornecedor () throws SQLException, ClassNotFoundException{
        Connection connection = con.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<GrupoArmado> gruposArmadosMaisFornecedores = new ArrayList<>();

        try{
            stmt = connection.prepareStatement(LerSQL.query("query_v"));
            rs = stmt.executeQuery();

            while(rs.next()){
                GrupoArmado grupoArmado = new GrupoArmado();

                grupoArmado.setId(rs.getInt("ID_Grupo_Armado"));
                grupoArmado.setArmasPorTraficante(rs.getInt("ARMAS_FORNECIDAS"));
                gruposArmadosMaisFornecedores.add(grupoArmado);
            }

        }catch(SQLException ex){
            Logger.getLogger(ConflitosBelicosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        con.FecharConexao();
        return gruposArmadosMaisFornecedores;
    }

}
