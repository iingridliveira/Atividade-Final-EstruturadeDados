import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame
        extends JFrame
        implements ActionListener {

    // Components of the Form
    private Container c;
    private JLabel title;
    private JLabel title2;
    private JLabel name;
    private JTextField tname;
    private JLabel CPF;
    private JTextField tmno;
    private JLabel Celular;
    private JTextField tCelular;
    private JLabel Email;
    private JTextField tEmail;


    private JLabel mno;

    private JLabel gender;
    private JRadioButton male;
    private JRadioButton female;
    private ButtonGroup gengp;
    private JLabel dob;
    private JComboBox date;
    private JComboBox month;
    private JComboBox year;
    private JLabel add;
    private JTextArea tadd;
    private JCheckBox term;
    private JButton sub;
    private JButton reset;
    private JTextArea tout;
    private JLabel res;
    private JTextArea resadd;


    // constructor, to initialize the components
    // with default values.
    public MyFrame()
    {
        setTitle("Sistema de Registro de clientes");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Sistema de Registro de clientes");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        c.add(title);

        title2 = new JLabel("Adicionar cliente");
        title2.setFont(new Font("Arial", Font.PLAIN, 30));
        title2.setSize(300, 30);
        title2.setLocation(60, 70);
        c.add(title2);

        name = new JLabel("Nome");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(100, 20);
        name.setLocation(100, 100);
        c.add(name);

        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(190, 20);
        tname.setLocation(200, 100);
        c.add(tname);

        CPF = new JLabel("CPF");
        CPF.setFont(new Font("Arial", Font.PLAIN, 20));
        CPF.setSize(100, 20);
        CPF.setLocation(100, 150);
        c.add(CPF);

        tmno = new JTextField();
        tmno.setFont(new Font("Arial", Font.PLAIN, 15));
        tmno.setSize(150, 20);
        tmno.setLocation(200, 150);
        c.add(tmno);

        Celular= new JLabel("Celular");
        Celular.setFont(new Font("Arial", Font.PLAIN, 20));
        Celular.setSize(100, 20);
        Celular.setLocation(100, 200);
        c.add(Celular);

        tCelular = new JTextField();
        tCelular.setFont(new Font("Arial", Font.PLAIN, 15));
        tCelular.setSize(150, 20);
        tCelular.setLocation(200, 200);
        c.add(tCelular);

        Email= new JLabel("Email");
        Email.setFont(new Font("Arial", Font.PLAIN, 20));
        Email.setSize(100, 20);
        Email.setLocation(100, 250);
        c.add(Email);

        tEmail = new JTextField();
        tEmail.setFont(new Font("Arial", Font.PLAIN, 15));
        tEmail.setSize(150, 20);
        tEmail.setLocation(200, 250);
        c.add(tEmail);








        sub = new JButton("Salvar");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(270, 450);
        sub.addActionListener(this);
        c.add(sub);

        reset = new JButton("Limpar");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(150, 450);
        reset.addActionListener(this);
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
    }

    // method actionPerformed()
    // to get the action performed
    // by the user and act accordingly
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == sub) {
                if (true) {

                String data
                        = "Name : "
                        + tname.getText() + "\n"
                        + "CPF : "
                        + tmno.getText() + "\n"
                        + "Celular : "
                        + tCelular.getText() + "\n"
                        + "E-mail: "
                        + tEmail.getText() + "\n"

                        ;
                tout.setText(data );
                tout.setEditable(false);
                res.setText("Registration Successfully..");
            }
            else {

                tout.setText("");
                resadd.setText("");
                res.setText("Please accept the"
                        + " terms & conditions..");
            }
        }

        else if (e.getSource() == reset) {
            String def = "";
            tname.setText(def);
            tmno.setText(def);
            tEmail.setText(def);
            tCelular.setText(def);
            tadd.setText(def);
            res.setText(def);
            tout.setText(def);
            resadd.setText(def);
        }
    }
}

// Driver Code
class Registration {

    public static void main(String[] args) throws Exception
    {
        MyFrame f = new MyFrame();
    }
}
