public class Persona{
  protected String identificacion;
  protected String nombre;
  protected int telefono;

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
