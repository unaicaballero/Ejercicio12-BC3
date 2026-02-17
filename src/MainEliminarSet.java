import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainEliminarSet {

    public static void main(String[] args) {

        Set<String> palabras = new HashSet<>();
        palabras.add("Ana");
        palabras.add("Luis");
        palabras.add("Alberto");

        System.out.println("Set original:");
        System.out.println(palabras);

        Iterator<String> iterator = palabras.iterator();

        while (iterator.hasNext()) {
            String palabra = iterator.next();

            if (palabra.startsWith("A")) {
                iterator.remove();
            }
        }

        System.out.println("Set después de eliminar los que empiezan por 'A': ");
        System.out.println(palabras);
    }
}
