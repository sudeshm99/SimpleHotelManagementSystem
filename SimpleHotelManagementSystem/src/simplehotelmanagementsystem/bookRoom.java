/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplehotelmanagementsystem;

/**
 *
 * @author root
 */
public class bookRoom extends javax.swing.JFrame {

    /**
     * Creates new form bookRoom
     */
    public bookRoom() {
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        BookRoomL = new javax.swing.JLabel();
        idL = new javax.swing.JLabel();
        idTxt = new javax.swing.JTextField();
        nicL = new javax.swing.JLabel();
        contNOL = new javax.swing.JLabel();
        nameL = new javax.swing.JLabel();
        ReservDateL = new javax.swing.JLabel();
        ReturnDateL = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        nicTxt = new javax.swing.JTextField();
        ContTxt = new javax.swing.JTextField();
        CloseB = new javax.swing.JButton();
        bookB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BookRoomL.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BookRoomL.setText("Book Rooms");

        idL.setText("Room ID");

        idTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTxtActionPerformed(evt);
            }
        });

        nicL.setText("NIC");

        contNOL.setText("Contact No");

        nameL.setText("Name");

        ReservDateL.setText("Reserve Date");

        ReturnDateL.setText("Return Date");

        CloseB.setText("Close");
        CloseB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseBActionPerformed(evt);
            }
        });

        bookB.setText("Book");

        jDesktopPane1.setLayer(BookRoomL, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(idL, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(idTxt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(nicL, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(contNOL, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(nameL, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(ReservDateL, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(ReturnDateL, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(nameTxt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(nicTxt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(ContTxt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(CloseB, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(bookB, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ReturnDateL)
                                    .addComponent(ReservDateL)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nicL)
                                            .addComponent(idL)
                                            .addComponent(nameL))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nameTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nicTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(contNOL)
                                        .addGap(29, 29, 29)
                                        .addComponent(ContTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(BookRoomL)))
                        .addGap(0, 109, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bookB, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CloseB)))
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BookRoomL)
                .addGap(26, 26, 26)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idL)
                    .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nicL)
                    .addComponent(nicTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameL)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contNOL)
                    .addComponent(ContTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ReservDateL)
                .addGap(24, 24, 24)
                .addComponent(ReturnDateL)
                .addGap(16, 16, 16)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CloseB)
                    .addComponent(bookB))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CloseBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseBActionPerformed
        Receptionist reception = new Receptionist();
        reception.setVisible(true);
        dispose();
    }//GEN-LAST:event_CloseBActionPerformed

    private void idTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTxtActionPerformed

    /**
     * @param args the command line arguments
     */
    public void getid(int i){
       String id = Integer.toString(i);
       idTxt.setText(id);
    }
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
            java.util.logging.Logger.getLogger(bookRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bookRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bookRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bookRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bookRoom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BookRoomL;
    private javax.swing.JButton CloseB;
    private javax.swing.JTextField ContTxt;
    private javax.swing.JLabel ReservDateL;
    private javax.swing.JLabel ReturnDateL;
    private javax.swing.JButton bookB;
    private javax.swing.JLabel contNOL;
    private javax.swing.JLabel idL;
    private javax.swing.JTextField idTxt;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel nameL;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JLabel nicL;
    private javax.swing.JTextField nicTxt;
    // End of variables declaration//GEN-END:variables
}
