import java.awt.AWTException;
import java.awt.Image;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SystrayTest {
	
	static Image image = Toolkit.getDefaultToolkit().getImage("icon.bmp");

	static TrayIcon trayIcon = new TrayIcon(image, "Tester2");

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if (SystemTray.isSupported()) {
		      SystemTray tray = SystemTray.getSystemTray();

		      trayIcon.setImageAutoSize(true);
		      trayIcon.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent e) {
		          System.out.println("In here");
		          trayIcon.displayMessage("Tester!", "Some action performed", TrayIcon.MessageType.INFO);
		        }
		      });

		      try {
		        tray.add(trayIcon);
		      } catch (AWTException e) {
		        System.err.println("TrayIcon could not be added.");
		      }
		    }

	}

}
