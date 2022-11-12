package main;
import java.util.ArrayList;
import java.util.Scanner;

public class Celular implements ClasesCarros {
    //Propiedades//
    Productividad productividad = new Productividad();
    String Conectado = "Desconectado";
    public  String EnLlamada = "SinLlamada";
    public String SalidaSonido;
    Scanner ScanInt = new Scanner(System.in);
    Scanner ScanString = new Scanner(System.in);
    ArrayList<String> C1 = new ArrayList<String>();
    ArrayList<String> C2 = new ArrayList<String>();
    ArrayList<String> C3 = new ArrayList<String>();
    ArrayList<String> C4 = new ArrayList<String>();
    ArrayList<String> C5 = new ArrayList<String>();

    //Constructor
    public Celular(Productividad P){
        this.productividad = P;
    }
    //Funciones//
    public void Conectar()
    {
        if(Conectado == "Desconectado"){
            System.out.println("¿Deseas conectar tu celular?\n 1. Si\n2. No");
            int opcion = ScanInt.nextInt();
            if(opcion ==1){
                System.out.println("Se ha conectado tu dispositivo");
                Conectado = "Conectado";
            }else if (opcion == 2){
                System.out.println("No hay ningun dispositivo");
                Conectado = "Conectado";
            }else{
                System.out.println("Error, intentalo de nuevo");
            }
            
        }else if(Conectado == "Conectado"){
            System.out.println("¿Deseas desconectar tu celular?\n1. Si\n2. No");
            int opcion2 = ScanInt.nextInt();
            if(opcion2 == 1){
                System.out.println("Se ha desconectado tu dispositivo");
                Conectado = "Desconectado";
            }else if(opcion2 ==2){
                System.out.println("Tu dispositivo sigue conectado");
            }
    }
    }
    public void ListadeContactos(){
        C1.add("Maria Jose");
        C1.add("12548798");
        
        C2.add("Jose David");
        C2.add("65988745");
        
        C3.add("Bryan España");
        C3.add("54789845");

        C4.add("Debora Estrada");
        C4.add("32659887");
        
        C5.add("Sebastian Solorzano");
        C5.add("89875421");
    }
    public void ImprimirContactos(){     
        System.out.println(C1);
        System.out.println(C2);
        System.out.println(C3);
        System.out.println(C4);
        System.out.println(C5);
    }

    
    class C1{
        private String nombre;
        void setName(String nombre){
            this.nombre = nombre;
        }
    }
    public void Llamar()
    {
        System.out.println("\n¿A que numero desea llamar?");
        System.out.println("1. Maria Jose");
        System.out.println("2. Jose David");
        System.out.println("3. Bryan España");
        System.out.println("4. Debora Estrada");
        System.out.println("5. Sebastian Solorzano");
        int option = ScanInt.nextInt();
        if(option == 1)
        {
            System.out.println("Llamando a: " + C1+"\n      ♩ ♫ ♪ ♩ ♫ ♪\n *En llamada*");
            EnLlamada="EnLlamada";
        }
        else if(option ==2)
        {
            System.out.println("Llamando a: " + C2+"\n      ♩ ♫ ♪ ♩ ♫ ♪\n *En llamada*");
            EnLlamada="EnLlamada";
        }
        else if(option ==3)
        {
            System.out.println("Llamando a: " + C3+"\n      ♩ ♫ ♪ ♩ ♫ ♪\n *En llamada*");
            EnLlamada="EnLlamada";
        }
        else if(option ==4)
        {
            System.out.println("Llamando a: " + C4+"\n      ♩ ♫ ♪ ♩ ♫ ♪\n *En llamada*");
            EnLlamada="EnLlamada";
        }
        else if(option ==5)
        {
            System.out.println("Llamando a: " + C5+"\n♩ ♫ ♪ ♩ ♫ ♪\n *En llamada*");
            EnLlamada="EnLlamada";
        }
    }
    public void finalizarLlamada(){
            if(EnLlamada == "SinLlamada"){
                System.out.println("No tienes ninguna llamada por finalizar");
            }else if(EnLlamada == "EnLlamada"){
            System.out.println("¿Deseas Finalizar la llamada?\n 1. Si\n2. No");
            int opcion = ScanInt.nextInt();
            if(opcion ==1){
                System.out.println("Se ha colgado la llamada");
                EnLlamada = "no";
            }else if (opcion == 2){
                System.out.println("Sigues en Llamada");
                EnLlamada = "si";
            }else{
                System.out.println("Error, intentalo de nuevo");
            }
        }
        }
    
    public void ClaseA(){
        if(productividad.optionCarros==1){
        System.out.println("Llamando a: " + C3+"\n      ♩ ♫ ♪ ♩ ♫ ♪\n *En llamada*");
        EnLlamada="EnLlamada";
        }else if(productividad.optionCarros == 2 & productividad.optionCarros == 3){
            System.out.println("Esta funcion solo aplica para automoviles de Clase A");
        }else{
            System.out.println("Tu automovil no forma parte de ninguna Clase");
        }
    }
    
    public void ClaseC(){  
        if(productividad.optionCarros ==2){
        if(EnLlamada == "EnLlamada"){
            System.out.println("Estas en llamada, ¿deseas poner en espera la llamada para llamar a alguien mas?\n1. Si \n2. No");
            int opcion = ScanInt.nextInt();
            if(opcion ==1){
                System.out.println("Dejando en espera...\n      ♩ ♫ ♪ ♩ ♫ ♪\n");
                Llamar();
                }
            }else{
            System.out.println("No estas en llamada para dejar en espera");
        }
        }else if(productividad.optionCarros == 1 & productividad.optionCarros == 3){
            System.out.println("Esta funcion solo aplica para automoviles de Clase C");
        }else{
            System.out.println("Tu automovil no forma parte de ninguna Clase");
        }
    }
    
    public void ClaseS(){
        if(productividad.optionCarros==3){
        System.out.println("¿Que salida de audio deseas?\n1. Bocinas\n2. Audiculares");
            int salidaAudio = ScanInt.nextInt();
            if(salidaAudio == 1){
                System.out.println("Bocinas conectadas");
                SalidaSonido = "Bocinas";
            }else if (salidaAudio == 2){
                System.out.println("Audiculares conectados");
                SalidaSonido = "Audiculares";
            }
            }else if(productividad.optionCarros == 2 & productividad.optionCarros == 1){
            System.out.println("Esta funcion solo aplica para automoviles de Clase ");
        }
    }
    public String getEnLlamada(){
        return EnLlamada;
    }
    public void setEnLlamada(String EnLlamada){
        this.EnLlamada = EnLlamada;
    }
    }
