
package IGU.Insumos;

import IGU.InicialServer;
import Logica.Insumos.Computadora;
import Logica.Controladora;
import Logica.Insumos.Hardware;
import Logica.Insumos.RegistroInsumos;
import Logica.Servicios.Sala;
import Logica.Servicios.Servicio;
import Logica.Insumos.Tinta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class PrimariaInsumos extends javax.swing.JFrame {

         
    
    Controladora controlLogica = new Controladora();
    
    ArrayList <Servicio> listaServicios = controlLogica.buscarListaServicios();
    ArrayList <Sala> listaSalas = new ArrayList();
    ArrayList <Tinta> listaTinta = controlLogica.buscarListaTinta();
    ArrayList <Hardware> listaHard = controlLogica.buscarListaHardware();
    ArrayList <Computadora> listaCompu = controlLogica.buscarListaComputadora();
    
    Sala salaSeleccionado = new Sala();
    Servicio servicioSeleccionado = null;
    String serviSelect="";
    String salaSelect="";
    int idServicio;
    int idSala;
    
    DefaultTableModel tablaCarrito = null;
    DefaultComboBoxModel comboModel =new DefaultComboBoxModel();
    String resumen ="";
    
    public PrimariaInsumos() {
        initComponents();
 
        setearTablas();
        setearFecha();
        rellenarCamposServicio();
        this.setTitle("Gestion de insumos informaticos");        
    }

    private void setearTablas(){
        tablaCarrito = new DefaultTableModel(){
            @Override
            public boolean isCellEditable (int row, int column){return false;} 
        };
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnCompu = new javax.swing.JButton();
        btnHardware = new javax.swing.JButton();
        btnTinta = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnConsulta = new javax.swing.JButton();
        btnEditarInsumo = new javax.swing.JButton();
        btnAgregarInsumo = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCarrito = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        boxListaStock = new javax.swing.JComboBox<>();
        txtCantidad = new javax.swing.JLabel();
        txtCantidadNum = new javax.swing.JLabel();
        txtCantidad1 = new javax.swing.JLabel();
        txtId = new javax.swing.JLabel();
        btnEliminarItem1 = new javax.swing.JButton();
        btnAgregarAlCarrito = new javax.swing.JButton();
        txtTipo = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnFinalizarCompra = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        boxServicios = new javax.swing.JComboBox<>();
        boxListaSalas = new javax.swing.JComboBox<>();
        btnAgregarServicio = new javax.swing.JButton();
        btnAgregarSala = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setSize(new java.awt.Dimension(400, 500));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GESTION DE INSUMOS");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wolf (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel1.add(jPanel2, gridBagConstraints);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        btnCompu.setBackground(new java.awt.Color(102, 102, 102));
        btnCompu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/computer-tower.png"))); // NOI18N
        btnCompu.setToolTipText("Computadoras");
        btnCompu.setBorder(null);
        btnCompu.setBorderPainted(false);
        btnCompu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompuActionPerformed(evt);
            }
        });
        jPanel3.add(btnCompu);

        btnHardware.setBackground(new java.awt.Color(102, 102, 102));
        btnHardware.setIcon(new javax.swing.ImageIcon(getClass().getResource("/motherboard (2).png"))); // NOI18N
        btnHardware.setToolTipText("Hardware");
        btnHardware.setBorderPainted(false);
        btnHardware.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHardwareActionPerformed(evt);
            }
        });
        jPanel3.add(btnHardware);

        btnTinta.setBackground(new java.awt.Color(102, 102, 102));
        btnTinta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ink-cartridge.png"))); // NOI18N
        btnTinta.setToolTipText("Tintas");
        btnTinta.setBorderPainted(false);
        btnTinta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTintaActionPerformed(evt);
            }
        });
        jPanel3.add(btnTinta);

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        btnConsulta.setBackground(new java.awt.Color(102, 102, 102));
        btnConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/find.png"))); // NOI18N
        btnConsulta.setToolTipText("Consultas");
        btnConsulta.setBorderPainted(false);
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 6, 0, 6);
        jPanel4.add(btnConsulta, gridBagConstraints);

        btnEditarInsumo.setBackground(new java.awt.Color(102, 102, 102));
        btnEditarInsumo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edit (1).png"))); // NOI18N
        btnEditarInsumo.setToolTipText("Editar un insumo existente");
        btnEditarInsumo.setBorderPainted(false);
        btnEditarInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarInsumoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 6, 0, 6);
        jPanel4.add(btnEditarInsumo, gridBagConstraints);

        btnAgregarInsumo.setBackground(new java.awt.Color(102, 102, 102));
        btnAgregarInsumo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plus.png"))); // NOI18N
        btnAgregarInsumo.setToolTipText("Agregar insumo al stock");
        btnAgregarInsumo.setBorderPainted(false);
        btnAgregarInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarInsumoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 6);
        jPanel4.add(btnAgregarInsumo, gridBagConstraints);

        jPanel3.add(jPanel4);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanel1.add(jPanel3, gridBagConstraints);

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));
        jPanel5.setLayout(new java.awt.GridBagLayout());

        jPanel6.setBackground(new java.awt.Color(102, 102, 102));

        tableCarrito.setBackground(new java.awt.Color(102, 102, 102));
        tableCarrito.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tableCarrito.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tableCarrito.setForeground(new java.awt.Color(0, 0, 0));
        tableCarrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Modelo/Nombre", "Cantidad", "Tipo", "Stock", "ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableCarrito.setRowHeight(50);
        jScrollPane1.setViewportView(tableCarrito);

        jPanel7.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        boxListaStock.setBackground(new java.awt.Color(102, 102, 102));
        boxListaStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxListaStockActionPerformed(evt);
            }
        });

        txtCantidad.setText("Cantidad:");

        txtCantidadNum.setText("        ");

        txtCantidad1.setBackground(new java.awt.Color(102, 102, 102));
        txtCantidad1.setForeground(new java.awt.Color(102, 102, 102));
        txtCantidad1.setText("ID:");

        txtId.setBackground(new java.awt.Color(102, 102, 102));
        txtId.setForeground(new java.awt.Color(102, 102, 102));
        txtId.setText("    ");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(boxListaStock, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCantidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCantidadNum)
                        .addGap(48, 48, 48)
                        .addComponent(txtCantidad1)
                        .addGap(16, 16, 16)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boxListaStock, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCantidadNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCantidad1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanel5.add(jPanel6, gridBagConstraints);

        btnEliminarItem1.setBackground(new java.awt.Color(102, 102, 102));
        btnEliminarItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minus.png"))); // NOI18N
        btnEliminarItem1.setBorderPainted(false);
        btnEliminarItem1.setEnabled(false);
        btnEliminarItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarItem1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 12, 0, 0);
        jPanel5.add(btnEliminarItem1, gridBagConstraints);

        btnAgregarAlCarrito.setBackground(new java.awt.Color(102, 102, 102));
        btnAgregarAlCarrito.setForeground(new java.awt.Color(102, 102, 102));
        btnAgregarAlCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plus.png"))); // NOI18N
        btnAgregarAlCarrito.setToolTipText("Aguante el amargo obrero");
        btnAgregarAlCarrito.setBorderPainted(false);
        btnAgregarAlCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAlCarritoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 12, 0, 14);
        jPanel5.add(btnAgregarAlCarrito, gridBagConstraints);

        txtTipo.setText("-");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 228;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 25, 0, 0);
        jPanel5.add(txtTipo, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 6, 0, 0);
        jPanel1.add(jPanel5, gridBagConstraints);

        jPanel8.setBackground(new java.awt.Color(102, 102, 102));

        jLabel5.setText("Seleccione el servicio");

        jPanel9.setBackground(new java.awt.Color(102, 102, 102));

        btnExit.setBackground(new java.awt.Color(102, 102, 102));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exit (1).png"))); // NOI18N
        btnExit.setBorderPainted(false);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnFinalizarCompra.setBackground(new java.awt.Color(102, 102, 102));
        btnFinalizarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ranking (1).png"))); // NOI18N
        btnFinalizarCompra.setBorderPainted(false);
        btnFinalizarCompra.setEnabled(false);
        btnFinalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarCompraActionPerformed(evt);
            }
        });

        btnPrint.setBackground(new java.awt.Color(102, 102, 102));
        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/expediente.png"))); // NOI18N
        btnPrint.setBorderPainted(false);
        btnPrint.setEnabled(false);
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnFinalizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 239, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnFinalizarCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(btnExit, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPrint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jLabel6.setText("Seleccione el sector");

        boxServicios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        boxServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxServiciosActionPerformed(evt);
            }
        });

        boxListaSalas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        boxListaSalas.setEnabled(false);
        boxListaSalas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxListaSalasActionPerformed(evt);
            }
        });

        btnAgregarServicio.setBackground(new java.awt.Color(102, 102, 102));
        btnAgregarServicio.setForeground(new java.awt.Color(102, 102, 102));
        btnAgregarServicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plus.png"))); // NOI18N
        btnAgregarServicio.setToolTipText("Aguante el amargo obrero");
        btnAgregarServicio.setBorderPainted(false);
        btnAgregarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarServicioActionPerformed(evt);
            }
        });

        btnAgregarSala.setBackground(new java.awt.Color(102, 102, 102));
        btnAgregarSala.setForeground(new java.awt.Color(102, 102, 102));
        btnAgregarSala.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plus.png"))); // NOI18N
        btnAgregarSala.setToolTipText("Aguante el amargo obrero");
        btnAgregarSala.setBorderPainted(false);
        btnAgregarSala.setEnabled(false);
        btnAgregarSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarSalaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boxListaSalas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregarServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarSala, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(183, 183, 183))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boxServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarServicio))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregarSala)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boxListaSalas, javax.swing.GroupLayout.Alignment.LEADING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = -68;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 20, 0, 0);
        jPanel1.add(jPanel8, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 562;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 12, 0, 0);
        jPanel1.add(jSeparator1, gridBagConstraints);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, -1, 897));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        InicialServer inicial = new InicialServer();
        inicial.setVisible(true);
        inicial.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnHardwareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHardwareActionPerformed

       limpiarListaStock();    
       txtTipo.setText("Hardware"); 
       
        if(!listaHard.isEmpty()){
            for(Hardware hard: listaHard){
                comboModel.addElement(hard.getNombre());
                boxListaStock.setModel(comboModel);
            }
        }
        else{
           txtCantidadNum.setText("");
        }
    }//GEN-LAST:event_btnHardwareActionPerformed

    private void btnAgregarInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarInsumoActionPerformed
        //Agregar nuevo insumo al stock
        SeleccionarInsumo seleccionInsumo = new SeleccionarInsumo();
        seleccionInsumo.setVisible(true);
        seleccionInsumo.setLocationRelativeTo(this);
        this.dispose();
    }//GEN-LAST:event_btnAgregarInsumoActionPerformed

    private void btnTintaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTintaActionPerformed

        limpiarListaStock();
        txtTipo.setText("Tinta");   
        
        if(!listaTinta.isEmpty()){
            for(Tinta tinta: listaTinta){
               comboModel.addElement(tinta.getModelo());
               boxListaStock.setModel(comboModel);
            }
        }   
        else {
           txtCantidadNum.setText("");
       }
    }//GEN-LAST:event_btnTintaActionPerformed

    private void boxListaStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxListaStockActionPerformed

        switch (txtTipo.getText()) {          
            case "Tinta":
                for(Tinta tinta : listaTinta){
                    
                    if(boxListaStock.getSelectedItem().toString().equals(tinta.getModelo())){
                        txtCantidadNum.setText(Integer.toString(tinta.getCantidad()));
                        txtId.setText(Integer.toString(tinta.getId()));
                    }
                }   break;
            case "Hardware":
                for(Hardware hard : listaHard){
                    if(boxListaStock.getSelectedItem().toString().equals(hard.getNombre())){
                        txtCantidadNum.setText(Integer.toString(hard.getCantidad()));
                        txtId.setText(Integer.toString(hard.getId()));
                    }
                }   break;
            case "Computadoras":
                for(Computadora compu : listaCompu){
                    if(boxListaStock.getSelectedItem().toString().equals(compu.getMarca())){
                        txtCantidadNum.setText(Integer.toString(compu.getCantidad()));
                        txtId.setText(Integer.toString(compu.getId()));
                    }
                }   break;
            default:
                break;
        }
        
        if(boxListaStock.getModel().getSize()==0){
            txtCantidadNum.setText("");
            txtId.setText("");
        }

        
    }//GEN-LAST:event_boxListaStockActionPerformed

    private void btnCompuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompuActionPerformed
       limpiarListaStock();
       txtTipo.setText("Computadoras");
       if(!listaCompu.isEmpty()){
           
           for(Computadora compu : listaCompu){
                comboModel.addElement(compu.getMarca());
                boxListaStock.setModel(comboModel);
            }
       }
       else {
           txtCantidadNum.setText("");
       }
       
    }//GEN-LAST:event_btnCompuActionPerformed

    @SuppressWarnings("empty-statement")
    private void btnAgregarAlCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAlCarritoActionPerformed
 
        if(txtTipo.getText().equals("-")||boxListaStock.getItemAt(0)==null){
            mostrarMensaje("Seleccione un insumo a agregar", "Informacion","Ningun insumo seleccionado");
        }
        else if(Integer.parseInt(txtCantidadNum.getText())>0){
            
            String itemSeleccionado = boxListaStock.getSelectedItem().toString();
            if(boxListaStock.getModel().getSize() != 0){
                if(tableCarrito.getModel().getValueAt(0, 0)==null){                
                    agregarItemAlCarro(1,Integer.parseInt(txtCantidadNum.getText())-1);    
                }
                else{

                    boolean itemExiste = false;
                    int cantidad = 1;
                    int row=0;

                    for(int i=0;i<tableCarrito.getModel().getRowCount();i++){

                        if(itemSeleccionado.equals(tableCarrito.getValueAt(i, 0))){

                            itemExiste = true;
                            row = i;
                            break;
                        }
                        else{
                            itemExiste = false;
                            row = 0;
                        }
                    }

                    if(itemExiste){      
                        cantidad = Integer.parseInt(tableCarrito.getValueAt(row, 1).toString());
                        cantidad++;
                        tablaCarrito.setValueAt(cantidad, row,1);
                        tablaCarrito.setValueAt(Integer.parseInt(txtCantidadNum.getText())-1, row,3);
                        tableCarrito.setModel(tablaCarrito);
                        restarInsumoLocal();
                    }

                    else if(!itemExiste){
                        cantidad=1;
                        agregarItemAlCarro(1,Integer.parseInt(txtCantidadNum.getText())-1);   
                    }
                }
            }
        }
        else{mostrarMensaje("No quedan insumos de este tipo en el stock", "Error","Error de carga");}
    }//GEN-LAST:event_btnAgregarAlCarritoActionPerformed

    private void btnEliminarItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarItem1ActionPerformed

         if(tableCarrito.getSelectedRow()!=-1){
           
           int selectedRow = tableCarrito.getSelectedRow();
           
           String valueAt = tableCarrito.getValueAt(selectedRow, 1).toString();
           int cantidad =Integer.parseInt(valueAt);
           
           //Si hay mas de un item identico en la lista del carrito
           int stock = Integer.parseInt(tableCarrito.getValueAt(selectedRow, 3).toString());
       
           if(cantidad > 0){
               
         
               switch(tableCarrito.getValueAt(tableCarrito.getSelectedRow(), 2).toString()){
                   case "Tinta":                                          

                     if(listaTinta!=null){
                        for(int i=0;i<listaTinta.size();i++)
                        {
                            if (listaTinta.get(i).getModelo().equals(tableCarrito.getValueAt(tableCarrito.getSelectedRow(),0 ).toString()))
                            {
                                Tinta tinta=listaTinta.get(i);  

                                tinta.setCantidad(tinta.getCantidad()+1);
                                listaTinta.set(i, tinta);

                                tableCarrito.setValueAt(cantidad-1, selectedRow,1);                                     
                                tableCarrito.setValueAt(stock+1, selectedRow, 3);

                               if(tableCarrito.getValueAt(selectedRow, 0).equals(boxListaStock.getSelectedItem().toString())){
                                   txtCantidadNum.setText(Integer.toString(tinta.getCantidad()));
                               }

                               if(Integer.parseInt(tableCarrito.getValueAt(selectedRow,1).toString())<=0){

                                   removerFila(selectedRow);
                               }
                               break;
                            }
                        }break;
                    }
                                      
                   case "Hardware":
                       if(listaHard!=null){
                           for(int i=0;i<listaHard.size();i++){
                               if(listaHard.get(i).getNombre().equals(tableCarrito.getValueAt(tableCarrito.getSelectedRow(),0).toString())){
                                    
                                    Hardware hard = listaHard.get(i);
                                    hard.setCantidad(hard.getCantidad()+1);
                                    listaHard.set(i,hard);

                                    tableCarrito.setValueAt(cantidad-1, selectedRow,1);
                                    tableCarrito.setValueAt(stock+1, selectedRow,3);

                                    if(tableCarrito.getValueAt(selectedRow,0).equals(boxListaStock.getSelectedItem().toString())){
                                         txtCantidadNum.setText(Integer.toString(hard.getCantidad()));
                                    }
                                    
                                    if(Integer.parseInt(tableCarrito.getValueAt(selectedRow,1).toString())<=0){

                                         removerFila(selectedRow);
                                    }
                                    break;
                                }
                            }break;
                        }
                       
                       
                   case "Computadoras":
                       
                       if(listaCompu!=null){
                           for(int i=0;i<listaCompu.size();i++){
                               if(listaCompu.get(i).getMarca().equals(tableCarrito.getValueAt(tableCarrito.getSelectedRow(),0).toString())){
                                    
                                    Computadora compu = listaCompu.get(i);
                                    compu.setCantidad(compu.getCantidad()+1);
                                    listaCompu.set(i,compu);

                                    tableCarrito.setValueAt(cantidad-1, selectedRow,1);
                                    tableCarrito.setValueAt(stock+1, selectedRow,3);

                                    if(tableCarrito.getValueAt(selectedRow,0).equals(boxListaStock.getSelectedItem().toString())){
                                         txtCantidadNum.setText(Integer.toString(compu.getCantidad()));
                                    }
                                    
                                    if(Integer.parseInt(tableCarrito.getValueAt(selectedRow,1).toString())<=0){

                                         removerFila(selectedRow);
                                    }
                                    break;
                                }
                            }break;
                        }
               }
           }
            
        }
        else{
            mostrarMensaje("No hay nada seleccionado para eliminar","Informacion","Seleccione un item");
        }
    }//GEN-LAST:event_btnEliminarItem1ActionPerformed

    private void btnFinalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarCompraActionPerformed
        boolean tintaCargada=false;
        boolean hardCargada=false;
        boolean compuCargada= false;
        
        if(boxServicios.getSelectedItem().toString().equals("Seleccione un servicio") || boxListaSalas.getSelectedItem().toString().equals("Seleccione un sector")){
            mostrarMensaje("El servicio seleccionado no es correcto","Error","Verifique el servicio");
        }
        else{
        
            servicioSeleccionado = controlLogica.buscarServicio(idServicio);
            
            for(int i =0;i<tableCarrito.getRowCount();i++){
                if(tableCarrito.getValueAt(i, 2).toString().equals("Tinta")){
                    tintaCargada = true;
                }
                if(tableCarrito.getValueAt(i, 2).toString().equals("Hardware")){
                    hardCargada=true;
                }
                if(tableCarrito.getValueAt(i, 2).toString().equals("Computadoras")){
                    compuCargada=true;
                }
            }   

            if(tintaCargada){

                for(Tinta tinta : listaTinta){
                    int idT;
                    idT = tinta.getId();
                    if(tinta.getCantidad()!= controlLogica.buscarTinta(idT).getCantidad()){
                        controlLogica.editarTinta(tinta);
                        }
                    }
                }

            if(hardCargada){

                for(Hardware hard : listaHard){
                    int idH = hard.getId();
                    if(hard.getCantidad()!= controlLogica.buscarHardware(idH).getCantidad()){
                        controlLogica.editarHardware(hard);
                        }
                    }
                }

            if(compuCargada){

                for(Computadora compu : listaCompu){
                    int idC=compu.getId();
                    if (compu.getCantidad()!=controlLogica.buscarComputadora(idC).getCantidad()){
                        controlLogica.editarComputadora(compu);
                        }
                    }
                }

            ArrayList <String> lista = new ArrayList();  
            ArrayList <Integer>listaCantidad = new ArrayList();

            for(int i=0;i<tableCarrito.getRowCount();i++){
                String insumoSel = tableCarrito.getValueAt(i, 0).toString();
                int insCantidad = Integer.parseInt(tableCarrito.getValueAt(i,1).toString());
                lista.add(lista.size(), insumoSel);                      
                listaCantidad.add(listaCantidad.size(), insCantidad);
            }


            LinkedList<RegistroInsumos>listaRegistro = salaSeleccionado.getListaRegistros();                    

            RegistroInsumos registro = new RegistroInsumos();
            registro.setFecha(controlLogica.getDateUnformat());
            registro.setServicio(boxServicios.getSelectedItem().toString());
            registro.setInsumos_retirados(lista);
            registro.setCantidad_Insumos(listaCantidad);
            listaRegistro.add(registro);
            registro.setSala(salaSeleccionado);

            controlLogica.nuevoRegistro(registro);
            controlLogica.editarSala(salaSeleccionado);

            mostrarMensaje("La carga se completo correctamente","Informacion","Puede retirar su insumo");
            reset();                    
        } 
    }//GEN-LAST:event_btnFinalizarCompraActionPerformed

    private void btnEditarInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarInsumoActionPerformed
        EditarDatos editar = new EditarDatos();
        editar.setVisible(true);
        editar.setLocationRelativeTo(this);
        this.dispose();
    }//GEN-LAST:event_btnEditarInsumoActionPerformed

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        SeleccionarConsultaRegistro consulta = new SeleccionarConsultaRegistro();
        consulta.setVisible(true);
        consulta.setLocationRelativeTo(this);
        this.dispose();
    }//GEN-LAST:event_btnConsultaActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        if(boxServicios.getSelectedItem().toString().equals("Seleccione un servicio") || boxListaSalas.getSelectedItem().toString().equals("Seleccione un sector")){
            
            mostrarMensaje("El servicio seleccionado no es correcto","Error","Verifique el servicio");
                
        }
        else{
            
            servicioSeleccionado = controlLogica.buscarServicio(idServicio);

            resumen ="El servicio de " + servicioSeleccionado.getNombreServicio()+ " : " + salaSeleccionado.getSala() + " lleva " + "\n";

            for(int a=0;a<tableCarrito.getRowCount();a++){
                resumen = resumen + tableCarrito.getValueAt(a, 0) +" x " +tableCarrito.getValueAt(a,1)+ "\n";
            }

            resumen = resumen + "\n" + "Responsable a cargo: " + salaSeleccionado.getJefeSala() + "\n" + controlLogica.getDate();

            ResumenRetiro resumenW = new ResumenRetiro(resumen);
            resumenW.setVisible(true);
            resumenW.setLocationRelativeTo(null);
            resumenW.setResizable(false);
            resumenW.setAlwaysOnTop(true);
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    private void boxServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxServiciosActionPerformed
        if(boxServicios.getSelectedIndex() != 0){
            for(Servicio servi : listaServicios){
                if(servi.getNombreServicio().equals(boxServicios.getSelectedItem())){
                    servicioSeleccionado = servi;                    
                    idServicio = servi.getId();
                    
                }
            }
            if(servicioSeleccionado != null){
                
                boxListaSalas.removeAllItems();
                boxListaSalas.addItem("Seleccione un sector");
                if(!servicioSeleccionado.getSala().isEmpty()){
                    for(int i=0; i< servicioSeleccionado.getSala().size();i++){
                        boxListaSalas.addItem(servicioSeleccionado.getSala().get(i).getSala());
                    }
                }
                
                listaSalas = servicioSeleccionado.getSala();
                btnAgregarSala.setEnabled(true);
                boxListaSalas.setEnabled(true);
                                
            }
        }
        
        else{ 
            
            listaSalas.clear();
            btnAgregarSala.setEnabled(false);
            boxListaSalas.setEnabled(false);
        }
    }//GEN-LAST:event_boxServiciosActionPerformed

    private void btnAgregarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarServicioActionPerformed
        NuevoServicio nuevoServicio = new NuevoServicio();
        nuevoServicio.setVisible(true);
        nuevoServicio.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnAgregarServicioActionPerformed

    private void btnAgregarSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarSalaActionPerformed
        NuevoSala nuevoSala = new NuevoSala(servicioSeleccionado);
        nuevoSala.setVisible(true);
        nuevoSala.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnAgregarSalaActionPerformed

    private void boxListaSalasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxListaSalasActionPerformed

        //salaSeleccionado = null;
        
            for(Sala sala : listaSalas){
                if(sala.getSala().equals(boxListaSalas.getSelectedItem())){
                    salaSeleccionado = sala;
                    break;
                }
            }
    }//GEN-LAST:event_boxListaSalasActionPerformed

    private void limpiarListaStock(){
        comboModel = new DefaultComboBoxModel();
        
        comboModel.removeAllElements();
       
        boxListaStock.setModel(comboModel);
        
    }

    private void agregarItemAlCarro(int cantidad,int stockTotal){
        if(!boxListaStock.getSelectedItem().toString().equals("")){
            Object[] itemAgregar = {boxListaStock.getSelectedItem().toString(), cantidad, txtTipo.getText(),stockTotal ,txtId.getText()};
            String titulos[] = {"Modelo/Nombre","Cantidad","Tipo","Stock","ID"};
            tablaCarrito.setColumnIdentifiers(titulos);
            tablaCarrito.addRow(itemAgregar);
            tableCarrito.setModel(tablaCarrito);
            restarInsumoLocal();  
            btnEliminarItem1.setEnabled(true);
            btnFinalizarCompra.setEnabled(true);
            btnPrint.setEnabled(true);

        }      
    }
    
    private void restarInsumoLocal(){
        switch (txtTipo.getText()) {
            case "Tinta":
                Tinta tinta = listaTinta.get(boxListaStock.getSelectedIndex());
                tinta.setCantidad(tinta.getCantidad()-1);
                txtCantidadNum.setText(Integer.toString(tinta.getCantidad()));
                listaTinta.set(boxListaStock.getSelectedIndex(), tinta);
                break;
            case "Hardware":
                Hardware hard = listaHard.get(boxListaStock.getSelectedIndex());
                hard.setCantidad(hard.getCantidad()-1);
                txtCantidadNum.setText(Integer.toString(hard.getCantidad()));
                listaHard.set(boxListaStock.getSelectedIndex(), hard);
                break;
            case "Computadoras":
                Computadora compu = listaCompu.get(boxListaStock.getSelectedIndex());
                compu.setCantidad(compu.getCantidad()-1);
                txtCantidadNum.setText(Integer.toString(compu.getCantidad()));
                listaCompu.set(boxListaStock.getSelectedIndex(), compu);
                break;
        }
                
    }
    
    private void setearFecha() {

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
    
    private void rellenarCamposServicio() {
        
        Collections.sort(listaServicios, new Comparator <Servicio>() {
            @Override
            public int compare(Servicio o1, Servicio o2) {
                return o1.getNombreServicio().compareTo(o2.getNombreServicio());
            }

        });
        
        boxServicios.removeAllItems();
        
        if(!listaServicios.isEmpty()){         
            boxServicios.addItem("Seleccione un servicio");
            
            for(Servicio servi : listaServicios){
                boxServicios.addItem(servi.getNombreServicio());                 
            }
        }
        
        else{
            boxServicios.addItem("Cargue un servicio");
        }
           
        boxListaSalas.removeAllItems();
        
    }
    
    private void removerFila(int selectedRow) {
        
        try{
            if(tableCarrito.isValid()){
                tablaCarrito.removeRow(selectedRow);
            }

            if(tablaCarrito.getRowCount()<=0){
                Object[] itemAgregar = {"", "", "","",""};
                String titulos[] = {"Modelo/Nombre","Cantidad","Tipo","Stock","ID"};
                tablaCarrito.setColumnIdentifiers(titulos);
                tablaCarrito.addRow(itemAgregar);
                tablaCarrito = new DefaultTableModel();  
                btnEliminarItem1.setEnabled(false);
                btnPrint.setEnabled(false);
                btnFinalizarCompra.setEnabled(false);
                

          }
        }catch(ArrayIndexOutOfBoundsException aIE){};
        
     
    }


    private void reset() {
        PrimariaInsumos primaria = new PrimariaInsumos();
        primaria.setVisible(true);
        primaria.setLocationRelativeTo(this);
        this.dispose();
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxListaSalas;
    private javax.swing.JComboBox<String> boxListaStock;
    private javax.swing.JComboBox<String> boxServicios;
    private javax.swing.JButton btnAgregarAlCarrito;
    private javax.swing.JButton btnAgregarInsumo;
    private javax.swing.JButton btnAgregarSala;
    private javax.swing.JButton btnAgregarServicio;
    private javax.swing.JButton btnCompu;
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnEditarInsumo;
    private javax.swing.JButton btnEliminarItem1;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFinalizarCompra;
    private javax.swing.JButton btnHardware;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnTinta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tableCarrito;
    private javax.swing.JLabel txtCantidad;
    private javax.swing.JLabel txtCantidad1;
    private javax.swing.JLabel txtCantidadNum;
    private javax.swing.JLabel txtId;
    private javax.swing.JLabel txtTipo;
    // End of variables declaration//GEN-END:variables




}
