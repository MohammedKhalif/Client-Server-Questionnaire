
import java.awt.Component;
import java.net.MalformedURLException;
import java.rmi.*;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class TestClient extends javax.swing.JFrame {

    Component frame = null;
    char[] ServerPass = new char[]{'q', 'u', 'i', 'z', '1', '2', '3'};
    public static int counter = 0;

    public TestClient() {
        initComponents();
    }

    String rmiName = "rmi://localhost/server";
    String num1 = null;
    String num2 = null;
    String num3 = null;

    public void connection() {
        try {
            Testinfo s = (Testinfo) Naming.lookup(rmiName);
            ResponceArea.append("Server connection established\n" + s.message());
            ResponceArea.append(s.question1());
        } catch (NotBoundException | RemoteException | MalformedURLException ex) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        ConnectBtn = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        EntPassLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ResponceArea = new javax.swing.JTextArea();
        SendBtn1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        questLabel = new javax.swing.JLabel();

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Title.setText("Quiz");

        ConnectBtn.setText("connect");
        ConnectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConnectBtnActionPerformed(evt);
            }
        });

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        EntPassLbl.setText("Enter password:");

        ResponceArea.setColumns(20);
        ResponceArea.setRows(5);
        jScrollPane1.setViewportView(ResponceArea);

        SendBtn1.setText("send");
        SendBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendBtn1ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        questLabel.setText("Q1:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(Title))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                                        .addComponent(jTextField1))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ConnectBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(SendBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(EntPassLbl)
                                        .addComponent(questLabel))
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EntPassLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConnectBtn))
                .addGap(18, 18, 18)
                .addComponent(questLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SendBtn1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void ConnectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConnectBtnActionPerformed
        char[] password = jPasswordField1.getPassword();

        if (Arrays.equals(password, ServerPass)) {
            JOptionPane.showMessageDialog(frame, "correct password");
            connection();
        } else {
            JOptionPane.showMessageDialog(frame, "incorrect password");
        }
    }//GEN-LAST:event_ConnectBtnActionPerformed

    private void SendBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendBtn1ActionPerformed
        char[] password = jPasswordField1.getPassword();

        if (Arrays.equals(password, ServerPass)) {

            try {

                if (jTextField1.getText().equals("")) {
                    JOptionPane.showMessageDialog(frame, "Please enter answer");
                } else {
                    int number = Integer.parseInt(jTextField1.getText());

                    if (number >= 1 && number <= 3) {
                        try {
                            Testinfo s = (Testinfo) Naming.lookup(rmiName);

                            switch (counter) {
                                case 0:
                                    num1 = jTextField1.getText();
                                    ResponceArea.append(s.question2());
                                    questLabel.setText("Q2.");
                                    jTextField1.setText("");
                                    break;
                                case 1:
                                    num2 = jTextField1.getText();
                                    ResponceArea.append(s.question3());
                                    questLabel.setText("Q3.");
                                    jTextField1.setText("");
                                    break;
                                case 2:
                                    num3 = jTextField1.getText();
                                    ResponceArea.append(s.a1(num1));
                                    ResponceArea.append(s.a2(num2));
                                    ResponceArea.append(s.a3(num3));
                                    SendBtn1.setText("Finsished");
                                    ResponceArea.append("\n\n End of Quiz! ");
                                    break;
                                default:
                                    System.exit(0);
                                    break;
                            }
                            counter++;

                        } catch (NotBoundException | RemoteException | MalformedURLException | java.lang.ArithmeticException ex) {

                        }
                    } else {
                        JOptionPane.showMessageDialog(frame, "Please enter answer between 1 and 3");
                    }
                }
            } catch (NumberFormatException ex) {
            }

        } else {
            JOptionPane.showMessageDialog(frame, "You are not connected to server");
        }

    }//GEN-LAST:event_SendBtn1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    public static void main(String args[]) throws Exception {

        java.awt.EventQueue.invokeLater(() -> {
            new TestClient().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConnectBtn;
    private javax.swing.JLabel EntPassLbl;
    private javax.swing.JTextArea ResponceArea;
    private javax.swing.JButton SendBtn1;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel questLabel;
    // End of variables declaration//GEN-END:variables

    private static class TestInfo {

        public TestInfo s() {
            return null;
        }
    }
}
