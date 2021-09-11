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
        Preguntas q10 = new Respuestas("¿Cual de las siguientes respuestas hace parte de una de las etapas del ciclo del agua?","Biologia","Pigmentación", "Aceleración", "Congelación", "Precipitación",false,false,false,true);
        
        Preguntas q11 = new Respuestas("¿En que fecha dio comienzo uno de los conflictos mas grandes de la historia de la humanidad, la segunda guerra mundial?","Historia","Septiembre 1 de 1939","Septiembre 2 de 1945","Octubre 3 de 1931","Noviembre 11 de 1918",true,false,false,false);
        Preguntas q12 = new Respuestas("¿Cuál de los siguientes no fue hijo de cleopatra?","Historia","Cleopatra Selene", "Alejando Helios", "Cesarión", "Arsionoe",false, false, false, true);
        Preguntas q13 = new Respuestas("¿Cual de los siguientes dioses de la antigüedad, hace parte de la mitología griega?","Historia","Kratos, El dios de la guerra","Mercurio, Dios del Comercio","Atenea, La diosa de la sabiduría","Mephisto, Dios de los sueños",false,false,true,false);
        Preguntas q14 = new Respuestas("El renacimiento es un movimiento artístico y cultural que hace parte del periodo de la edad moderna y se dio posteriormente a la edad media, por tanto ¿entre que siglos estuvo comprendida la etapa del renacimiento?","Historia","Siglo XV y Siglo XVI","Siglo XII y Siglo XIV","Siglo XVIII y Siglo XX","Siglo IX y Siglo X",true,false,false,false);
        Preguntas q15 = new Respuestas("Completa la siguiente oración, La revolución industrial fue un proceso de transformación económico, social y _________ que se inicio en la segunda mitad del siglo XVIII y que vio el paso desde una economía rural basada en la agricultura y el comercio a una economía de carácter urbano, industrializada y mecanizada","Historia","Teológico", "Tecnológico", "Artístico", "Onomástico",false,true,false,false);
        
        Preguntas q16 = new Respuestas("¿Cual de las siguientes expresiones no es un polinomio?","Matematicas","Xˆ2 + X + 3","(X+2)/Xˆ2","(7*Xˆ2+5*Xˆ4)/Xˆ2","(Xˆ5)/4 + 3*Xˆ2-9",false,true,false,false);
        Preguntas q17 = new Respuestas("¿Cual de las siguientes afirmaciones es incorrecta?","Matematicas","Los ángulos rectos, son aquellos que miden 90°","Los ángulos obtusos son aquellos que miden mas de 90° y menos de 180°","Los ángulos agudos son aquellos que tienen una amplitud menor a 90°","Los ángulos convexos son ángulos cuya amplitud es mayor de 180° y menor de 360°", false,false,false,true);
        Preguntas q18 = new Respuestas("'Es aquel conjunto de números que utilizamos en nuestro día a día y cuyo dominio esta dado entre los rangos de menos Infinito hasta más infinito' De acuerdo al enunciado anterior, ¿Cuál de las siguientes respuestas se acerca más a esta definición?","Matematicas","Numeros Reales", "Numeros Imaginarios", "Numeros Enteros", "Numeros Racionales",true,false,false,false);
        Preguntas q19 = new Respuestas("Complete la siguiente frase: El producto de un número real por una suma de números reales es igual a la suma de los productos de dicho número por cada uno de los ____________","Matematicas","Cocientes", "Factores", "Exponentes", "Sumandos",false,false,false,true);
        Preguntas q20 = new Respuestas("¿Cual de estas es una propiedad de los logaritmos?","Matematicas","log (a*b) = log a – log b","log 1 = 1","log aˆb = b * log a","log (a/b) = log a * log b",false,false,true,false);
        
        Preguntas q21 = new Respuestas("What is the meaning of Chipped?","Ingles","A small broken or cut off piece, as of wood, stone, or glass","Deterioration, as of ability, resulting from inactivity or neglect","A frame or model around or on which something is formed or shaped","To permit the escape, entry, or passage of something through a breach or flaw",true,false,false,false);
        Preguntas q22 = new Respuestas("Choose the correct answer: How long have you been living here?","Ingles","No I haven´t but my brother has, he´s living in Bogota for almost a year","I’ve been living in Medellin city for five years","I like to go out wth my friends, we go and eat someplace","Oh! Chocolate is my favorite drink",false,true,false,false);
        Preguntas q23 = new Respuestas("Complete the sentence: What have you _________ for fun lately?","Ingles","am getting","is waiting","are lived","been doing",false,false,false,true);
        Preguntas q24 = new Respuestas("Choose the correct phrasal verb to complete the next sentence: He __________ and collapse on the floor","Ingles","beat up","get out","black out","turn off",false,false,true,false);
        Preguntas q25 = new Respuestas("'I look over Bryan, i see his face white and he was starting to run fast', change the word 'was starting' to present continuous","Ingles","has been starting","is starting","are starting","will be starting",false,true,false,false);
        
        questionsCG.add(q1);
        questionsCG.add(q2);
        questionsCG.add(q3);
        questionsCG.add(q4);
        questionsCG.add(q5);
        questionsBio.add(q6);
        questionsBio.add(q7);
        questionsBio.add(q8);
        questionsBio.add(q9);
        questionsBio.add(q10);
        questionsHist.add(q11);
        questionsHist.add(q12);
        questionsHist.add(q13);
        questionsHist.add(q14);
        questionsHist.add(q15);
        questionsMat.add(q16);
        questionsMat.add(q17);
        questionsMat.add(q18);
        questionsMat.add(q19);
        questionsMat.add(q20);
        questionsEn.add(q21);
        questionsEn.add(q22);
        questionsEn.add(q23);
        questionsEn.add(q24);
        questionsEn.add(q25);
    }
    public static void main(String[] args) {
        lectorExcel();
        
        for(int i=0;i<questions.size();i++)
            System.out.println(questions.get(i));
        
    }
    
}
