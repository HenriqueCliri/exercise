
public class PagamentoCartao extends Pagamento {
    
    private String valor;

    public PagamentoCartao(double valor) {
        super(valor);
    }

    @Override
    public void processar() {
        System.out.println("Conectando com a operadora de carão para cobrar R$ " + valor);
    }
}
