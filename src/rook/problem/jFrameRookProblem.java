/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rook.problem;

import java.lang.Math;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import java.awt.Color;

import java.util.ArrayList;
import java.util.List;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;
//import static rook.problem.Permute.permute;

/**
 *
 * @author Randy_000
 */
public class jFrameRookProblem extends javax.swing.JFrame {

List<Integer> rookPosition = new ArrayList<Integer>();
Boolean flag = false;
    

    /**
     * Creates new form jFrameRookProblem
     */
    public jFrameRookProblem() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rook Problem");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(502, 501));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 499, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Number of Rooks");

        jButton1.setText("Begin");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Length (In Squares)");

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(8, 0, 10, 1));
        jSpinner1.setValue(4);

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(8, 0, 10, 1));
        jSpinner2.setRequestFocusEnabled(false);
        jSpinner2.setValue(4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSpinner2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


@Override
public void paint (java.awt.Graphics g) {
        //super.paintComponents(g);
        super.paint(g);
    // Graphics is guaranteed to be an instance of Graphics2D since I think 1.4
    // You should create a copy, so any changes you make are not carried onto the
    // next component, Graphics is shared between all the components being painted
    // in this paint cycle.
    Graphics2D g2=(Graphics2D)g.create();
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int numRooks = (Integer) jSpinner1.getValue();
        int numLength = (Integer) jSpinner2.getValue();
        int k = 0;
    
        

            BufferedImage imgRook = null;
        try {
            imgRook = ImageIO.read(new File("Rook.png"));
        } catch (IOException e) {
        }
        //Load image from file with exception.
        //This way the button doesn't need to be clicked twice

        
        g = jPanel1.getGraphics();
        
        g.setColor(Color.black);
        

        
        
        g.fillRect(1, 1, (numLength * 50 + 1), (numLength * 50 - 1));

        for (int i = 1; i <= (numLength * 50); i += 100) {
            for (int j = 1; j <= (numLength * 50); j += 100) {
                g.clearRect(i, j, 50, 50 - 2);
            }
        }

        for (int i = 51; i <= (numLength * 50); i += 100) {
            for (int j = 50; j <= (numLength * 50); j += 100) {
                g.clearRect(i, j, 50, 50 - 1);
            }
        }
       
//            //Pause to visualize
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException ex) {
//                Thread.currentThread().interrupt();
//            }
//            //end pause
        
//            }
       

            //BRIAN, NEED TO GET THIS LINE TO WORK AND PAINT EACH PERMUTATION
            
            //Permute.permute((rookPosition), 0);
     if (!rookPosition.isEmpty()){
      for (int r : rookPosition){
    g.drawImage(imgRook, (rookPosition.indexOf(r) *50 + 10), ((r-1) * 50 + 10),jPanel1);
  
   }
        }
     // Once create it should be disposed
     g.dispose();
}
 
    
    
    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed

        rookPosition.clear();
        //clean up array for next computation

        
      //Graphics g = jPanel1.getGraphics();
        //Currently only used to draw board, and still should be replaced
        //with paint/paintpaincomponents

        int numRooks = (Integer) jSpinner1.getValue();
        int numLength = (Integer) jSpinner2.getValue();
        int k = 0;

        //Draws board based on numLength

        if (numRooks > numLength) {
            JOptionPane.showMessageDialog(null, "Cannot construct board with more rooks than board length.", "Out of Bounds Error", JOptionPane.WARNING_MESSAGE);
            throw new IllegalArgumentException("Rooks > Board Length");
        }//Create exception catching for more rooks than length

        //ArrayList<Integer> rookPosition = new ArrayList<Integer>();

        for (int i = 1; i < numRooks + 1; i++) {
            rookPosition.add(i);
        }
        repaint();

    }//GEN-LAST:event_jButton1MousePressed



    
    
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
            java.util.logging.Logger.getLogger(jFrameRookProblem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFrameRookProblem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFrameRookProblem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFrameRookProblem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFrameRookProblem().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    // End of variables declaration//GEN-END:variables
}
