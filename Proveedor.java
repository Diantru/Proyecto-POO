public class Proveedor extends Persona{
    private descripcion;

    public Proveedor(String id, String n, int tel, String desc){
        super(id, n, tel);
        this.descripcion = desc;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public void AgregarProveedor(Proveedor p){
        listaProv.add(p);
    }

}
