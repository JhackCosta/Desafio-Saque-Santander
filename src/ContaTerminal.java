
public class ContaTerminal {

	public static void main(String[] args) {

		simulaReinicializacao(25, 18);
		simulaReinicializacao(15, 22);
		
	}

	public static void simulaReinicializacao(double saldo, double valorSolicitado) {
		if (saldo > valorSolicitado) {
			saldo = saldo - valorSolicitado;
		} else {
			System.out.println("Saldo insuficiente");
		}
		System.out.println(saldo);

	}
}
