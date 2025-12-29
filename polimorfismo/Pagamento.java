
public class Pagamento {
    protected double valor;

    public Pagamento(double valor) {
        if(valor < 0 ) throw new IllegalArgumentException("Valor inválido");
        this.valor = valor;
    }
    
    public void processar() {
        System.out.println("Processando pagamento genérico de R$ " + valor);
    }
}
