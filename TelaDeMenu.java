import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TelaDeMenu extends JFrame {
    private final JMenuItem abrirItem;
    private final JMenuItem copiarItem;
    private final JMenuItem moverItem;
    private final JMenu cadastroMenu;
    private final JLabel lblNomeDaTela;
    private final JMenuBar menuBar;
    private final JMenuItem apagarItem;
    private final JMenuItem renomearItem;
    private final JMenuItem sobreItem;
    private final JMenuItem sairItem;

    public TelaDeMenu() {
        super("Tela de Menu");

        cadastroMenu = new JMenu("Cadastro");
        lblNomeDaTela = new JLabel("Tela de Menu", SwingConstants.CENTER);
        menuBar = new JMenuBar();

        abrirItem = new JMenuItem("Abrir");
        copiarItem = new JMenuItem("Copiar");
        moverItem = new JMenuItem("Mover");
        apagarItem = new JMenuItem("Apagar");
        renomearItem = new JMenuItem("Renomear");
        sobreItem = new JMenuItem("Sobre");
        sairItem = new JMenuItem("Sair");

        cadastroMenu.add(abrirItem);
        cadastroMenu.add(copiarItem);
        cadastroMenu.add(moverItem);
        cadastroMenu.add(apagarItem);
        cadastroMenu.add(renomearItem);
        cadastroMenu.add(sobreItem);
        cadastroMenu.add(sairItem);

        menuBar.add(cadastroMenu);

        setJMenuBar(menuBar);

        add(lblNomeDaTela, BorderLayout.CENTER);

        abrirItem.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    OpenFile.abrirArquivo();
                }
            }
        );

        copiarItem.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    CopyFile.copiarArquivo();
                }
            }
        );

        moverItem.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    JOptionPane.showMessageDialog(null,"Você clicou no menu: " + event.getActionCommand());
                }
            }
        );
    
        apagarItem.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    JOptionPane.showMessageDialog(null,"Você clicou no menu: " + event.getActionCommand());
                }
            }
        );

        renomearItem.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    JOptionPane.showMessageDialog(null,"Você clicou no menu: " + event.getActionCommand());
                }
            }
        );

        sobreItem.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    JOptionPane.showMessageDialog(null,"Você clicou no menu: " + event.getActionCommand());
                }
            }
        );

        sairItem.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    JOptionPane.showMessageDialog(null,"Você clicou no menu: " + event.getActionCommand());
                }
            }
        );
    }

    public static TelaDeMenu appTelaDeMenuView;
    public static void main(String[] args) {
        appTelaDeMenuView = new TelaDeMenu();
        appTelaDeMenuView.setDefaultCloseOperation(EXIT_ON_CLOSE);
        appTelaDeMenuView.setSize(500,500);
        appTelaDeMenuView.setVisible(true);
    }
}