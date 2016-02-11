package gui.main;

import gui.panel.PanelOpciones;
import gui.panel.PanelPFL;
import gui.panel.PanelSID;
import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.text.DefaultCaret;
import property.Constants;

/**
 *
 * @author iamezcua
 */
public class MainWindow extends javax.swing.JFrame {

    private PanelPFL panelPfl;
    private PanelOpciones panelOpciones;
    private PanelSID panelSid;

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        setPanelPfl(null);
        setPanelOpciones(null);
        ((DefaultCaret) this.jTextArea1.getCaret()).setUpdatePolicy(DefaultCaret.ALWAYS_U‌​PDATE);
    }

    private JFrame getFrame() {
        return this;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        panelMain = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplicación de Transportes SAP");
        setLocationByPlatform(true);
        setMaximumSize(null);
        setMinimumSize(new java.awt.Dimension(760, 600));
        setPreferredSize(new java.awt.Dimension(760, 600));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jButton1.setText("Execute");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(204, 204, 204));
        jTextArea1.setRows(5);
        jTextArea1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextArea1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        jScrollPane2.setMinimumSize(new java.awt.Dimension(570, 400));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(570, 400));

        panelMain.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelMain.setMinimumSize(new java.awt.Dimension(570, 390));
        panelMain.setPreferredSize(new java.awt.Dimension(570, 390));
        panelMain.setLayout(new java.awt.BorderLayout());
        jScrollPane2.setViewportView(panelMain);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Thread myThread = new Thread(new Runnable() {
            private BufferedWriter wtr;

            @Override
            public void run() {
                OutputStream stdin = null;
                InputStream stdout = null;
                BufferedReader reader = null;
                BufferedWriter writer = null;

                try {
                    final List<String> command = new ArrayList<>();
                    command.add("cmd.exe");
                    command.add("/c");
                    command.add("script.bat");
                    System.out.println("[INF] Commands: " + command);
                    System.out.println("[INF] Script execution started...");

                    ProcessBuilder pb = new ProcessBuilder(command);
                    File workingDirectory = new File(System.getProperty("user.dir"));
                    pb.directory(workingDirectory);
                    pb.redirectErrorStream(true);
                    Process process = pb.start();

                    jTextArea1.append(command + System.lineSeparator());

                    stdin = process.getOutputStream();
                    stdout = process.getInputStream();

                    reader = new BufferedReader(new InputStreamReader(stdout));
                    writer = new BufferedWriter(new OutputStreamWriter(stdin));
                    setWriter(writer);

                    String line;

                    while ((line = reader.readLine()) != null) {
                        System.out.println(line);
                        jTextArea1.append(line + System.lineSeparator());

                        if (line.contains("[INP] Ingrese la ruta del archivo .PFL:")) {
                            configureProfileFile();
                        }

                        if (line.contains("[INP] Para continuar, definalas aqui ( Sintaxis: U[0|1|2|3|4|6|8|9]):")) {
                            configureImportOptions();
                        }

                        if (line.contains("[INP] Para continuar, escriba el SID del ambiente:")) {
                            configureSID();
                        }
                    }
                    System.out.println("[INF] Script execution finished...");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Exception!");
                    Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    try {
                        if (reader != null) {
                            reader.close();
                        }
                        if (writer != null) {
                            writer.close();
                        }
                        if (stdin != null) {
                            stdin.close();
                        }
                        if (stdout != null) {
                            stdout.close();
                        }
                    } catch (IOException ex) {
                        System.err.println("[ERR] Unable to close streams. Exiting abruply.");
                        Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }

            private void configureImportOptions() {
                setEnvironmentVarWithGUI(Constants.OPCIONES_ENVIRONMENT_VAR_GOT);
            }

            private void configureProfileFile() {
                setEnvironmentVarWithGUI(Constants.AMBIENTE_ENVIRONMENT_VAR_GOT);
            }

            private void configureSID() {
                setEnvironmentVarWithGUI(Constants.SID_ENVIRONMENT_VAR_GOT);
            }

            private void setEnvironmentVarWithGUI(final String property) {
                final JPanel panel = buildPanel(property);

                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        panelMain.removeAll();
                        panel.setVisible(true);
                        panelMain.add(panel, BorderLayout.CENTER);

                        getFrame().pack();
                        SwingUtilities.updateComponentTreeUI(panelMain);

                    }
                });
            }

            private void setWriter(BufferedWriter writer) {
                this.wtr = writer;
            }

            private BufferedWriter getWriter() {
                return this.wtr;
            }

            private JPanel buildPanel(final String type) {
                JPanel panel = null;

                switch (type) {
                    case Constants.AMBIENTE_ENVIRONMENT_VAR_GOT:
                        if (getPanelPfl() == null) {
                            setPanelPfl(new PanelPFL());
                        }
                        panel = getPanelPfl();
                        break;
                    case Constants.OPCIONES_ENVIRONMENT_VAR_GOT:
                        if (getPanelOpciones() == null) {
                            setPanelOpciones(new PanelOpciones());
                        }
                        panel = getPanelOpciones();
                        break;
                    case Constants.SID_ENVIRONMENT_VAR_GOT:
                        if (getPanelSID() == null) {
                            setPanelSID(new PanelSID());
                        }
                        panel = getPanelSID();

                }

                if (panel != null) {
                    panel.addPropertyChangeListener(new PropertyChangeListener() {
                        @Override
                        public void propertyChange(PropertyChangeEvent pce) {
                            if (pce.getPropertyName().equals(type)) {
                                try {
                                    String envVarValue = pce.getNewValue().toString();
                                    getWriter().write("\"" + envVarValue + "\"");
                                    getWriter().flush();
                                    jTextArea1.append("--> \"" + envVarValue + "\"");
                                    System.out.println(" \"" + envVarValue + "\"");
                                    writeToIniFile(((type.equals(Constants.AMBIENTE_ENVIRONMENT_VAR_GOT)) ? "AMBIENTE" : (type.equals(Constants.OPCIONES_ENVIRONMENT_VAR_GOT)) ? "OPCIONES" : "SID"), envVarValue);
                                } catch (IOException ex) {
                                    Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        }

                        private void writeToIniFile(String envVar, String value) {
                            try {
                                Path configFile = Paths.get(System.getProperty("user.dir") + "\\" + "config.ini");
                                if (!Files.exists(configFile, LinkOption.NOFOLLOW_LINKS)) {
                                    Files.createFile(configFile);
                                    Files.write(configFile, ("[Configuration for SAP Transports]" + System.lineSeparator() + System.lineSeparator()).getBytes(), StandardOpenOption.APPEND);
                                }
                                Files.write(Paths.get(System.getProperty("user.dir") + "\\" + "config.ini"), (envVar + "=" + value + System.lineSeparator()).getBytes(Charset.forName("UTF-8")), StandardOpenOption.APPEND);
                            } catch (IOException ex) {
                                Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    });
                } else {
                    JOptionPane.showMessageDialog(getFrame(), "Component load error... Contact to your system administrator.", "GUI Error!", JOptionPane.ERROR_MESSAGE);
                }

                return panel;
            }

        });
        myThread.start();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButton1.doClick();
        }
    }//GEN-LAST:event_jButton1KeyPressed

    private void jTextArea1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButton1.doClick();
        }
    }//GEN-LAST:event_jTextArea1KeyPressed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked

    }//GEN-LAST:event_jPanel1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MainWindow.class
//                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MainWindow.class
//                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MainWindow.class
//                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MainWindow.class
//                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel panelMain;
    // End of variables declaration//GEN-END:variables

//    @Override
//    public void propertyChange(PropertyChangeEvent pce) {
//        if (pce.getPropertyName().equals(Constants.AMBIENTE_ENVIRONMENT_VAR_GOT)) {
//            JOptionPane.showMessageDialog(this, "Hola!");
//        }
//    }
    public PanelPFL getPanelPfl() {
        return panelPfl;
    }

    public final void setPanelPfl(PanelPFL panelPfl) {
        this.panelPfl = panelPfl;
    }

    public PanelOpciones getPanelOpciones() {
        return panelOpciones;
    }

    public final void setPanelOpciones(PanelOpciones panelOpciones) {
        this.panelOpciones = panelOpciones;
    }

    public PanelSID getPanelSID() {
        return panelSid;
    }

    public void setPanelSID(PanelSID panelSid) {
        this.panelSid = panelSid;
    }
}
