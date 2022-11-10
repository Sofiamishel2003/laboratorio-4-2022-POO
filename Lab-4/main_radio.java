import java.util.Scanner;
import java.util.ArrayList;
public class main_radio {
    public static void main(String[] args){
        Scanner reclado = new Scanner(System.in);
        int opcion1 = 0;
        radio tumba_la_casa= new radio();
        ArrayList <cancion> canciones =new ArrayList<cancion>();
        ArrayList <contacto> contactos =new ArrayList<contacto>();
        ArrayList <Double> emisoras =new ArrayList<Double>();
        //Playlist #1 
        ArrayList <cancion> top5 =new ArrayList<cancion>();
        cancion midnights = new cancion("Midnights","Talyor Swift","Pop","5:10 min");
        cancion revolver = new cancion("Revolver","The Beatles","Rock","4:10 min");
        cancion motomami = new cancion("Motomami","Rosalia","Música tropical","3:10 min");
        cancion sour = new cancion("Sour","Olivia Rodrigo","Pop","2:21 min");
        top5.add(midnights);
        top5.add(revolver);
        top5.add(motomami);
        top5.add(sour);
        //Playlist #2
        ArrayList <cancion> hitsongs =new ArrayList<cancion>();
        cancion jasmine = new cancion("Jasmine","DPR LIVE","Pop","3:20 min");
        cancion you = new cancion("You","Travis Scott","Rap","3:33 min");
        cancion reminder = new cancion("Reminder","The Weekend","Pop","3;37 min");
        cancion sings = new cancion("Sings","Drake","Rap","3:52 min");
        top5.add(jasmine);
        top5.add(you);
        top5.add(reminder);
        top5.add(sings);
        //Playlist #3
        ArrayList <cancion> salsamix =new ArrayList<cancion>();
        cancion location = new cancion("Location","Khalid","Pop","4:10 min");
        cancion hope = new cancion("Hope","XXXTENTACION","Rap","1:50 min");
        cancion bye = new cancion("Bye","Jaden","Rap","4:56 min");
        cancion telepatia = new cancion("Telpatia","Kali Uchis","Pop","2:39 min");
        top5.add(location);
        top5.add(hope);
        top5.add(bye);
        top5.add(telepatia);
        //Playlist #4
        ArrayList <cancion> indie =new ArrayList<cancion>();
        cancion more = new cancion("More","J-Hope","KPop","2:58 min");
        cancion museo = new cancion("Museo","Rauw Alejandro","Reguetón","4:08 min");
        cancion positions = new cancion("Positions","Ariana Grande","Pop","2:52 min");
        cancion who = new cancion("Who","BTS","Kpop","2:59 min");
        top5.add(more);
        top5.add(museo);
        top5.add(positions);
        top5.add(who);

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
                    tumba_la_casa.volumen(true);
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
pie de página
© 2022 GitHub, Inc.
Pie de página de navegación
Términos
Privacidad
