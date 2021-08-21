package misiontic2022.p67reto5.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import misiontic2022.p67reto5.model.dao.RequerimientoDao_1;
import misiontic2022.p67reto5.model.dao.RequerimientoDao_2;
import misiontic2022.p67reto5.model.dao.RequerimientoDao_3;
import misiontic2022.p67reto5.model.vo.Requerimiento_1;
import misiontic2022.p67reto5.model.vo.Requerimiento_2;
import misiontic2022.p67reto5.model.vo.Requerimiento_3;

public class ControllerRequerimientos {
        // Su código
    
        public ArrayList<Requerimiento_1> consultarRequerimiento1() throws SQLException {
            // Su código
            RequerimientoDao_1 rq1 = new RequerimientoDao_1();
            ArrayList<Requerimiento_1> rq1Results = rq1.requerimiento1();
            return rq1Results;
        }
    
        public ArrayList<Requerimiento_2> consultarRequerimiento2() throws SQLException {
            // Su código
            RequerimientoDao_2 rq2 = new RequerimientoDao_2();
            ArrayList<Requerimiento_2> rq2Results = rq2.requerimiento2();
            return rq2Results;
        }
    
        public ArrayList<Requerimiento_3> consultarRequerimiento3() throws SQLException {
            // Su código
            RequerimientoDao_3 rq3 = new RequerimientoDao_3();
            ArrayList<Requerimiento_3> rq3Results = rq3.requerimiento3();
            return rq3Results;
        }

    
}
