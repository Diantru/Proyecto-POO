import java.util.ArrayList;

public class Tecnico extends Persona {
    private Especialidades especialidad;
    private ArrayList<Orden> ordenes;

    public Tecnico(String id, String nombre, int telefono, Especialidades especialidad) {
        super(id, nombre, telefono);
        this.especialidad = especialidad;
        this.ordenes = new ArrayList<>();
    }

    public void agregarTec(Tecnico tecnico) {
        listaTecnicos.add(t);
        System.out.println("Técnico agregado");
    }
    
    public void registrarOrden(Orden nuevaOrden) {
        ordenes.add(nuevaOrden);
    }

    public void asignarOrden(Orden orden) {
        ordenes.add(orden);
    }

    public Especialidades getEspecialidad() {
        return especialidad;
    }
  
    public ArrayList<Orden> getOrdenes() {
        return ordenes;
    }
}

