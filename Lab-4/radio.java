import java.util.ArrayList;

public class radio implements modo_estado, modo_radio, modo_volumen, modo_productividad{ //declaracion de variables protegidas y creacion de la clase padre
    private String marca;
    private double emisora;
    public radio()
    {
        marca = "";
        emisora = 0;
    }
    @Override
    //----------modo_estado----------------------
    public void estado(Boolean state)
    {

    }
    //----------modo_radio-----------------------
    public void cambiar(Boolean flag)
    {

    }
    public void cambiar_e(Boolean flag)
    {

    }
    public void guardar(ArrayList<Float> lista, String emisora_number)
    {

    }
    public void cargar(ArrayList<Float> lista)
    {

    }
    //----------modo_volumen---------------------

    public void volumen(Boolean flag)
    {

    }
    //----------productividad---------------------
    public String viajes()
    {
        return "random de tiempo de llegada y distancia";
    }

}

