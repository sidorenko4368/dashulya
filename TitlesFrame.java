package Tech_sol_lab2;

import javax.swing.SwingUtilities;
import java.awt.Component;
import javax.swing.JFrame;


/**
 * 
 * This class extends JFrame
 *
 */
public class TitlesFrame extends JFrame
{
    public TitlesFrame() {
        this.initUI();
    }
    /**
     * 
     * @deprecated initUI Here is we can set size and form. To change my program I set value of titlesPanel(97)
     */
    private void initUI() {
        this.setTitle("\u041a\u0440\u0438\u0432\u044b\u0435 \u0444\u0438\u0433\u0443\u0440\u044b");
        this.setDefaultCloseOperation(3);
        this.add(new TitlesPanel(97));
        this.setSize(350, 350);
        this.setLocationRelativeTo(null);
    }

    public static void main(final String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            
            /**
             * 
             * @deprecated run set our object visible
             */
            public void run() {
                final TitlesFrame ps = new TitlesFrame();
                ps.setVisible(true);
            }
        });
    }
}
