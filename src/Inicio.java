/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author toled
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
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

        jPanel_Fondo = new javax.swing.JPanel();
        jLabel_Titulo1 = new javax.swing.JLabel();
        jButton_Jugar = new javax.swing.JButton();
        jButton_Salir = new javax.swing.JButton();
        jButton_Personajes = new javax.swing.JButton();
        jButton_Instrucciones = new javax.swing.JButton();
        jButton_Créditos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_Fondo.setBackground(new java.awt.Color(188, 252, 203));
        jPanel_Fondo.setAutoscrolls(true);

        jLabel_Titulo1.setFont(new java.awt.Font("Mistral", 3, 36)); // NOI18N
        jLabel_Titulo1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel_Titulo1.setText("ADIVINA QUIÉN");

        jButton_Jugar.setBackground(new java.awt.Color(0, 204, 102));
        jButton_Jugar.setText("Jugar");
        jButton_Jugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_JugarActionPerformed(evt);
            }
        });

        jButton_Salir.setBackground(new java.awt.Color(255, 0, 0));
        jButton_Salir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Salir.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Salir.setText("X");
        jButton_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SalirActionPerformed(evt);
            }
        });

        jButton_Personajes.setBackground(new java.awt.Color(0, 204, 102));
        jButton_Personajes.setText("Personajes");
        jButton_Personajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PersonajesActionPerformed(evt);
            }
        });

        jButton_Instrucciones.setBackground(new java.awt.Color(0, 204, 102));
        jButton_Instrucciones.setText("Instrucciones");
        jButton_Instrucciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_InstruccionesActionPerformed(evt);
            }
        });

        jButton_Créditos.setBackground(new java.awt.Color(0, 204, 102));
        jButton_Créditos.setText("Créditos");
        jButton_Créditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CréditosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_FondoLayout = new javax.swing.GroupLayout(jPanel_Fondo);
        jPanel_Fondo.setLayout(jPanel_FondoLayout);
        jPanel_FondoLayout.setHorizontalGroup(
            jPanel_FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_FondoLayout.createSequentialGroup()
                .addContainerGap(174, Short.MAX_VALUE)
                .addComponent(jLabel_Titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157))
            .addGroup(jPanel_FondoLayout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addGroup(jPanel_FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_Instrucciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_Jugar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_Personajes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_Créditos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_FondoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton_Salir))
        );
        jPanel_FondoLayout.setVerticalGroup(
            jPanel_FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_FondoLayout.createSequentialGroup()
                .addComponent(jButton_Salir)
                .addGap(1, 1, 1)
                .addComponent(jLabel_Titulo1)
                .addGap(46, 46, 46)
                .addComponent(jButton_Jugar)
                .addGap(18, 18, 18)
                .addComponent(jButton_Instrucciones)
                .addGap(18, 18, 18)
                .addComponent(jButton_Personajes)
                .addGap(18, 18, 18)
                .addComponent(jButton_Créditos)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_CréditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CréditosActionPerformed
        this.setVisible(false);
        Créditos credits = new Créditos(this, rootPaneCheckingEnabled);
        credits.setVisible(true);
    }//GEN-LAST:event_jButton_CréditosActionPerformed

    private void jButton_JugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_JugarActionPerformed
        this.setVisible(false);
        Jugar jugar = new Jugar(this, rootPaneCheckingEnabled);
        jugar.setVisible(true);
    }//GEN-LAST:event_jButton_JugarActionPerformed

    private void jButton_InstruccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_InstruccionesActionPerformed
        this.setVisible(false);
        Intrucciones instr = new Intrucciones(this, rootPaneCheckingEnabled);
        instr.setVisible(true);
    }//GEN-LAST:event_jButton_InstruccionesActionPerformed

    private void jButton_PersonajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PersonajesActionPerformed
        this.setVisible(false);
        Listado lista = new Listado(this, rootPaneCheckingEnabled);
        lista.setVisible(true);
    }//GEN-LAST:event_jButton_PersonajesActionPerformed

    private void jButton_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton_SalirActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Créditos;
    private javax.swing.JButton jButton_Instrucciones;
    private javax.swing.JButton jButton_Jugar;
    private javax.swing.JButton jButton_Personajes;
    private javax.swing.JButton jButton_Salir;
    private javax.swing.JLabel jLabel_Titulo1;
    private javax.swing.JPanel jPanel_Fondo;
    // End of variables declaration//GEN-END:variables
}
