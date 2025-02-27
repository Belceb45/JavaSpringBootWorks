public class Application {

  public static void main(String[] args) {
    

    Singleton singleton=Singleton.getInstance("FOO");
    Singleton anothersingleton=Singleton.getInstance("BAR");


    System.out.println(anothersingleton.value);
    System.out.println(singleton.value);


  }
}