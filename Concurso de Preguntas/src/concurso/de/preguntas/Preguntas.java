/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurso.de.preguntas;

public class Preguntas {
    public String enunciado;
    public String categoria;
    
    Preguntas(String enunciado, String categoria){
        this.enunciado =enunciado;
        this.categoria =categoria;
    }
    @Override
        public String toString(){
            return enunciado+categoria;
        }
}
