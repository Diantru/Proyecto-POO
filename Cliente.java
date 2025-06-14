
class Cliente extends Persona {
  protected String direccion;
  TipoCliente tipoCliente;

  public Cliente(String  id, String nombre, int telefono, String direccion, tipoCliente tipoCliente){
    super(id, nombre, telefono);
    this.direccion = direccion;
    this.tipoCliente = tipoCliente;
  }

  public String getDireccion(){
    return direccion;
  }

  public String getDescripcion(){
    return descripcion;
  }

  public String getTipo(){
    return TipoCliente;
  }

  public void seleccionarOpcion(){
    return ""
  }

  public void agregarCliente(){
    return ""
  }
  
}
