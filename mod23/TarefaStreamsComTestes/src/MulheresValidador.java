import java.util.ArrayList;
import java.util.List;

public class MulheresValidador {

    List<Pessoa> mulheres = new ArrayList<>();

    public void adicionaMulheres(List<Pessoa> pessoas) {
        for (Pessoa p : pessoas){
            if (p.getGenero().equals("feminino")) {
                mulheres.add(p);
            }
        }
    }

    public static boolean isSomenteMulheres(List<Pessoa> mulheres){
        return mulheres.stream().allMatch(pessoa -> pessoa.getGenero().equals("feminino"));
    }




}
