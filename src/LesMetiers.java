/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author tm325716
 */
public class LesMetiers extends javax.swing.JFrame {

    /**
     * Creates new form LesMetiers
     */
    public LesMetiers() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Peintre = new javax.swing.JButton();
        Patissier = new javax.swing.JButton();
        Coiffeur = new javax.swing.JButton();
        Sculpteur = new javax.swing.JButton();
        Marin = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        ISculpteur = new javax.swing.JButton();
        IMarin = new javax.swing.JButton();
        IPatissier = new javax.swing.JButton();
        ICoiffeur = new javax.swing.JButton();
        IPeintre = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        MonImage = new javax.swing.JButton();
        MonMetier = new javax.swing.JButton();
        Resultats = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new java.awt.GridLayout(0, 1));

        Peintre.setText("Peintre");
        Peintre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PeintreActionPerformed(evt);
            }
        });
        jPanel2.add(Peintre);

        Patissier.setText("Patissier");
        jPanel2.add(Patissier);

        Coiffeur.setText("Coiffeur");
        jPanel2.add(Coiffeur);

        Sculpteur.setText("Sculpteur");
        jPanel2.add(Sculpteur);

        Marin.setText("Marin");
        jPanel2.add(Marin);

        getContentPane().add(jPanel2, java.awt.BorderLayout.EAST);

        jLabel1.setText("Jeu des m??tiers");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel4.setLayout(new java.awt.GridLayout(0, 1));

        ISculpteur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sculteur.gif"))); // NOI18N
        jPanel4.add(ISculpteur);

        IMarin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/marin.gif"))); // NOI18N
        jPanel4.add(IMarin);

        IPatissier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/patissier.gif"))); // NOI18N
        jPanel4.add(IPatissier);

        ICoiffeur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coiffeur.gif"))); // NOI18N
        jPanel4.add(ICoiffeur);

        IPeintre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/peintre.gif"))); // NOI18N
        jPanel4.add(IPeintre);

        getContentPane().add(jPanel4, java.awt.BorderLayout.WEST);

        jPanel3.setLayout(new java.awt.GridLayout(3, 1));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 297, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel5);

        jPanel6.setLayout(new java.awt.GridLayout(1, 2));

        MonImage.setText("Image");
        jPanel6.add(MonImage);

        MonMetier.setText("M??tier");
        jPanel6.add(MonMetier);

        jPanel3.add(jPanel6);

        jLabel2.setText("R??sultats");

        javax.swing.GroupLayout ResultatsLayout = new javax.swing.GroupLayout(Resultats);
        Resultats.setLayout(ResultatsLayout);
        ResultatsLayout.setHorizontalGroup(
            ResultatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 297, Short.MAX_VALUE)
            .addGroup(ResultatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ResultatsLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        ResultatsLayout.setVerticalGroup(
            ResultatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
            .addGroup(ResultatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ResultatsLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel3.add(Resultats);

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PeintreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PeintreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PeintreActionPerformed

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
            java.util.logging.Logger.getLogger(LesMetiers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LesMetiers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LesMetiers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LesMetiers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LesMetiers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Coiffeur;
    private javax.swing.JButton ICoiffeur;
    private javax.swing.JButton IMarin;
    private javax.swing.JButton IPatissier;
    private javax.swing.JButton IPeintre;
    private javax.swing.JButton ISculpteur;
    private javax.swing.JButton Marin;
    private javax.swing.JButton MonImage;
    private javax.swing.JButton MonMetier;
    private javax.swing.JButton Patissier;
    private javax.swing.JButton Peintre;
    private javax.swing.JPanel Resultats;
    private javax.swing.JButton Sculpteur;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
