
public class TestReferencia {

	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta(0);
		primeraCuenta.saldo = 200;
		
		Cuenta segundaCuenta = primeraCuenta;
		segundaCuenta.saldo = 100;
		
		System.out.println("Saldo primera Cuenta: "+ primeraCuenta.saldo);
		System.out.println("Saldo segunda Cuenta: "+ segundaCuenta.saldo);
		
		segundaCuenta.saldo += 400;
		System.out.println("Saldo segunda Cuenta: "+ segundaCuenta.saldo);
	}
}
