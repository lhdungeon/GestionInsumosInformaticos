
package IGU.Usuarios;

import IGU.InicialServer;
import Logica.Controladora;
import Logica.Login.Login;
import Logica.Servicios.Sala;
import Logica.Servicios.Servicio;
import java.util.ArrayList;


public class PrimariaUsuarios extends javax.swing.JFrame {

    Controladora controlLogica = null;
    ArrayList <Servicio> listaServicios = new ArrayList();
    Servicio servicioSeleccionado = new Servicio();
    
    public PrimariaUsuarios() {
        controlLogica = new Controladora();
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnRegis = new javax.swing.JButton();
        txtSala = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        cBoxServicios = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnRegis.setText("Registrar");
        btnRegis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisActionPerformed(evt);
            }
        });

        jLabel1.setText("Contraseña");

        jLabel2.setText("Sala/Sector");

        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("INF-Hos Usuarios");

        jLabel4.setText("Servicio");

        cBoxServicios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cBoxServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxServiciosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141)
                        .addComponent(btnRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSala, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                            .addComponent(txtPass)
                            .addComponent(cBoxServicios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cBoxServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        jMenu1.setText("Opciones");

        jMenuItem1.setText("Agregar servicio");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

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

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        InicialServer server = new InicialServer();
        server.setVisible(true);
        server.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        listaServicios = controlLogica.buscarListaServicios();
        
        cBoxServicios.removeAllItems();
        cBoxServicios.addItem("Seleccione un servicio");
        
        for(Servicio servi : listaServicios){
            cBoxServicios.addItem(servi.getNombreServicio());
        }
    }//GEN-LAST:event_formWindowOpened

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       NuevoServicio nuevServ = new NuevoServicio();
       nuevServ.setVisible(true);
       nuevServ.setLocationRelativeTo(this);
       this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnRegisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisActionPerformed
        String password = new String(txtPass.getPassword());
        String salaIngresada = txtSala.getText();
        
        if(salaIngresada.isBlank()){
            if(password.length()>=8){    
                
                ArrayList <Sala> listaSala = controlLogica.buscarListaSala();  
                boolean salaExiste=false;
                
                for(Sala sal : listaSala){
                    if(salaIngresada.equals(sal.getSala()));
                    salaExiste=true;
                }
                
                if(!salaExiste){
                    Login login = new Login();
                    Sala sala = new Sala();
                    
                    login.setUsuario(salaIngresada);
                    login.setPassword(password);
                    
                    sala.setSala(salaIngresada);
                    
                    login.setSala(sala);
                    sala.setLogin(login);

                    //encontrar el servicio seleccionado en el cBox
                    for(Servicio ser : listaServicios){
                        if(ser.getNombreServicio().equals(servicioSeleccionado.getNombreServicio())){
                            servicioSeleccionado.setId(ser.getId());
                            servicioSeleccionado.setJefeServicio(ser.getJefeServicio());
                            servicioSeleccionado.getSala().add(sala);
                            break;
                        }
                        else{
                            mostrarMensaje("Error al buscar el servicio","Fatal error","Error");
                        }
                    }
                    sala.setServicio(servicioSeleccionado);
                    
                    controlLogica.editarServicio(servicioSeleccionado);
                    
                    // ¿Login se crea antes o despues de sala?    Test!
                    controlLogica.nuevoLogin(login);
                    controlLogica.nuevoSala(sala);
                    
                    mostrarMensaje("Se agrego un nuevo login y una nueva sala a la base de datos","Carga Exitosa","Informacion");
                    
                }
                else{
                    mostrarMensaje("El sector que ingreso ya existe en el sistema","Sala ya existe","Error");
                }
                
                
            }
            else{
                mostrarMensaje("El password es muy corto","Contraseña Incorrecta", "Error");
            }
        }
        else{
            mostrarMensaje("El usuario es incorrecto", "Usuario incorrecto","Error");
        }
        
    }//GEN-LAST:event_btnRegisActionPerformed

    private void cBoxServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxServiciosActionPerformed
        String seleccion = cBoxServicios.getSelectedItem().toString();
        
        if(seleccion.equals("Seleccione un servicio")){
        
        }
        else{
            servicioSeleccionado.setNombreServicio(cBoxServicios.getSelectedItem().toString());
        }
        
    }//GEN-LAST:event_cBoxServiciosActionPerformed

    private void mostrarMensaje(String mensaje, String titulo, String tipo){
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnRegis;
    private javax.swing.JComboBox<String> cBoxServicios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtSala;
    // End of variables declaration//GEN-END:variables
}
