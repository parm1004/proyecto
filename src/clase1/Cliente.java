/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;

import java.util.Scanner;

/**
 *
 * @author LabingXEON
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        int op;
        
        System.out.println("Menu:\n ");
        System.out.println("1. Registrar estudiante\n ");
        System.out.println("2. Registrar cursos\n ");
        System.out.println("3. Registro de materias\n ");
        
        Scanner sc = new Scanner(System.in);
        op = sc.nextInt();
                
                
        switch(op){
            case 1:
                System.out.println("Ingrese el nombre del estudiante:\n");
                System.out.println("Ingrese el apelldio del estudiante:\n");
                System.out.println("Ingrese la carrera del estudiante:\n");
                System.out.println("Ingrese el ID del estudiante:\n");
                System.out.println("Ingrese la edad del estudiante:\n");
                


                break;
                
            case 2:
                System.out.println("Ingrese el nombre del curso:\n");
                System.out.println("Ingrese las horas semanales:\n");
                System.out.println("Ingrese el numero de creditos:\n");
                System.out.println("Ingrese el ID del curso:\n");
                
                break;
                
            case 3:
                System.out.println("Ingrese el ID del estudiante:\n");
                System.out.println("Ingrese el ID del curso:\n");
                break;
                
                
            default:
                break;
            
            
        }
        
    } // TODO code application logic here
    }
    

