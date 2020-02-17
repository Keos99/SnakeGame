import javax.swing.*;
import java.awt.*;

public class GameField extends JPanel {
    private final int SIZE = 320;
    private final int DOT_SIZE = 16;
    private final int ALL_DOTS = 400;
    private Image dot;
    private Image apple;
    private int[] x = new int[ALL_DOTS];
    private int[] y = new int[ALL_DOTS];
    private int dots;
    private Timer timer;
    private boolean left = false;
    private boolean right = false;
    private boolean up = false;
    private boolean down = false;
    private boolean inGame = false;


    public GameField(){
        setBackground(Color.BLACK);
        loadImages();
    }

    public void loadImages(){
        ImageIcon imageIconApple = new ImageIcon("apple.png");
        apple = imageIconApple.getImage();
        ImageIcon imageIconDot = new ImageIcon("dot.png");
        dot = imageIconDot.getImage();
    }
}
