import java.math.BigDecimal;
import java.time.LocalDate;

public record Venda(
        Long id,
        String categoria,
        BigDecimal valor,
        LocalDate data) {
    public static Venda fromCsv(String linha) {
        String[] campos = linha.split(",");

        return new Venda(
                Long.parseLong(campos[0]),
                campos[1],
                new BigDecimal(campos[2]),
                LocalDate.parse(campos[3]));
    }
}