
public class TestReferencia2 {
	
	public static void main(String[] args) {
		Cliente diego = new Cliente();
		diego.nombre = "Diego";
		diego.documento = "1234567890";
		diego.telefono = "449108618";
		
		Cuenta cuentaDeDiego = new Cuenta(0);
		cuentaDeDiego.agencia = 1;
		cuentaDeDiego.titular = diego;
		
		System.out.println(cuentaDeDiego.titular.documento);
	}

}
