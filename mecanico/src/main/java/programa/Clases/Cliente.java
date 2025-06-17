package programa.Clases;

public class Cliente extends Persona{
    private String direccion;
    private String tipoCliente;

    public Cliente(String id, String n, int tel, String dir, String TC){
        super(id, n, tel);
        this.direccion = dir;
        this.tipoCliente = TC;
    }

    public String getDireccion(){
        return direccion;
    }

    public String getTipoCliente(){
        return tipoCliente;
    }
}
