public class Persona{
  private String identificacion;
  private String nombre;
  private int telefono;

  public Persona(String id, String n, int tel){
    this.identificacion = id;
    this.nombre = n;
    this.telefono = tel;
  }

  public String getIdentificacion(){
      return identificacion;
  }

  public String getNombre(){
      return nombre;
  }

  public int getTelefono(){
      return telefono;
  }
}
