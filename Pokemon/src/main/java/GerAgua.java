// Willian Hiroshi da Silva Fukuda Gardini - 2209624

import java.util.List;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class GerAgua {
    private AguaPokemon agua;
    private List<AguaPokemon> bdAgua;
    private static GerAgua gpUnic;

    private GerAgua() {
        bdAgua = new ArrayList<AguaPokemon>();
    }

    public static GerAgua geraGerAgua() {
        if (gpUnic == null) {
            gpUnic = new GerAgua();
        }
        return gpUnic;
    }

    public List<AguaPokemon> getBdAgua() {
        return bdAgua;
    }

    public AguaPokemon cadasPok(AguaPokemon agua) {
        if (consPokNome(agua) == null) {
            bdAgua.add(agua);
            return agua;
        } else {
            return null;
        }
    }


    public AguaPokemon consPokNome(AguaPokemon agua) {
        for (int i = 0; i < bdAgua.size(); i++) {
            if (agua.getNome().equals( bdAgua.get(i).getNome())) {
                return bdAgua.get(i);
            }
        }
        return null;
    }

    public AguaPokemon delPokNivel(AguaPokemon agua) {
        AguaPokemon agua1 = consPokNome(agua);
        if (agua1 != null) {
            bdAgua.remove(agua1);
            return null;
        } else {
            return agua;
        }
    }

    public AguaPokemon atualizaPokNivel(AguaPokemon agua) {
        for (int i = 0; i < bdAgua.size(); i++) {
            if (agua.getNivel() == bdAgua.get(i).getNivel()) {
                agua = bdAgua.get(i);
                String nome = JOptionPane.showInputDialog(null, "Informe o NOVO nome", "NOVO NOME", 3);
                agua.setNome(nome);
                bdAgua.set(i, agua);
                return bdAgua.get(i);
            }
        }
        return null;
    }
    
}