
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2018
 *    Level 1
 */

import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class SimonSays extends KeyAdapter {

	// Complete steps 1 - 7 before you test
	// 1. Declare a JFrame variable
	JFrame Thanos = new JFrame();
	HashMap<Integer, String> images = new HashMap<Integer, String>();
	private int imageIndex;
	private int tries = 0;
	private boolean simonSays = false;
	Date timeAtStart;

	private void makeAlbum() {
		// 2. Add the four images that match keyboard keys like this:
		images.put(null, "up.jpg");
		images.put(null, "down.jpg");
		images.put(null, "left.jpg");
		images.put(null, "right.jpg");

		// 3. Use a JOptionPane to tell the user the rules: "Press the matching key when
		// 'Simon says' otherwise press a different key"
		JOptionPane.showMessageDialog(null, "Press the matching key when 'Simon says' otherwise press a different key");
		// 4. Call the showImage method to show an image
		showImage();
	}

	public void keyPressed(KeyEvent e) {
		// 15. Make a points variable to track the score.
		int points=0;
		// 16. If the keyCode matches the imageIndex and "Simon says"
		if (simonSays==images.containsKey(images)) {
			points=points+1;
			speak("You are correct");
		}
		// 17. Increase the value of score
		if (simonSays!=images.containsKey(images)) {
			points=points+1;
			speak("You are correct");
		}
			// 18. Use the speak method to tell the user they were correct
		
		// 19. If the keyCode doesn't match the imageIndex and "Simon didn't say..."

		// 20. Increase the value of score

		// 21. Use the speak method to tell the user they were correct

		// 22. Increment tries by 1
tries=tries+1;
		// 25. If tries is greater than 9 (or however many you want)...
		if (tries==9) {
			speak("your score is "+points);
			System.exit(points);
			Thanos.dispose();
			showImage();
		}
		// 26. Tell the user their score

		// 27. Exit the program
		
		// 23. Dispose of the frame
		
		// 24. Call the showImage method to show a new image
		
	}

	private void showImage() {
		// 5. Initialize your frame to a new JFrame()
		JFrame Bill = new JFrame();

		// 6. Set the frame to visible
		Bill.setVisible(true);
		// 7. Uncomment the following line to add a random image to your frame
Bill.add(getNextRandomImage());
		
		// 8. Set the name of your frame
Bill.setName("Po");
		// 9. Pack the frame
Bill.pack();
		// 10. Set the defaultCloseOperation of your from to JFrame.EXIT_ON_CLOSE
Bill.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// 11. Add a key listener to the frame
Bill.addKeyListener(null);
		// 12. Create a new instance of Random
Random instance = new Random();
		// 13. Use the Random and the speak method to either say
// "Simon says press this key" or "Press this key"

int a = instance.nextInt(2);
		System.out.println(instance);
		if (a==0) {
			speak("Simon says press this key");
		}
		else {
			speak("Press this key");
		}
		// 14. Above, set the value of simonSays to true/false appropriately
	}

	private Component getNextRandomImage() {
		this.imageIndex = new Random().nextInt(4) + 37;
		return loadImage(images.get(imageIndex));
	}

	private JLabel loadImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		new SimonSays().makeAlbum();
	}


/*
 * BONUS! Add a timer : ~~~ where the code starts running 
 timeAtStart = newDate();
 *
 Date timeAtEnd = new Date();
 System.out.println((timeAtEnd.getTime()-timeAtStart.getTime())/1000);
 System.exit(0);
 */

} 