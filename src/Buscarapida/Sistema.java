package Buscarapida;

import Buscarapida.Cliente;

import java.util.HashMap;

import java.util.Scanner;

public class Sistema {
    private static HashMap<String, Cliente> clientes = new HashMap<>();

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Cadastrar cliente");
            System.out.println("2. Consultar cliente por CPF");
            System.out.println("3. Consultar todos os clientes");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    CadastrarCliente(ler);
                    break;
                case 2:
                    ConsultarCliente(ler);
                    break;
                case 3:
                    ConsultarClientes();
                    break;
                case 4:
                    System.out.println("Saindo do sistema");
                    return;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    private static void CadastrarCliente(Scanner ler) {
        System.out.print("Digite o nome do cliente: \n");
        String nome = ler.next();

        System.out.print("Digite o CPF do cliente: \n");
        String cpf = ler.next();

        System.out.print("Digite o celular do cliente: \n");
        String celular = ler.next();

        System.out.print("Digite o email do cliente: \n");
        String email = ler.next();

        Cliente cliente = new Cliente(nome, cpf, celular, email);
        clientes.put(cpf, cliente);

        System.out.println("Buscarapida.Cliente cadastrado");
    }

    private static void ConsultarCliente(Scanner ler) {
        System.out.print("Digite o CPF do cliente: ");
        String cpf = ler.next();

        Cliente cliente = clientes.get(cpf);

        if (cliente != null) {
            System.out.println("\n--- Buscarapida.Cliente Encontrado ---");
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("CPF: " + cliente.getCPF());
            System.out.println("Celular: " + cliente.getCelular());
            System.out.println("Email: " + cliente.getEmail() + "\n");
        } else {
            System.out.println("Buscarapida.Cliente não encontrado para o CPF informado.");
        }
    }

    private static void ConsultarClientes() {
        System.out.println("--- Todos os clientes ---\n");
        for (Cliente cliente : clientes.values()) {
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("CPF: " + cliente.getCPF());
            System.out.println("Celular: " + cliente.getCelular());
            System.out.println("Email: " + cliente.getEmail() + "\n");
        }
    }
}