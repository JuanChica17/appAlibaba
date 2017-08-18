/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.modelo;

import java.sql.SQLException;

/**
 *
 * @author Estudiante
 */
public class Usuario {
    private  int idUsuario;
    private  String nombres;
    private  String apellidos;
    private  String usuario;
    private  String password;
    private  String idRol;
    private  String estado;
public static Usuario load(resultset rs)throws  SQLException{
    Usuario objUsuario = new Usuario();
    objUsuario.setIdUsuario(rs.getInt(1));
    objUsuario.setNombres(rs.getString(2));    

    }


}
