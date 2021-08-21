package misiontic2022.p67reto5.model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import misiontic2022.p67reto5.model.vo.Requerimiento_3;
import misiontic2022.p67reto5.util.JDBCUtilities;

public class RequerimientoDao_3 {

    public ArrayList<Requerimiento_3> requerimiento3() throws SQLException {
            // Su código
            ArrayList<Requerimiento_3> answer = new ArrayList<>();
            Connection connection = JDBCUtilities.getConnection();
            Statement statement = null;
            ResultSet results = null;
            
            try {
                statement = connection.createStatement();
                String query = "SELECT substr (Nombre, 1, 2) || substr (Primer_Apellido , 1, 2) || substr (Segundo_Apellido , 1, 2) 'Abrev.'\n" +
                                "FROM Lider l ";
                results = statement.executeQuery(query);
                while (results.next()) {
                    Requerimiento_3 vo = new Requerimiento_3();
                    vo.setAbrev(results.getString("Abrev."));
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

