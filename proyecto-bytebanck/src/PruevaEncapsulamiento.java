
public class PruevaEncapsulamiento {
	
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(0);
		Cliente cliente = new Cliente();
		cliente.setNombre("Diego");
		cliente.setDocumento("f24f4253f34");
		
		cuenta.setTitular(cliente);
		
		System.out.println(cliente.getNombre());
		System.out.println(cuenta.getTitular().getNombre());
	}

}
