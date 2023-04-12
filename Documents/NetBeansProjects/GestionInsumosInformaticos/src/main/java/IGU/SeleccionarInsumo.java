
package IGU;


public class SeleccionarInsumo extends javax.swing.JFrame {

    public SeleccionarInsumo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnCompu = new javax.swing.JButton();
        btnHardware = new javax.swing.JButton();
        btnTinta = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrador\\Documents\\NetBeansProjects\\GestionInsumosFinal\\src\\main\\java\\IGU\\Icons\\wolf (1).png")); // NOI18N

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Agregar nuevo insumo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        btnCompu.setBackground(new java.awt.Color(102, 102, 102));
        btnCompu.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrador\\Documents\\NetBeansProjects\\GestionInsumosFinal\\src\\main\\java\\IGU\\Icons\\computer-tower.png")); // NOI18N
        btnCompu.setToolTipText("Computadoras");
        btnCompu.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnCompu.setBorderPainted(false);
        btnCompu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompuActionPerformed(evt);
            }
        });
        jPanel3.add(btnCompu);

        btnHardware.setBackground(new java.awt.Color(102, 102, 102));
        btnHardware.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrador\\Documents\\NetBeansProjects\\GestionInsumosFinal\\src\\main\\java\\IGU\\Icons\\motherboard (2).png")); // NOI18N
        btnHardware.setToolTipText("Hardware");
        btnHardware.setBorderPainted(false);
        btnHardware.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHardwareActionPerformed(evt);
            }
        });
        jPanel3.add(btnHardware);

        btnTinta.setBackground(new java.awt.Color(102, 102, 102));
        btnTinta.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrador\\Documents\\NetBeansProjects\\GestionInsumosFinal\\src\\main\\java\\IGU\\Icons\\ink-cartridge.png")); // NOI18N
        btnTinta.setToolTipText("Tintas");
        btnTinta.setBorderPainted(false);
        btnTinta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTintaActionPerformed(evt);
            }
        });
        jPanel3.add(btnTinta);

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));

        btnAtras.setBackground(new java.awt.Color(102, 102, 102));
        btnAtras.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrador\\Downloads\\flecha-izquierda.png")); // NOI18N
        btnAtras.setBorderPainted(false);
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAtras)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(btnAtras)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHardwareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHardwareActionPerformed
        NuevoHard nuevoHard = new NuevoHard();
        nuevoHard.setVisible(true);
        nuevoHard.setLocationRelativeTo(this);
        this.dispose();        
    }//GEN-LAST:event_btnHardwareActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
       Primaria primaria = new Primaria();
       primaria.setVisible(true);
       primaria.setLocationRelativeTo(this);
       this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnCompuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompuActionPerformed
        NuevaCompu nuevaCompu = new NuevaCompu();
        nuevaCompu.setVisible(true);
        nuevaCompu.setLocationRelativeTo(this);
        this.dispose();
    }//GEN-LAST:event_btnCompuActionPerformed

    private void btnTintaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTintaActionPerformed
        NuevaTinta nuevaTinta = new NuevaTinta();
        nuevaTinta.setVisible(true);
        nuevaTinta.setLocationRelativeTo(this);
        this.dispose();
    }//GEN-LAST:event_btnTintaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCompu;
    private javax.swing.JButton btnHardware;
    private javax.swing.JButton btnTinta;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
