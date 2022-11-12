package main;
import java.util.ArrayList;
import java.util.Scanner;

public class Reproduccion {
    public String CancionElegida;
    ArrayList<String> Cancion1 = new ArrayList<String>();
    ArrayList<String> Cancion2 = new ArrayList<String>();
    ArrayList<String> Cancion3 = new ArrayList<String>();
    ArrayList<String> Cancion4 = new ArrayList<String>();
    ArrayList<String> Cancion5 = new ArrayList<String>();
    ArrayList<String> Canciones = new ArrayList<String>();
    Scanner scan = new Scanner(System.in);
    
    public void ListaReproduccion()
    {
        Cancion1.add("Tripping Over Air");
        Cancion1.add("3:02");
        Cancion1.add("Aidan Bisset");
        Cancion1.add("Pop");

        Cancion2.add("Promesa");
        Cancion2.add("3:25");
        Cancion2.add("Alex Gargolas, Eladio Carrion");
        Cancion2.add("Trap");

        Cancion3.add("Relationshit");
        Cancion3.add("2:48");
        Cancion3.add("Ernes");
        Cancion3.add("Pop en español");

        Cancion4.add("Pretinha");
        Cancion4.add("2:29");
        Cancion4.add("FMK");
        Cancion4.add("Reggaeton");

        Cancion5.add("queen of broken hearts");
        Cancion5.add("2:50");
        Cancion5.add("blackbear");
        Cancion5.add("pop");

        System.out.println(Cancion1);
        System.out.println(Cancion2);
        System.out.println(Cancion3);
        System.out.println(Cancion4);
        System.out.println(Cancion5);
    }

    public void escucharCancion()
    {
        System.out.println("\nQue cancion desea escuchar");
        System.out.println("1. Tripping Over Air");
        System.out.println("2. Promesa");
        System.out.println("3. Relationshit");
        System.out.println("4. Pretinha");
        System.out.println("5. queen of broken hearts");
        int option = scan.nextInt();
        if(option == 1)
        {
            System.out.println("Esta escuchando: " + Cancion1);
        }
        else if(option ==2)
        {
            System.out.println("Esta escuchando: " + Cancion2);
        }
        else if(option ==3)
        {
            System.out.println("Esta escuchando: " + Cancion3);
        }
        else if(option ==4)
        {
            System.out.println("Esta escuchando: " + Cancion4);
        }
        else if(option ==5)
        {
            System.out.println("Esta escuchando: " + Cancion5);
        }
    }

    public void CambiarCancion()
    {
        System.out.println("\nQue cancion desea escuchar");
        System.out.println("1. Tripping Over Air");
        System.out.println("2. Promesa");
        System.out.println("3. Relationshit");
        System.out.println("4. Pretinha");
        System.out.println("5. queen of broken hearts");
        int option = scan.nextInt();
        if(option == 1)
        {
            System.out.println("Esta escuchando: " + Cancion1);
        }
        else if(option ==2)
        {
            System.out.println("Esta escuchando: " + Cancion2);
        }
        else if(option ==3)
        {
            System.out.println("Esta escuchando: " + Cancion3);
        }
        else if(option ==4)
        {
            System.out.println("Esta escuchando: " + Cancion4);
        }
        else if(option ==5)
        {
            System.out.println("Esta escuchando: " + Cancion5);
        }
    }
}