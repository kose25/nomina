/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TEST;

import DAO.ConceptoJpaController;
import DAO.Conexion;
import DTO.Concepto;
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
        
        for (Concepto dato : conceptos) {
            if (dato.getCodconcepto().equalsIgnoreCase("SUEBA")) {
                System.out.println(dato.toString());
            }
        }
    }
}
