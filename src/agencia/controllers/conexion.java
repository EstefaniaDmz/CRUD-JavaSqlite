/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agencia.controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author andre
 */
public class conexion {
    String strConexionDB = "jdbc:sqlite:C:/Users/andre/OneDrive/Documentos/NetBeansProjects/agencia/agenciaViajes.s3db";
    Connection conn = null;
    
    public conexion(){
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(strConexionDB);
            System.out.println("Conectado");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
    public boolean insertar(String tabla, String campos, String datos){
        try {
            String consulta="INSERT INTO "+ tabla +"(" + campos +") VALUES(" + datos + ")";
            PreparedStatement pstmt = conn.prepareStatement(consulta);
            pstmt.execute();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public boolean actualizar(String tabla, String datos, String condicion){
        try {
            String consulta="UPDATE " + tabla + " SET " + datos + " WHERE " + condicion;
            PreparedStatement pstm = conn.prepareStatement(consulta);
            pstm.execute();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean eliminar(String tabla, String condicion){
        try {
            String consulta="UPDATE " + tabla + " SET estatus=0 WHERE " + condicion;
            PreparedStatement pstm = conn.prepareStatement(consulta);
            pstm.execute();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public ResultSet mostrar(String tabla, String condicion){
        try {
            String consulta="SELECT * FROM " + tabla + " WHERE estatus=1 " + condicion;
            PreparedStatement pstm = conn.prepareStatement(consulta);
            ResultSet rs = pstm.executeQuery();
            return rs;
        } catch (Exception e) {
            return null;
        }
    }
    
    public boolean validarUsuario(String correo, String clave){
        try {
            String consulta="SELECT * FROM Usuario WHERE correo='"+correo+"' and clave='"+clave+"'";
            PreparedStatement pstm = conn.prepareStatement(consulta);
            ResultSet rs = pstm.executeQuery();
            if(rs.next()){
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }
    
}
