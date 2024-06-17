package Banco;
public class App {
    public static void main(String[] args) {
        Agencia agencia = new Agencia();
        agencia.setNumero(1);
       
        Cliente rogerio = new Cliente();
        rogerio.setNome("Rogerio");
       

        Banco banco = new Banco();
        banco.setNome("Meu Banco");

        Conta cc = new ContaCorrente(rogerio, agencia);
        cc.depositar(120);
      

        Conta cp = new ContaPoupanca(rogerio, agencia);
        cc.transferir(100, cp);
        

        banco.adicionarConta(cc);
        banco.adicionarConta(cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        System.out.println("Clientes do banco:");
        banco.listarClientes().forEach(cliente -> System.out.println(cliente.getNome()));
    }
}
