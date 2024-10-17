import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class Historico {
    List<Registro> historico = new LinkedList<>();

    public void logHistorico(String pesquisa) {
        Registro data = new Registro(pesquisa, LocalDateTime.now());
        historico.add(data);
    }

    public void exibirHistorico() {
        if (!historico.isEmpty()) {
            historico.forEach(System.out::println);
        } else {
            System.out.println("Você ainda não fez nenhuma pesquisa!");
        }
    }
}
