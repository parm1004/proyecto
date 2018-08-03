/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;

import java.util.ArrayList;

/**
 *
 * @author LabingXEON
 */
public class Curso {
    private String Nombre;
    private int Horas_Semanales,Creditos,ID;
   
    
    

    public Curso(String Nombre, int Horas_Semanales, int Creditos, int ID) {
        this.Nombre = Nombre;
        this.Horas_Semanales = Horas_Semanales;
        this.Creditos = Creditos;
        this.ID = ID;
        
       
    }

    
    

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getHoras_Semanales() {
        return Horas_Semanales;
    }

    public void setHoras_Semanales(int Horas_Semanales) {
        this.Horas_Semanales = Horas_Semanales;
    }

    public int getCreditos() {
        return Creditos;
    }

    public void setCreditos(int Creditos) {
        this.Creditos = Creditos;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Curso{" + "Nombre=" + Nombre + ", Horas_Semanales=" + Horas_Semanales + ", Creditos=" + Creditos + ", ID=" + ID + '}';
    }

   


   

    
    
    
    
    
}
