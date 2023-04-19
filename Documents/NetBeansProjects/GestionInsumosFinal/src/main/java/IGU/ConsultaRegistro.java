

package IGU;

import Logica.Controladora;
import Logica.Registro;
import Logica.Servicio;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import javax.swing.DefaultComboBoxModel;


public class ConsultaRegistro extends javax.swing.JFrame {


    Controladora controlLogica = new Controladora();
    Servicio servicio = null;
    ArrayList<Servicio> listaServicio;
    int idSelect;
    
    ArrayList <String> insumosNombreTotal = new ArrayList();
    ArrayList <Integer> insumosCantidadTotal = new ArrayList();
    ArrayList <Integer> punteroAlInsumo = new ArrayList();
    

    public ConsultaRegistro() {
        initComponents();
        this.setTitle("Gestion de insumos informaticos");
        listaServicio = controlLogica.buscarListaServicio();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        btnAtras2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRegistros = new javax.swing.JTextArea();
        jListaServicios = new javax.swing.JComboBox<>();
        txtId = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        btnBuscarTotalInsumo = new javax.swing.JButton();
        comboListaIndividualInsumos = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel10.setBackground(new java.awt.Color(102, 102, 102));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wolf (1).png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Registro");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel11.setBackground(new java.awt.Color(102, 102, 102));

        btnAtras2.setBackground(new java.awt.Color(102, 102, 102));
        btnAtras2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flecha-izquierda.png"))); // NOI18N
        btnAtras2.setBorderPainted(false);
        btnAtras2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtras2ActionPerformed(evt);
            }
        });

        txtRegistros.setEditable(false);
        txtRegistros.setColumns(20);
        txtRegistros.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtRegistros.setRows(5);
        jScrollPane1.setViewportView(txtRegistros);

        jListaServicios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jListaServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jListaServiciosActionPerformed(evt);
            }
        });

        txtId.setBackground(new java.awt.Color(102, 102, 102));
        txtId.setForeground(new java.awt.Color(102, 102, 102));
        txtId.setText("  ");

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/seo (1).png"))); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Observaciones:");

        txtObservaciones.setColumns(20);
        txtObservaciones.setRows(5);
        txtObservaciones.setEnabled(false);
        jScrollPane2.setViewportView(txtObservaciones);

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setText("Editar observaciones sobre el servicio");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnBuscarTotalInsumo.setText("Contar");
        btnBuscarTotalInsumo.setEnabled(false);
        btnBuscarTotalInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarTotalInsumoActionPerformed(evt);
            }
        });

        comboListaIndividualInsumos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboListaIndividualInsumosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jListaServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(btnAtras2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboListaIndividualInsumos, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarTotalInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jListaServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAtras2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBuscarTotalInsumo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboListaIndividualInsumos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtras2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtras2ActionPerformed
        Primaria primaria = new Primaria();
        primaria.setVisible(true);
        primaria.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnAtras2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarListaServicios();
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        insumosNombreTotal.clear();
        btnBuscarTotalInsumo.setEnabled(false);            
        comboListaIndividualInsumos.removeAllItems();
        //comboListaIndividualInsumos.addItem("Seleccione el insumo que desea consultar");
        
        if(jListaServicios.getSelectedItem().toString().equals("Seleccione un servicio")){
           txtObservaciones.setEnabled(false);
           txtObservaciones.setText("");
           txtRegistros.setText("");
           btnBuscarTotalInsumo.setEnabled(false);            

        }
        else{
            
            
            txtRegistros.setText("");
            int numeroDeRegistro=0;
            LinkedList<Registro>listaRegistros=servicio.getListaRegistros();                              
            
            for(int x=0;x<listaRegistros.size();x++){
                
                numeroDeRegistro++;
                txtRegistros.append("Registro numero "+numeroDeRegistro + " :" + "\n" +
                        "Fecha: "+ servicio.getListaRegistros().get(x).getFecha() +"\n" + "Insumos: " + "\n");
                
                for(int i=0;i<servicio.getListaRegistros().get(x).getCantidad_Insumos().size();i++)              {
                    
                    String insumoAListar = servicio.getListaRegistros().get(x).getInsumos_retirados().get(i);
                    int cantidadListar = servicio.getListaRegistros().get(x).getCantidad_Insumos().get(i);
                    
                    txtRegistros.append("                          "+ insumoAListar + "x "+ cantidadListar +"\n" );
                    
                    if(!insumosNombreTotal.contains(insumoAListar)){
                        insumosNombreTotal.add(insumoAListar);                 
                    }
                    
                    insumosCantidadTotal.add(cantidadListar);

                }
                
                txtRegistros.append("\n" + "Retira: "+ servicio.getListaRegistros().get(x).getServi().getNombreResponsable() + "\n" +
                "Dni: " + servicio.getListaRegistros().get(x).getServi().getDniResponsable()+ "\n" + "---------------------------------------------------------" + "\n");                                
                               
            }
            
            Collections.sort(insumosNombreTotal);
            
            for(int z=0;z<insumosNombreTotal.size();z++){
                comboListaIndividualInsumos.addItem(insumosNombreTotal.get(z));
            } 
            
            if(comboListaIndividualInsumos.getSelectedItem() == null){
                btnBuscarTotalInsumo.setEnabled(false);
            }
            else{
                btnBuscarTotalInsumo.setEnabled(true);            
            }   
             
            txtObservaciones.setEnabled(true); 
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jListaServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jListaServiciosActionPerformed
        if(listaServicio!=null){
            for(Servicio servi : listaServicio){
                if(jListaServicios.getSelectedItem().toString().equals(servi.getServicio())){
                    idSelect = (servi.getId());
                    servicio = controlLogica.buscarServicio(idSelect);
                    txtId.setText(Integer.toString(idSelect));
                    txtObservaciones.setText(servi.getObservaciones());
                    break;
                }              
            }
        }
    }//GEN-LAST:event_jListaServiciosActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(jListaServicios.getSelectedItem().toString().equals("Seleccione un servicio")){
            
        }
        else{
            servicio.setObservaciones(txtObservaciones.getText());
            controlLogica.editarServicio(servicio);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnBuscarTotalInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarTotalInsumoActionPerformed
        //String insTotal = comboListaIndividualInsumos.getSelectedItem().toString();
    }//GEN-LAST:event_btnBuscarTotalInsumoActionPerformed

    private void comboListaIndividualInsumosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboListaIndividualInsumosActionPerformed
    
    }//GEN-LAST:event_comboListaIndividualInsumosActionPerformed


    private void cargarListaServicios() {
        DefaultComboBoxModel comboBox = new DefaultComboBoxModel();
        comboBox.addElement("Seleccione un servicio");
        if(listaServicio!=null){
            for(Servicio servicio : listaServicio){
                comboBox.addElement(servicio.getServicio());
                jListaServicios.setModel(comboBox);
            }
        }    
    }    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras2;
    private javax.swing.JButton btnBuscarTotalInsumo;
    private javax.swing.JComboBox<String> comboListaIndividualInsumos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> jListaServicios;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel txtId;
    private javax.swing.JTextArea txtObservaciones;
    private javax.swing.JTextArea txtRegistros;
    // End of variables declaration//GEN-END:variables

}
