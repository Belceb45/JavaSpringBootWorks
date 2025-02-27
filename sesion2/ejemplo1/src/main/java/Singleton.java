public class Singleton {
  // Declaramos un atributo estático que será la única instancia de la clase Singleton
  private static Singleton instance;
  // Declaramos un atributo público que representa algún valor en el Singleton
  public String value;

 // Constructor privado para evitar que se pueda crear instancias fuera de la clase
 private Singleton(String value) {
     this.value = value;
 }

// Método estático para obtener la instancia Singleton
 public static Singleton getInstance(String value){
// Si la instancia aún no ha sido creada, la creamos
    if (instance == null){

       instance = new Singleton(value);
    }
// Devolvemos la instancia existente
  return instance;
 }


}