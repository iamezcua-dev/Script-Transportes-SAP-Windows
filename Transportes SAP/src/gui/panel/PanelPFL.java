/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.panel;

import java.awt.Color;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import property.Constants;

/**
 *
 * @author iamezcua
 */
public class PanelPFL extends javax.swing.JPanel {

    /**
     * Creates new form PanelGeneral
     */
    public PanelPFL() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        textPaneWarningMessage = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(502, 206));
        setMinimumSize(new java.awt.Dimension(502, 206));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setLayout(new java.awt.GridLayout(1, 3, 5, 5));
        jPanel1.add(jLabel2);

        jButton3.setText("Apply!");
        jButton3.setMaximumSize(new java.awt.Dimension(120, 40));
        jButton3.setMinimumSize(new java.awt.Dimension(120, 40));
        jButton3.setPreferredSize(new java.awt.Dimension(120, 40));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jPanel1.add(jLabel3);

        jButton2.setText("Browse...");
        jButton2.setMaximumSize(new java.awt.Dimension(95, 25));
        jButton2.setMinimumSize(new java.awt.Dimension(95, 25));
        jButton2.setPreferredSize(new java.awt.Dimension(95, 25));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        textPaneWarningMessage.setBorder(BorderFactory.createDashedBorder(Color.RED));
        textPaneWarningMessage.setContentType("text/html");
        textPaneWarningMessage.setText("<h3>No profile file loaded!</h3><p>You need to specify where <code>.pfl</code> file is, so you can apply bulk SAP transports.");
        textPaneWarningMessage.setBackground(new java.awt.Color(255, 255, 102));
        textPaneWarningMessage.setFocusable(false);
        textPaneWarningMessage.setMinimumSize(new java.awt.Dimension(396, 80));
        textPaneWarningMessage.setPreferredSize(new java.awt.Dimension(396, 80));
        jScrollPane3.setViewportView(textPaneWarningMessage);
        jScrollPane3.setBorder(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setMaximumSize(new java.awt.Dimension(80, 80));
        jLabel1.setMinimumSize(new java.awt.Dimension(80, 80));
        jLabel1.setPreferredSize(new java.awt.Dimension(80, 80));
        ImageIcon imageIcon = new ImageIcon(this.getClass().getResource("/resources/warning_image.png"));
        ImageIcon i = new ImageIcon(imageIcon.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH));
        jLabel1.setIcon(i);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFileChooser jfch = new JFileChooser(System.getProperty("user.dir"));
        jfch.setMultiSelectionEnabled(false);
        jfch.setFileSelectionMode(JFileChooser.FILES_ONLY);
        jfch.setApproveButtonText("Load selected profile file");
        int response = jfch.showOpenDialog(this);
        switch (response) {
            case JFileChooser.APPROVE_OPTION:
                String selectedFilePath = jfch.getSelectedFile().getAbsolutePath();
                jTextField1.setText(selectedFilePath);
                jTextField1.setToolTipText(selectedFilePath);
                break;
            case JFileChooser.CANCEL_OPTION:
//                JOptionPane.showMessageDialog(this, "You jave choosen CANCEL!");
                break;
            case JFileChooser.ERROR_OPTION:
                JOptionPane.showMessageDialog(this, "ERROR!");
                break;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (!"".equals(jTextField1.getText())) {
            JOptionPane.showMessageDialog(this, "Is it mandatory to restart the program for the changes to take effect.", "Changes applied!", JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
            firePropertyChange(Constants.AMBIENTE_ENVIRONMENT_VAR_GOT, "", jTextField1.getText());
        } else {
            JOptionPane.showMessageDialog(this, "Please, specify a valid path for the profile file (.pfl) !", "Profile path not yet specified!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextPane textPaneWarningMessage;
    // End of variables declaration//GEN-END:variables

//    public void setFlushableStdIn(OutputStream stdin) {
//        this.stdin = stdin;
//    }
}
