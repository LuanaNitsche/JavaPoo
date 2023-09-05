public class PrincipalContaCorrente {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("João");
        System.out.println(cc.fazerDeposito(950.0));
        System.out.println(cc.getStatusContaCorrente());
        System.out.println(cc.fazerRetirada(1000.0));
        ContaCorrente contaDest = new ContaCorrente("Maria", 50.0);
        System.out.println(cc.fazerTransferencia(contaDest, 500.0));
    }
}
