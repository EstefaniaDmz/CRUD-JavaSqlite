/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agencia.controllers;

import agencia.models.Hotel;
import java.sql.ResultSet;
/**
 *
 * @author andre
 */
public class ctrlHotel {
    conexion cnn = new conexion();
    public boolean insertar(Hotel h){
        try {
            String columnas="nombre, telefono, calle, colonia, cp, ciudad, estado, pais, numeroPlazas";
            String datos= "'" + h.getNombre() + "', '" + h.getTelefono() + "', '" + h.getCalle() + "', '" + h.getColonia() + "', '" + h.getCp() + "', '"
                    + h.getCiudad() + "', '" + h.getEstado() + "', '" + h.getPais() + "', '" + h.getNumeroPlazas() + "'";
            if(cnn.insertar("Hotel", columnas, datos)){
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }
    public ResultSet mostrar(String condicion){
        try {
            ResultSet rs = cnn.mostrar("hotel", condicion);
            return rs;
        } catch (Exception e) {
            return null;
        }
    }
    
    public boolean modificar(Hotel h){
        try {
            String datos= "nombre='" + h.getNombre() + "', telefono='" + h.getTelefono() + "', calle='" + h.getCalle() + "', colonia='" + h.getColonia() + "', cp='" + h.getCp() + "', ciudad='"
                    + h.getCiudad() + "', estado='" + h.getEstado() + "', pais='" + h.getPais() + "', numeroPlazas='" + h.getNumeroPlazas() + "'";
            String condicion = "idHotel=" + h.getIdHotel();
            if(cnn.actualizar("hotel", datos, condicion)){
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }
    
    public boolean eliminar(int id){
        try {
            String condicion = "idHotel=" + id;
            if(cnn.eliminar("hotel", condicion)){
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }
}
