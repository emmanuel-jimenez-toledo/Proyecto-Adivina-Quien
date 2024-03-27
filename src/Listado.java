/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */

/**
 *
 * @author toled
 */
public class Listado extends javax.swing.JDialog {

    /**
     * Creates new form Listado_de_personajes
     */
    public Listado(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_TituloPersonajes = new javax.swing.JLabel();
        jLabel_Expli1 = new javax.swing.JLabel();
        jLabel_Expli2 = new javax.swing.JLabel();
        jLabel_Expli3 = new javax.swing.JLabel();
        jScrollPane_Reales = new javax.swing.JScrollPane();
        jListReales = new javax.swing.JList<>();
        jScrollPane_Imaginarios = new javax.swing.JScrollPane();
        jListImaginarios = new javax.swing.JList<>();
        jScrollPane_Animales = new javax.swing.JScrollPane();
        jListAnimales = new javax.swing.JList<>();
        jLabel_Reales = new javax.swing.JLabel();
        jLabel_Imaginarios = new javax.swing.JLabel();
        jLabel_Animales = new javax.swing.JLabel();
        jButton_Salir = new javax.swing.JButton();
        jButton_regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel_TituloPersonajes.setFont(new java.awt.Font("Mistral", 2, 24)); // NOI18N
        jLabel_TituloPersonajes.setText("Personajes");

        jLabel_Expli1.setText("Los personajes que puede adivinar el programa son 30,");

        jLabel_Expli2.setText("los personajes se clasificaron en 3 categorias, para mayor comprensión.");

        jLabel_Expli3.setText("A continuación se mostrarán los personajes:");

        jListReales.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "1. Iósif Stalin", "2. Taylor Swift", "3. Freddy Mercurie", "4. Porfirio Díaz", "5. Omar Chaparro", "6. Chespirito", "7. Will Smith", "8. Leonardo di Caprio", "9. Ariana Grande", "10. Michelle Obama" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane_Reales.setViewportView(jListReales);

        jListImaginarios.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "1. Iron Man", "2. Capitán América", "3. Bob Esponja", "4. El chavo del 8", "5. Dominic Toretto", "6. Terminator", "7. Pantera Rosa", "8. Venom", "9. Simón \"Ghost\" Riley", "10. Spiderman" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane_Imaginarios.setViewportView(jListImaginarios);

        jListAnimales.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "1. Perro", "2. Gato", "3. Quetzal", "4. Jirafa", "5. León", "6. Tigre", "7. Jaguar", "8. Foca", "9. Tiburón", "10. Elefante" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane_Animales.setViewportView(jListAnimales);

        jLabel_Reales.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel_Reales.setText("Reales");

        jLabel_Imaginarios.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel_Imaginarios.setText("Imaginarios");

        jLabel_Animales.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel_Animales.setText("Animales");

        jButton_Salir.setBackground(new java.awt.Color(255, 0, 0));
        jButton_Salir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Salir.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Salir.setText("X");
        jButton_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SalirActionPerformed(evt);
            }
        });

        jButton_regresar.setText("Regresar");
        jButton_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_regresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_TituloPersonajes, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(193, 193, 193)
                        .addComponent(jButton_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(64, 64, 64)
                                        .addComponent(jScrollPane_Reales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)
                                        .addComponent(jScrollPane_Imaginarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(105, 105, 105)
                                        .addComponent(jLabel_Reales)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel_Imaginarios)
                                        .addGap(23, 23, 23)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(jScrollPane_Animales, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel_Animales)
                                        .addGap(29, 29, 29))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel_Expli1)
                                        .addGap(40, 40, 40))
                                    .addComponent(jLabel_Expli2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(81, 81, 81)
                                        .addComponent(jLabel_Expli3)
                                        .addGap(62, 62, 62))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(251, 251, 251)
                                .addComponent(jButton_regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 53, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_TituloPersonajes, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel_Expli1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Expli2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Expli3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Reales, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel_Animales, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel_Imaginarios)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane_Imaginarios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane_Reales, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane_Animales, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton_regresar)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton_SalirActionPerformed

    private void jButton_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_regresarActionPerformed
        this.setVisible(false);
        Inicio init = new Inicio();
        init.setVisible(true);
    }//GEN-LAST:event_jButton_regresarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Listado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Listado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Listado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Listado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Listado dialog = new Listado(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Salir;
    private javax.swing.JButton jButton_regresar;
    private javax.swing.JLabel jLabel_Animales;
    private javax.swing.JLabel jLabel_Expli1;
    private javax.swing.JLabel jLabel_Expli2;
    private javax.swing.JLabel jLabel_Expli3;
    private javax.swing.JLabel jLabel_Imaginarios;
    private javax.swing.JLabel jLabel_Reales;
    private javax.swing.JLabel jLabel_TituloPersonajes;
    private javax.swing.JList<String> jListAnimales;
    private javax.swing.JList<String> jListImaginarios;
    private javax.swing.JList<String> jListReales;
    private javax.swing.JScrollPane jScrollPane_Animales;
    private javax.swing.JScrollPane jScrollPane_Imaginarios;
    private javax.swing.JScrollPane jScrollPane_Reales;
    // End of variables declaration//GEN-END:variables
}
