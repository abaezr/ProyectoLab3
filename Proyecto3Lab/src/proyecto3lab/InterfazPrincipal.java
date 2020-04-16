/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3lab;

/**
 *
 * @author andresbaezrincon
 */
public class InterfazPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form InterfazPrincipal
     */
    public InterfazPrincipal() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnParqueadero = new javax.swing.JButton();
        btnTeatro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(212, 212, 212));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Titulo1.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Titulo2.png"))); // NOI18N

        btnParqueadero.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnParqueadero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Carro2.png"))); // NOI18N
        btnParqueadero.setText("PARQUEADERO");
        btnParqueadero.setBorderPainted(false);
        btnParqueadero.setContentAreaFilled(false);
        btnParqueadero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnParqueadero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnParqueadero.setIconTextGap(-3);
        btnParqueadero.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Carro3.png"))); // NOI18N
        btnParqueadero.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Carro3.png"))); // NOI18N
        btnParqueadero.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnParqueadero.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnParqueadero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParqueaderoActionPerformed(evt);
            }
        });

        btnTeatro.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnTeatro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Teatro2.png"))); // NOI18N
        btnTeatro.setText("SALA DE TEATRO");
        btnTeatro.setBorderPainted(false);
        btnTeatro.setContentAreaFilled(false);
        btnTeatro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTeatro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTeatro.setIconTextGap(-3);
        btnTeatro.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Teatro3.png"))); // NOI18N
        btnTeatro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Teatro1.png"))); // NOI18N
        btnTeatro.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnTeatro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTeatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeatroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnParqueadero)
                        .addGap(18, 18, 18)
                        .addComponent(btnTeatro)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(62, 62, 62)
                .addComponent(jLabel1)
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnParqueadero, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTeatro))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnParqueaderoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParqueaderoActionPerformed
        // TODO add your handling code here:
      Parqueadero.InterfazParqueadero parq = new Parqueadero.InterfazParqueadero();
      parq.setVisible(true);
    }//GEN-LAST:event_btnParqueaderoActionPerformed

    private void btnTeatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeatroActionPerformed
        // TODO add your handling code here:
        Teatro.InterfazTeatro tea = new Teatro.InterfazTeatro();
        tea.setVisible(true);
    }//GEN-LAST:event_btnTeatroActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnParqueadero;
    private javax.swing.JButton btnTeatro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
