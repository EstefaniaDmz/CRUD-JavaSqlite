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
import agencia.models.Cliente;
public class ctrlCliente {
    conexion cnn = new conexion();
    public boolean insertar(Cliente c){
        try {
            String columnas="nombre, apellidoPaterno, apellidoMaterno, telefono, calle, colonia, cp, idHotel, regimenHotel, idSucursal, idVuelo, claseVuelo";
            String datos= "'" + c.getNombre()+ "', '" + c.getApellidoPaterno()+ "', '" + c.getApellidoMaterno() + "', '" + c.getTelefono() + "', '" + c.getCalle() +
             "', '" + c.getColonia() + "', '" + c.getCp() + "', '" + c.getIdHotel() + "', '" + c.getRegimenHotel() + "', '" + c.getIdSucursal() + "', '" + c.getIdVuelo() + "', '" + c.getClaseVuelo() + "'";
            if(cnn.insertar("Cliente", columnas, datos)){
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }
    public ResultSet mostrar(String condicion){
        try {
            ResultSet rs = cnn.mostrar("Cliente", condicion);
            return rs;
        } catch (Exception e) {
            return null;
        }
    }
    
    public boolean modificar(Cliente c){
        try {
            String datos= "nombre='" + c.getNombre() +  "', apellidoPaterno='" + c.getApellidoPaterno() +  "', apellidoMaterno='" + c.getApellidoMaterno() + "', telefono='" + c.getTelefono() + "', calle='" + c.getCalle() + "', colonia='" + c.getColonia() + 
                    "', cp='" + c.getCp() +  "', idHotel='" + c.getIdHotel() +  "', regimenHotel='" + c.getRegimenHotel() +  "', idSucursal='" + c.getIdSucursal() +  
                    "', idVuelo='" + c.getIdVuelo()+  "', claseVuelo='" + c.getClaseVuelo() + "'";
            String condicion = "idCliente=" + c.getIdCliente();
            if(cnn.actualizar("Cliente", datos, condicion)){
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }
    
    public boolean eliminar(int id){
        try {
            String condicion = "idCliente=" + id;
            if(cnn.eliminar("cliente", condicion)){
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }
}
