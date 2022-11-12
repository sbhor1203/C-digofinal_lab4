package main;
import java.util.ArrayList;
import java.util.Scanner;

public class Productividad implements ClasesCarros{
     //Propiedades//
    public String UbicacionViaje;
    public String FechaViaje;
    public String NombrePresentacion;
    public String TextoPresentacion;
    public int TipoDia;
    public int optionCarros;
    public int CarrosInt;
    Scanner ScanInt = new Scanner(System.in);
    Scanner ScanString = new Scanner(System.in);
    ArrayList<String> Viajes = new ArrayList<String>();
    //Métodos//

    //Constructor//
    public Productividad()
    {
        UbicacionViaje = null;
        FechaViaje = null;
        NombrePresentacion = null;
        TextoPresentacion = null;
        TipoDia=0;
    }
    public void ClaseCarrosPrint(){
        System.out.println("       ¿Que tipo de clase es tu automovil?\n "+
                           "   ╔═════════════╗   ╔═════════════╗   ╔═════════════╗\n"+
                           "    ║ 1.Clase A ║   ║ 2.Clase C ║   ║ 3.Clase S ║\n"+
                           "    ╚═════════════╝   ╚═════════════╝   ╚═════════════╝\n");
        this.optionCarros = ScanInt.nextInt(); 
        setoptionCarros(optionCarros);
    }
    public int getoptionCarros(){
        return optionCarros;
    }
    public void setoptionCarros(int optionCarros){
        this.optionCarros = optionCarros;
    }
    public String getUbicacion()
    {
        return UbicacionViaje;
    }

    public String getFecha()
    {
        return FechaViaje;
    }

    public String getNombre()
    {
        return NombrePresentacion;
    }

    public String getTexto()
    {
        return TextoPresentacion;
    }

    public int getTipo()
    {
        return TipoDia;
    }

    public void setUbicacion(String UbicacionViaje)
    {
        this.UbicacionViaje = UbicacionViaje;
    }

    public void setFecha(String FechaViaje)
    {
        this.FechaViaje = FechaViaje;
    }
    
    public void setNombre(String NombrePresentacion)
    {
        this.NombrePresentacion = NombrePresentacion;
    }

    public void setTexto(String TextoPresentacion)
    {
        this.TextoPresentacion = TextoPresentacion;
    }

    public void setTipo(int TipoDia)
    {
        this.TipoDia = TipoDia;
    }
    public void ClaseA(){
        System.out.println(optionCarros);
        if(optionCarros==1){
            System.out.println("Introduzca el nombre que desea ponerle a la tarjeta:\n");
            NombrePresentacion = ScanString.nextLine();
            System.out.println("Introduzca el texto que incluye la tarjeta:\n");
            TextoPresentacion = ScanString.nextLine();
            System.out.println("-------Tarjeta de presentación-------\nNombre:"+NombrePresentacion+"\n Descripcion:\n"+TextoPresentacion);
        }else if(optionCarros==2 & optionCarros==3){
            System.out.println("Esta funcion solo aplica para automoviles de Clase A");
        }else{
            System.out.println("Tu automovil no forma parte de ninguna Clase");
        }
    }
    public void ClaseC(){
        System.out.println(optionCarros);
        if(optionCarros==2){
            System.out.println("Introduzca como ha estado su dia:\n1. vientoso\n2. Frio\n3. Calor");
            TipoDia = ScanInt.nextInt();
            if(TipoDia == 1){
                System.out.println("\tBienvenido al pronostico de hoy\nExiste bastante probabilidad de que Llueva o haya tormeta");
            }else if(TipoDia ==2){
                System.out.println("\tBienvenido al pronostico de hoy\nExiste bastante probabilidad de que haya ventisca o nieve si nieva en su pais");              
            }else if(TipoDia ==3){
                System.out.println("\tBienvenido al pronostico de hoy\nExiste bastante probabilidad de que tu dia sea soleado");
            }
        }else if(optionCarros==1 & optionCarros==3){
            System.out.println("Esta funcion solo aplica para automoviles de Clase C");
        }else{
            System.out.println("Tu automovil no forma parte de ninguna Clase");
        }
    }
    public void ClaseS(){
        System.out.println(optionCarros);
        if(optionCarros==3){
            System.out.println("Introduzca la Ubicación a donde desea viajar:\n");
            UbicacionViaje = ScanString.nextLine();
            System.out.println("Introduzca la fecha en la que desea viajar:\n");
            FechaViaje = ScanString.nextLine();
            System.out.println("Viaje planificado para "+UbicacionViaje+"el dia "+FechaViaje);
        }else if(optionCarros==2 & optionCarros==1){
            System.out.println("Esta funcion solo aplica para automoviles de Clase S");
        }else{
            System.out.println("Tu automovil no forma parte de ninguna Clase");
        }
    }
    public void PlanificarViaje(int OptionFinal){
        System.out.println(OptionFinal);
        
    }
}