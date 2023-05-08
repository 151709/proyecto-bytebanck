
public class CrearCuenta {
    
    public static void main(String[] args) {
        
        
        Cuenta primeraCuenta = new Cuenta(0);
        primeraCuenta.depositar(1000);
        
        System.out.println(primeraCuenta.getSaldo());
        
        Cuenta segundaCuenta = new Cuenta(0);
        segundaCuenta.depositar(500);
        
        System.out.println(segundaCuenta.getSaldo());
        System.out.println(primeraCuenta.getAgencia());
    }

}
