import java.util.ArrayList;
import java.util.List;

public class SistemaFinanceiro {
    public static void main(String[] args) {
        Pagamento p1 = new PagamentoPix(100.00);
        Pagamento p2 = new PagamentoCartao(350.00);
        
        List<Pagamento> listaDePagamentos = new ArrayList<>();
        
        listaDePagamentos.add(p1);
        listaDePagamentos.add(p2);
    
        for(Pagamento p : listaDePagamentos) {
            p.processar();
        }
    } 
}
