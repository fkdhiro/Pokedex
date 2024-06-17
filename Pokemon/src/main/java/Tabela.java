// Willian Hiroshi da Silva Fukuda Gardini - 2209624

import javax.swing.table.DefaultTableModel;


public class Tabela extends javax.swing.JFrame {
    private static Tabela tabUnic;
    
  
    public Tabela() {
        initComponents();
    }
    
    
    public static Tabela geraTabela(){
        if(tabUnic == null){
            tabUnic = new Tabela();
        }
        return tabUnic;
    }
    
    public void listTabAgua(){
        DefaultTableModel modelo = (DefaultTableModel)tabAgua.getModel();
        int posLin =0;
        modelo.setRowCount(posLin);
        for(AguaPokemon a1 : GerAgua.geraGerAgua().getBdAgua()){
            modelo.insertRow(posLin, new Object[]{a1.getNome(),a1.getNivel(),a1.getPoder()});
            posLin++;
        }
    }
    
    public void listTabFogo(){
        DefaultTableModel modelo = (DefaultTableModel)tabFogo.getModel();
        int posLin =0;
        modelo.setRowCount(posLin);
        for(FogoPokemon f1 : GerFogo.geraGerFogo().getBdFogo()){
            modelo.insertRow(posLin, new Object[]{f1.getNome(),f1.getNivel(),f1.getPoder()});
            posLin++;
        }
    }
    
    public void listTabEletrico(){
    DefaultTableModel modelo = (DefaultTableModel)tabEletrico.getModel(); 
    int posLin = 0;
    modelo.setRowCount(posLin);
    
    for(EletricoPokemon e1 : GerEletrico.geraGerEletrico().getBdEletrico()){ 
        modelo.insertRow(posLin, new Object[]{e1.getNome(), e1.getNivel(), e1.getPoder()}); 
        posLin++;
    }
}

    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabAgua = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabEletrico = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabFogo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        tabAgua.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Pokemon", "Nivel", "Ataque"
            }
        ));
        jScrollPane1.setViewportView(tabAgua);

        tabEletrico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Pokemon", "Nivel", "Ataque"
            }
        ));
        jScrollPane2.setViewportView(tabEletrico);

        tabFogo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Pokemon", "Nivel", "Ataque"
            }
        ));
        jScrollPane3.setViewportView(tabFogo);

        jLabel1.setText("Pokemons de Fogo");

        jLabel2.setText("Pokemons de Água");

        jLabel3.setText("Pokemons Elétricos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jLabel1)
                .addGap(338, 338, 338)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(350, 350, 350))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(401, 401, 401)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listTabAgua();
        listTabFogo();
        listTabEletrico();
    }//GEN-LAST:event_formWindowActivated

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tabAgua;
    private javax.swing.JTable tabEletrico;
    private javax.swing.JTable tabFogo;
    // End of variables declaration//GEN-END:variables
}
