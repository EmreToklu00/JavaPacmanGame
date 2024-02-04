import java.awt.EventQueue;
import javax.swing.JFrame;

public class Pacman extends JFrame {

    public Pacman() {
        initUI();
    }

    public static final int WIDTH = 660;
    public static final int HEIGHT = 720;

    private void initUI() {
        add(new MainGameEngine());
        setTitle("Java Pacman Game");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(Pacman::new);
    }
}
