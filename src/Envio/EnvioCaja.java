package Envio;

public class EnvioCaja implements Envio{
	@Override
	public void enviar(String mensaje) {
		System.out.println("Caja enviada a la direccion: " + mensaje);
	}
}
