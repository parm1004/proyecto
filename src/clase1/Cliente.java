/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LabingXEON
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
    ArrayList<Curso> cursos = new ArrayList<Curso>();
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
                String Nombre;
                int Horas_Semanales,Creditos,ID;
                ArrayList<Curso> Cursos;
                Scanner in= new Scanner(System.in);
               for(int i = 0; i<5; i++){
                System.out.println("Ingrese el nombre del curso:\n");
                Nombre = in.nextLine();
                System.out.println("Ingrese las horas semanales:\n");
                Horas_Semanales = in.nextInt();
                System.out.println("Ingrese el numero de creditos:\n");
                Creditos = in.nextInt();
                System.out.println("Ingrese el ID del curso:\n");
                ID = in.nextInt();
                
                Curso c= new Curso(Nombre, Horas_Semanales, Creditos, ID);
                
                cursos.add(c);
               }
                RandomAccessFile raf = new RandomAccessFile("cursos.txt", "rw");

         // write something in the file
                raf.writeUTF(cursos.toString());
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
    

