
class Orden extends Cliente {
  private String id;
  private String fecha;
  private tipoVehiculo tiposVehiculo;
  private String placaCarro;
  private int valorPagar;

  public Orden(String id, String fecha, tiposVehiculos tipoVehiculo, Servicios[] serviciosUsar){
    this.id = id;
    this.fecha = fecha;
    this.tipoVehiculo = tiposVehiculo;
    this.serviciosUsar = Servicios[]
  }
}
