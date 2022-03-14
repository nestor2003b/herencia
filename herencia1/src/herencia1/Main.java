package herencia1;
public class Main {
    public static void main(String[] args) {
    Animal perro = new Perro("Tana","guiso",3,"labrador");
    perro.alimento();
    Animal caballo = new Caballo("Manso","pasto",10,"tordillo");
   caballo.alimento();
   Animal gato= new Gato("Manchita","atún",2,"siames");
   gato.alimento();
    }
 
    
}
