package misiontic2022.p67reto5.model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import misiontic2022.p67reto5.model.vo.Requerimiento_2;
import misiontic2022.p67reto5.util.JDBCUtilities;

public class RequerimientoDao_2 {

    public ArrayList<Requerimiento_2> requerimiento2() throws SQLException {
            // Su código
            ArrayList<Requerimiento_2> answer = new ArrayList<>();
            Connection connection = JDBCUtilities.getConnection();
            Statement statement = null;
            ResultSet results = null;
            
            try {
                statement = connection.createStatement();
                String query = "SELECT Fecha_Inicio 'Fec. Ini.', Ciudad 'Nom. Ciudad', Constructora 'Nombre. Constructora', l.Nombre || ' ' || l.Segundo_Apellido 'Nom. Lider', t.Codigo_Tipo 'C. Tipo', t.Estrato\n" +
                                "FROM Proyecto p \n" +
                                "INNER JOIN Lider l \n" +
                                "ON p.ID_Lider = l.ID_Lider \n" +
                                "INNER JOIN Tipo t \n" +
                                "ON p.ID_Tipo = t.ID_Tipo \n" +
                                "WHERE Ciudad = 'Armenia'\n" +
                                "AND Fecha_Inicio BETWEEN '2021-01-01' AND '2021-05-30'";
                results = statement.executeQuery(query);
                while (results.next()) {
                    Requerimiento_2 vo = new Requerimiento_2();
                    vo.setFechaInicio(results.getString("Fec. Ini."));
                    vo.setNomCiudad(results.getString("Nom. Ciudad"));
                    vo.setNomConstructora(results.getString("Nombre. Constructora"));
                    vo.setNomLider(results.getString("Nom. Lider"));
                    vo.setCodigoTipo(results.getString("C. Tipo"));
                    vo.setEstrato(results.getString("Estrato"));
                    answer.add(vo);
                }
            } catch (SQLException ex) {
                /* Ignored */ 
            } finally {
                try { results.close(); } catch (Exception e) { /* Ignored */ }
                try { statement.close(); } catch (Exception e) { /* Ignored */ }
                try { connection.close(); } catch (Exception e) { /* Ignored */ }
            }
            return answer;
    }  
    
}

