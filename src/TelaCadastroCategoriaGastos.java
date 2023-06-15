import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadastroCategoriaGastos extends JFrame {
    private JTextField jTextFieldCategoria;
    private JButton jButtonSalvar;

    public TelaCadastroCategoriaGastos() {
        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Cadastro de Categoria de Gastos");

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(2, 2, 10, 10));
        add(jPanel, BorderLayout.CENTER);

        JLabel jLabelCategoria = new JLabel("Categoria:");
        jPanel.add(jLabelCategoria);

        jTextFieldCategoria = new JTextField();
        jPanel.add(jTextFieldCategoria);

        jButtonSalvar = new JButton("Salvar");
        jButtonSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salvarCategoria();
            }
        });
        jPanel.add(jButtonSalvar);

        pack();
        setLocationRelativeTo(null);
    }

    private void salvarCategoria() {
        String categoria = jTextFieldCategoria.getText();

        // Aqui você pode realizar a lógica de persistência da categoria no banco de dados
        // por meio de uma classe DAO ou outro mecanismo de acesso aos dados

        // Exemplo de exibição de mensagem informando que a categoria foi salva
        JOptionPane.showMessageDialog(this, "Categoria salva com sucesso!");

        // Limpar o campo de texto após salvar
        jTextFieldCategoria.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaCadastroCategoriaGastos().setVisible(true);
            }
        });
    }
}
