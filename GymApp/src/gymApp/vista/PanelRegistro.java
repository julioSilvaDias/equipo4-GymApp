package gymApp.vista;

import java.util.ArrayList;

import javax.swing.JPanel;

public class PanelRegistro {
	private JPanel panel = null;

	public PanelRegistro(ArrayList<JPanel> paneles) {
		panel = new JPanel();
		panel.setBounds(0, 0, 1499, 878);
		panel.setLayout(null);
	}

	public JPanel getPanel() {
		return panel;
	}
}
