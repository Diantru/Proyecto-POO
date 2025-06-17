package programa.Clases;
import java.util.*;

public class Tecnico extends Persona{
    private String especialidad;
    private ArrayList<Orden> ordenes;
    
    public Tecnico(String id, String n, int tel, String esp){
        super(id, n, tel);
        this.especialidad = esp;
    }

    public String getEspecialidad(){
        return especialidad;
    }
}
