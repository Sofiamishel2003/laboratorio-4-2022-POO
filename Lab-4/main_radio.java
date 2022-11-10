import java.util.Scanner;
import java.util.ArrayList;
public class main_radio {
    public static void main(String[] args){
        Scanner reclado = new Scanner(System.in);
        int opcion1 = 0;
        ArrayList <cancion> canciones =new ArrayList<cancion>();
        ArrayList <contacto> contactos =new ArrayList<contacto>();
        ArrayList <Double> emisoras =new ArrayList<Double>();
        {
            ArrayList <cancion> top5 =new ArrayList<cancion>();
            ArrayList <contacto> contactos =new ArrayList<contacto>();
            cancion midnights = new cancion(nombre:"Midnights",autor:"Talyor Swift",genero:"Pop",tiempo:"5:10 min");
            top5.add(midnights);

        }

        {
            ArrayList <cancion> top5 =new ArrayList<cancion>();
            ArrayList <contacto> contactos =new ArrayList<contacto>();
            cancion revolver = new cancion(nombre:"Revolver",autor:"The Beatles",genero:"Rock",tiempo:"4:10 min");
            top5.add(revolver);

        }

        {
            ArrayList <cancion> top5 =new ArrayList<cancion>();
            ArrayList <contacto> contactos =new ArrayList<contacto>();
            cancion motomami = new cancion(nombre:"Motomami",autor:"Rosalia",genero:"Música tropical",tiempo:"3:10 min");
            top5.add(motomami);

        }

        {
            ArrayList <cancion> top5 =new ArrayList<cancion>();
            ArrayList <contacto> contactos =new ArrayList<contacto>();
            cancion sour = new cancion(nombre:"Sour",autor:"Olivia Rodrigo",genero:"pop",tiempo:"2:21 min");
            top5.add(sour);

        }
        
        System.out.println("Radio tumba la casa \n[1] Encender \n[2] Cambiar volumen \n[3] Modo radio\n[4] Modo reproducción\n[5] Modo telefono\n[6] Modo productividad\n[7] Apagar");
        opcion1 = reclado.nextInt();
        if(opcion1 ==1){
            while(opcion1 !=7)
            {
                System.out.println("Radio tumba la casa \n[2] Cambiar volumen \n[3] Modo radio\n[4] Modo reproducción\n[5] Modo telefono\n[6] Modo productividad\n[7] Apagar");
                opcion1 = reclado.nextInt();
            if(opcion1 == 2){
                System.out.println("[1] Sumarle 1\n[2] Bajarle 1");
                int v = reclado.nextInt();
                if(v==2)
                {
                    //radio.volumen(true);
                }
                else
                {
                    
                }
            }else if(opcion1 == 3){
                System.out.println("Ingrese su usuario: ");
                System.out.println("Ingrese su contraseña: ");
            }else if(opcion1 == 4){
                System.out.println("Saliendo del programa...");
            
        }
        }
        }
        else
        {
            System.out.println("No se puede hacer nada si no se enciende la");
        }

    }
}