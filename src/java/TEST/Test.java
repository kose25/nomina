/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TEST;

import DAO.ConceptoJpaController;
import DAO.Conexion;
import DAO.EmpleadoJpaController;
import DTO.Concepto;
import DTO.Empleado;
import java.util.Date;
import java.util.List;

/**
 *
 * @author stive
 */
public class Test {
    
    public static void main(String[] args) {
        Conexion con = Conexion.getConexion();
        ConceptoJpaController conceptoDAO = new ConceptoJpaController(con.getBd());
        List<Concepto> conceptos = conceptoDAO.findConceptoEntities();
        EmpleadoJpaController empleadoDAO = new EmpleadoJpaController(con.getBd());
        List<Empleado> empleados = empleadoDAO.findEmpleadoEntities();
        
       
        for (Concepto dato : conceptos) {
            //Busca el concepto sueba
            if (dato.getCodconcepto().equalsIgnoreCase("SUEBA")) {
                System.out.println(dato.toString());
            }
        }
        
        
        //Empleado = 	codigo cedula nombre fechanacimiento fecharetiro
        Empleado nuevo = new Empleado("11514","109111111","Carlos",new Date((1998-1900),01,29),new Date((2020-1900),01,01),new Date((2020-1900),12,01));
        try{
        empleadoDAO.create(nuevo);
        System.out.println("Se ha creado con éxito:"+nuevo.toString());
        }catch(Exception ex){
            //Logger.getLogger(TestConexion.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println(ex.getMessage());
        }

    }
}
