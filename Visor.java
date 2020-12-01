import javax.swing.JTextArea;

public class Visor extends JTextArea {
    
    public Visor() {
        super();
        setEditable(false);
        setOpaque(false);
    }

    public void limparCampos() {
        setText(null);
    }

    public void escreverVisor(String string) {
        setText(string);
    }

}
