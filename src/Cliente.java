import java.util.Scanner;

public class Cliente {
    private String nome;
    private String CPF;
    private String Celular;
    private String Email;

    public Cliente(String nome, String CPF, String Celular, String Email) {
        this.nome = nome;
        this.CPF = CPF;
        this.Celular= Celular;
        this.Email= Email;
    }
    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    public String getEmail() {
        return Email;

    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String celular) {
        Celular = celular;
    }

    public void setEmail(String email) {
        Email = email;
    }



    @Override
    public String toString() {
        System.out.println("-----------------------------------------------");
        return "nome : " + nome + " " + "CPF: " + CPF + " " +"Celular: "+ Celular + " "+ "Email: " + Email;
    }
}

