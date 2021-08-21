package misiontic2022.p67reto5.model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import misiontic2022.p67reto5.model.vo.Requerimiento_1;
import misiontic2022.p67reto5.util.JDBCUtilities;

public class RequerimientoDao_1 {

    public ArrayList<Requerimiento_1> requerimiento1() throws SQLException {
            // Su código
            ArrayList<Requerimiento_1> answer = new ArrayList<>();
            Connection connection = JDBCUtilities.getConnection();
            Statement statement = null;
            ResultSet results = null;
            
            try {
                statement = connection.createStatement();
                String query = "SELECT Fecha 'Fec. Compra', Proveedor 'Nom. Proveedor', ID_Compra 'C. Compra', Pagado \n" +
                                "FROM Compra c \n" +
                                "ORDER BY ID_Compra DESC\n" +
                                "LIMIT 20";
                results = statement.executeQuery(query);
                while (results.next()) {
                    Requerimiento_1 vo = new Requerimiento_1();
                    vo.setFechaCompra(results.getString("Fec. Compra"));
                    vo.setIdCompra(results.getString("C. Compra"));
                    vo.setNomProveedor(results.getString("Nom. Proveedor"));
                    vo.setPagado(results.getString("Pagado"));
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
