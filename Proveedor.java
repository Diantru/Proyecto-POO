public class Proveedor extends Persona{
    private descripcion;

    public Proveedor(String id, String n, int tel, String desc){
        super(id, n, tel);
        this.descripcion = desc;
        
    }
}
