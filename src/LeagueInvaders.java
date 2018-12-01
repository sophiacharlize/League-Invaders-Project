import java.awt.Dimension;

import javax.swing.JFrame;

public class LeagueInvaders {

	int width = 500;
	int height = 800;
	JFrame frame;
	GamePanel g;

	public static void main(String[] args) {
		LeagueInvaders x = new LeagueInvaders();
		x.setup();
	}

	public LeagueInvaders() {
		frame = new JFrame();
		g = new GamePanel();
	}

	public void setup() {

		frame.add(g);
		frame.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setPreferredSize(new Dimension(width, height));
		frame.pack();
		g.startGame();
		frame.addKeyListener(g);
	}

	private void setDefaultCloseOperation(int exitOnClose) {
		// TODO Auto-generated method stub

	}

}
