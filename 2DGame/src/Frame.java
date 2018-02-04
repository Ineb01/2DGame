import javax.swing.JFrame;

public class Frame extends JFrame {

	private static final long serialVersionUID = 1L;

	public Frame() {
		super("2DGame");

		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setUndecorated(true);

		this.add(new GamePlane());

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Frame();
	}

}
