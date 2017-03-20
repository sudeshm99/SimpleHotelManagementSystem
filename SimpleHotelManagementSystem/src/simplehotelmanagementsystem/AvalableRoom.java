/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplehotelmanagementsystem;

import javax.swing.JOptionPane;
import database.connectDB;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author root
 */
public class AvalableRoom extends javax.swing.JFrame {
     connectDB dbconn = new connectDB();
    /**
     * Creates new form AvalableRoom
     */
    public AvalableRoom() {
       dbconn.connect();
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
        noofperl = new javax.swing.JLabel();
        condition = new javax.swing.JComboBox<>();
        acnonl = new javax.swing.JLabel();
        check = new javax.swing.JLabel();
        checkbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        roomidtxt = new javax.swing.JTextArea();
        type = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        noofperl.setText("Couple or Family");

        condition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "NON-AC" }));

        acnonl.setText("AC or NON-AC");

        check.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        check.setText("Check Avalable Rooms");

        checkbtn.setText("check");
        checkbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbtnActionPerformed(evt);
            }
        });

        roomidtxt.setColumns(20);
        roomidtxt.setRows(5);
        jScrollPane1.setViewportView(roomidtxt);

        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Couple", "Family" }));

        jDesktopPane1.setLayer(noofperl, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(condition, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(acnonl, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(check, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(checkbtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(type, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(check)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(acnonl)
                    .addComponent(noofperl))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(condition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkbtn)
                    .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(144, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(check)
                .addGap(22, 22, 22)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acnonl)
                    .addComponent(condition, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noofperl)
                    .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(checkbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
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
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbtnActionPerformed
           String typ = type.getSelectedItem().toString();//get user selected values
           String cond = condition.getSelectedItem().toString();
           int typValue=2,condValue=2;
           if(typ.equals("Couple")){//if type is couple set 1 to typValue else type is family set 0 to typValue 
               typValue = 1;
           }else if(typ.equals("Family")){
               typValue = 0; 
           }
           if(cond.equals("AC")){//if room is ac then set 1 to condValue else room is non-ac set 0 to condValue
               condValue = 1;
           }else if(cond.equals("NON-AC")){
               condValue = 0;
           }
           
        try{
//           String typ = type.getSelectedItem().toString();//get user selected values
//           String cond = condition.getSelectedItem().toString();
//           int typValue=2,condValue=2;
//           if(typ.equals("Couple")){//if type is couple set 1 to typValue else type is family set 0 to typValue 
//               typValue = 1;
//           }else if(typ.equals("Family")){
//               typValue = 0; 
//           }
//           if(cond.equals("AC")){//if room is ac then set 1 to condValue else room is non-ac set 0 to condValue
//               condValue = 1;
//           }else if(cond.equals("NON-AC")){
//               condValue = 0;
//           }
           String sql ="SELECT id FROM rooms WHERE type=? AND ac_or_non=?";//sql query
           
           PreparedStatement statement = dbconn.conn.prepareStatement(sql);//prepare query statement for db connection
           statement.setInt(1,typValue);//complete statement
           statement.setInt(2,condValue);
           
           ResultSet result = statement.executeQuery();//execute query and get result
           String st = "";
           
           for(int i = 0;result.next(); i++){
              int id = result.getInt("id");
              st += Integer.toString(id)+"  ";
            
            }
           
          // st += "\b\b";
           
           System.out.println(st);
           roomidtxt.setText(st);
          
           
       }catch(Exception ex){
           JOptionPane.showMessageDialog(null, "Exception");
       }
       
    }//GEN-LAST:event_checkbtnActionPerformed

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
            java.util.logging.Logger.getLogger(AvalableRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AvalableRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AvalableRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AvalableRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AvalableRoom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acnonl;
    private javax.swing.JLabel check;
    private javax.swing.JButton checkbtn;
    private javax.swing.JComboBox<String> condition;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel noofperl;
    private javax.swing.JTextArea roomidtxt;
    private javax.swing.JComboBox<String> type;
    // End of variables declaration//GEN-END:variables
}
