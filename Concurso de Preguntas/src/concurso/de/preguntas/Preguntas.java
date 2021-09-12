/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurso.de.preguntas;

import java.util.Scanner;

public class Preguntas {
    public String enunciado;
    public String categoria;
    
    public String respuesta1;
    public String respuesta2;
    public String respuesta3;
    public String respuesta4;
    
   // public String lineas="_";
    
    public boolean answer1;
    public boolean answer2;
    public boolean answer3;
    public boolean answer4;
    
    Preguntas(String enunciado, String categoria, String respuesta1, String respuesta2, String respuesta3, String respuesta4, boolean answer1, boolean answer2, boolean answer3, boolean answer4){
        this.enunciado =enunciado;
        this.categoria =categoria;
        
        this.respuesta1=respuesta1;
        this.respuesta2=respuesta2;
        this.respuesta3=respuesta3;
        this.respuesta4=respuesta4;
        
        this.answer1=answer1;
        this.answer2=answer2;
        this.answer3=answer3;
        this.answer4=answer4;
    }
    
    public boolean getRespuesta(){
       
        Scanner respuesta = new Scanner(System.in);
        boolean res=false;
        String opcion;
        int i = 0;
        
        System.out.print("\nDigita una de las 4 opciones: ");
        
        while(i!=1){
        opcion=respuesta.nextLine();
            switch (opcion){
                case "a":
                    i=1;
                    res=this.answer1;
                    break;
                case "b":
                    i=1;
                    res=this.answer2;
                    break;
                case "c":
                    i=1;
                    res=this.answer3;
                    break;
                case "d":
                    i=1;
                    res=this.answer4;
                    break;
                default:
                    System.out.println("¡Respuesta Invalida! Intentelo Nuevamente");
            }
        }
        return res;
    }
    @Override
       public String toString(){
        return categoria+"\n\n   "+enunciado+"\n\ta. "+respuesta1+answer1+"\n\tb. "+respuesta2+answer2+"\n\tc. "+respuesta3+answer3+"\n\td. "+respuesta4+answer4;
   }
}
