// Willian Hiroshi da Silva Fukuda Gardini - 2209624

import java.util.List;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class GerFogo {
    private FogoPokemon fogo;
    private List<FogoPokemon> bdFogo;
    private static GerFogo gpUnic;

    private GerFogo() {
        bdFogo = new ArrayList<FogoPokemon>();
    }

    public static GerFogo geraGerFogo() {
        if (gpUnic == null) {
            gpUnic = new GerFogo();
        }
        return gpUnic;
    }

    public List<FogoPokemon> getBdFogo() {
        return bdFogo;
    }

    public FogoPokemon cadasPok(FogoPokemon fogo) {
        if (consPokNome(fogo) == null) {
            bdFogo.add(fogo);
            return fogo;
        } else {
            return null;
        }
    }

    public FogoPokemon consPokNome(FogoPokemon fogo) {
        for (int i = 0; i < bdFogo.size(); i++) {
            if (fogo.getNome().equals(bdFogo.get(i).getNome())) {
                return bdFogo.get(i);
            }
        }
        return null;
    }

    public FogoPokemon delPokNivel(FogoPokemon fogo) { 
        FogoPokemon fogo1 = consPokNome(fogo);
        if (fogo1 != null) {
            bdFogo.remove(fogo1);
            return null;
        } else {
            return fogo;
        }
    }

    public FogoPokemon atualizaPokNivel(FogoPokemon fogo) {
        for (int i = 0; i < bdFogo.size(); i++) {
            if (fogo.getNivel() == bdFogo.get(i).getNivel()) {
                fogo = bdFogo.get(i);
                String nome = JOptionPane.showInputDialog(null, "Informe o NOVO nome", "NOVO NOME", 3);
                fogo.setNome(nome);
                bdFogo.set(i, fogo);
                return bdFogo.get(i);
            }
        }
        return null;
    }
}
