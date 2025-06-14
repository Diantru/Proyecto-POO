pubic class Servicio{
  private int codigo;
  private String nombre;
  private double precio;

  public Servicio(int code, String n, double precio){
    this.codigo = code;
    this.nombre = n;
    this.precio = precio;
  }

  public int getCodigo(){
    return codigo;
  }

  public String getNombre(){
    return nombre;
  }

  public double getPrecio(){
    return precio;
  }
    
}
