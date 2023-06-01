
package IGU;

import IGU.Insumos.PrimariaInsumos;
import IGU.Reparaciones.PrimariaReparaciones;
import IGU.Usuarios.PrimariaUsuarios;

public class InicialServer extends javax.swing.JFrame {

    public InicialServer() {
        initComponents();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnUsuarios = new javax.swing.JButton();
        btnReparaciones = new javax.swing.JButton();
        btnInsumos = new javax.swing.JButton();
        btnRedes = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(java.awt.Color.darkGray);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INF-HOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 80));

        btnUsuarios.setBackground(new java.awt.Color(102, 102, 102));
        btnUsuarios.setText("Usuarios");
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });
        jPanel1.add(btnUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 350, 40));

        btnReparaciones.setBackground(new java.awt.Color(102, 102, 102));
        btnReparaciones.setText("Reparaciones");
        btnReparaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReparacionesActionPerformed(evt);
            }
        });
        jPanel1.add(btnReparaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 350, 40));

        btnInsumos.setBackground(new java.awt.Color(102, 102, 102));
        btnInsumos.setText("Insumos");
        btnInsumos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsumosActionPerformed(evt);
            }
        });
        jPanel1.add(btnInsumos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 350, 40));

        btnRedes.setBackground(new java.awt.Color(102, 102, 102));
        btnRedes.setText("Redes");
        btnRedes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedesActionPerformed(evt);
            }
        });
        jPanel1.add(btnRedes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 350, 40));

        jScrollPane1.setBackground(new java.awt.Color(102, 102, 102));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("                                             Notificaciones");
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 350, 230));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -35, 350, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        PrimariaUsuarios usuarios = new PrimariaUsuarios ();
        usuarios.setVisible(true);
        usuarios.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnReparacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReparacionesActionPerformed
        PrimariaReparaciones reparaciones = new PrimariaReparaciones ();
        reparaciones.setVisible(true);
        reparaciones.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnReparacionesActionPerformed

    private void btnInsumosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsumosActionPerformed
        PrimariaInsumos insumos = new PrimariaInsumos ();
        insumos.setVisible(true);
        insumos.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnInsumosActionPerformed

    private void btnRedesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRedesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInsumos;
    private javax.swing.JButton btnRedes;
    private javax.swing.JButton btnReparaciones;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
