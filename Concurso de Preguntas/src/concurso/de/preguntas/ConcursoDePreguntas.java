/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurso.de.preguntas;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author Daniel Ortiz
 */
public class ConcursoDePreguntas {
    public static ArrayList<Preguntas> questionsCG = new ArrayList();
    public static ArrayList<Preguntas> questionsBio = new ArrayList();
    public static ArrayList<Preguntas> questionsHist = new ArrayList();
    public static ArrayList<Preguntas> questionsMat = new ArrayList();
    public static ArrayList<Preguntas> questionsEn = new ArrayList();
    
    public static void lectorExcel(){
            try{
            BufferedReader reader = new BufferedReader (new FileReader("C:\\Users\\SAT\\Desktop\\Challengue-Concurso-Preguntas-Respuestas\\preguntas.csv"));
            String line= null;
            while((line = reader.readLine())!=null){
              String [] parts = line.split(",");
                  Preguntas q = new Respuestas(parts[0],parts[1],parts[2],parts[3],parts[4],parts[5],Boolean.parseBoolean(parts[6]),Boolean.parseBoolean(parts[7]),Boolean.parseBoolean(parts[8]),Boolean.parseBoolean(parts[9]));
                  questions.add(q);
            }
            
            
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void cargarPreguntas(){
        Preguntas q1 = new Respuestas("¿Que famoso cantante fue el líder y vocalista de la banda queen?", "Cultura General", "Freddy Mercury", "Michael Jackson", "Adam Levine", "Enrique Iglesias",true,false,false,false);
        Preguntas q2 = new Respuestas("¿Cual de las siguientes no es una cancion de Bruno Mars","Cultura General","Leave the door Open","Levitating","Lazy Song","Just the way you are",false,true,false,false);
        Preguntas q3 = new Respuestas("¿Quien es el creador de la serie televisiva 'Los Simpons'?","Cultura General","Ernest Cline","Matt Groening","George R.R. Martin","Alex Hirsch",false, true, false, false);
        Preguntas q4 = new Respuestas("¿Que personaje de Marvel Comics es capaz de escalar paredes, poseer fuerza sobre humana y balancearse entre los edificios de Nueva York, además de que su identidad secreta Peter Parker?","Cultura General","Hulk","The Fly","Batman","Spider-Man",false,false,false,true);
        Preguntas q5 = new Respuestas("¿Que capital en el mundo es popularmente conocida como 'La ciudad del amor'?","Cultura General","Venecia","Bogotá","Paris","Tokio",false,false,true,false);
        Preguntas q6 = new Respuestas("¿Cual de las siguientes no hace parte fundamental de la celula?","Biologia","el nucleo","la membrana plasmatica","el Peciolo","el citoplasma",false,false,true,false);
        Preguntas q7 = new Respuestas("Bajo que nombre son conocidas las leyes que constituyen las bases de la genetica, que son el conjunto de reglas basicas sobre la transmision por herencia genetica de las caracteristicas de los organismos padres a los hijos","Biologia","Leyes de Mendel","Leyes de Volta","Leyes de Curie","Ley de Newton",true,false,false,false);
        Preguntas q8 = new Respuestas("Que es la fotosintesis","Biologia","Es el proceso mediante el cual los organismos, como plantas y algas, transforman energia quimica en energia luminica","Es la funcion vital gracias a la cual los seres humanos incorporan alimentos del medio, los descomponen para liberar los nutrientes que contienen y utilizan estos nutrientes en la realizacion de sus actividades","Es el proceso mediante el cual los organismos, como plantas y algas utilizan la energia luminica y la transforman en energia quimica","Es el proceso mediante el cual la celula puede dividirse y producir nuevas celulas",false,false,true,false);
        Preguntas q9 = new Respuestas("La nutricion es una de las funciones mas vitales dentro de los seres humanos por tanto muchas veces es importante saber cuales son las fuentes de las que podemos obtener ciertas vitaminas y minerales por tanto para la siguiente pregunta seleccione la opcion mas valida de cual de las siguientes fuentes podemos obtener el calcio al consumirlo","Biologia","Vegetales de hoja verde, Hígado y Aceite de soya","Lacteos, Vegetales Verdes y Legumbres","Carne, Aves y Granos", "Sal de mesa, Pescados y Huevos",false,true,false,false);
        Preguntas q10 = new Respuestas("¿Cuál de las siguientes respuestas hace parte de una de las etapas del ciclo del agua?","Biologia","Pigmentación", "Aceleración", "Congelación", "Precipitación",false,false,false,true);
        
        questionsCG.add(q1);
    }
    public static void main(String[] args) {
        lectorExcel();
        
        for(int i=0;i<questions.size();i++)
            System.out.println(questions.get(i));
        
    }
    
}
