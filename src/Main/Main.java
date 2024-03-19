package Main;

import Envio.EnvioCaja;
import Envio.EnvioCarta;
import Usuario.Usuario;
public class Main {
	public static void main(String[] args) {
		Usuario UsuarioEnviaDatoCaja = new Usuario(new EnvioCaja());
		Usuario UsuarioEnviaDatoCarta = new Usuario(new EnvioCarta());
		
		UsuarioEnviaDatoCaja.EnviarDato("Calle la Cuesta");
		UsuarioEnviaDatoCarta.EnviarDato("Calle Madrid ");
    }
}
