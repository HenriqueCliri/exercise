

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Analizador {
    public static void main(String[] args) {
        Path caminhoArquivo = Paths.get("./analizador-vendas/vendas.csv");

        try(Stream<String> linhas = Files.lines(caminhoArquivo)) {

            List<Venda> vendas = linhas
                .skip(1)
                .map(Venda::fromCsv)
                .toList();

            vendas.stream()
            .forEach(System.out::println);


            BigDecimal total = vendas.stream()
            .map(Venda::valor)
            .reduce(BigDecimal.ZERO, (ac, valorAtual) -> ac.add(valorAtual));
            
            System.out.println("Soma do valor total de produtos: " + total);

            //=====SOMA TOTAL para cada categoria====//
            Map<String , BigDecimal> totalPorCategoria = vendas.stream()
            .collect(Collectors.groupingBy(
                Venda::categoria, Collectors.reducing(BigDecimal.ZERO, Venda::valor, BigDecimal::add)
            ));

            totalPorCategoria.forEach((categoria, totalVenda) -> {
                System.out.println(categoria + "R$ " + totalVenda);
            });
        } catch (IOException e) {
                System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }


    }
}
