/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurso.de.preguntas;

/**
 *
 * @author SAT
 */
public class Respuestas extends Preguntas{
    
    public String respuesta1;
    public String respuesta2;
    public String respuesta3;
    public String respuesta4;
    
    public boolean answer1;
    public boolean answer2;
    public boolean answer3;
    public boolean answer4;
    

    public Respuestas(String enunciado, String categoria, String respuesta1, String respuesta2, String respuesta3, String respuesta4, boolean answer1, boolean answer2, boolean answer3, boolean answer4){
        
        super(enunciado, categoria); 
        
        this.respuesta1=respuesta1;
        this.respuesta2=respuesta2;
        this.respuesta3=respuesta3;
        this.respuesta4=respuesta4;
        
        this.answer1=answer1;
        this.answer2=answer2;
        this.answer3=answer3;
        this.answer4=answer4;
    }
    @Override
   public String toString(){
        return enunciado+categoria+respuesta1+answer1+respuesta2+answer2+respuesta3+answer3+respuesta4+answer4;
   }
}
