
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

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String celular) {
        Celular = celular;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public String toString() {
        return nome + " " + CPF + " " + Celular + " " + Email;
    }
}

