/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import DAO.Conexion;
import DAO.EmpleadoJpaController;
import DTO.Empleado;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author kose_
 */
public class Nomina {

    Conexion con = Conexion.getConexion();
    EmpleadoJpaController empleadoDAO = new EmpleadoJpaController(con.getBd());
    List<Empleado> empleados = empleadoDAO.findEmpleadoEntities();

    public boolean insertarEmpleado(String codigo, String cedula, String nombre, String fechanacimiento, String fechaingreso, String fecharetiro) throws ParseException {
        Empleado e = new Empleado();
        e.setCedula(cedula);
        e.setCodigo(codigo);
        e.setFechaingreso(crearFecha(fechaingreso));
        e.setFechanacimiento(crearFecha(fechanacimiento));
        e.setFecharetiro(crearFecha(fecharetiro));
        e.setNombre(nombre);

        try {
            empleadoDAO.create(e);
            return true;
        } catch (Exception x) {
            System.err.println(x.getMessage());
            return false;
        }
    }

    public Empleado buscarEmpleado(String codigo) {
        if (empleadoDAO.findEmpleado(codigo) != null) {
            return empleadoDAO.findEmpleado(codigo);
        } else {
            return null;
        }
    }
    
    private Date crearFecha(String fecha) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
        Date date = formatter.parse(fecha);
        return date;
    }

}
