
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class Renderizatabela extends JFrame {

    private JTable tabela;
    private Container c;
    private JLabel title;
    private JLabel title2;
    private JLabel title3;

    private JLabel CPF;
    private JTextField tmno;
    private JButton sub;
    private JButton reset;
    private JTextArea tout;
    private JLabel res;
    private JTextArea resadd;

    public Renderizatabela() {
        renderizarTela();
    }

    private void renderizarTela() {
        c = getContentPane();
        title = new JLabel("Sistema de Registro de clientes");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        c.add(title);

        title2 = new JLabel("Adicionar cliente");
        title2.setFont(new Font("Arial", Font.PLAIN, 30));
        title2.setSize(300, 30);
        title2.setLocation(60, 70);

        title3 = new JLabel("Lista de contatos");
        title3.setFont(new Font("Arial", Font.PLAIN, 30));
        title3.setSize(300, 30);
        title3.setLocation(100, 250);
        c.add(title3);


        CPF = new JLabel("CPF");
        CPF.setFont(new Font("Arial", Font.PLAIN, 20));
        CPF.setSize(100, 20);
        CPF.setLocation(100, 100);
        c.add(CPF);

        tmno = new JTextField();
        tmno.setFont(new Font("Arial", Font.PLAIN, 15));
        tmno.setSize(150, 20);
        tmno.setLocation(100, 150);
        c.add(tmno);


        sub = new JButton("Buscar");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(200, 200);

        c.add(sub);

        reset = new JButton("Limpar");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(100, 200);

        c.add(reset);


        tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(300, 400);
        tout.setLocation(500, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        c.add(tout);

        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(500, 25);
        res.setLocation(100, 500);
        c.add(res);

        resadd = new JTextArea();
        resadd.setFont(new Font("Arial", Font.PLAIN, 15));
        resadd.setSize(200, 75);
        resadd.setLocation(580, 175);
        resadd.setLineWrap(true);
        c.add(resadd);

        setVisible(true);


        //4 ojetos criados para popular a tabela
        //aqui predendo tranformar   ArrayList para  HashMap

        Cliente  f1 = new Cliente("Ingrid","079077863","(88)99650-4395","oli@gamil.com");

        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(f1);



        //cria um objeto do nosso model
       ClienteTabela model = new  ClienteTabela(clientes);

        //instancia a tabela já com o model como argumento
        this.tabela = new JTable(model);
        this.c = new JScrollPane(tabela);
        tabela.setLocation(100,400);



        this.add(c);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Renderizatabela c = new Renderizatabela();
                c.setLocationRelativeTo(null);
                c.setVisible(true);

            }
        });
    }
}
