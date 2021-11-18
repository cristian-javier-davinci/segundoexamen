import java.util.ArrayList;

public class Profesor extends Usuario{

    //ATRIBUTOS
    private ArrayList<String> comisiones = new ArrayList<String>();

    //CONSTRUCTOR
    public Profesor(int dni, String nombre, String apellido) {
        super(dni, nombre, apellido);
        this.comisiones = comisiones;
    }

    //Getter y setter
    public ArrayList<String> getComisiones() {
        return comisiones;
    }

    public void setComisiones(ArrayList<String> comisiones) {
        this.comisiones = comisiones;
    }

    //METODOS
    public void imprimirComisiones(){
        System.out.println("Comisiones"+comisiones);
    }
}
