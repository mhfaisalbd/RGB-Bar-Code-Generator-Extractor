/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cse.pstu;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.image.ImageFilter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author Mahmud
 */
public class BarCodeRGB extends javax.swing.JFrame {

    /**
     * Creates new form BarCodeRGB
     */
    public BufferedImage img;
    public BarCodeRGB() {
        initComponents();
        img = new BufferedImage(640,32,BufferedImage.TYPE_INT_ARGB);
        imageLabel.setIcon(new ImageIcon(img));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectImg = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        parseToImage = new javax.swing.JButton();
        saveBarCode = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        imageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RGB Bar Code Generator & Reader");

        selectImg.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        selectImg.setText("Load Image");
        selectImg.setToolTipText("");
        selectImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectImgActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N

        parseToImage.setBackground(new java.awt.Color(0, 153, 153));
        parseToImage.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        parseToImage.setForeground(new java.awt.Color(255, 255, 204));
        parseToImage.setText("Create RGB Bar Code");
        parseToImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parseToImageActionPerformed(evt);
            }
        });

        saveBarCode.setBackground(new java.awt.Color(0, 0, 255));
        saveBarCode.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        saveBarCode.setForeground(new java.awt.Color(255, 255, 204));
        saveBarCode.setText("Save Bar Code");
        saveBarCode.setEnabled(false);
        saveBarCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBarCodeActionPerformed(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 153));
        jLabel1.setText("Input your text:");

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 153));
        jLabel2.setText("Output of RGB Bar Code:");

        imageLabel.setBackground(new java.awt.Color(255, 255, 255));
        imageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imageLabel.setPreferredSize(new java.awt.Dimension(640, 32));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(parseToImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(selectImg, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(saveBarCode, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(parseToImage, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBarCode, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectImg, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectImgActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        
        try {
            BufferedImage image = ImageIO.read(chooser.getSelectedFile());
            imageLabel.setIcon(new ImageIcon(image));
            img = image;
            //marchThroughImage(image);
            jTextField2.setText(getOutput(getRGBSet(image)));
        } catch (IOException ex) {
            Logger.getLogger(BarCodeRGB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_selectImgActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void parseToImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parseToImageActionPerformed
        String input = jTextField1.getText();
        String encodedRGB = "";
        for (int i =0; i<input.length(); i++){
            encodedRGB += setRGBSet(setOutput(input.charAt(i)));
        }
        int RGBLength = encodedRGB.length();
        BufferedImage image = 
        new BufferedImage(RGBLength*5, 32, BufferedImage.TYPE_INT_ARGB);
        for(int i = 0; i < RGBLength; i++){
            for (int x = i*5; x < (i+1)*5; x++){
                for (int y = 0; y < 32; y++){
                    image.setRGB(x, y, GetPixelof(encodedRGB.charAt(i)));
                }
            }
        }
        img = image;
        imageLabel.setIcon(new ImageIcon(image));
        saveBarCode.setEnabled(true);
        
    }//GEN-LAST:event_parseToImageActionPerformed

    private void saveBarCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBarCodeActionPerformed
        JFileChooser chooser = new JFileChooser();
        int value = chooser.showSaveDialog(null);
        if (value == JFileChooser.APPROVE_OPTION) {
            try {
                ImageIO.write(img, "jpg", chooser.getSelectedFile());
            } catch (IOException ex) {
                Logger.getLogger(BarCodeRGB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_saveBarCodeActionPerformed
    public void printPixelARGB(int pixel) {
        int alpha = (pixel >> 24) & 0xff;
        int red = (pixel >> 16) & 0xff;
        int green = (pixel >> 8) & 0xff;
        int blue = (pixel) & 0xff;
        System.out.println("argb: " + alpha + ", " + red + ", " + green + ", " + blue);
    }

    private void marchThroughImage(BufferedImage image) {
        int w = image.getWidth();
        int h = image.getHeight();
        System.out.println("width, height: " + w + ", " + h);

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.println("x,y: " + j + ", " + i);
                int pixel = image.getRGB(j, i);
                printPixelARGB(pixel);
                System.out.println("");
            }
      }
    }
    String getRGBSet(BufferedImage image){
        String RGBStream = "";
        int h = image.getHeight();
        int w = image.getWidth();
        for (int i=3; i<w; i= i+5){
            int pixel = image.getRGB(i, h/2);
            RGBStream += pixelARGB(pixel);
        }
        return RGBStream;
    }
    String pixelARGB(int pixel){
        char RGB = 'A';
        double alpha = (pixel >> 24) & 0xff;
        double red = (pixel >> 16) & 0xff;
        double green = (pixel >> 8) & 0xff;
        double blue = (pixel) & 0xff;
        
        if((red+green+blue)/(3.0*alpha) > 0.75){
            RGB = 'A';
        } else if(red > green && red > blue){
            RGB = 'R';
        } else if(green > red && green > blue){
            RGB = 'G';
        } else if(blue > red && blue > green)
            RGB = 'B';
        return RGBtoBin(RGB);
    }
    String setRGBSet(String bin){
        String RGBSet = "";
        for (int i=0; i<= bin.length()-2; i += 2){
            RGBSet += binToRGB(bin.substring(i, i+2));
        }
        return RGBSet;
    }
    char binToRGB(String bin){
        char RGBChar = 'A';
        switch(bin){
            case "00" : RGBChar = 'A';
                break;
            case "01" : RGBChar = 'R';
                break;
            case "10" : RGBChar = 'G';
                break;
            case "11" : RGBChar = 'B';
        }
        return RGBChar;
    }
    String RGBtoBin(char ch){
        String output = "00";
        switch(ch){
            case 'A' : output = "00";
                break;
            case 'R' : output = "01";
                break;
            case 'G' : output = "10";
                break;
            case 'B' : output = "11";
        }
        return output;
    }
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
            java.util.logging.Logger.getLogger(BarCodeRGB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BarCodeRGB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BarCodeRGB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BarCodeRGB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BarCodeRGB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton parseToImage;
    private javax.swing.JButton saveBarCode;
    private javax.swing.JButton selectImg;
    // End of variables declaration//GEN-END:variables
    private String setOutput(char ch){
        String streamBin = Integer.toBinaryString(ch);
        while(streamBin.length() < 8){
            streamBin = "0"+streamBin;
        }
        return streamBin;
    }
    private String getOutput(String rgbSet) {
        String output = "";   
        char nextChar;
        //System.out.println(rgbSet);
        for(int i = 0; i <= rgbSet.length()-8; i += 8) 
        {
            nextChar = (char)Integer.parseInt(rgbSet.substring(i, i+8), 2);
            
            output += nextChar;
        }
        
        return output;
    }

    private int GetPixelof(char ch) {
        int pixel = Color.white.getRGB();
        switch (ch) {
            case 'A': pixel = Color.white.getRGB();
                break;
            case 'R': pixel = Color.red.getRGB();
                break;
            case 'G': pixel = Color.green.getRGB();
                break;
            case 'B': pixel = Color.blue.getRGB();
                break;
        }
        return pixel;
    }
}
