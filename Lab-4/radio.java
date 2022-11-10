import java.util.ArrayList;
import java.util.Scanner;
public class radio implements modo_estado, modo_radio, modo_volumen, modo_productividad, modo_telefono{ //declaracion de variables protegidas y creacion de la clase padre
    private String modulation;
    private String estado;
    private Boolean conectar;
    private double emisora;
    private int volumen;
    private int pos;
    private String audio;
    Scanner reclado = new Scanner(System.in);

    public radio()
    {
        modulation = "AM";
        emisora = 88.1;
        estado="Apagado";
        volumen=0;
        conectar=false;
        pos=0;
        audio="speaker";
    }
    @Override
    //----------modo_estado----------------------
    public void estado(Boolean state)
    {
        if (state)
        {
            estado="Encendido";
        }
        else
        {
            estado="Apagado";
        }
        System.out.println("El radio está "+estado);

    }
    //----------modo_radio-----------------------
    public void cambiar(Boolean flag)
    {
        if (flag)
        {
            modulation="FM";
        }
        else
        {
            modulation="AM";
        }
        System.out.println("La modulación está en "+modulation);
    }
    public void cambiar_e(Boolean flag)
    {
        if (flag)
        {
            emisora=emisora+0.5;
        }
        else
        {
            emisora=emisora-0.5;
        }
        System.out.println("La emisora es "+emisora);

    }
    public void guardar(ArrayList<Double> lista, Double emisora_number)
    {
        if(lista.size()<50)
        {
            lista.add(emisora_number);
            System.out.println("Se añadio la emisora "+emisora_number);
        }
        else
        {
            System.out.println("La lista de emisoras ya está llena");
        }
    }
    public void cargar(ArrayList<Double> lista)
    {
        int x=1;
        for (Double i: lista) {
            System.out.println("-"+x+". "+i);
          }
    }
    //----------modo_volumen---------------------

    public void volumen(Boolean flag)
    {
        if (flag)
        {
            volumen=volumen+1;
        }
        else
        {
            volumen=volumen-1;
        }
        System.out.println("La volumen es "+volumen);
    }
    //----------modo_productividad---------------------
    public String viajes()
    {
        return "random de tiempo de llegada y distancia";
    }
    //----------modo_telefono---------------------

    public void conexion(boolean conection)
    {
        String mensaje="";
        if (conection)
        {
            mensaje="El telefono esta conectado";
        }
        else
        {
            mensaje="El telefono esta desconectado";
        }
        conectar=conection;
        System.out.println(mensaje);
    }
    public void contactos(ArrayList<contacto> lista)
    {
        int x=1;
        for (contacto i: lista) {
            System.out.println("-"+x+". "+i.get_nombre() +", telefono: "+i.get_telefono());
          }
    }
    public void llamar(ArrayList<contacto> lista)
    {
        int x=1;
        for (contacto i: lista) {
            System.out.println("-"+x+". "+i.get_nombre() +", telefono: "+i.get_telefono());
          }
        int o = reclado.nextInt();
        System.out.println("llamando a "+lista.get(o).get_nombre()+ " del numero "+ lista.get(o).get_telefono());

    }
    public void finalizar()
    {
        System.out.println("Se finaliza llamada");

    }
    public void audio(Boolean flag)
    {
        if (flag)
        {
            audio="auriculares";
        }
        else
        {
            audio="speaker";
        }
        System.out.println("El sonido está en "+audio);
    }
    //----------modo_reproducción---------------------
    public void seleccionar(ArrayList<cancion> lista)
    {
        int x=1;
        for (cancion i: lista) {
            System.out.println("-"+x+". "+i.get_nombre() +", artista: "+i.get_autor()+"("+i.get_genero()+")");
          }
    }
    public void cambiar_c(Boolean flag,ArrayList<cancion> lista)
    {
        if (flag==true || pos==0)
        {
            pos=pos+1;
            if(pos==lista.size())
            {
                pos=0;
            }   
        }
        else
        {
            if (pos==0)
            {
                pos=lista.size()-1;
            }
            else
            {
                pos=pos-1;
            }
        }
    }
    public void escuchar(ArrayList<cancion> lista)
    {
        System.out.println("Reproduciendo "+lista.get(pos).get_nombre() +", artista: "+lista.get(pos).get_autor()+"("+lista.get(pos).get_genero()+")"+ "duración: "+lista.get(pos).get_tiempo());
    }
}

