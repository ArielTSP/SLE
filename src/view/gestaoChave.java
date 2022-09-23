/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * @author Alunos
 */
public class gestaoChave extends javax.swing.JFrame {

    int mousePX, mousePY;
    public gestaoChave() {
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

        panelFundo = new javax.swing.JPanel();
        exitProgram = new javax.swing.JLabel();
        toolbarWindow = new javax.swing.JLabel();
        fundoPrograma = new javax.swing.JPanel();
        nomeUser = new javax.swing.JComboBox<>();
        tipoChave = new javax.swing.JComboBox<>();
        chave = new javax.swing.JComboBox<>();
        revogar = new javax.swing.JButton();
        remover = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SLE - Serviço de Logística Empresarial");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);

        panelFundo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitProgram.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CloseIcon.png"))); // NOI18N
        exitProgram.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exitProgram.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitProgramMouseClicked(evt);
            }
        });
        panelFundo.add(exitProgram, new org.netbeans.lib.awtextra.AbsoluteConstraints(762, 2, 30, 40));

        toolbarWindow.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        toolbarWindow.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                toolbarWindowMouseDragged(evt);
            }
        });
        toolbarWindow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                toolbarWindowMousePressed(evt);
            }
        });
        panelFundo.add(toolbarWindow, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 40));

        nomeUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Professor e etc." }));

        tipoChave.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de Chave", "C. Reserva", "C. Professor" }));

        chave.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chave" }));
        chave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chaveActionPerformed(evt);
            }
        });

        revogar.setText("Revogar");

        remover.setText("Remover");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Professor", "Setor", "Chave", "Tipo de Chave", "Descrição", "Horário"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTextField1.setText("Descrição");

        javax.swing.GroupLayout fundoProgramaLayout = new javax.swing.GroupLayout(fundoPrograma);
        fundoPrograma.setLayout(fundoProgramaLayout);
        fundoProgramaLayout.setHorizontalGroup(
            fundoProgramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoProgramaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fundoProgramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(fundoProgramaLayout.createSequentialGroup()
                        .addGroup(fundoProgramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fundoProgramaLayout.createSequentialGroup()
                                .addComponent(nomeUser, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tipoChave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                        .addComponent(remover, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(revogar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        fundoProgramaLayout.setVerticalGroup(
            fundoProgramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoProgramaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fundoProgramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(remover, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(revogar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nomeUser)
                    .addComponent(chave)
                    .addComponent(tipoChave))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelFundo.add(fundoPrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 780, 490));

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/SchoolGround.jpg"))); // NOI18N
        lblFundo.setToolTipText("");
        panelFundo.add(lblFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFundo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void toolbarWindowMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toolbarWindowMouseDragged
        System.out.println("Pegando dados brutos de posição da janela.");
        int coordX = evt.getXOnScreen();
        int coordY = evt.getYOnScreen();
        System.out.println("Modificando posição da janela.");
        this.setLocation(coordX-mousePX, coordY-mousePY);
    }//GEN-LAST:event_toolbarWindowMouseDragged

    private void toolbarWindowMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toolbarWindowMousePressed
        System.out.println("Pegando dados brutos de posição do mouse.");
        mousePX = evt.getX();
        mousePY = evt.getY();
    }//GEN-LAST:event_toolbarWindowMousePressed

    private void exitProgramMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitProgramMouseClicked
        System.out.println("Encerrando programa.");
        System.exit(0);
    }//GEN-LAST:event_exitProgramMouseClicked

    private void chaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chaveActionPerformed
 
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
            java.util.logging.Logger.getLogger(gestaoChave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gestaoChave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gestaoChave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gestaoChave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gestaoChave().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> chave;
    private javax.swing.JLabel exitProgram;
    private javax.swing.JPanel fundoPrograma;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JComboBox<String> nomeUser;
    private javax.swing.JPanel panelFundo;
    private javax.swing.JButton remover;
    private javax.swing.JButton revogar;
    private javax.swing.JComboBox<String> tipoChave;
    private javax.swing.JLabel toolbarWindow;
    // End of variables declaration//GEN-END:variables
}
