package gymApp.logica;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

import javax.swing.JOptionPane;

import gymApp.bbdd.gestor.GestorUsuario;
import gymApp.bbdd.pojos.Usuario;

public class controladorLogin {

	public boolean checkLogin(String login, String password, boolean comprobando) throws InterruptedException, ExecutionException, IOException {

		GestorUsuario gestorUsuario = new GestorUsuario();

		Usuario user = gestorUsuario.obtenerUserAndPassword(login, password);

		if (null == user.getName()) {
			
			JOptionPane.showMessageDialog(null, "User does not exist");
		} else if (user.getName().equals(login) && user.getPassword().equals(password)) {
			JOptionPane.showMessageDialog(null, "Corret Login");
		} else {
			JOptionPane.showMessageDialog(null, "incorrect username or password");
		}
		
		return comprobando;

	}

}