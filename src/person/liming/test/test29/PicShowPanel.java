package person.liming.test.test29;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;

import javax.swing.JPanel;

public class PicShowPanel extends JPanel {
	
	Image image;
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		if(image != null){
			g.drawImage(image, 0, 0, this);
		}
	}
	
	public void setImage(File file){
		System.out.println(file.getAbsolutePath());
		Image image = Toolkit.getDefaultToolkit().getImage(file.getAbsolutePath());
		this.setImage(image);
	}
	
	public void setImage(Image image){
		this.image = image;
		repaint();
	}
}
