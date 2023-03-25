public class TesteGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 64712);

        Cliente walter = new Cliente();
        walter.setNome("Walter Turcatti");

        conta.setTitular(walter);

        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("programador");

    }
}