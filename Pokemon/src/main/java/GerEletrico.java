// Willian Hiroshi da Silva Fukuda Gardini - 2209624

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GerEletrico {
    private EletricoPokemon eletrico;
    private List<EletricoPokemon> bdEletrico;
    private static GerEletrico gpUnic;

    private GerEletrico() {
        bdEletrico = new ArrayList<EletricoPokemon>();
    }

    public static GerEletrico geraGerEletrico() {
        if (gpUnic == null) {
            gpUnic = new GerEletrico();
        }
        return gpUnic;
    }

    public List<EletricoPokemon> getBdEletrico() {
        return bdEletrico;
    }

    public EletricoPokemon cadasPok(EletricoPokemon eletrico) {
        if (consPokNome(eletrico) == null) {
            bdEletrico.add(eletrico);
            return eletrico;
        } else {
            return null;
        }
    }

    public EletricoPokemon consPokNome(EletricoPokemon eletrico) {
        for (int i = 0; i < bdEletrico.size(); i++) {
            if (eletrico.getNome().equals(bdEletrico.get(i).getNome())) {
                return bdEletrico.get(i);
            }
        }
        return null;
    }

    public EletricoPokemon delPokNivel(EletricoPokemon eletrico) {
        EletricoPokemon eletrico1 = consPokNome(eletrico);
        if (eletrico1 != null) {
            bdEletrico.remove(eletrico1);
            return null;
        } else {
            return eletrico;
        }
    }

    public EletricoPokemon atualizaPokNivel(EletricoPokemon eletrico) {
        for (int i = 0; i < bdEletrico.size(); i++) {
            if (eletrico.getNivel() == bdEletrico.get(i).getNivel()) {
                eletrico = bdEletrico.get(i);
                String nome = JOptionPane.showInputDialog(null, "Informe o NOVO nome", "NOVO NOME", 3);
                eletrico.setNome(nome);
                bdEletrico.set(i, eletrico);
                return bdEletrico.get(i);
            }
        }
        return null;
    }
}
