import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class ImagePanel extends JPanel{
	 private Image img;
	 
	 public ImagePanel(Image img) {
		 this.img = img;
		 setSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		 setLayout(null);
	 }
	 
	 public void paintComponent(Graphics g) {
		 g.drawImage(img, 0, 0, null);
	 }
}

public class Image {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Input img");
		frame.setSize(640, 480);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
