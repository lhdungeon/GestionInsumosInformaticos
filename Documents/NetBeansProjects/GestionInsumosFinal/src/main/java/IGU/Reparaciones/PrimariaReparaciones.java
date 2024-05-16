
package IGU.Reparaciones;

import IGU.InicialServer;
import Logica.Controladora;
import Logica.Reparaciones.Reparacion;
import java.awt.Color;
import java.awt.Component;
import java.awt.Point;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class PrimariaReparaciones extends javax.swing.JFrame {

    Controladora controlLogica = new Controladora();
    
    DefaultTableModel tabla=null;
    int idOrdenSelect;
    
    public PrimariaReparaciones() {
        initComponents();
        
        cargarTabla();
        cargarReparaciones();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuNuevaReparacion = new javax.swing.JMenuItem();
        jMenuNuevoTecnico = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Servicio", "Equipo", "Diagnostico", "Fecha de carga", "Estado"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
        );

        jMenu1.setText("Nuevo");

        jMenuNuevaReparacion.setText("Nueva Reparacion");
        jMenuNuevaReparacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuNuevaReparacionActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuNuevaReparacion);

        jMenuNuevoTecnico.setText("Nuevo Tecnico");
        jMenuNuevoTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuNuevoTecnicoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuNuevoTecnico);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Consulta");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    private void jMenuNuevaReparacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuNuevaReparacionActionPerformed
        // Nueva Reparacion
        NuevaReparacion nuevaRep = new NuevaReparacion();
        nuevaRep.setVisible(true);
        nuevaRep.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jMenuNuevaReparacionActionPerformed

    private void jMenuNuevoTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuNuevoTecnicoActionPerformed
        // Nuevo Tecnico
        NuevoTecnico nuevoTec = new NuevoTecnico();
        nuevoTec.setVisible(true);
        nuevoTec.setLocationRelativeTo(null);
        this.dispose();
        
    }//GEN-LAST:event_jMenuNuevoTecnicoActionPerformed

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        JTable table =(JTable) evt.getSource();
        Point point = evt.getPoint();
        int row = table.rowAtPoint(point);
        if (evt.getClickCount() == 2 && table.getSelectedRow() != -1) {
            
            String id =jTable1.getValueAt(jTable1.getSelectedRow(), jTable1.getColumnCount()-1).toString();
            idOrdenSelect = Integer.parseInt(id); 
            
            EditarReparacion editRep = new EditarReparacion(idOrdenSelect);
            
            editRep.setVisible(true);
            editRep.setAlwaysOnTop(true);
            editRep.setLocationRelativeTo(this);
            
            this.dispose();
        }
    }//GEN-LAST:event_jTable1MousePressed
   
    private void cargarTabla(){
        tabla = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){return false;}
        };
    
    }
    
    private void cargarReparaciones() {
        ArrayList <Reparacion> listaReparacion = controlLogica.buscarListaReparacion();
        
        String titulos[] = {"Sala", "Equipo", "Diagnostico","Fecha de recepcion","Estado", "ID"}; //si se desea agregar mas columnas,
                                                                                                  //ID Siempre debe ser la ultima columna             
        tabla = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row,int column){return false;}
        };
               
        tabla.setColumnIdentifiers(titulos);
        
        jTable1.setModel(tabla);
        
        for(Reparacion repa : listaReparacion){
            Object[] repaAgregar = {repa.getSala().getSala(), repa.getModelo(), repa.getDiagnostico(),repa.getFechaRecepcion(),repa.getEstado(), repa.getId()};
            tabla.addRow(repaAgregar);
            
            jTable1.setModel(tabla); 
            
            if(repa.getEstado().equals("Recibido")){
                
            
                jTable1.setBackground(Color.red);
                    //pintar solo la fila deseada
            
            }
        }
         
        
      //  jTable1.setGridColor(Color.BLUE);
        //jTable1.setForeground(Color.BLACK);

       
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuNuevaReparacion;
    private javax.swing.JMenuItem jMenuNuevoTecnico;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables


}
