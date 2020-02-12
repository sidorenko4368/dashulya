package Tech_sol_lab2;

import javax.swing.SwingUtilities;
import java.awt.Component;
import javax.swing.JFrame;



public class TitlesFrame extends JFrame
{
    public TitlesFrame() {
        this.initUI();
    }

    private void initUI() {
        this.setTitle("\u041a\u0440\u0438\u0432\u044b\u0435 \u0444\u0438\u0433\u0443\u0440\u044b");
        this.setDefaultCloseOperation(3);
        this.add(new TitlesPanel(53));
        this.setSize(350, 350);
        this.setLocationRelativeTo(null);
    }

    public static void main(final String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            

            public void run() {
                final TitlesFrame ps = new TitlesFrame();
                ps.setVisible(true);
            }
        });
    }
}
