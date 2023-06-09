
package IGU;

import Logica.Computadora;
import Logica.Controladora;
import Logica.Hardware;
import Logica.Registro;
import Logica.Servicio;
import Logica.Tinta;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Primaria extends javax.swing.JFrame {

            
    Controladora controlLogica = new Controladora();
    ArrayList <Servicio> listaServicios = controlLogica.buscarListaServicio();       
    ArrayList <Tinta> listaTinta = controlLogica.buscarListaTinta();
    ArrayList <Hardware> listaHard = controlLogica.buscarListaHardware();
    ArrayList <Computadora> listaCompu = controlLogica.buscarListaComputadora();
    Servicio servicioSeleccionado = null;
    int idServicio;
    DefaultTableModel tablaCarrito = null;
    DefaultComboBoxModel comboModel =new DefaultComboBoxModel();

    public Primaria() {
        initComponents();
        setearTabla();
        setearFecha();
        rellenarCamposServicio();
        
    }

    private void setearTabla(){
        tablaCarrito = new DefaultTableModel(){
            @Override
            public boolean isCellEditable (int row, int column){return false;} 
        };
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnCompu = new javax.swing.JButton();
        btnHardware = new javax.swing.JButton();
        btnTinta = new javax.swing.JButton();
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
        btnAgregarServicio = new javax.swing.JButton();
        boxServicio = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnFinalizarCompra = new javax.swing.JButton();
        txtFecha = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        btnConsulta = new javax.swing.JButton();
        btnEditarInsumo = new javax.swing.JButton();
        btnAgregarInsumo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GESTION DE INSUMOS");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrador\\Downloads\\wolf (1).png")); // NOI18N

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

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        btnCompu.setBackground(new java.awt.Color(102, 102, 102));
        btnCompu.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrador\\Downloads\\computer-tower.png")); // NOI18N
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
        btnHardware.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrador\\Downloads\\motherboard (2).png")); // NOI18N
        btnHardware.setToolTipText("Hardware");
        btnHardware.setBorderPainted(false);
        btnHardware.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHardwareActionPerformed(evt);
            }
        });
        jPanel3.add(btnHardware);

        btnTinta.setBackground(new java.awt.Color(102, 102, 102));
        btnTinta.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrador\\Downloads\\ink-cartridge.png")); // NOI18N
        btnTinta.setToolTipText("Tintas");
        btnTinta.setBorderPainted(false);
        btnTinta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTintaActionPerformed(evt);
            }
        });
        jPanel3.add(btnTinta);

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));

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
                false, false, false, true, false
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

        txtCantidad1.setText("ID:");

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

        btnEliminarItem1.setBackground(new java.awt.Color(102, 102, 102));
        btnEliminarItem1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrador\\Downloads\\minus.png")); // NOI18N
        btnEliminarItem1.setEnabled(false);
        btnEliminarItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarItem1ActionPerformed(evt);
            }
        });

        btnAgregarAlCarrito.setBackground(new java.awt.Color(102, 102, 102));
        btnAgregarAlCarrito.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrador\\Downloads\\plus.png")); // NOI18N
        btnAgregarAlCarrito.setToolTipText("Aguante el amargo obrero");
        btnAgregarAlCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAlCarritoActionPerformed(evt);
            }
        });

        txtTipo.setText("-");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminarItem1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarAlCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnAgregarAlCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnEliminarItem1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel8.setBackground(new java.awt.Color(102, 102, 102));

        btnAgregarServicio.setBackground(new java.awt.Color(102, 102, 102));
        btnAgregarServicio.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrador\\Documents\\NetBeansProjects\\GestionInsumosFinal\\src\\main\\java\\IGU\\Icons\\plus.png")); // NOI18N
        btnAgregarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarServicioActionPerformed(evt);
            }
        });

        boxServicio.setBackground(new java.awt.Color(102, 102, 102));
        boxServicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un servicio" }));
        boxServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxServicioActionPerformed(evt);
            }
        });

        jLabel5.setText("Seleccione el servicio");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnAgregarServicio)
                .addGap(99, 99, 99))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregarServicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(boxServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(102, 102, 102));

        btnExit.setBackground(new java.awt.Color(102, 102, 102));
        btnExit.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrador\\Documents\\NetBeansProjects\\GestionInsumosFinal\\src\\main\\java\\IGU\\Icons\\exit (1).png")); // NOI18N
        btnExit.setBorderPainted(false);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnFinalizarCompra.setBackground(new java.awt.Color(102, 102, 102));
        btnFinalizarCompra.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrador\\Documents\\NetBeansProjects\\GestionInsumosFinal\\src\\main\\java\\IGU\\Icons\\ranking (1).png")); // NOI18N
        btnFinalizarCompra.setBorderPainted(false);
        btnFinalizarCompra.setEnabled(false);
        btnFinalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarCompraActionPerformed(evt);
            }
        });

        txtFecha.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtFecha.setText("Fecha");
        txtFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFechaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnFinalizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnFinalizarCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExit, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14))))
        );

        jSeparator1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        btnConsulta.setBackground(new java.awt.Color(102, 102, 102));
        btnConsulta.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrador\\Downloads\\find.png")); // NOI18N
        btnConsulta.setToolTipText("Consultas");
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });

        btnEditarInsumo.setBackground(new java.awt.Color(102, 102, 102));
        btnEditarInsumo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrador\\Downloads\\edit (1).png")); // NOI18N
        btnEditarInsumo.setToolTipText("Editar un insumo existente");
        btnEditarInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarInsumoActionPerformed(evt);
            }
        });

        btnAgregarInsumo.setBackground(new java.awt.Color(102, 102, 102));
        btnAgregarInsumo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrador\\Downloads\\plus.png")); // NOI18N
        btnAgregarInsumo.setToolTipText("Agregar insumo al stock");
        btnAgregarInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarInsumoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditarInsumo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregarInsumo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(btnAgregarInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(btnEditarInsumo))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnHardwareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHardwareActionPerformed

       limpiarListaStock();    
       txtTipo.setText("Hardware"); 
       
       if(listaHard != null){
            for(Hardware hard: listaHard){
                comboModel.addElement(hard.getNombre());
                boxListaStock.setModel(comboModel);
            }
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
        if(listaTinta!=null){
            for(Tinta tinta: listaTinta){
               comboModel.addElement(tinta.getModelo());
               boxListaStock.setModel(comboModel);
            }
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
       
       for(Computadora compu : listaCompu){
           comboModel.addElement(compu.getMarca());
           boxListaStock.setModel(comboModel);
       }
       
    }//GEN-LAST:event_btnCompuActionPerformed

    @SuppressWarnings("empty-statement")
    private void btnAgregarAlCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAlCarritoActionPerformed
        
        if(txtTipo.getText().equals("-")){
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

    private void btnAgregarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarServicioActionPerformed
        NuevoServicio nuevoServicio = new NuevoServicio();
        nuevoServicio.setVisible(true);
        nuevoServicio.setLocationRelativeTo(this);
        this.dispose();
        
    }//GEN-LAST:event_btnAgregarServicioActionPerformed

    private void txtFechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFechaMouseClicked
        setearFecha();
        
    }//GEN-LAST:event_txtFechaMouseClicked

    private void btnEliminarItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarItem1ActionPerformed
 
         if(tableCarrito.getSelectedRow()!=-1){
           
           int selectedRow = tableCarrito.getSelectedRow();
           
           String valueAt = tableCarrito.getValueAt(selectedRow, 1).toString();
           int cantidad =Integer.parseInt(valueAt);
           
           //Si hay mas de un item identico en la lista del carrito
           int idSeleccionado = Integer.parseInt(tableCarrito.getValueAt(selectedRow, 4).toString())-1;
           int stock = Integer.parseInt(tableCarrito.getValueAt(selectedRow, 3).toString());
       
           if(cantidad > 0){
               
         
               switch(tableCarrito.getValueAt(tableCarrito.getSelectedRow(), 2).toString()){
                   case "Tinta":
                     
                     Tinta tinta = listaTinta.get(idSeleccionado);  
                     
                     tinta.setCantidad(tinta.getCantidad()+1);
                     listaTinta.set(idSeleccionado, tinta);
                     
                     tableCarrito.setValueAt(cantidad-1, selectedRow,1);                                     
                     tableCarrito.setValueAt(stock+1, selectedRow, 3);
                     
                     if(tableCarrito.getValueAt(selectedRow, 0).equals(boxListaStock.getSelectedItem().toString())){
                         txtCantidadNum.setText(Integer.toString(tinta.getCantidad()));
                     }
                     
                     if(Integer.parseInt(tableCarrito.getValueAt(selectedRow,1).toString())<=0){
                        
                         removerFila(selectedRow);
                     }
                     break;
                   
                   case "Hardware":
                       Hardware hard = listaHard.get(idSeleccionado);
                       hard.setCantidad(hard.getCantidad()+1);
                       listaHard.set(boxListaStock.getSelectedIndex(),hard);
                       
                       tableCarrito.setValueAt(cantidad-1, selectedRow,1);
                       tableCarrito.setValueAt(stock+1, selectedRow,3);
                       
                       if(tableCarrito.getValueAt(selectedRow,0).equals(boxListaStock.getSelectedItem().toString())){
                            txtCantidadNum.setText(Integer.toString(hard.getCantidad()));
                       }
                       if(Integer.parseInt(tableCarrito.getValueAt(selectedRow,1).toString())<=0){
                        
                       removerFila(selectedRow);
                       
                       }
                       break;
                   
                   case "Computadoras":
                       Computadora compu = listaCompu.get(boxListaStock.getSelectedIndex());
                       compu.setCantidad(compu.getCantidad()+1);
                       listaCompu.set(boxListaStock.getSelectedIndex(), compu);
                       
                       tableCarrito.setValueAt(cantidad-1, selectedRow,1);
                       tableCarrito.setValueAt(stock+1,selectedRow,3);
                       
                       if(tableCarrito.getValueAt(selectedRow,0).equals(boxListaStock.getSelectedItem().toString())){
                            txtCantidadNum.setText(Integer.toString(compu.getCantidad()));
                       }
                       if(Integer.parseInt(tableCarrito.getValueAt(selectedRow,1).toString())<=0){
                            removerFila(selectedRow);
                       }
                       break;
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
        
        if(boxServicio.getSelectedItem().toString().equals("Seleccione un servicio")){
            mostrarMensaje("El servicio seleccionado no es correcto","Error","Verifique el servicio");
        }
        else{
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
            
            servicioSeleccionado = controlLogica.buscarServicio(idServicio);
            ArrayList<Registro>listaRegistro = servicioSeleccionado.getListaRegistros();                    
          
            Registro registro = new Registro();
            registro.setFecha(controlLogica.getDateUnformat());
            registro.setServicio(boxServicio.getSelectedItem().toString());
            registro.setInsumos_retirados(lista);
            registro.setCantidad_Insumos(listaCantidad);
            listaRegistro.add(registro);
                      
            registro.setServi(servicioSeleccionado);
                  
            controlLogica.editarServicio(servicioSeleccionado);

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
        ConsultaRegistro consulta = new ConsultaRegistro();
        consulta.setVisible(true);
        consulta.setLocationRelativeTo(this);
        this.dispose();
    }//GEN-LAST:event_btnConsultaActionPerformed

    private void boxServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxServicioActionPerformed
        if(listaServicios!=null){
            for(Servicio servicio : listaServicios){
                if(servicio.getServicio().equals(boxServicio.getSelectedItem().toString())){
                    idServicio = servicio.getId();
                    break;
                }
            }
        }
    }//GEN-LAST:event_boxServicioActionPerformed

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
        txtFecha.setText(controlLogica.getDate());
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
        for(Servicio servicio : listaServicios)
        {
            boxServicio.addItem(servicio.getServicio());
        }
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
                btnFinalizarCompra.setEnabled(false);

          }
        }catch(ArrayIndexOutOfBoundsException aIE){};
        
     
    }


    private void reset() {
        Primaria primaria = new Primaria();
        primaria.setVisible(true);
        primaria.setLocationRelativeTo(this);
        this.dispose();
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxListaStock;
    private javax.swing.JComboBox<String> boxServicio;
    private javax.swing.JButton btnAgregarAlCarrito;
    private javax.swing.JButton btnAgregarInsumo;
    private javax.swing.JButton btnAgregarServicio;
    private javax.swing.JButton btnCompu;
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnEditarInsumo;
    private javax.swing.JButton btnEliminarItem1;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFinalizarCompra;
    private javax.swing.JButton btnHardware;
    private javax.swing.JButton btnTinta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JLabel txtFecha;
    private javax.swing.JLabel txtId;
    private javax.swing.JLabel txtTipo;
    // End of variables declaration//GEN-END:variables



}
