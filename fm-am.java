package main;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class Radio{
//Propiedades//
    public Double EmisoraRadio;
    public String NumeroEmisora;
    public String TipoDeRadio;
    public String ruta;
    ArrayList<String> EmisorasGuardadas = new ArrayList<String>();
    Scanner scan = new Scanner(System.in);

    //Métodos//

    //Constructor//
    public Radio()
    {
        EmisoraRadio = 82.5;
        NumeroEmisora = null;
        ruta = null;
    }

    
    //Get//
    public Double getEmisoraRadio()
    {
        return EmisoraRadio;
    }

    public String getNumEmisora()
    {
        return NumeroEmisora;
    }

    
    //Set//
    public void setEmisoraRadio(Double EmisoraRadio)
    {
        this.EmisoraRadio = EmisoraRadio;
    }

    public void setNumEmisora(String NumeroEmisora)
    {
        this.NumeroEmisora = NumeroEmisora;
    }

    //Funciones//
    public void TipoRadio()
    {
        System.out.println("1. FM\n2. AM");
        int option = scan.nextInt();
        if(option == 1)
        {
            TipoDeRadio = "FM";
        }
        else if(option ==2)
        {
            TipoDeRadio = "AM";
        }
        if(TipoDeRadio =="FM")
        {
            System.out.println("Cambiaste a FM, Frecuencias: 300 Khz a 30 Khz");
        }
        else if(TipoDeRadio =="AM")
        {
            System.out.println("Cambiaste a AM, Frecuencias: 3.000 Khz a 300 Khz");
        }
    }

    public void CambiarEmisora()
    {
        while(EmisoraRadio >= 82.5 && EmisoraRadio <= 107.5)
        {
            System.out.println("\n1. Subir emisora");
            System.out.println("2. Bajar emisora");
            int opcion = scan.nextInt();
            switch(opcion)
            {
                case 1:
                    EmisoraRadio = EmisoraRadio + 0.5;
                    setEmisoraRadio(EmisoraRadio);
                    System.out.println("Esta escuchando la emisora: " + EmisoraRadio);
                    break;
                case 2:
                    EmisoraRadio = EmisoraRadio - 0.5;
                    setEmisoraRadio(EmisoraRadio);
                    System.out.println("Esta escuchando la emisora: " + EmisoraRadio);
                    break;
                default:
                    System.out.println("ERROR: Escogio una opcion invalida\nIntente de nuevo");
            }
            break;
        }
    }

    public void GuardarEmisora()
    {
        System.out.println("Ingrese el numero de la emisora: (entre 82.5 y 107.5)");
        NumeroEmisora = scan.nextLine();

        setNumEmisora(NumeroEmisora);

        EmisorasGuardadas.add(NumeroEmisora);

    }

    public void CargarEmisora()
    {
        System.out.println("Emisoras: "+ EmisorasGuardadas);
    }
}