public class TestaMetodo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.saldo = 100;
        conta.deposita(50);
        System.out.println(conta.saldo);
        conta.saca(170);
        System.out.println(conta.saldo);

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000);

        if(contaDaMarcela.transfere(3000, conta)) {
            System.out.println("transferencia feita com sucesso");
        } else {
            System.out.println("faltou saldo");
        }

        System.out.println(contaDaMarcela.saldo);
        System.out.println(conta.saldo);
    }

}
