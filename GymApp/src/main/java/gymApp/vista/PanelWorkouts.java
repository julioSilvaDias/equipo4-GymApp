package gymApp.vista;

import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class PanelWorkouts {
	private JPanel panel = null;

	public PanelWorkouts(ArrayList<JPanel> paneles) {
		panel = new JPanel();
		panel.setBounds(0, 0, 1499, 878);
		panel.setOpaque(false);
		panel.setLayout(null);
		
		JLabel fondo = new JLabel("");
		fondo.setBounds(0, 0, 1489, 867);
		fondo.setIcon(new ImageIcon(PanelLogin.class.getResource("/images/WORKOUTS.png")));
		panel.add(fondo);
	}

	public JPanel getPanel() {
		return panel;
	}
}
