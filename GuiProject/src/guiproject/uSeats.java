/*





                     This page will appear after clicking the UserWork>Seats Btn




 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package guiproject;

/**
 *
 * @author 59510
 */
public class uSeats extends javax.swing.JFrame {

    /**
     * Creates new form uSeats
     */
    public uSeats() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        SeatsArrangementTable = new javax.swing.JTable();
        labelEnterSeatNameToCheckAvailability = new javax.swing.JLabel();
        txtFieldToEnterSeatnumber = new javax.swing.JTextField();
        MoveToUserTaskPageBtn = new javax.swing.JButton();
        okBTn = new javax.swing.JButton();
        seatAvalableORnot = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SeatsArrangementTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Row 1", "Seat 1a", "Seat 1b", "Seat 1c", "Seat 1d", "Seat 1e"},
                {"Row 2", "Seat 2a", "Seat 2b", "Seat 2c", "Seat 2d", "Seat 2e"},
                {"Row 3", "Seat 3a", "Seat 3b", "Seat 3c", "Seat 3d", "Seat 3e"},
                {"Row 4", "Seat  4a", "Seat  4b", "Seat  4c", "Seat  4d", "Seat  4e"},
                {"Row 5", "Seat 5a", "Seat 5b", "Seat 5c", "Seat 5d", "Seat 5e"},
                {"Row 6 ", "Seat 6a", "Seat 6b", "Seat 6c", "Seat 6d", "Seat 6e"},
                {"Row 7", "Seat 7a", "Seat 7b", "Seat 7c", "Seat 7d", "Seat 7e"},
                {"Row 8", "Seat 8a", "Seat 8b", "Seat 8c", "Seat 8d", "Seat 8a"}
            },
            new String [] {
                "Row Num/ Col num", "Coloumn a", "Coloumn b", "Coloumn c", "Coloumn d", "Coloumn e"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SeatsArrangementTable.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(SeatsArrangementTable);
        SeatsArrangementTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        if (SeatsArrangementTable.getColumnModel().getColumnCount() > 0) {
            SeatsArrangementTable.getColumnModel().getColumn(0).setResizable(false);
            SeatsArrangementTable.getColumnModel().getColumn(1).setResizable(false);
            SeatsArrangementTable.getColumnModel().getColumn(2).setResizable(false);
            SeatsArrangementTable.getColumnModel().getColumn(3).setResizable(false);
            SeatsArrangementTable.getColumnModel().getColumn(4).setResizable(false);
            SeatsArrangementTable.getColumnModel().getColumn(5).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, 191));

        labelEnterSeatNameToCheckAvailability.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelEnterSeatNameToCheckAvailability.setForeground(new java.awt.Color(255, 255, 255));
        labelEnterSeatNameToCheckAvailability.setText("Enter Seat Name To Check Availability :");
        getContentPane().add(labelEnterSeatNameToCheckAvailability, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));
        getContentPane().add(txtFieldToEnterSeatnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 220, -1));

        MoveToUserTaskPageBtn.setBackground(new java.awt.Color(0, 0, 0));
        MoveToUserTaskPageBtn.setForeground(new java.awt.Color(255, 255, 255));
        MoveToUserTaskPageBtn.setText("Back");
        getContentPane().add(MoveToUserTaskPageBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        okBTn.setText("Ok");
        getContentPane().add(okBTn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, -1, -1));

        seatAvalableORnot.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        seatAvalableORnot.setForeground(new java.awt.Color(255, 255, 255));
        seatAvalableORnot.setText("Result.");
        getContentPane().add(seatAvalableORnot, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\59510\\Downloads\\required3.jpg")); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(uSeats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(uSeats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(uSeats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(uSeats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new uSeats().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MoveToUserTaskPageBtn;
    private javax.swing.JTable SeatsArrangementTable;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelEnterSeatNameToCheckAvailability;
    private javax.swing.JButton okBTn;
    private javax.swing.JLabel seatAvalableORnot;
    private javax.swing.JTextField txtFieldToEnterSeatnumber;
    // End of variables declaration//GEN-END:variables
}
