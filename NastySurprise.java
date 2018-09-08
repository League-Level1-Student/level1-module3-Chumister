import javax.swing.JOptionPane;

public class NastySurprise {
	String Halloween = JOptionPane.showConfirmDialog(null, "What do you want?");
	private void showPictureFromTheInternet(String imageUrl) {
	     try {
	          URL url = new URL(dowload.jpg);
	          Icon icon = new ImageIcon(url);
	          JLabel imageLabel = new JLabel(icon);
	          JFrame frame = new JFrame();
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (MalformedURLException e) {
	          e.printStackTrace();
	     }
	}





}
