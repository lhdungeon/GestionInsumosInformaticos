
package IGU.Reparaciones;

import IGU.InicialServer;
import IGU.Usuarios.NuevoServicio;
import Logica.Controladora;
import Logica.Reparaciones.Reparacion;
import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
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
        jMenuNuevo = new javax.swing.JMenu();
        jMenuNuevaReparacion = new javax.swing.JMenuItem();
        jMenuNuevoTecnico = new javax.swing.JMenuItem();
        jMenuNuevoServicio = new javax.swing.JMenuItem();
        jMenuFiltrar = new javax.swing.JMenu();
        jMenuTipo = new javax.swing.JMenu();
        jMenuComputadora = new javax.swing.JMenuItem();
        jMenuImpresora = new javax.swing.JMenuItem();
        jMenuHardware = new javax.swing.JMenuItem();
        jMenuMonitor = new javax.swing.JMenuItem();
        jMenuAllInOne = new javax.swing.JMenuItem();
        jMenuNoteBook = new javax.swing.JMenuItem();
        jMenuEstado = new javax.swing.JMenu();
        jMenuRecibido = new javax.swing.JMenuItem();
        jMenuEntregado = new javax.swing.JMenuItem();
        jMenuEnProceso = new javax.swing.JMenuItem();
        jMenuDiagnosticado = new javax.swing.JMenuItem();
        jMenuFinalizado = new javax.swing.JMenuItem();
        jMenuTodo = new javax.swing.JMenuItem();
        jMenuAtras = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
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

        jMenuNuevo.setText("Nuevo");

        jMenuNuevaReparacion.setText("Nueva Reparacion");
        jMenuNuevaReparacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuNuevaReparacionActionPerformed(evt);
            }
        });
        jMenuNuevo.add(jMenuNuevaReparacion);

        jMenuNuevoTecnico.setText("Nuevo Tecnico");
        jMenuNuevoTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuNuevoTecnicoActionPerformed(evt);
            }
        });
        jMenuNuevo.add(jMenuNuevoTecnico);

        jMenuNuevoServicio.setText("Nuevo Servicio");
        jMenuNuevoServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuNuevoServicioActionPerformed(evt);
            }
        });
        jMenuNuevo.add(jMenuNuevoServicio);

        jMenuBar1.add(jMenuNuevo);

        jMenuFiltrar.setText("Filtrar");

        jMenuTipo.setText("Por Tipo");

        jMenuComputadora.setText("Computadora");
        jMenuComputadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuComputadoraActionPerformed(evt);
            }
        });
        jMenuTipo.add(jMenuComputadora);

        jMenuImpresora.setText("Impresora");
        jMenuImpresora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuImpresoraActionPerformed(evt);
            }
        });
        jMenuTipo.add(jMenuImpresora);

        jMenuHardware.setText("Hardware");
        jMenuHardware.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuHardwareActionPerformed(evt);
            }
        });
        jMenuTipo.add(jMenuHardware);

        jMenuMonitor.setText("Monitor");
        jMenuMonitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuMonitorActionPerformed(evt);
            }
        });
        jMenuTipo.add(jMenuMonitor);

        jMenuAllInOne.setText("All In One");
        jMenuAllInOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAllInOneActionPerformed(evt);
            }
        });
        jMenuTipo.add(jMenuAllInOne);

        jMenuNoteBook.setText("NoteBook");
        jMenuNoteBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuNoteBookActionPerformed(evt);
            }
        });
        jMenuTipo.add(jMenuNoteBook);

        jMenuFiltrar.add(jMenuTipo);

        jMenuEstado.setText("Por Estado");

        jMenuRecibido.setText("Recibido");
        jMenuRecibido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuRecibidoActionPerformed(evt);
            }
        });
        jMenuEstado.add(jMenuRecibido);

        jMenuEntregado.setText("Entregado");
        jMenuEntregado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEntregadoActionPerformed(evt);
            }
        });
        jMenuEstado.add(jMenuEntregado);

        jMenuEnProceso.setText("En Proceso");
        jMenuEnProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEnProcesoActionPerformed(evt);
            }
        });
        jMenuEstado.add(jMenuEnProceso);

        jMenuDiagnosticado.setText("Diagnoticado");
        jMenuDiagnosticado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuDiagnosticadoActionPerformed(evt);
            }
        });
        jMenuEstado.add(jMenuDiagnosticado);

        jMenuFinalizado.setText("Finalizado");
        jMenuFinalizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFinalizadoActionPerformed(evt);
            }
        });
        jMenuEstado.add(jMenuFinalizado);

        jMenuFiltrar.add(jMenuEstado);

        jMenuTodo.setText("Mostrar todo");
        jMenuTodo.setActionCommand("Por Sector");
        jMenuTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuTodoActionPerformed(evt);
            }
        });
        jMenuFiltrar.add(jMenuTodo);

        jMenuBar1.add(jMenuFiltrar);

        jMenuAtras.setText("Atras");
        jMenuAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuAtrasMouseClicked(evt);
            }
        });
        jMenuAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAtrasActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenuAtras);

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

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if(jTable1.getValueAt(jTable1.getSelectedRow(), 4).equals("A: Recibido")){
            jTable1.setSelectionBackground(Color.RED);
        }
        else if(jTable1.getValueAt(jTable1.getSelectedRow(), 4).equals("B: En Proceso")){
            jTable1.setSelectionBackground(Color.YELLOW);
        }
        else if(jTable1.getValueAt(jTable1.getSelectedRow(), 4).equals("C: Diagnostico")){
            jTable1.setSelectionBackground(Color.BLUE);
        }
        else if(jTable1.getValueAt(jTable1.getSelectedRow(), 4).equals("D: Reparada")){
            jTable1.setSelectionBackground(Color.GREEN);
        }
        else if(jTable1.getValueAt(jTable1.getSelectedRow(), 4).equals("E: Entregada")){
            jTable1.setSelectionBackground(Color.gray);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jMenuAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAtrasActionPerformed
        //Boton Atras ActionPerformed
    }//GEN-LAST:event_jMenuAtrasActionPerformed

    private void jMenuAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuAtrasMouseClicked
        InicialServer inicialServer = new InicialServer();
        inicialServer.setVisible(true);
        inicialServer.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jMenuAtrasMouseClicked

    private void filtrarReparaciones(String tipoFiltro, String tipoABuscar){
        
        ArrayList<Reparacion> listaReparacionTipo = new ArrayList();
        
        switch (tipoFiltro){
            case "Tipo":
                for (Reparacion repa : controlLogica.buscarListaReparacion()){
                    if(repa.getTipoDeReparacion().equals(tipoABuscar)){
                        listaReparacionTipo.add(repa);        
                    }
                }
                break;
                
            case"Estado":
                for (Reparacion repa : controlLogica.buscarListaReparacion()){
                    if(repa.getEstado().equals(tipoABuscar)){
                        listaReparacionTipo.add(repa);        
                    }
                }
                break;    
                
            case"Tecnico":
                for (Reparacion repa : controlLogica.buscarListaReparacion()){
                    if(repa.getTipoDeReparacion().equals(tipoABuscar)){
                        listaReparacionTipo.add(repa);        
                    }
                }
                break;   
                
            case"Todo":
                for (Reparacion repa : controlLogica.buscarListaReparacion()){
                    listaReparacionTipo.add(repa);  
                }
                break;   
        }
        
        String titulos[] = {"Sala", "Equipo", "Diagnostico","Fecha de recepcion","Estado", "ID"}; //si se desea agregar mas columnas,
                                                                                                  //ID Siempre debe ser la ultima columna             
        tabla = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row,int column){return false;}
        };
               
        tabla.setColumnIdentifiers(titulos);
        
        jTable1.setModel(tabla);
        
            Collections.sort(listaReparacionTipo, new Comparator <Reparacion>() {
            @Override
            public int compare(Reparacion o1, Reparacion o2) {
                return o1.getEstado().compareTo(o2.getEstado());
            }
        });
            
        for(Reparacion repa : listaReparacionTipo){
            Object[] repaAgregar = {repa.getSala().getServicio().getNombreServicio()+ "/" +repa.getSala().getSala(), repa.getTipoDeReparacion()+": "+repa.getModelo(), repa.getDiagnostico(),repa.getFechaRecepcion(),repa.getEstado(), repa.getId()};
             
            tabla.addRow(repaAgregar);
            jTable1.setModel(tabla); 
        }
                
    }
    private void jMenuComputadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuComputadoraActionPerformed
        filtrarReparaciones("Tipo", "Computadora");
    }//GEN-LAST:event_jMenuComputadoraActionPerformed

    private void jMenuTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTodoActionPerformed
       filtrarReparaciones("Todo","Todo");
    }//GEN-LAST:event_jMenuTodoActionPerformed

    private void jMenuNuevoServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuNuevoServicioActionPerformed
        NuevoServicio nuevoServicio = new NuevoServicio();
        nuevoServicio.setVisible(true);
        nuevoServicio.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jMenuNuevoServicioActionPerformed

    private void jMenuImpresoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuImpresoraActionPerformed
        filtrarReparaciones("Tipo", "Impresora");
    }//GEN-LAST:event_jMenuImpresoraActionPerformed

    private void jMenuHardwareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuHardwareActionPerformed
        filtrarReparaciones("Tipo", "Hardware");
    }//GEN-LAST:event_jMenuHardwareActionPerformed

    private void jMenuMonitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuMonitorActionPerformed
        filtrarReparaciones("Tipo", "Monitor");
    }//GEN-LAST:event_jMenuMonitorActionPerformed

    private void jMenuAllInOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAllInOneActionPerformed
        filtrarReparaciones("Tipo", "All in one");
    }//GEN-LAST:event_jMenuAllInOneActionPerformed

    private void jMenuNoteBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuNoteBookActionPerformed
        filtrarReparaciones("Tipo", "Notebook");
    }//GEN-LAST:event_jMenuNoteBookActionPerformed

    private void jMenuRecibidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuRecibidoActionPerformed
        filtrarReparaciones("Estado", "A: Recibido");
    }//GEN-LAST:event_jMenuRecibidoActionPerformed

    private void jMenuEntregadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEntregadoActionPerformed
        filtrarReparaciones("Estado", "E: Entregada");
    }//GEN-LAST:event_jMenuEntregadoActionPerformed

    private void jMenuEnProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEnProcesoActionPerformed
        filtrarReparaciones("Estado", "B: En Proceso");
    }//GEN-LAST:event_jMenuEnProcesoActionPerformed

    private void jMenuDiagnosticadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuDiagnosticadoActionPerformed
        filtrarReparaciones("Estado", "C: Diagnostico");
    }//GEN-LAST:event_jMenuDiagnosticadoActionPerformed

    private void jMenuFinalizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFinalizadoActionPerformed
        filtrarReparaciones("Estado", "D: Reparada");
    }//GEN-LAST:event_jMenuFinalizadoActionPerformed
   
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
        
            Collections.sort(listaReparacion, new Comparator <Reparacion>() {
            @Override
            public int compare(Reparacion o1, Reparacion o2) {
                return o1.getEstado().compareTo(o2.getEstado());
            }
        });
            
        //Estas lineas son el comienzo de una organizacion en las listas mas prudente.
        //Inicialmente creamos una lista por cada estado conocido.
        //Luego filtramos las reparaciones cargadas y las agregamos a la lista correspondiente
        //luego ordenamos cada una de las listas por fecha
        //agregamos todas las listas en orden, a una nueva lista auxiliar
        //y esta lista auxiliar es la que que se muestra en el IGU
/*        
       ArrayList <Reparacion> repaRecibida = new ArrayList();
       ArrayList <Reparacion> repaDiag = new ArrayList();

       for(int i=0;i<listaReparacion.size();i++){
           switch (listaReparacion.get(i).getEstado()){
                case "Recibida":
                    repaRecibida.add(listaReparacion.get(i));
                    break;
                case "Diagnostico":
                    repaDiag.add(listaReparacion.get(i));
                    break;
           }                      
       }
*/       
        for(Reparacion repa : listaReparacion){
            Object[] repaAgregar = {repa.getSala().getServicio().getNombreServicio()+ "/" +repa.getSala().getSala(), repa.getTipoDeReparacion()+": "+repa.getModelo(), repa.getDiagnostico(),repa.getFechaRecepcion(),repa.getEstado(), repa.getId()};
             
            tabla.addRow(repaAgregar);
            jTable1.setModel(tabla); 
        }
    }
    
    /*
        1:
            el codigo presenta errores en otros alas del programa. 
            la division de servicio y sector hace saltar errores en la edicion de los servicios
            no permitiendo borrar o editar algun servicio o sala cargado por error.
    
        2:
            para este sistema no es necesario la carga de contraseña y usuarios. la pagina web no se incluira en este nucleo de software.
            deletear y optimizar esta parte
        3: 
            la hoja de reparacion no panea bien la linea "Detalle " y "Diagnostico" si estas lineas se extienden quedan fuera de la hoja
            Deberian acomodarse a un cuadro con formato de linea.
        4:
            En la hoja de reparacion no esta impreso el estado de la reparacion.
    
        5:
    
    */
    

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jMenuAllInOne;
    private javax.swing.JMenu jMenuAtras;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuComputadora;
    private javax.swing.JMenuItem jMenuDiagnosticado;
    private javax.swing.JMenuItem jMenuEnProceso;
    private javax.swing.JMenuItem jMenuEntregado;
    private javax.swing.JMenu jMenuEstado;
    private javax.swing.JMenu jMenuFiltrar;
    private javax.swing.JMenuItem jMenuFinalizado;
    private javax.swing.JMenuItem jMenuHardware;
    private javax.swing.JMenuItem jMenuImpresora;
    private javax.swing.JMenuItem jMenuMonitor;
    private javax.swing.JMenuItem jMenuNoteBook;
    private javax.swing.JMenuItem jMenuNuevaReparacion;
    private javax.swing.JMenu jMenuNuevo;
    private javax.swing.JMenuItem jMenuNuevoServicio;
    private javax.swing.JMenuItem jMenuNuevoTecnico;
    private javax.swing.JMenuItem jMenuRecibido;
    private javax.swing.JMenu jMenuTipo;
    private javax.swing.JMenuItem jMenuTodo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables


}
