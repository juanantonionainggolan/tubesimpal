/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Juan Antonio
 */
public class homeDosen extends javax.swing.JFrame {

    /**
     * Creates new form homeDosen
     */
    public homeDosen() {
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

        jLabel1 = new javax.swing.JLabel();
        uploadmaterihomedosen = new javax.swing.JButton();
        pengolahannilaihomedosen = new javax.swing.JButton();
        downloadjawabanhomedosen = new javax.swing.JButton();
        inputsoalhomedosen = new javax.swing.JButton();
        signouthomedosen = new javax.swing.JButton();
        pengolahankehadiranhomedosen = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Selamat Datang");

        uploadmaterihomedosen.setText("Upload Materi");
        uploadmaterihomedosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadmaterihomedosenActionPerformed(evt);
            }
        });

        pengolahannilaihomedosen.setText("Pengolahan Nilai");

        downloadjawabanhomedosen.setText("Download Jawaban");
        downloadjawabanhomedosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downloadjawabanhomedosenActionPerformed(evt);
            }
        });

        inputsoalhomedosen.setText("Input Soal");

        signouthomedosen.setText("Sign Out");
        signouthomedosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signouthomedosenActionPerformed(evt);
            }
        });

        pengolahankehadiranhomedosen.setText("Pengolahan Kehadiran");

        jButton1.setText("Edit Profil");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pengolahankehadiranhomedosen)
                    .addComponent(signouthomedosen, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pengolahannilaihomedosen, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(downloadjawabanhomedosen, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputsoalhomedosen, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(174, 174, 174)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(114, 114, 114)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(uploadmaterihomedosen, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(113, 113, 113))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addComponent(uploadmaterihomedosen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(21, 21, 21)
                .addComponent(inputsoalhomedosen)
                .addGap(49, 49, 49)
                .addComponent(downloadjawabanhomedosen)
                .addGap(47, 47, 47)
                .addComponent(pengolahannilaihomedosen)
                .addGap(45, 45, 45)
                .addComponent(pengolahankehadiranhomedosen)
                .addGap(44, 44, 44)
                .addComponent(signouthomedosen)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signouthomedosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signouthomedosenActionPerformed
        dispose();
        new loginPage().setVisible(true);
    }//GEN-LAST:event_signouthomedosenActionPerformed

    private void uploadmaterihomedosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadmaterihomedosenActionPerformed
        
    }//GEN-LAST:event_uploadmaterihomedosenActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void downloadjawabanhomedosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downloadjawabanhomedosenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_downloadjawabanhomedosenActionPerformed

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
            java.util.logging.Logger.getLogger(homeDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homeDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homeDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homeDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homeDosen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton downloadjawabanhomedosen;
    private javax.swing.JButton inputsoalhomedosen;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton pengolahankehadiranhomedosen;
    private javax.swing.JButton pengolahannilaihomedosen;
    private javax.swing.JButton signouthomedosen;
    private javax.swing.JButton uploadmaterihomedosen;
    // End of variables declaration//GEN-END:variables
}