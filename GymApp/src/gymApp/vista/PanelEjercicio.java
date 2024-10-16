package gymApp.vista;

import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelEjercicio {
	private JPanel panel=null;
	public PanelEjercicio(ArrayList<JPanel> paneles) {
		panel = new JPanel();
		panel.setBounds(0, 0, 1499, 878);
		panel.setLayout(null);
		
		JLabel fondo = new JLabel("");
		fondo.setIcon(new ImageIcon(PanelEjercicio.class.getResource("/images/EJERCICIO.png")));
		fondo.setBounds(0, 0, 1489, 867);
		panel.add(fondo);
	}
	
	public JPanel getPanel() {
		return panel;
	}
}
