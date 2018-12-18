/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.wp.dialogsample;

import javax.swing.JOptionPane;

/**
 *
 * @author lendle
 */
public class ShowMessageDialogSample extends javax.swing.JFrame {

    /**
     * Creates new form ShowMessageDialogSample
     */
    public ShowMessageDialogSample() {
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

        Default = new javax.swing.JButton();
        Error = new javax.swing.JButton();
        Information = new javax.swing.JButton();
        Plain = new javax.swing.JButton();
        Question = new javax.swing.JButton();
        Warning = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(6, 1));

        Default.setText("Default");
        Default.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DefaultActionPerformed(evt);
            }
        });
        getContentPane().add(Default);

        Error.setText("Error");
        Error.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ErrorActionPerformed(evt);
            }
        });
        getContentPane().add(Error);

        Information.setText("Information");
        Information.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InformationActionPerformed(evt);
            }
        });
        getContentPane().add(Information);

        Plain.setText("Plain");
        Plain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlainActionPerformed(evt);
            }
        });
        getContentPane().add(Plain);

        Question.setText("Question");
        Question.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuestionActionPerformed(evt);
            }
        });
        getContentPane().add(Question);

        Warning.setText("Warning");
        Warning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WarningActionPerformed(evt);
            }
        });
        getContentPane().add(Warning);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ErrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ErrorActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"hello","1",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_ErrorActionPerformed

    private void DefaultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DefaultActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"hello","2",JOptionPane.DEFAULT_OPTION);
    }//GEN-LAST:event_DefaultActionPerformed

    private void InformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InformationActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"hello","3",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_InformationActionPerformed

    private void PlainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlainActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"hello","4",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_PlainActionPerformed

    private void QuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuestionActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"hello","5",JOptionPane.QUESTION_MESSAGE);
    }//GEN-LAST:event_QuestionActionPerformed

    private void WarningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WarningActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"hello","6",JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_WarningActionPerformed

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
            java.util.logging.Logger.getLogger(ShowMessageDialogSample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowMessageDialogSample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowMessageDialogSample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowMessageDialogSample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowMessageDialogSample().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Default;
    private javax.swing.JButton Error;
    private javax.swing.JButton Information;
    private javax.swing.JButton Plain;
    private javax.swing.JButton Question;
    private javax.swing.JButton Warning;
    // End of variables declaration//GEN-END:variables
}
