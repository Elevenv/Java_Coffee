import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Muhammad Anas
 */
public class ClearingJframe
{
    private static JFrame mainWindow;
    public static void main(String[] args)
    {
        mainWindow = new JFrame( "Clearing a JFrame" );
        mainWindow.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        JButton button1 = new JButton( "First Button" );
        mainWindow.add( button1 );
        button1.addActionListener(
            new ActionListener()
            {
                public void actionPerformed( ActionEvent eve )
                {
                    mainWindow.removeAll();
                }
            }
        );

        mainWindow.pack();
        mainWindow.setLocation( 500, 500 );
        mainWindow.setVisible( true );
    }
}