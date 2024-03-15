import java.util.HashMap;

public class ClientesHash  {
    public static void main(String[] args){

        HashMap<Integer,Cliente> clientes = new HashMap<Integer,Cliente>();
        clientes.put(1,new Cliente("Ingrid","079077863","(88)99650-4395","oli@gamil.com"));
        clientes.put(2,new Cliente("Ingrid2","079077864","(88)99650-4395","oli@gamil.com"));
        clientes.put(3,new Cliente("Ingrid3","079077865","(88)99650-4395","oli@gamil.com"));
        clientes.put(4,new Cliente("Ingrid4","079077866","(88)99650-4395","oli@gamil.com"));

        System.out.println( clientes.get(1));
    }
}
