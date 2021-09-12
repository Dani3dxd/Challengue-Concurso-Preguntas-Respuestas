package concurso.de.preguntas;
//impotacion de las librerias necesarias para el funcionamiento de la aplicacion 
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author Daniel Ortiz
 */
public class ConcursoDePreguntas {
    
    //Cambiar la ubicacion del archivo aqui dependiendo de donde se extraiga el programa
    public static String ubicacionArchivo = "C:\\Users\\SAT\\Desktop\\Challengue-Concurso-Preguntas-Respuestas\\preguntas.csv";
    
    //Creacion de las diferentes clases para las preguntas
    public static ArrayList<Preguntas> questionsCG = new ArrayList();
    public static ArrayList<Preguntas> questionsBio = new ArrayList();
    public static ArrayList<Preguntas> questionsHist = new ArrayList();
    public static ArrayList<Preguntas> questionsMat = new ArrayList();
    public static ArrayList<Preguntas> questionsEn = new ArrayList();
    
    //creacion de los arrays para la informacion del jugador y su puntaje
    private static ArrayList<String> Player= new ArrayList();
    private static ArrayList<Integer> Score = new ArrayList();
    private static ArrayList<String> pl= new ArrayList();
    private static ArrayList<Integer> sc = new ArrayList();
    
    //Creación e inicialización de variables para salida del juego y el contador de las preguntas que inicia en 1 y debe llegar hasta 5
    public static int contadorPreguntas = 1;
    public static int puntaje = 0;
    public static int exit = 2;
    
    public static void lectorExcel(){
        //funcion para el lector del documento en Excel donde se guarda el historico de los jugadores
        try{
            BufferedReader reader = new BufferedReader (new FileReader(ubicacionArchivo));
            String line= null;
            
            while((line = reader.readLine())!=null){
                String [] parts = line.split(",");
                Player.add(parts[0]);
                Score.add(Integer.parseInt(parts[1]));
            }      
        }catch(IOException e){
            e.printStackTrace();
        }
        
    }
    
    public static void escritorExcel(){
        //funcion para escribir sobre el documento de excel la informacion del jugador como el nombre y su puntaje
        try{
            BufferedWriter bw =new BufferedWriter (new FileWriter(ubicacionArchivo));
           
            for(int i=0;i<Player.size();i++){
                bw.write(Player.get(i)+","+Score.get(i));
                bw.newLine();
                bw.flush();
            } 
        }catch(IOException e){
            e.printStackTrace();
        }
    
    }
    
    
    public static void tiempoEspera(){
        //funcion para poner a "Dormir" el programa durante unos ms
         try {
            Thread.sleep(1*1000/2);
         } catch (Exception e) {
            System.out.println(e);
         }
         
    }
    
    public static void cargarPreguntas(){
        //funcion para cargar las preguntas del desafio 
        Preguntas q1 = new Preguntas("¿Que famoso cantante fue el líder y vocalista de la banda queen?", "Cultura General", "Freddy Mercury", "Michael Jackson", "Adam Levine", "Enrique Iglesias",true,false,false,false);
        Preguntas q2 = new Preguntas("¿Cual de las siguientes no es una cancion de Bruno Mars?","Cultura General","Leave the door Open","Levitating","Lazy Song","Just the way you are",false,true,false,false);
        Preguntas q3 = new Preguntas("¿Quien es el creador de la serie televisiva 'Los Simpons'?","Cultura General","Ernest Cline","Matt Groening","George R.R. Martin","Alex Hirsch",false, true, false, false);
        Preguntas q4 = new Preguntas("¿Que personaje de Marvel Comics es capaz de posee fuerza sobre humana, escala paredes y es capaz de balancearse entre los edificios de Nueva York?","Cultura General","Hulk","The Fly","Batman","Spider-Man",false,false,false,true);
        Preguntas q5 = new Preguntas("¿Que capital en el mundo es popularmente conocida como 'La ciudad del amor'?","Cultura General","Venecia","Bogotá","Paris","Tokio",false,false,true,false);
        
        Preguntas q6 = new Preguntas("¿Cual de las siguientes no hace parte fundamental de la celula?","Biologia","el nucleo","la membrana plasmatica","el Peciolo","el citoplasma",false,false,true,false);
        Preguntas q7 = new Preguntas("Bajo que nombre son conocidas las leyes que constituyen las bases de la genetica, que son el conjunto de reglas basicas sobre la transmision \n   por herencia genetica de las caracteristicas de los organismos padres a los hijos","Biologia","Leyes de Mendel","Leyes de Volta","Leyes de Curie","Ley de Newton",true,false,false,false);
        Preguntas q8 = new Preguntas("Que es la fotosintesis","Biologia","Es el proceso mediante el cual los organismos, como plantas y algas, transforman energia quimica en energia luminica","Es la funcion vital gracias a la cual los seres humanos incorporan alimentos del medio, los descomponen para liberar los nutrientes que contienen y utilizan estos nutrientes en la realizacion de sus actividades","Es el proceso mediante el cual los organismos, como plantas y algas utilizan la energia luminica y la transforman en energia quimica","Es el proceso mediante el cual la celula puede dividirse y producir nuevas celulas",false,false,true,false);
        Preguntas q9 = new Preguntas("La nutricion es una de las funciones mas vitales dentro de los seres humanos por tanto muchas veces es importante saber cuales son las fuentes de las que podemos obtener ciertas \n   vitaminas y minerales por tanto para la siguiente pregunta seleccione la opcion mas valida de cual de las siguientes fuentes podemos obtener el calcio al consumirlo","Biologia","Vegetales de hoja verde, Hígado y Aceite de soya","Lacteos, Vegetales Verdes y Legumbres","Carne, Aves y Granos", "Sal de mesa, Pescados y Huevos",false,true,false,false);
        Preguntas q10 = new Preguntas("¿Cual de las siguientes respuestas hace parte de una de las etapas del ciclo del agua?","Biologia","Pigmentación", "Aceleración", "Congelación", "Precipitación",false,false,false,true);
        
        Preguntas q11 = new Preguntas("¿En que fecha dio comienzo uno de los conflictos mas grandes de la historia de la humanidad, la segunda guerra mundial?","Historia","Septiembre 1 de 1939","Septiembre 2 de 1945","Octubre 3 de 1931","Noviembre 11 de 1918",true,false,false,false);
        Preguntas q12 = new Preguntas("¿Cuál de los siguientes no fue hijo de cleopatra?","Historia","Cleopatra Selene", "Alejando Helios", "Cesarión", "Arsionoe",false, false, false, true);
        Preguntas q13 = new Preguntas("¿Cual de los siguientes dioses de la antigüedad, hace parte de la mitología griega?","Historia","Kratos, El dios de la guerra","Mercurio, Dios del Comercio","Atenea, La diosa de la sabiduría","Mephisto, Dios de los sueños",false,false,true,false);
        Preguntas q14 = new Preguntas("El renacimiento es un movimiento artístico y cultural que hace parte del periodo de la edad moderna y se dio posteriormente a la edad media, por tanto \n   ¿entre que siglos estuvo comprendida la etapa del renacimiento?","Historia","Siglo XV y Siglo XVI","Siglo XII y Siglo XIV","Siglo XVIII y Siglo XX","Siglo IX y Siglo X",true,false,false,false);
        Preguntas q15 = new Preguntas("Completa la siguiente oración: \n   La revolución industrial fue un proceso de transformación económico, social y _________ que se inicio en la segunda mitad del siglo XVIII y que vio el paso desde una economía rural \n   basada en la agricultura y el comercio a una economía de carácter urbano, industrializada y mecanizada","Historia","Teológico", "Tecnológico", "Artístico", "Onomástico",false,true,false,false);
        
        Preguntas q16 = new Preguntas("¿Cual de las siguientes expresiones no es un polinomio?","Matematicas","Xˆ2 + X + 3","(X+2)/Xˆ2","(7*Xˆ2+5*Xˆ4)/Xˆ2","(Xˆ5)/4 + 3*Xˆ2-9",false,true,false,false);
        Preguntas q17 = new Preguntas("¿Cual de las siguientes afirmaciones es incorrecta?","Matematicas","Los ángulos rectos, son aquellos que miden 90°","Los ángulos obtusos son aquellos que miden mas de 90° y menos de 180°","Los ángulos agudos son aquellos que tienen una amplitud menor a 90°","Los ángulos convexos son ángulos cuya amplitud es mayor de 180° y menor de 360°", false,false,false,true);
        Preguntas q18 = new Preguntas("'Es aquel conjunto de números que utilizamos en nuestro día a día y cuyo dominio esta dado entre los rangos de menos Infinito hasta más infinito' \n   De acuerdo al enunciado anterior, ¿Cuál de las siguientes respuestas se acerca más a esta definición?","Matematicas","Numeros Reales", "Numeros Imaginarios", "Numeros Enteros", "Numeros Racionales",true,false,false,false);
        Preguntas q19 = new Preguntas("Complete la siguiente frase: \n   El producto de un número real por una suma de números reales es igual a la suma de los productos de dicho número por cada uno de los ____________","Matematicas","Cocientes", "Factores", "Exponentes", "Sumandos",false,false,false,true);
        Preguntas q20 = new Preguntas("¿Cual de estas es una propiedad de los logaritmos?","Matematicas","log (a*b) = log a – log b","log 1 = 1","log aˆb = b * log a","log (a/b) = log a * log b",false,false,true,false);
        
        Preguntas q21 = new Preguntas("What is the meaning of Chipped?","Ingles","A small broken or cut off piece, as of wood, stone, or glass","Deterioration, as of ability, resulting from inactivity or neglect","A frame or model around or on which something is formed or shaped","To permit the escape, entry, or passage of something through a breach or flaw",true,false,false,false);
        Preguntas q22 = new Preguntas("Choose the correct answer: \n   How long have you been living here?","Ingles","No I haven´t but my brother has, he´s living in Bogota for almost a year","I’ve been living in Medellin city for five years","I like to go out wth my friends, we go and eat someplace","Oh! Chocolate is my favorite drink",false,true,false,false);
        Preguntas q23 = new Preguntas("Complete the sentence: \n   What have you _________ for fun lately?","Ingles","am getting","is waiting","are lived","been doing",false,false,false,true);
        Preguntas q24 = new Preguntas("Choose the correct phrasal verb to complete the next sentence: He __________ and collapse on the floor","Ingles","beat up","get out","black out","turn off",false,false,true,false);
        Preguntas q25 = new Preguntas("'I look over Bryan, i see his face white and he was starting to run fast', change the word 'was starting' to present continuous","Ingles","has been starting","is starting","are starting","will be starting",false,true,false,false);
        
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
        
        System.out.print("Cargando Preguntas");
        for(int i = 0; i<=5; i++){
            tiempoEspera();
            System.out.print(".");
        }
        
    }
    
    public static void respuestaCorrInc(boolean respuesta){
        //funcion que determina si la respuesta es valida o invalida para continuar con el desafio o finalizar su turno en caso de que el usuario falle
        if(respuesta)
        {
            puntaje+=100;
            contadorPreguntas+=1;
        }
        else
            contadorPreguntas=6;
        
    }
    
    public static void generadorAleatorioPreguntas(ArrayList<Preguntas> preguntas){
        //funcion para seleccionar de acuerdo al nivel en el que se encuentre una pregunta aleatoria para su categoria
        int numeroAleatorio = (int)(Math.random()*5);
        String lineas="_";
        
        for(int i=0;i<=180;i++)
            lineas=lineas+"_";
        
        System.out.println(contadorPreguntas+". "+preguntas.get(numeroAleatorio));
        respuestaCorrInc(preguntas.get(numeroAleatorio).getRespuesta());
        System.out.println("\n"+lineas+"\n");
        
    }
    
    public static void pantallaSalida(Scanner res){
        //funcion que imprime por consola una pantalla de salida para el desafio
        String salir;
        
        System.out.print("\n¿Deseas Salir del Juego?(S/N):");
        salir=res.nextLine();
            
            if(salir.equalsIgnoreCase("S"))
            {
                exit=1;
                System.out.println("Gracias por Jugar");
            }else{
                exit=2;
                contadorPreguntas=1;
            }
            
        puntaje=0;
        
    }
    
    public static void main(String[] args) throws IOException, InterruptedException {
        //inicializacion de variables nombre jugador y la variable para leer la informacion que digite el usuario por la ventana de comandos
        String nombreJugador;
        Scanner resp = new Scanner(System.in);
        //ventana de texto inicial
        System.out.println("Bienvenido al CHALLENGE - CONCURSO DE PREGUNTAS Y RESPUESTAS\n");
        System.out.println("En este juego tu misión si decides aceptarla es avanzar lo máximo posibles a través de diferentes e intrincadas preguntas que se irán volviendo más difíciles\n"
                +          "a medida que subas de nivel, por cada pregunta correcta que tengas se te dará un total de 100 puntos, hay un total de 5 preguntas por tanto tu puntuación\n"
                +          "máxima podrá ser hasta de 500 puntos y una vez falles con alguna pregunta terminara el juego y te quedaras con el puntaje que lleves hasta ese momento.\n¡buena suerte!, te espero en la cima.");
        System.out.println("Ahora si Comenzemos\n");
        cargarPreguntas();
        //muestra en pantalla los nombres y puntajes de los diferentes jugadores
        lectorExcel();
        //codigo para poder dejar el programa en un bucle hasta que el usuario decida terminar la sesion
        while(exit!=1){
            //se solicita el nombre al jugador y se recibe la informacion mediante la consola
            System.out.print("\n\nDime, ¿Cuál es tu Nombre?: ");
            nombreJugador=resp.nextLine();
            //codigo para ejecutar cierta clase de preguntas de acuerdo al nivel en el que se encuentre el jugador (va desde 1 hasta 5 en caso de ser 6 completo el desafio por tanto finaliza el juego)
            while(contadorPreguntas<=6){
                switch(contadorPreguntas){
                    case 1:
                        generadorAleatorioPreguntas(questionsCG);
                        break;
                    case 2:
                        generadorAleatorioPreguntas(questionsBio);
                        break;
                    case 3:
                        generadorAleatorioPreguntas(questionsHist);
                        break;
                    case 4:
                        generadorAleatorioPreguntas(questionsMat);
                        break;
                    case 5:
                        generadorAleatorioPreguntas(questionsEn);
                        break;
                    case 6:
                        System.out.println("Finalizo el Juego "+nombreJugador+" tu puntaje fue de: "+puntaje+" pts.");
                        contadorPreguntas=7;
                        break;
                    default:      
                }
            }
            //codigo para asociar los puntajes en una base de datos local (ArrayList) y despues transferirlos al archivo excel
            Player.add(nombreJugador);
            Score.add(puntaje);
            //funciones finales para asociar los nombre con los puntajes en un archivo excel
            escritorExcel();
            pantallaSalida(resp); 
        }
        
        System.out.println("\tPuntajes");
        for(int i=0;i<Player.size();i++){
            System.out.println(Player.get(i)+"\t\t"+Score.get(i)+" pts.");
        }
    }
    
}
