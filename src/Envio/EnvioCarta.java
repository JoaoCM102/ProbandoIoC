package Envio;

public class EnvioCarta implements Envio{
	@Override
	public void enviar(String mensaje) {
		System.out.println("Enviando carta a la direccion : " + mensaje);
	}
}
