/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

/**
 *
 * @author gizem
 */
public class Frame1 extends javax.swing.JInternalFrame {

   
    public Frame1() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        setClosable(true);
        setForeground(java.awt.Color.white);
        setIconifiable(true);

        jTextPane1.setText("Gerçeklikle karşılaştırıldığında, bilimde vardığımız düzey ilkeldir, çocuk oyuncağıdır. Ama sahip olduğumuz en değerli şey odur. - Albert Einstein\n\n\n\nDüşünüyorum, düşünüyorum, aylarca ve yıllarca. Doksan dokuz kez vardığım sonuç yanlış. Yüzüncü de doğru çıkıyorum. - Albert Einstein \n\n\n\nBilim, bilgi kütlesinden daha fazlası; bir düşünme tarzıdır. Evrenin kuşkuyla sorgulanma tarzıdır. Eğer şüpheci yaklaşmamak için otoriteye kuşkucu sorular soramıyorsak o zaman tam bir kaos içindeyiz. - Carl Sagan ");
        jScrollPane1.setViewportView(jTextPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
