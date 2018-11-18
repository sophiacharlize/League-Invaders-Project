import javax.swing.JFrame;

public class LeagueInvaders {

	int width = 500;
	int height = 800;
	JFrame frame = new JFrame();

	public static void main(String[] args) {
		LeagueInvaders x = new LeagueInvaders();
		x.setup();
	}

	public LeagueInvaders() {
		this.frame = frame;
	}

	public void setup() {
		frame.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void setDefaultCloseOperation(int exitOnClose) {
		// TODO Auto-generated method stub

	}

}
