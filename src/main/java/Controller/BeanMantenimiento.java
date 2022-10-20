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
public class BeanMantenimiento {
    
    String ced;
    String nombre;
    int edad;
    String estadoCivil;
    double salario;
    String provincia;
    String hilera;

    public String getCed() {
        return ced;
    }

    public void setCed(String ced) {
        this.ced = ced;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getHilera() {
        return hilera;
    }

    public void setHilera(String hilera) {
        this.hilera = hilera;
    }
    

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    
    
       public LinkedList<String> onbtieneEstadoCivil(){
        ModelMantenimiento modelo = new ModelMantenimiento();
        return modelo.obtieneEstadoCivil();
    }
      public LinkedList<String> onbtieneProvincia(){
        ModelMantenimiento modelo = new ModelMantenimiento();
        return modelo.obtieneProvincia();
    }
      
      public void imprime(){
        double salarioNeto, ccss, asociacion = 0;
          
          String error = "";
          if(ced.equals("")){
              error = "Cédula vacía";
          }
          if(nombre.equals("")){
              error = "Nombre Vacío";
          }
          if(edad <= 0){
              error = "Edad inválida";
          }
           if(salario <= 0){
              error = "Salario inválido";
          }
           ccss = (salario*0.09);
            asociacion = (salario*0.05);
           salarioNeto = salario - ccss - asociacion;
           
           
           if(!error.equals("")){
               hilera = error;
           }
           else{
                   hilera = "Cédula: " + ced + "\nNombre: " + nombre + "\nEdad: " +
                   edad + "\nEstado Civil: " + estadoCivil + "\nSalario: " +
                   salario + "\nCCSS: " + ccss  + "\nAsociación: " +
                   asociacion + "\nSalario Neto: " + salarioNeto;
           }
       
                   
           
      }
      
      public void limpiar(){
          this.setCed("");
          this.setNombre("");
          this.setSalario(0);
          this.setEstadoCivil("");
          this.setProvincia("");
          this.setEdad(0);
          this.setHilera("");
          

      }
      

}
