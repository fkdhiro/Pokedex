// Willian Hiroshi da Silva Fukuda Gardini - 2209624

public class Pokemon {
    private String nome;
    private int nivel;

    public Pokemon() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void mostrarStatus() {
        System.out.println("Nome: " + getNome());
        System.out.println("Nivel: " + getNivel());
    }

    // Sobrecarga
    public void usarAtaque() {
    }

    // Sobrecarga
    public void usarAtaque(String ataqueEspecial) {
        System.out.println("Usou ataque especial: " + ataqueEspecial);
    }

    @Override
    public String toString() {
        return getNome();
    }
}
