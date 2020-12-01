import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.Font;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;


public class Calculadora extends JFrame {
    
    private GridBagLayout layoutGridBagLayout;
    private GridBagConstraints constraintsGridBagConstraints;
    private JPanel panelVisor;
    private JPanel panelTeclas;
    private Visor visor;
    private JButton teclaZero;
    private JButton teclaUm;
    private JButton teclaDois;
    private JButton teclaTres;
    private JButton teclaQuatro;
    private JButton teclaCinco;
    private JButton teclaSeis;
    private JButton teclaSete;
    private JButton teclaOito;
    private JButton teclaNove;
    private JButton teclaPonto;
    private JButton teclaIgual;
    private JButton teclaSubtracao;
    private JButton teclaSoma;
    private JButton teclaMultiplicacao;
    private JButton teclaDivisao;
    private JButton teclaLimpar;

    public Calculadora() {
        super("Calculadora");
        instanciarComponentes();
        criarComponentes();
        ajustarPropriedadeJanela();
    }

    private void ajustarPropriedadeJanela() {
        setVisible(true);
        setSize(360,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void criarComponentes() {
        Border borda = BorderFactory.createLineBorder(Color.gray);
        panelVisor.setBorder(borda);
        panelTeclas.setBorder(borda);
        setLayout(layoutGridBagLayout);
        definirFonte(teclaZero, teclaUm, teclaDois, teclaTres, teclaQuatro, teclaCinco, teclaSeis, teclaSete, teclaOito, teclaNove, teclaPonto, teclaIgual, teclaSoma, teclaSubtracao, teclaMultiplicacao, teclaDivisao, teclaLimpar);
        ajustarLayout(panelTeclas, teclaLimpar, 0, 0, GridBagConstraints.CENTER, 1, 1, GridBagConstraints.BOTH, 1, 1);
        ajustarLayout(panelTeclas, teclaDivisao, 1, 0, GridBagConstraints.CENTER, 1, 1, GridBagConstraints.BOTH, 1, 1);
        ajustarLayout(panelTeclas, teclaMultiplicacao, 2, 0, GridBagConstraints.CENTER, 1, 1, GridBagConstraints.BOTH, 1, 1);
        ajustarLayout(panelTeclas, teclaSubtracao, 3, 0, GridBagConstraints.CENTER, 1, 1, GridBagConstraints.BOTH, 1, 1);
        ajustarLayout(panelTeclas, teclaSete, 0, 1, GridBagConstraints.CENTER, 1, 1, GridBagConstraints.BOTH, 1, 1);
        ajustarLayout(panelTeclas, teclaOito, 1, 1, GridBagConstraints.CENTER, 1, 1, GridBagConstraints.BOTH, 1, 1);
        ajustarLayout(panelTeclas, teclaNove, 2, 1, GridBagConstraints.CENTER, 1, 1, GridBagConstraints.BOTH, 1, 1);
        ajustarLayout(panelTeclas, teclaSoma, 3, 1, GridBagConstraints.CENTER, 1, 2, GridBagConstraints.BOTH, 1, 1);
        ajustarLayout(panelTeclas, teclaQuatro, 0, 2, GridBagConstraints.CENTER, 1, 1, GridBagConstraints.BOTH, 1, 1);
        ajustarLayout(panelTeclas, teclaCinco, 1, 2, GridBagConstraints.CENTER, 1, 1, GridBagConstraints.BOTH, 1, 1);
        ajustarLayout(panelTeclas, teclaSeis, 2, 2, GridBagConstraints.CENTER, 1, 1, GridBagConstraints.BOTH, 1, 1);
        ajustarLayout(panelTeclas, teclaUm, 0, 3, GridBagConstraints.CENTER, 1, 1, GridBagConstraints.BOTH, 1, 1);
        ajustarLayout(panelTeclas, teclaDois, 1, 3, GridBagConstraints.CENTER, 1, 1, GridBagConstraints.BOTH, 1, 1);
        ajustarLayout(panelTeclas, teclaTres, 2, 3, GridBagConstraints.CENTER, 1, 1, GridBagConstraints.BOTH, 1, 1);
        ajustarLayout(panelTeclas, teclaIgual, 3, 3, GridBagConstraints.CENTER, 1, 2, GridBagConstraints.BOTH, 1, 1);
        ajustarLayout(panelTeclas, teclaZero, 0, 4, GridBagConstraints.CENTER, 2, 1, GridBagConstraints.BOTH, 1, 1);
        ajustarLayout(panelTeclas, teclaPonto, 2, 4, GridBagConstraints.CENTER, 1, 1, GridBagConstraints.BOTH, 1, 1);
        ajustarLayout(panelVisor, visor, 0, 0, GridBagConstraints.CENTER, 1, 1, GridBagConstraints.BOTH, 1, 1);
        ajustarLayout(this, panelVisor, 0, 0, GridBagConstraints.CENTER, 1, 1, GridBagConstraints.BOTH, 1, 0.2);
        ajustarLayout(this, panelTeclas, 0, 1, GridBagConstraints.CENTER, 1, 1, GridBagConstraints.BOTH, 1, 1);
    }

    private void ajustarLayout(Container container,JComponent comp, int coluna, int linha, int posicao, int largura, int altura, int preenche, double pesoX, double pesoY) {
        constraintsGridBagConstraints.gridx = coluna;
        constraintsGridBagConstraints.gridy = linha;
        constraintsGridBagConstraints.anchor = posicao;
        constraintsGridBagConstraints.gridwidth = largura;
        constraintsGridBagConstraints.gridheight = altura;
        constraintsGridBagConstraints.fill = preenche;
        constraintsGridBagConstraints.weightx = pesoX;
        constraintsGridBagConstraints.weighty = pesoY;
        constraintsGridBagConstraints.insets = new Insets( 5, 5, 5, 5 );
        layoutGridBagLayout.setConstraints(comp, constraintsGridBagConstraints);
        container.add(comp);
    }

    private void instanciarComponentes() {
        layoutGridBagLayout = new GridBagLayout();
        constraintsGridBagConstraints = new GridBagConstraints();
        visor = new Visor();
        teclaZero = new JButton("0");
        teclaUm = new JButton("1");
        teclaDois = new JButton("2");
        teclaTres = new JButton("3");
        teclaQuatro = new JButton("4");
        teclaCinco = new JButton("5");
        teclaSeis = new JButton("6");
        teclaSete = new JButton("7");
        teclaOito = new JButton("8");
        teclaNove = new JButton("9");
        teclaPonto = new JButton(".");
        teclaIgual = new JButton("=");
        teclaSubtracao = new JButton("-");
        teclaSoma = new JButton("+");
        teclaDivisao = new JButton("/");
        teclaMultiplicacao = new JButton("*");
        teclaLimpar = new JButton("C");
        panelVisor = new JPanel(layoutGridBagLayout);
        panelTeclas = new JPanel(layoutGridBagLayout);
    }

    private void definirFonte(JComponent... components) {
        for(JComponent component : components) {    
            component.setFont(new Font("arial",Font.PLAIN,18));
        }
    }
}
