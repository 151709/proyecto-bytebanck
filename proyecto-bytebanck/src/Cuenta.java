
class Cuenta {
	
	double saldo;
	int agencia;
	private int numero;
	Cliente titular = new Cliente();
	
	public static int total = 0;
	
	public Cuenta(int agencia) {
		if(agencia <= 0) {
			System.out.println("No sepermite 0");
			this.agencia = 1;
		}else {
			this.agencia = agencia;
		}
		total++;
		System.out.println("Se van creando: " + total + " cuentas");
	}
	
	public void Cuenta11(int agencia2) {
		// TODO Auto-generated constructor stub
	}

	public void Cuenta1(int agencia2) {
		// TODO Auto-generated constructor stub
	}

	public void depositar(double valor) {
		saldo = saldo + valor;
	}
	
	public boolean retirar(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transferir(double valor, Cuenta cuenta) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			cuenta.depositar(valor);
			return true;
		} else {
			return false;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	//public void setAgencia(int agencia) {
		//if(agencia > 0) {
		//	this.agencia = agencia;
	//	}else {
		//	System.out.println("No estan permitidos numeros negativos");
	//	}
	//}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Cuenta.total;
	}

	public void setAgencia1(int i) {
		// TODO Auto-generated method stub
		
	}

	public void setAgencia(int i) {
		// TODO Auto-generated method stub
		
	}

}
