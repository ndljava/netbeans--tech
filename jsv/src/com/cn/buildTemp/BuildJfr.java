/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cn.buildTemp;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author Administrator
 */
public class BuildJfr extends javax.swing.JFrame {

    private JFileChooser fileselectPanel;
    private BuildXmlToAs bxa;
    private int isTmp = 0;

    /**
     * Creates new form BuildJfr
     */
    public BuildJfr() {
        initComponents();
        init();
        initUI();
    }

    private void init() {
        bxa = new BuildXmlToAs();
        bxa.setTextArea(textContent);
        bxa.setOutputDir("d:\\tempfiles\\");
    }

    private void initUI() {
        fileselectPanel = new JFileChooser();
        fileselectPanel.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                
                System.out.println(fileselectPanel.getSelectedFile().getPath());
                
                if (isTmp == 2) {
                    
                    outputDIR.setText(fileselectPanel.getSelectedFile().getAbsolutePath());
                    bxa.setOutputDir(fileselectPanel.getSelectedFile().getPath());
                    
                } else if (isTmp == 1) {
                    
                    tempTxt.setText(fileselectPanel.getSelectedFile().getAbsolutePath());
                    bxa.setTmpStr(fileselectPanel.getSelectedFile().getPath());

                    outputDIR.setText(fileselectPanel.getSelectedFile().getParent() + "\\tempfile");
                    bxa.setOutputDir(fileselectPanel.getSelectedFile().getParent() + "\\tempfile");
                    
                } else {
                    
                    pathTxt.setText(fileselectPanel.getSelectedFile().getAbsolutePath());
                    bxa.setPathStr(fileselectPanel.getSelectedFile().getPath());

                    bxa.setTmpStr(tempTxt.getText());
                    
                }
                
            }
        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectBtn = new javax.swing.JButton();
        pathTxt = new javax.swing.JTextField();
        startBuild = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textContent = new javax.swing.JTextArea();
        tempTxt = new javax.swing.JTextField();
        selectTmp = new javax.swing.JButton();
        outputDIR = new javax.swing.JTextField();
        outputBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("xml生成as文件");

        selectBtn.setText("选择目录");
        selectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectBtnActionPerformed(evt);
            }
        });

        pathTxt.setEditable(false);

        startBuild.setText("start");
        startBuild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBuildActionPerformed(evt);
            }
        });

        textContent.setColumns(20);
        textContent.setRows(5);
        jScrollPane1.setViewportView(textContent);

        tempTxt.setEditable(false);
        tempTxt.setText("/template.as");

        selectTmp.setText("选择模版文件");
        selectTmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectTmpActionPerformed(evt);
            }
        });

        outputDIR.setEditable(false);

        outputBtn.setText("选择输出目录");
        outputBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(outputDIR)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                    .addComponent(tempTxt)
                    .addComponent(pathTxt, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectBtn)
                    .addComponent(selectTmp)
                    .addComponent(startBuild)
                    .addComponent(outputBtn))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectBtn)
                    .addComponent(pathTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tempTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectTmp))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(outputDIR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outputBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startBuild))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectBtnActionPerformed
        // TODO add your handling code here:
        isTmp = 0;
        fileselectPanel.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        fileselectPanel.setForeground(Color.red);
        fileselectPanel.setSelectedFile(new File("E:\\svn\\策划目录\\游戏策划案\\B数据表\\道具表"));
        fileselectPanel.showOpenDialog(this);
        
    }//GEN-LAST:event_selectBtnActionPerformed

    private void startBuildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startBuildActionPerformed
        // TODO add your handling code here:
        this.setEnabled(false);
        bxa.buildFiles();
        this.setEnabled(true);
    }//GEN-LAST:event_startBuildActionPerformed

    private void selectTmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectTmpActionPerformed
        // TODO add your handling code here:
        isTmp = 1;
        fileselectPanel.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        fileselectPanel.showOpenDialog(this);
    }//GEN-LAST:event_selectTmpActionPerformed

    private void outputBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputBtnActionPerformed
        // TODO add your handling code here:
        isTmp = 2;
        fileselectPanel.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fileselectPanel.showOpenDialog(this);
    }//GEN-LAST:event_outputBtnActionPerformed

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
            java.util.logging.Logger.getLogger(BuildJfr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuildJfr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuildJfr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuildJfr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuildJfr().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton outputBtn;
    private javax.swing.JTextField outputDIR;
    private javax.swing.JTextField pathTxt;
    private javax.swing.JButton selectBtn;
    private javax.swing.JButton selectTmp;
    private javax.swing.JButton startBuild;
    private javax.swing.JTextField tempTxt;
    private javax.swing.JTextArea textContent;
    // End of variables declaration//GEN-END:variables
}
