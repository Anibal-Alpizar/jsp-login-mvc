/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.ModelMantenimiento;
import java.util.LinkedList;

/**
 *
 * @author ramir
 */
public class Bean208470478 {

    String usuario;
    String password;


    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void limpiaCampos() {
        this.setUsuario("");
        this.setPassword("");
    }


    public String ingresar() {
        String rutaPag = "";
        boolean ingresoExitoso = false;
        if (usuario.equals("Examen")) {
            if(password.equals("E1")){
                ingresoExitoso = true;
            }
         
        }

        if (ingresoExitoso) {

            rutaPag = "pageMantenimiento.xhtml";
        } else {

            rutaPag = "index.xhtml";
        }
        return rutaPag;
    
    }
    
 
    
}
