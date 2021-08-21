package misiontic2022.p67reto5.view;

import java.util.ArrayList;

import misiontic2022.p67reto5.controller.ControllerRequerimientos;

import misiontic2022.p67reto5.model.vo.Requerimiento_1;
import misiontic2022.p67reto5.model.vo.Requerimiento_2;
import misiontic2022.p67reto5.model.vo.Requerimiento_3;


public class ViewRequerimientos {

    public static final ControllerRequerimientos controlador = new ControllerRequerimientos();

    public static String requerimiento1(){
        String results = "Requerimiento 1";
        results += "\nFec.Compra\tC.Compra\tNom.Proveedor\t\tPagado?";
        try {
            // Su código
            ArrayList<Requerimiento_1> rq1Results = controlador.consultarRequerimiento1();
            for (Requerimiento_1 rq1Result: rq1Results) {
                results += String.format("%n %s\t%s\t%s\t%s", rq1Result.getFechaCompra(), rq1Result.getIdCompra(), rq1Result.getNomProveedor(), rq1Result.getPagado());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
        return results;
    }

    public static String requerimiento2(){
        String results = "Requerimiento 2";
        results += "\nFec.Ini.\tNom.Ciudad\tNombre.Constructora\tNom.Lider\tC.Tipo\tEstrato";
        try {
            // Su código
            ArrayList<Requerimiento_2> rq2Results = controlador.consultarRequerimiento2();
            for (Requerimiento_2 rq2Result: rq2Results) {
                results += String.format("%n %s\t%s\t%s\t%s\t%s\t%s", rq2Result.getFechaInicio(), rq2Result.getNomCiudad(), rq2Result.getNomConstructora(), rq2Result.getNomLider(), rq2Result.getCodigoTipo(), rq2Result.getEstrato());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
        return results;
    }

    public static String requerimiento3(){
        String results = "Requerimiento 3";
        results += "\nAbrev.";
        try {
            // Su código
            ArrayList<Requerimiento_3> rq3Results = controlador.consultarRequerimiento3();
            for (Requerimiento_3 rq3Result: rq3Results) {
                results += String.format("%n %s", rq3Result.getAbrev());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
        return results;
    }
    
}

