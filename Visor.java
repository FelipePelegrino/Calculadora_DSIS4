import javax.swing.JTextArea;
import java.awt.Font;

public class Visor extends JTextArea {
    
    public Visor() {
        super();
        setEditable(false);
        setOpaque(false);
        setFont(new Font("arial",Font.PLAIN,18));
    }

    public void limparVisor() {
        setText(null);
    }

    public void escreverVisor(String string) {
        if(getText().matches("^[0-9,.]+$")) {
            setText(getText() + string);
        }
        else
            setText(string);
    }
}
