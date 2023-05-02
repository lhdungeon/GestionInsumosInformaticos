

package IGU.Insumos;

import Logica.Controladora;
import Logica.Registro;
import Logica.Sala;
import Logica.Servicio;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ConsultaRegistro extends javax.swing.JFrame {


    Controladora controlLogica = new Controladora();
    Servicio servicio = null;
    Sala sala = null;
    ArrayList<Servicio> listaServicio;
    LinkedList<Registro>listaRegistros;
    int idSelect;
    
    DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            
    ArrayList <String> insumosNombreTotal = new ArrayList();
    DefaultTableModel tabla=null;

    public ConsultaRegistro() {
        initComponents();
        this.setTitle("Gestion de insumos informaticos");
        cargarTabla();
        listaServicio = controlLogica.buscarListaServicios();
        
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
        jListaServicios = new javax.swing.JComboBox<>();
        txtId = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        btnBuscarTotalInsumo = new javax.swing.JButton();
        comboListaIndividualInsumos = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableRegistro = new javax.swing.JTable();
        jListaServicios1 = new javax.swing.JComboBox<>();

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
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        jTableRegistro.setBackground(new java.awt.Color(102, 102, 102));
        jTableRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Registro N°", "Fecha de retiro", "Insumos", "Cantidad", "Retira", "Dni"
            }
        ));
        jScrollPane3.setViewportView(jTableRegistro);

        jListaServicios1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jListaServicios1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jListaServicios1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel11Layout.createSequentialGroup()
                            .addComponent(btnAtras2)
                            .addGap(18, 18, 18)
                            .addComponent(comboListaIndividualInsumos, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addComponent(btnBuscarTotalInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jListaServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jListaServicios1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jListaServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jListaServicios1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAtras2)
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnBuscarTotalInsumo)
                                .addComponent(comboListaIndividualInsumos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addGap(8, 8, 8)
                        .addComponent(jButton2)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 884, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarTabla(){
        tabla = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){return false;}
        };
        
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        Collections.sort(listaServicio, new Comparator <Servicio>() {
            @Override
            public int compare(Servicio o1, Servicio o2) {
                return o1.getNombreServicio().compareTo(o2.getNombreServicio());
            }
        });
        cargarListaServicios();
    }//GEN-LAST:event_formWindowOpened

    private void comboListaIndividualInsumosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboListaIndividualInsumosActionPerformed

    }//GEN-LAST:event_comboListaIndividualInsumosActionPerformed

    private void btnBuscarTotalInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarTotalInsumoActionPerformed
        btnBuscarTotalInsumo.setEnabled(false);


        String insTotal = comboListaIndividualInsumos.getSelectedItem().toString();
        String fechaInicial=dateFormat.format(sala.getListaRegistros().getFirst().getFecha());
        String fechaFinal=dateFormat.format(sala.getListaRegistros().getLast().getFecha());
        
        int total=0;
       
        for(int i=0; i<jTableRegistro.getRowCount();i++){
            if(jTableRegistro.getValueAt(i,2).toString().contains(insTotal)){
                int valor = Integer.parseInt(jTableRegistro.getValueAt(i,3).toString());
                total=total+valor;
            }
            else{}
        }
        

        String mensaje = "El servicio "+ servicio.getNombreServicio()+" consumio un total de "+total+" del insumo "+insTotal+"."+"\n"+"Desde la fecha "+fechaInicial+" hasta la fecha "+ fechaFinal;
        mostrarMensaje(mensaje,"Informacion", "Conteo finalizado");

        btnBuscarTotalInsumo.setEnabled(true);
    }//GEN-LAST:event_btnBuscarTotalInsumoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(jListaServicios.getSelectedItem().toString().equals("Seleccione un servicio")){

        }
        else{sala.setObservaciones(txtObservaciones.getText());
            controlLogica.editarServicio(servicio);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String titulos[] = {"Registro N°", "Fecha de retiro", "Insumos","Cantidad","Retira","Dni"};
        
        tabla = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){return false;}
        };
    
        
        tabla.setColumnIdentifiers(titulos);       
        
        jTableRegistro.setModel(tabla);

     
        insumosNombreTotal.clear();
        btnBuscarTotalInsumo.setEnabled(false);
        comboListaIndividualInsumos.removeAllItems();

        if(jListaServicios.getSelectedItem().toString().equals("Seleccione un servicio")){
            txtObservaciones.setEnabled(false);
            txtObservaciones.setText("");
            btnBuscarTotalInsumo.setEnabled(false);

        }
        else{

            int numeroDeRegistro=1;
            listaRegistros=sala.getListaRegistros();
    
            String insumoAListar ="";

            tabla.setColumnIdentifiers(titulos);
            
            Collections.sort(listaRegistros, new Comparator<Registro>() {
                @Override
                public int compare(Registro o1, Registro o2) {
                    return o1.getFecha().compareTo(o2.getFecha());
                }
            });
            
            
            for(int i=0;i<listaRegistros.size();i++){
               
                if(listaRegistros.get(i).getInsumos_retirados().size()==1){
                
                    String date = dateFormat.format(sala.getListaRegistros().get(i).getFecha());
                    Object[] registroAgregar = {numeroDeRegistro,date, listaRegistros.get(i).getInsumos_retirados().get(0),
                        listaRegistros.get(i).getCantidad_Insumos().get(0), listaRegistros.get(i).getSala().getNombreResponsable(),listaRegistros.get(i).getSala().getDniResponsable()};
                    tabla.addRow(registroAgregar);

                    jTableRegistro.setModel(tabla);
                  
                    insumoAListar = sala.getListaRegistros().get(i).getInsumos_retirados().get(0);   
                    if(!insumosNombreTotal.contains(insumoAListar)){
                        insumosNombreTotal.add(insumoAListar);
                    }
                    
                    numeroDeRegistro++;
                }
                else if(listaRegistros.get(i).getInsumos_retirados().size()>1){
                    
                    for(int z=0;z<listaRegistros.get(i).getInsumos_retirados().size();z++){
                        Object[] registroAgregar = {numeroDeRegistro,sala.getListaRegistros().get(i).getFecha(), listaRegistros.get(i).getInsumos_retirados().get(z),
                        listaRegistros.get(i).getCantidad_Insumos().get(z), listaRegistros.get(i).getSala().getNombreResponsable(),listaRegistros.get(i).getSala().getDniResponsable()};
                        tabla.addRow(registroAgregar);

                        jTableRegistro.setModel(tabla);
                      
                        insumoAListar = sala.getListaRegistros().get(i).getInsumos_retirados().get(z);
                        if(!insumosNombreTotal.contains(insumoAListar)){
                            insumosNombreTotal.add(insumoAListar);
                        }
                    } 
                    numeroDeRegistro++;
                }              
                    
                Collections.sort(insumosNombreTotal);
            }

            

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
                if(jListaServicios.getSelectedItem().toString().equals(servi.getNombreServicio())){
                    idSelect = (servi.getId());
                    servicio = controlLogica.buscarServicio(idSelect);
                    txtId.setText(Integer.toString(idSelect));
                    txtObservaciones.setText(sala.getObservaciones());
                    break;
                }
            }
        }
    }//GEN-LAST:event_jListaServiciosActionPerformed

    private void btnAtras2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtras2ActionPerformed
        PrimariaInsumos primaria = new PrimariaInsumos();
        primaria.setVisible(true);
        primaria.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnAtras2ActionPerformed

    private void jListaServicios1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jListaServicios1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jListaServicios1ActionPerformed


    private void cargarListaServicios() {
        DefaultComboBoxModel comboBox = new DefaultComboBoxModel();
        comboBox.addElement("Seleccione un servicio");
        if(listaServicio!=null){
            for(Servicio servicio : listaServicio){
                comboBox.addElement(servicio.getNombreServicio());
                jListaServicios.setModel(comboBox);
            }
        }    
    }  
    
   private void mostrarMensaje(String mensaje, String tipo, String titulo) {
        JOptionPane ventana = new JOptionPane(mensaje);
        if(tipo.equals("Error")){
            ventana.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        else if(tipo.equals("Informacion")){
            ventana.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        }
        
        JDialog dialog = ventana.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
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
    private javax.swing.JComboBox<String> jListaServicios1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableRegistro;
    private javax.swing.JLabel txtId;
    private javax.swing.JTextArea txtObservaciones;
    // End of variables declaration//GEN-END:variables

}
