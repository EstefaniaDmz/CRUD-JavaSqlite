/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agencia.controllers;

/**
 *
 * @author andre
 */
import java.sql.ResultSet;
import agencia.models.Sucursal;
public class ctrlSucursal {
    conexion cnn = new conexion();
    public boolean insertar(Sucursal s){
        try {
            String columnas="nombre, telefono, calle, colonia, cp, numeroPlazas";
            String datos= "'" + s.getNombre() + "', '" + s.getTelefono() + "', '" + s.getCalle() + "', '" + s.getColonia() + "', '" + s.getCp() + "', '" + s.getNumeroPlazas() + "'";
            if(cnn.insertar("sucursal", columnas, datos)){
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }
    public ResultSet mostrar(String condicion){
        try {
            ResultSet rs = cnn.mostrar("sucursal", condicion);
            return rs;
        } catch (Exception e) {
            return null;
        }
    }
    
    public boolean modificar(Sucursal s){
        try {
            String datos= "nombre='" + s.getNombre() + "', telefono='" + s.getTelefono() + "', calle='" + s.getCalle() + "', colonia='" + s.getColonia() + 
                    "', cp='" + s.getCp() +  "', numeroPlazas='" + s.getNumeroPlazas() + "'";
            String condicion = "idSucursal=" + s.getIdSucursal();
            if(cnn.actualizar("sucursal", datos, condicion)){
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }
    
    public boolean eliminar(int id){
        try {
            String condicion = "idSucursal=" + id;
            if(cnn.eliminar("sucursal", condicion)){
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }
}
