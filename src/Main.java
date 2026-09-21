import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> inventario = new ArrayList<>();


        inventario.add("1- inventiario");
        inventario.add("2- inventario");
        inventario.add("3- inventario");

        System.out.println("Lista inventario: " + inventario);
        System.out.println("Cantidad de cursos: " + inventario.size());

        for(int i = 0; i <= inventario.size()-1; i++){
            System.out.println(i+") "+inventario.get(i));
        }

        inventario.set(1, "nuevo valor");

        System.out.println("Tamaño de la lista "+inventario.size());

        for(int i = inventario.size()-1; i >= 0; i--){
            System.out.println(i+") "+inventario.get(i));
        }


    }
}