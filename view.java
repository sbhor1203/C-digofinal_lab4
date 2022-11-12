package main;

import java.util.Scanner;

public class Vista 
{
    Scanner scan = new Scanner(System.in);
    Radio radio = new Radio();
    Reproduccion reproduccion = new Reproduccion();
    Productividad productividad = new Productividad();
    Celular celular = new Celular(productividad);
    
    public void Bienvenida()
    {
    System.out.println("                ╔═════════════════════════╗  \n" +
                       "                ║   Bienvenido a tu    ║  \n" +
                       "                ║    Mercedes-Benz     ║      \n" +      
                       "                ╚═════════════════════════╝         ");
    }
    public void ClasesCarros(){
        productividad.ClaseCarrosPrint();
    }


    public int Menu()
    {
        int opciones;
		String meniu = "   ╔══════════╗   ╔═══════════════════╗ ╔═════════════╗  ╔════════════════════╗   \n" +
                               "   ║ 1.Radio ║   ║ 2.Reproducción ║ ║ 3.Celular ║  ║ 4.Productividad ║ \n" +     
                               "   ╚══════════╝   ╚═══════════════════╝ ╚═════════════╝  ╚════════════════════╝ \n "+
                               "         Ingrese un numero del 1 al 4 para elegir su funcion\n" +
                               "                  Ingrese el numero 5 para apagar";
		System.out.println(meniu);
		opciones = scan.nextInt();
		
		return opciones;
    }

    public void RadioMenu()
    {
        boolean continuar = true;
        while(continuar)
        {
            System.out.println("\nModo Radio");
            System.out.println("1. Elegir entre FM o AM");
            System.out.println("2. Cambiar emisoras");
            System.out.println("3. Guardar emisoras");
            System.out.println("4. Cargar emisora");
            System.out.println("5. Salir\n");
            int opcion = scan.nextInt();
            switch(opcion)
            {
                case 1:
                    radio.TipoRadio();
                    break;
                case 2:
                    radio.CambiarEmisora();
                    break;
                case 3:
                    radio.GuardarEmisora();
                    break;
                case 4:
                    radio.CargarEmisora();
                    break;
		case 5:
                    System.out.println("Regresara al menu principal!");
                    continuar = false;
                    break;   
                default:
                    System.out.println("ERROR: Escogio una opcion invalida\nIntente de nuevo");
                    continuar = true;          
            } 
        }
    }
    
    public void ReproduccionMenu()
    {
        boolean continuar = true;
        while(continuar)
        {
            System.out.println("\nModo Reproduccion");
            System.out.println("1. Seleccionar lista de reproducción");
            System.out.println("2. Cambiar cancion");
            System.out.println("3. Escuchar cancion");
			System.out.println("4. Salir\n");
            int opcion = scan.nextInt();
            switch(opcion)
            {
                case 1:
                    System.out.println("Seleccionar lista de reproducción\n");
                    reproduccion.ListaReproduccion();
                    break;
                case 2:
                    System.out.println("Cambiar cancion\n");	
                    reproduccion.CambiarCancion();
                    break;
                case 3:
                    System.out.println("Escuchar cancion\n");
                    reproduccion.escucharCancion();
                    break;
		case 4:
                    System.out.println("Regresara al menu principal!");
                    continuar = false;
                    break;   
                default:
                    System.out.println("ERROR: Escogio una opcion invalida\nIntente de nuevo");
                    continuar = true;          
            } 
        }
    }

    public void CelularMenu()
    {
        boolean continuar = true;
        while(continuar)
        {
            System.out.println("\nModo Celular");
            System.out.println("1. Conectar/Desconectar telefono");
            System.out.println("2. Mostrar contactos");
            System.out.println("3. Llamar a contacto");
            System.out.println("4. Finalizar llamada");
            System.out.println("5. Cambiar a bocinas o auriculares ");
            System.out.println("6. Llamar al ultimo contacto con el que se habló");
            System.out.println("7. Cambiar a llamada en espera");
			System.out.println("8. Salir\n");
            int opcion = scan.nextInt();
            switch(opcion)
            {
                case 1:
                    System.out.println("Conectar/Desconectar telefono\n");
                    celular.Conectar();
                    celular.ListadeContactos();
                    break;
                case 2:
                    System.out.println("Mostrar contactos\n");
                    celular.ListadeContactos();	
                    celular.ImprimirContactos();
                    break;
                case 3:
                    System.out.println("Llamar a contacto\n");
                    celular.ListadeContactos();
                    celular.Llamar();
                    break;
		case 4:
                    System.out.println("Finalizar llamada\n");
                    celular.ListadeContactos();
                    celular.finalizarLlamada();
                    break;
                case 5:
                    System.out.println("Cambiar a bocinas o auriculares\n");
                    celular.ListadeContactos();
                    celular.ClaseS();
                    break;    
                case 6:
                    System.out.println("Llamar al ultimo contacto con el que se hablo\n");
                    celular.ListadeContactos();
                    celular.ClaseA();
                    break;
                case 7:
                    System.out.println("Cambiar a llamada en espera\n");
                    celular.ListadeContactos();
                    celular.ClaseC();
                    break;
                case 8:
                    System.out.println("Regresara al menu principal!");
                    continuar = false;
                    break;   
                default:
                    System.out.println("ERROR: Escogio una opcion invalida\nIntente de nuevo");
                    continuar = true;          
            } 
        }
    }

    public void ProductividadMenu()
    {
        boolean continuar = true;
        while(continuar)
        {
            System.out.println("\nModo Productividad");
            System.out.println("1. Planificar viajes");
            System.out.println("2. Ver tarjetas de presentacion");
            System.out.println("3. Ver pronostico de tiempo");
            System.out.println("4. Salir\n");
            int opcion = scan.nextInt();
            switch(opcion)
            {
                case 1:
                    System.out.println("Planificar viajes\n");
                    productividad.ClaseS();
                    break;
                case 2:
                    System.out.println("Ver tarjetas de presentacion\n");
                    productividad.ClaseA();
                    break;
                case 3:
                    System.out.println("Ver pronostico de tiempo\n");
                    productividad.ClaseC();
                    break;
                case 4:
                    System.out.println("Regresara al menu principal!");
                    continuar = false;
                    break;   
                default:
                    System.out.println("ERROR: Escogio una opcion invalida\nIntente de nuevo");
                    continuar = true;          
            } 
        }
    }

    public void Error()
	{
		System.out.println("\nHa elegido una opcin invalida.\n");
	}
    
    public void despedida()
	{
		System.out.println("\nAdios, que tenga feliz dia!\n");
	}
}