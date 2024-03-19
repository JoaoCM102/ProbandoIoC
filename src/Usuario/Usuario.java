package Usuario;

import Envio.Envio;

public class Usuario {
	private Envio envio;
	
	public Usuario(Envio envio) {
		this.envio = envio;
	}
	
	public void EnviarDato(String mensaje) {
		envio.enviar(mensaje);
	}
}
