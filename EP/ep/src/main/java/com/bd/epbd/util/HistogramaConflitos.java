package com.bd.epbd.util;

import com.bd.epbd.DAO.ConflitosBelicosDAO;
import com.bd.epbd.bean.OcorrenciaTiposConflitos;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.JFrame;
import java.awt.*;
import java.sql.SQLException;
import java.util.List;

public class HistogramaConflitos extends JFrame{

    public HistogramaConflitos() throws HeadlessException {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Histograma Conflitos");
        setSize(950,700);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void CriarHistograma() throws SQLException, ClassNotFoundException {
        DefaultCategoryDataset barra = new DefaultCategoryDataset();

        List<OcorrenciaTiposConflitos> ocorrenciasTiposConflitos = ConflitosBelicosDAO.listaOcorrenciaTiposConflitos();

        for (OcorrenciaTiposConflitos ocorrenciaTiposConflitos : ocorrenciasTiposConflitos){
            barra.setValue(ocorrenciaTiposConflitos.getOcorrencia(), ocorrenciaTiposConflitos.getTipo(),"");
        }

        JFreeChart grafico = ChartFactory.createBarChart("Histograma Conflitos", "Tipos", "Ocorrencia",
                barra, PlotOrientation.VERTICAL, true, true, false);

        ChartPanel painel = new ChartPanel(grafico);
        add(painel);
    }

}
