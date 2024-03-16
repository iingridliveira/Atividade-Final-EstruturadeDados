
import java.util.HashMap;
import java.util.Scanner;

public class ClientesHash  {

    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Cadastrando cliente");
        System.out.printf("Informe o CPF do cliente :\n");
        var a = ler.nextInt();
        System.out.printf("Informe o nome do cliente:\n");
        var n = ler.next();
        System.out.printf("Informe o numero do cliente:\n");
       var cel = ler.next();
        System.out.printf("Informe seu email:\n");
        var  e = ler.next();
        criandoCliente(String.valueOf(a),n,cel, e);
  }

    public static void criandoCliente(String a, String n, String cel, String e){


        HashMap<String,Cliente> clientes = new HashMap<String,Cliente>();
        clientes.put(a, new Cliente(n, a, cel, e));

        System.out.println( clientes.get(a));
        System.out.println(clientes);
    }

}
