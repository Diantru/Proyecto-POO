
class Cliente extends Persona {
  String direccion;
  TipoCliente tipoCliente;

  public Cliente(String  id, String nombre, int telefono, String direccion, tipoCliente tipoCliente){
    super(id, nombre, telefono);
    this.direccion = direccion;
    this.tipoCliente = tipoCliente;
  }
}
