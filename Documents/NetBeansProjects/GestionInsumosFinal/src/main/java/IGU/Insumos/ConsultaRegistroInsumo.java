

package IGU.Insumos;

import Logica.Computadora;
import Logica.Controladora;
import Logica.Hardware;
import Logica.Registro;
import Logica.Sala;
import Logica.Tinta;
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


public class ConsultaRegistroInsumo extends javax.swing.JFrame {


    Controladora controlLogica = new Controladora();
    
    Tinta tinta=null;
    Hardware hard=null;
    Computadora compu=null;
    
    ArrayList<Hardware> listaHard;
    ArrayList<Computadora>listaCompu;
    ArrayList<Tinta>listaTinta;
    ArrayList<Registro>listaRegistros;
    
    int idSelect;
    
    DefaultTableModel tabla=null;

    public ConsultaRegistroInsumo() {
        initComponents();
        
        this.setTitle("Gestion de insumos informaticos");
        
        cargarTabla();
        
        listaTinta = controlLogica.buscarListaTinta();
        listaHard = controlLogica.buscarListaHardware();
        listaCompu = controlLogica.buscarListaComputadora();
        listaRegistros = controlLogica.buscarListaRegistro();
        
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
        jListaInsumos = new javax.swing.JComboBox<>();
        txtId = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnBuscarTotalInsumo = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableRegistro = new javax.swing.JTable();
        jListaInsumos1 = new javax.swing.JComboBox<>();

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
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
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

        jListaInsumos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jListaInsumos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jListaInsumosActionPerformed(evt);
            }
        });

        txtId.setBackground(new java.awt.Color(102, 102, 102));
        txtId.setForeground(new java.awt.Color(102, 102, 102));
        txtId.setText("  ");

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/seo (1).png"))); // NOI18N
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnBuscarTotalInsumo.setText("Contar");
        btnBuscarTotalInsumo.setEnabled(false);
        btnBuscarTotalInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarTotalInsumoActionPerformed(evt);
            }
        });

        jTableRegistro.setBackground(new java.awt.Color(102, 102, 102));
        jTableRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Registro N°", "Fecha de retiro", "Insumos", "Cantidad", "Servicio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTableRegistro);

        jListaInsumos1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jListaInsumos1.setEnabled(false);
        jListaInsumos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jListaInsumos1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(btnAtras2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscarTotalInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jListaInsumos, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jListaInsumos1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jListaInsumos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jListaInsumos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAtras2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscarTotalInsumo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        DefaultComboBoxModel comboBox = new DefaultComboBoxModel();
        comboBox.addElement("Seleccione un tipo de insumo");
        comboBox.addElement("Tinta");
        comboBox.addElement("Hardware");
        comboBox.addElement("Computadoras");
        jListaInsumos.setModel(comboBox);
        
        DefaultComboBoxModel comboBoxTipo = new DefaultComboBoxModel();
        comboBoxTipo.addElement("Seleccione el insumo");
        jListaInsumos1.setModel(comboBoxTipo);
  
    }//GEN-LAST:event_formWindowOpened

    private void btnBuscarTotalInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarTotalInsumoActionPerformed
        
        btnBuscarTotalInsumo.setEnabled(false);
        
        String fechaInicial = jTableRegistro.getValueAt(0, 1).toString();
        String fechaFinal = jTableRegistro.getValueAt(jTableRegistro.getRowCount()-1, 1).toString();
        
        int total=0;
       
        for(int i=0; i<jTableRegistro.getRowCount();i++){
           
            int valor = Integer.parseInt(jTableRegistro.getValueAt(i,3).toString());
            total=total+valor;           
        }        
        
        
        String mensaje = "El insumo "+ jTableRegistro.getValueAt(0, 2)+" tiene un consumo total de: "+total+ "\n"+"Desde la fecha "+fechaInicial+" hasta la fecha "+ fechaFinal;
        mostrarMensaje(mensaje,"Informacion", "Conteo finalizado");

        btnBuscarTotalInsumo.setEnabled(true); 
    }//GEN-LAST:event_btnBuscarTotalInsumoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
             
        String titulos[] = {"Registro N°", "Fecha de retiro", "Insumos","Cantidad","Servicio"};
        
        tabla = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row,int column){return false;}
        };
        
        tabla.setColumnIdentifiers(titulos);
     
        jTableRegistro.setModel(tabla);
       
        String insumoSelec = jListaInsumos1.getSelectedItem().toString();
        int numeroDeRegistro=1;
        
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        
        for(Registro registro : listaRegistros){
            for(int i=0;i<registro.getInsumos_retirados().size();i++){
                if(insumoSelec.equals(registro.getInsumos_retirados().get(i))){
                    
                    String date = dateFormat.format(registro.getFecha());
                    
                    Object[] registroAgregar = {numeroDeRegistro,date, 
                                                registro.getInsumos_retirados().get(i),
                                                registro.getCantidad_Insumos().get(i),
                                                registro.getServicio()};
                       
                    tabla.addRow(registroAgregar);
                    jTableRegistro.setModel(tabla);
                    
                    numeroDeRegistro++;
                }
            }
        }
        if(listaRegistros.size()>0){
            btnBuscarTotalInsumo.setEnabled(true);
        }
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jListaInsumosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jListaInsumosActionPerformed
                             
        jListaInsumos1.removeAllItems();
           
        switch (jListaInsumos.getSelectedItem().toString()){
                
            case "Seleccione un tipo de insumo":{
                jButton1.setEnabled(false);
                    
            }
            break;
                
            case "Tinta":
                for(Tinta tinta : listaTinta){
                    jListaInsumos1.addItem(tinta.getModelo());
                }
                break;
                    
            case "Hardware":
                for(Hardware hard : listaHard){
                    jListaInsumos1.addItem(hard.getNombre());
                }
                break;
                    
            case "Computadoras":
                for(Computadora compu : listaCompu){
                    jListaInsumos1.addItem(compu.getMarca());
                }
                break;            
        }
            
        jListaInsumos1.setEnabled(true);
    }//GEN-LAST:event_jListaInsumosActionPerformed

    private void btnAtras2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtras2ActionPerformed
        PrimariaInsumos primaria = new PrimariaInsumos();
        primaria.setVisible(true);
        primaria.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnAtras2ActionPerformed

    private void jListaInsumos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jListaInsumos1ActionPerformed
        if(jListaInsumos!=null){
            jButton1.setEnabled(true);
        }
    }//GEN-LAST:event_jListaInsumos1ActionPerformed
    
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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> jListaInsumos;
    private javax.swing.JComboBox<String> jListaInsumos1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableRegistro;
    private javax.swing.JLabel txtId;
    // End of variables declaration//GEN-END:variables

}
