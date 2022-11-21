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
import agencia.models.Vuelo;
public class ctrlVuelo {
    conexion cnn = new conexion();
    public boolean insertar(Vuelo v){
        try {
            String columnas="fecha, hora, plazasTotales, ciudadOrigen, estadoOrigen, paisOrigen, ciudadDestino, estadoDestino, paisDestino";
            String datos= "'" + v.getFecha() + "', '" + v.getHora() + "', '" + v.getPlazasTotales() + "', '" + v.getCiudadOrigen() + "', '" + v.getEstadoOrigen() +
             "', '" + v.getPaisOrigen() + "', '" + v.getCiudadDestino() + "', '" + v.getEstadoDestino() + "', '" + v.getPaisDestino() + "'";
            if(cnn.insertar("vuelo", columnas, datos)){
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }
    public ResultSet mostrar(String condicion){
        try {
            ResultSet rs = cnn.mostrar("vuelo", condicion);
            return rs;
        } catch (Exception e) {
            return null;
        }
    }
    
    public boolean modificar(Vuelo v){
        try {
            String datos= "fecha='" + v.getFecha() + "', hora='" + v.getHora() + "', plazasTotales='" + v.getPlazasTotales() + "', ciudadOrigen='" + v.getCiudadOrigen() + 
                    "', estadoOrigen='" + v.getEstadoOrigen() +  "', paisOrigen='" + v.getPaisOrigen() + "', ciudadDestino='" + v.getCiudadDestino() + "', estadoDestino='" + 
                    v.getEstadoDestino() + "', paisDestino='" + v.getPaisDestino() + "'";
            String condicion = "idVuelo=" + v.getIdVuelo();
            if(cnn.actualizar("vuelo", datos, condicion)){
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }
    
    public boolean eliminar(int id){
        try {
            String condicion = "idVuelo=" + id;
            if(cnn.eliminar("vuelo", condicion)){
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }
}
