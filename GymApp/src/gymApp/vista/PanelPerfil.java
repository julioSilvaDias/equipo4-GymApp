package gymApp.vista;

import java.util.ArrayList;

import javax.swing.JPanel;

public class PanelPerfil {
	private JPanel panel=null;
	public PanelPerfil(ArrayList<JPanel> paneles) {
		panel = new JPanel();
		panel.setBounds(0, 0, 1499, 878);
		panel.setLayout(null);
	}
	
	public JPanel getPanel() {
		return panel;
	}
}
