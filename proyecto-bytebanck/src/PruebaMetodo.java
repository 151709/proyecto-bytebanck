
public class PruebaMetodo {
	
	public static void main(String[] args) {
		Cuenta miCuenta = new Cuenta(0);
		miCuenta.saldo = 300;
		miCuenta.depositar(200);
		System.out.println(miCuenta.saldo);
		
		miCuenta.retirar(100);
		System.out.println(miCuenta.saldo);
		
		Cuenta cuentaDeJimena = new Cuenta(0);
		cuentaDeJimena.depositar(1000);
		boolean puedeTransferir = (cuentaDeJimena.transferir(400, miCuenta));
		
		if(puedeTransferir) {
			System.out.println("Transferencia exitosa");
		} else {
			System.out.println("No se puede transferir");
		}
		
		
		System.out.println(cuentaDeJimena.saldo);
		System.out.println(miCuenta.saldo);
	}

}
