
package relogio;

/**
 *
 * @author Diego
 */
public class Tela1 extends javax.swing.JFrame {

    int cor=0;

    public Tela1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgCor = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        slAltura = new javax.swing.JSlider();
        jPanel5 = new javax.swing.JPanel();
        paFigs1 = new relogio.PaFigs();
        jPanel3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        btTerminar = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mini Relógio Java");
        jPanel2.add(jLabel1);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel1.setLayout(new java.awt.GridLayout(1, 3));

        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.PAGE_AXIS));

        slAltura.setMaximum(16777216);
        slAltura.setOrientation(javax.swing.JSlider.VERTICAL);
        slAltura.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slAlturaStateChanged(evt);
            }
        });
        jPanel4.add(slAltura);

        jPanel1.add(jPanel4);

        jPanel5.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout paFigs1Layout = new javax.swing.GroupLayout(paFigs1);
        paFigs1.setLayout(paFigs1Layout);
        paFigs1Layout.setHorizontalGroup(
            paFigs1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 177, Short.MAX_VALUE)
        );
        paFigs1Layout.setVerticalGroup(
            paFigs1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 179, Short.MAX_VALUE)
        );

        jPanel5.add(paFigs1, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel5);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel3.setLayout(new java.awt.BorderLayout());

        btTerminar.setText("Terminar");
        btTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTerminarActionPerformed(evt);
            }
        });
        jPanel8.add(btTerminar);

        jPanel3.add(jPanel8, java.awt.BorderLayout.SOUTH);
        jPanel3.add(jPanel7, java.awt.BorderLayout.NORTH);

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTerminarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btTerminarActionPerformed
    
    public void oi(){
        paFigs1.desenha(0, 0, slAltura.getValue());
        paFigs1.repaint();
    }
    
    private void slAlturaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slAlturaStateChanged

    }//GEN-LAST:event_slAlturaStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgCor;
    private javax.swing.JButton btTerminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private relogio.PaFigs paFigs1;
    private javax.swing.JSlider slAltura;
    // End of variables declaration//GEN-END:variables
}
