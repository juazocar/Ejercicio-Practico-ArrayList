import java.util.ArrayList;

public class Main {
    ArrayList<String> inventario = new ArrayList<>();

    public void agregarObjeto(String objeto){
        inventario.add(objeto);
    }

    public void mostrarInventario(){
        for(int i = 0; i <= inventario.size()-1; i++){
            System.out.println(i+") "+inventario.get(i));
        }
    }

    public void retirarObjeto(String objeto){
        inventario.remove(objeto);
    }

    public static void main(String[] args) {
        
        Main main = new Main();

        main.agregarObjeto("Objeto 1");
        main.agregarObjeto("Objeto 2");
        main.agregarObjeto("Objeto 3");
        main.agregarObjeto("Objeto 4");

        main.mostrarInventario();

        main.retirarObjeto("Objeto 1");

        main.mostrarInventario();

    }
}