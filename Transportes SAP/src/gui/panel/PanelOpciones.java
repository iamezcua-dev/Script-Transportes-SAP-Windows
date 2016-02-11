package gui.panel;

import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import property.Constants;

/**
 *
 * @author iamezcua
 */
public class PanelOpciones extends javax.swing.JPanel {

    public Map<String, JCheckBox> optionCodeMap;
    /**
     * Creates new form panel
     */
    public PanelOpciones() {
        initComponents();
        optionCodeMap = new LinkedHashMap<>();
        optionCodeMap.put( "0", jCheckBox1 );
        optionCodeMap.put( "1", jCheckBox2 );
        optionCodeMap.put( "2", jCheckBox3 );
        optionCodeMap.put( "6", jCheckBox4 );
        optionCodeMap.put( "9", jCheckBox5 );
        optionCodeMap.put( "8", jCheckBox6 );
        optionCodeMap.put( "3", jCheckBox7 );
        optionCodeMap.put( "4", jCheckBox8 );
        
        String envOpcionesValue = System.getenv("opciones");
        if( envOpcionesValue != null ) {
            for(char enabledOption : envOpcionesValue.toCharArray()){
                if (optionCodeMap.containsKey(String.valueOf(enabledOption))){
                    ((JCheckBox)optionCodeMap.get(String.valueOf(enabledOption))).setSelected(true);
                }
            }
        }
    }

    /**
     *  |0 |Leave Transport request in Queue for Later Import| Overtaker, leave the respective task in the buffer, mark it to be imported again (1 or I).|
     *  |1 |Import Transport Request Again| Repeat the import of the transport request from the beginning.|
     *  |2 |Overwrite Originals| Overwrite original objects.|
     *  |6 |Overwrite Objects in Unconfirmed Repairs| Overwrite repaired objects (that are object being in a unconfirmed repair).|
     *  |9 |Ignore Non-Permitted Transport Type| Ignore that this type of transport request currently may not be imported.|
     *  |8 |Ignore Non-Permitted Table Class| ignore restrictions arising from table classes.|
     *  |3 |Ignore Predecessor Relations| Not used any more.|
     *  |4 |Ignore Invalid Component Version| Ignore incorrect component version (as of 7.02 used again)|
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        textPaneWarningMessage = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setMaximumSize(new java.awt.Dimension(502, 367));
        setMinimumSize(new java.awt.Dimension(502, 367));
        setPreferredSize(new java.awt.Dimension(502, 367));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setText("Set as default options");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jCheckBox8.setText("Ignore Invalid Component Version.");
        jCheckBox8.setIconTextGap(10);

        jCheckBox1.setText("Leave Transport request in Queue for Later Import.");
        jCheckBox1.setIconTextGap(10);

        jCheckBox2.setText("Import Transport Request Again.");
        jCheckBox2.setIconTextGap(10);

        jCheckBox3.setText("Overwrite Originals.");
        jCheckBox3.setIconTextGap(10);

        jCheckBox6.setText("Ignore Non-Permitted Table Class.");
        jCheckBox6.setIconTextGap(10);

        jCheckBox7.setText("Ignore Predecessor Relations.");
        jCheckBox7.setIconTextGap(10);

        jCheckBox4.setText("Overwrite Objects in Unconfirmed Repairs.");
        jCheckBox4.setIconTextGap(10);

        jCheckBox5.setText("Ignore Non-Permitted Transport Type.");
        jCheckBox5.setIconTextGap(10);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox1)
                .addGap(0, 0, 0)
                .addComponent(jCheckBox2)
                .addGap(0, 0, 0)
                .addComponent(jCheckBox3)
                .addGap(0, 0, 0)
                .addComponent(jCheckBox4)
                .addGap(0, 0, 0)
                .addComponent(jCheckBox5)
                .addGap(0, 0, 0)
                .addComponent(jCheckBox6)
                .addGap(0, 0, 0)
                .addComponent(jCheckBox7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(9, 9, 9))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String opciones = "";
        
        for (Map.Entry<String, JCheckBox> pair : optionCodeMap.entrySet()) {
            opciones = opciones + (((JCheckBox)pair.getValue()).isSelected()? pair.getKey() : "");
        }
        
        List<Character> lista = new ArrayList<>();
        for(Character ch : opciones.toCharArray()){
            lista.add(ch);
        }
                
        Collections.sort(lista);
        
        for(Character ch : lista){
            opciones += ch.toString();
        }
        
        opciones = ((lista.size() > 0)? "U" : "") + opciones;
        
        this.setVisible(false);
        firePropertyChange(Constants.OPCIONES_ENVIRONMENT_VAR_GOT, "", opciones);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane textPaneWarningMessage;
    // End of variables declaration//GEN-END:variables
}
