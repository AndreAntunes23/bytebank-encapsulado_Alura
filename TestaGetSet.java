public class TestaGetSet {

	public static void main(String[] args) {
		Conta conta = new Conta(0, 0);
		//conta.numero = 1337;
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente Z = new Cliente();
		//conta.titular = Z;
		Z.setNome("ZY");
		
		conta.setTitular(Z);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		//agora em duas linhas:
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programador");
		
		System.out.println(titularDaConta);
		System.out.println(Z);
		System.out.println(conta.getTitular());
	}
}