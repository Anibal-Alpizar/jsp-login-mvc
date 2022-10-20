/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.LinkedList;

/**
 *
 * @author ramir
 */
public class ModelMantenimiento {
    
 
    public LinkedList<String> obtieneEstadoCivil(){
        LinkedList<String> listaEstadoCivil = new  LinkedList<>();
        listaEstadoCivil.add("Soltero");
        listaEstadoCivil.add("Casoado");
   
        return listaEstadoCivil;
    }
     public LinkedList<String> obtieneProvincia(){
        LinkedList<String> listaEstadoCivil = new  LinkedList<>();
        listaEstadoCivil.add("Alajuela");
        listaEstadoCivil.add("San José");
        listaEstadoCivil.add("Guanacaste");
        listaEstadoCivil.add("Heredia");
   
        return listaEstadoCivil;
    }
    
    
    
}
