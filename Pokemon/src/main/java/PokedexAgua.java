// Willian Hiroshi da Silva Fukuda Gardini - 2209624

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author wwwil
 */
public class PokedexAgua extends javax.swing.JFrame {
    private AguaPokemon a1 = new AguaPokemon();
    
    private GerAgua ga = GerAgua.geraGerAgua();
    
    private static PokedexAgua pokUnic;
    /**
     * Creates new form Pokedex
     */
    private PokedexAgua() {
        initComponents();
    }

    public static PokedexAgua geraPokedexAgua(){
        if(pokUnic == null){
            pokUnic = new PokedexAgua();
        }
        return pokUnic;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        cxNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cxNivel = new javax.swing.JTextField();
        cxBolha = new javax.swing.JRadioButton();
        cxAquaJato = new javax.swing.JRadioButton();
        cxMergulho = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btCadastrar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nome:");

        cxNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxNomeActionPerformed(evt);
            }
        });

        jLabel2.setText("Nivel:");

        buttonGroup1.add(cxBolha);
        cxBolha.setText("Bolha");
        cxBolha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxBolhaActionPerformed(evt);
            }
        });

        buttonGroup1.add(cxAquaJato);
        cxAquaJato.setText("Aqua Jato");

        buttonGroup1.add(cxMergulho);
        cxMergulho.setText("Mergulho");

        jLabel3.setText("Ataque:");

        jLabel4.setText("Informações Pokemon de Água");

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btConsultar.setText("Consultar");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxNome))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cxBolha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxAquaJato)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxMergulho))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cxNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(jLabel3)))))
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btConsultar)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btCadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btAlterar)))
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(90, 90, 90))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cxNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxAquaJato)
                    .addComponent(cxMergulho)
                    .addComponent(cxBolha))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btExcluir)
                    .addComponent(btAlterar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btConsultar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cxBolhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxBolhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxBolhaActionPerformed

    private void cxNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxNomeActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        cadastrar();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        excluirPok();        // TODO add your handling code here:
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        alterarPok();
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        consultaPok();
    }//GEN-LAST:event_btConsultarActionPerformed
    public void cadastrar() {
        try {
            validarNome(cxNome.getText());
            validarNivel(cxNivel.getText());

            a1 = new AguaPokemon();
            a1.setNome(cxNome.getText());
            a1.setNivel(Integer.parseInt(cxNivel.getText()));

            if (cxAquaJato.isSelected()) {
                a1.setAquaJato("Aqua Jato");
                a1.setPoder("Aqua Jato");
            } else if (cxBolha.isSelected()) {
                a1.setBolha("Bolha");
                a1.setPoder("Bolha");
            } else if (cxMergulho.isSelected()) {
                a1.setMergulho("Mergulho");
                a1.setPoder("Mergulho");
            }

            a1 = ga.cadasPok(a1);

            if (a1 != null) {
                JOptionPane.showMessageDialog(null, "Pokemon de Agua cadastrado com sucesso!", "Cadastro de Pokemons de Agua", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Pokemon ja Existente!", "Cadastro de Pokemons de Agua", 0);
            }
        } catch (NomeInvalidoException | NivelInvalidoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de Validacão", JOptionPane.ERROR_MESSAGE);
        }
    }
    
     public void excluirPok() {
        try {
            validarNome(cxNome.getText());

            a1 = new AguaPokemon();
            a1.setNome(cxNome.getText());

            a1 = ga.delPokNivel(a1);

            if (a1 == null) {
                JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso!", "EXCLUSÃO DE DADOS", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Pokemon de Agua INEXISTENTE", "EXCLUSÃO DE DADOS", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NomeInvalidoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de Validacão", JOptionPane.ERROR_MESSAGE);
            cxNome.requestFocus();
        }
    }

    public void alterarPok() {
        try {
            validarNivel(cxNivel.getText());

            a1 = new AguaPokemon();
            a1.setNivel(Integer.parseInt(cxNivel.getText()));

            a1 = ga.atualizaPokNivel(a1);

            if (a1 != null) {
                cxNivel.setText(Integer.toString(a1.getNivel()));
                cxNome.setText(a1.getNome());

                JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!", "ALTERAÇÃO DE DADOS", 1);

            } else {
                JOptionPane.showMessageDialog(null, "CPF inexistente", "ALTERAÇÃO DE DADOS", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NivelInvalidoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de Validacão", JOptionPane.ERROR_MESSAGE);
            cxNivel.requestFocus();
        }
    }

    public void consultaPok() {
        try {
            validarNome(cxNome.getText());

            a1 = new AguaPokemon();
            a1.setNome(cxNome.getText());

            a1 = ga.consPokNome(a1);

            if (a1 != null) {
                cxNivel.setText(Integer.toString(a1.getNivel()));
                cxNome.setText(a1.getNome());

                if (a1.getAquaJato().equalsIgnoreCase("Aqua Jato")) {
                    cxAquaJato.setSelected(true);
                } else if (a1.getBolha().equalsIgnoreCase("Bolha")) {
                    cxBolha.setSelected(true);
                } else {
                    cxMergulho.setSelected(true);
                }

                JOptionPane.showMessageDialog(null, "Confira os dados", "CONSULTA DE POKEMON", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Pokemon inexistente!", "CONSULTA DE POKEMON", 0);
            }
        } catch (NomeInvalidoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de Validacão", JOptionPane.ERROR_MESSAGE);
            cxNome.requestFocus();
        }
    }
    
    private void validarNome(String nome) throws NomeInvalidoException {
        if (!nome.matches("[a-zA-Z]+")) {
            throw new NomeInvalidoException("O nome deve conter apenas letras.");
        }
    }

    private void validarNivel(String nivel) throws NivelInvalidoException {
        try {
            Integer.parseInt(nivel);
        } catch (NumberFormatException e) {
            throw new NivelInvalidoException("O nível deve ser um número inteiro.");
        }
    }

    


  
    public static void main(String args[]) {
     


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PokedexAgua().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btExcluir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton cxAquaJato;
    private javax.swing.JRadioButton cxBolha;
    private javax.swing.JRadioButton cxMergulho;
    private javax.swing.JTextField cxNivel;
    private javax.swing.JTextField cxNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
