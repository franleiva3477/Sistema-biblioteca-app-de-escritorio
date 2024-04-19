/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import Clases.Listar_autores;
import Clases.Listar_topografia;
import Clases.Listar_Editorial;
import Clases.Listar_materia;
import Clases.mEditorial;
import Clases.mAutor;
import Clases.mMateria;
import Clases.mTopografia;
import Libros.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Francisco Leiva
 */
public class LIBROS extends javax.swing.JFrame {
    Conexion cn = new Conexion();
    Connection con;
    DefaultTableModel model;
    Statement st;
    ResultSet rs;
    int id = 0;
    
private void deshabilitarComponentes() {
        btnAgregar.setEnabled(false);
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
    }

    // Método para habilitar los componentes
    private void habilitarComponentes() {
        btnAgregar.setEnabled(true);
        btnModificar.setEnabled(true);
        btnEliminar.setEnabled(true);
    }

   
    /**
     * Creates new form LIBROS
     */
    public LIBROS() {
        initComponents();
        setLocationRelativeTo(null);

        // inicia la tabls
        model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("TITULO");
        model.addColumn("CONTENIDO");
        model.addColumn("AÑO");
        model.addColumn("TOPOGRAFIA");
        model.addColumn("AUTOR");
        model.addColumn("EDITORIAL");
        model.addColumn("MATERIA");
        TablaDatos.setModel(model); // Establezco el modelo en la tabla
        
        listar();
        cargarCombo(cTOPO);
        cargarComboa(cAUTOR);
        cargarComboe(cEDI);
        cargarCombom(cMATERIA);
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);


    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtTITULO = new javax.swing.JTextField();
        txtCONTE = new javax.swing.JTextField();
        txtAÑO = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblMateria = new javax.swing.JLabel();
        cTOPO = new javax.swing.JComboBox<>();
        cAUTOR = new javax.swing.JComboBox<>();
        cEDI = new javax.swing.JComboBox<>();
        cMATERIA = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel2.setText("ID");

        jLabel3.setText("TTULO");

        jLabel4.setText("CONTENIDO");

        jLabel5.setText("AÑO");

        txtId.setEditable(false);
        txtId.setEnabled(false);
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        jLabel6.setText("TOPOGRAFIA");

        jLabel7.setText("AUTOR");

        jLabel8.setText("EDITORIAL");

        lblMateria.setText("MATERIA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtAÑO, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                        .addComponent(txtCONTE)
                        .addComponent(txtTITULO))
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cEDI, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cAUTOR, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cTOPO, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblMateria)
                        .addGap(108, 108, 108)
                        .addComponent(cMATERIA, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cTOPO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTITULO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(cAUTOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtCONTE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cEDI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtAÑO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMateria)
                    .addComponent(cMATERIA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Operaciones"));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificar.setText("Guardar cambios");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado"));

        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "TITULO", "CONTENIDO", "AÑO", "TOPOGRAFIA", "AUTOR", "EDITORIAL", "MATERIA"
            }
        ));
        TablaDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDatosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TablaDatosMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(TablaDatos);
        if (TablaDatos.getColumnModel().getColumnCount() > 0) {
            TablaDatos.getColumnModel().getColumn(0).setMinWidth(50);
            TablaDatos.getColumnModel().getColumn(0).setPreferredWidth(50);
            TablaDatos.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel1.setText("LIBROS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        Agregar();
        listar();
        nuevo();        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        Modificar();
        listar();
        nuevo();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Eliminar();
        listar();
        nuevo();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void TablaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDatosMouseClicked
     int fila = TablaDatos.getSelectedRow();//obtiene el indice  seleccionado
    if (fila == -1) {
        JOptionPane.showMessageDialog(null, "Libro no seleccionado");
    } else {
        id = Integer.parseInt((String) TablaDatos.getValueAt(fila, 0).toString());//lo convierte a String y luego a int
        String titulo = (String) TablaDatos.getValueAt(fila, 1);                  // asignándolo a la variable id
        String conte = (String) TablaDatos.getValueAt(fila, 2);         //obtiene los valores del texro almacenaos 
        String año = (String) TablaDatos.getValueAt(fila, 3);           //en las variables
        txtId.setText("" + id);
        txtTITULO.setText(titulo);
        txtCONTE.setText(conte);
        txtAÑO.setText(año);
         btnModificar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnAgregar.setEnabled(false);
        

    //es para que uno vea y modifique cualquier dato

        }
    }//GEN-LAST:event_TablaDatosMouseClicked

    private void TablaDatosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDatosMouseEntered
        
    }//GEN-LAST:event_TablaDatosMouseEntered

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LIBROS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LIBROS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LIBROS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LIBROS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LIBROS().setVisible(true);
            }
        });
    }
    
   void listar() {
    limpiarTabla(model); // Limpio la tabla antes de cargar para evitar duplicados
    String sql = "select * from libros";
    try {
        con = cn.getConnection();
        st = con.createStatement();
        rs = st.executeQuery(sql);
        Object[] libros = new Object[8]; //crea un array libros con 8 columnas
        model = (DefaultTableModel) TablaDatos.getModel();
        while (rs.next()) {//recoree cada fila y agrega datos a cada tabla
            libros[0] = rs.getInt("Id");
            libros[1] = rs.getString("Titulos");
            libros[2] = rs.getString("Contenido"); //recorre cada fila conn el rs next  si devuelve true sigue extrayendo
            libros[3] = rs.getString("Año");      // y processa datos hasta obtener un false y sale.
            libros[4] = rs.getString("topografia");
            libros[5] = rs.getString("autor");
            libros[6] = rs.getString("editorial");
            libros[7] = rs.getString("Materia");
            model.addRow(libros);// agrega la fila a la tabla
        }
        TablaDatos.setModel(model);// actualiza la tabla y refleja los datos.
    } catch (Exception e) {
        e.printStackTrace();
    }
}
   
    void Agregar() {
        limpiarTabla(model);
    
    String titulo = txtTITULO.getText(); //obtengo lo del texto y lo guardo en la variable
    String conte = txtCONTE.getText();
    String año = txtAÑO.getText();
    String topo = String.valueOf(cTOPO.getItemAt(cTOPO.getSelectedIndex())); //se obtiene lo sdel combo, se convierte en el tipo de dato
    String autor = String.valueOf(cAUTOR.getItemAt(cAUTOR.getSelectedIndex()));// y se almacena en su variable
    String editorial = String.valueOf(cEDI.getItemAt(cEDI.getSelectedIndex()));
    String materia = String.valueOf(cMATERIA.getItemAt(cMATERIA.getSelectedIndex()));

    try {
        // Consultar el valor actual del ID en la base de datos
        String sqlConsultaID = "SELECT MAX(Id) FROM libros";
        st = con.createStatement();
        rs = st.executeQuery(sqlConsultaID);

        if (rs.next()) {
            id = rs.getInt(1) + 1; // Incrementa el ID
        }

        // carga un libro con los datps
        String sqlInsert = "INSERT INTO libros(Id, Titulos, Contenido, Año, topografia, autor, editorial, Materia) VALUES(" + id + ", '" + titulo + "', '" + conte + "', '" + año + "', '" + topo + "', '" + autor + "', '" + editorial + "', '" + materia + "')";
        st.executeUpdate(sqlInsert);

        

    } catch (Exception e) {
        e.printStackTrace(); // Manejo de errores, puedes personalizar según tus necesidades
    }
  
    }

    void Modificar() {//obtengo los datos seleccionados o los que ingrrse nuevos
        String titulo = txtTITULO.getText();
        String conte = txtCONTE.getText();
        String año = txtAÑO.getText();
        String topo = String.valueOf(cTOPO.getItemAt(cTOPO.getSelectedIndex()));
        String autor = String.valueOf(cAUTOR.getItemAt(cAUTOR.getSelectedIndex()));
        String editorial = String.valueOf(cEDI.getItemAt(cEDI.getSelectedIndex()));
        String materia = String.valueOf(cMATERIA.getItemAt(cMATERIA.getSelectedIndex()));

        String sql = "update libros set Titulos='" + titulo + "',Contenido='" + conte + "',Año='" + año + "',topografia='" + topo + "',autor='" + autor + "',editorial='" + editorial + "',Materia='" + materia + "' where Id=" + id;
        try {
            if (titulo != null || conte != null) {//verifica si al menos uno se cambio y modifica con los datos
                con = cn.getConnection();         //ya ingresados
                st = con.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Libro Modificado");
                limpiarTabla(model);
                btnModificar.setEnabled(false);
                btnEliminar.setEnabled(false);
                btnAgregar.setEnabled(true);
                
            } else {
                JOptionPane.showMessageDialog(null, "no se ha modificado ningun campo");
            }

        } catch (Exception e) {
        }

    }

    void Eliminar() {
        String sql = "delete from libros where Id=" + id;        
        int fila = TablaDatos.getSelectedRow();//obtiene la fila seleccionada
        if (fila < 0) {//si no se selecciono una fila muestra el mensaje
            JOptionPane.showMessageDialog(null,"Libro no Seleccionado");
        } else {//en el caso que si ejecuta
                try {
                    con = cn.getConnection();
                    st = con.createStatement();
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Libro Eliminado");
                    limpiarTabla(model);
                    btnModificar.setEnabled(false);
                    btnEliminar.setEnabled(false);
                    btnAgregar.setEnabled(true);
                    
                    
                } catch (Exception e) {
                }
               
        }
       

    }

    void nuevo() {
        txtId.setText("");
        txtTITULO.setText("");
        txtCONTE.setText("");
        txtAÑO.setText("");
        txtTITULO.requestFocus();//luego de limpiar los campos el cursor quedara en Titulo 
                                 //listo para ingresar datos
    }
    void limpiarTabla(DefaultTableModel model) {
        int rowCount = model.getRowCount();//obtiene las finlas que hay actualmente
         for (int i = rowCount - 1; i >= 0; i--) {// y aca las va eliminando de la ultima a la primera
        model.removeRow(i);//elimina las filas  antes de agregar datos
        }
         

    }
    void Actualizar(){
        limpiarTabla(model);
        listar();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDatos;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cAUTOR;
    private javax.swing.JComboBox<String> cEDI;
    private javax.swing.JComboBox<String> cMATERIA;
    private javax.swing.JComboBox<String> cTOPO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMateria;
    private javax.swing.JTextField txtAÑO;
    private javax.swing.JTextField txtCONTE;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtTITULO;
    // End of variables declaration//GEN-END:variables

private void cargarCombo(JComboBox c) {
        DefaultComboBoxModel combo = new DefaultComboBoxModel();//se declara un nuevo metodo
        c.setModel(combo);//usa el modelo personalizado
        Listar_topografia lt = new Listar_topografia(); //se instancia una nueva clase de listar

        try {
            con = cn.getConnection();  
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT topnombre FROM Topografia");

            while (rs.next()) { //se va ejecutando mientras tenga id
                mTopografia mTOP = new mTopografia();//se crea una nueva clase para almacenar
                mTOP.setTopNombre(rs.getString("topnombre"));//se obtiene el id
                lt.AgregarTopografia(mTOP); //se agrega a la lista creada en el objeto lm
                combo.addElement(mTOP.getTopNombre()); //se agrega los id al combo
                System.out.println("exito");
            }

        } catch (SQLException e) {
            System.out.println("No se pudo mostrar ningun dato: " + e.getMessage());
        }
    }

   
 private void cargarComboa(JComboBox<String> a) {
    DefaultComboBoxModel<String> comboa = new DefaultComboBoxModel<>();
    a.setModel(comboa);
    Listar_autores la = new Listar_autores();

    try {
        con = cn.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT autNombre FROM Autores");  // Cambio en la consulta a "Nombre"

        while (rs.next()) {
            mAutor mAUT = new mAutor();
            mAUT.setAutNombre(rs.getString("autNombre"));  // Cambio para obtener el nombre en lugar del ID
            la.AgregarAutores(mAUT);
            comboa.addElement(mAUT.getAutNombre());  // Agregar el nombre al combo
            System.out.println("exito");
        }

    } catch (SQLException e) {
        System.out.println("No se pudo mostrar ningún dato: " + e.getMessage());
    }
}


    private void cargarComboe(JComboBox e) {
    DefaultComboBoxModel comboe = new DefaultComboBoxModel();
    e.setModel(comboe);
    Listar_Editorial le = new Listar_Editorial();

    try {
        con = cn.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT ediNombre FROM Editorial");

        while (rs.next()) {
            mEditorial mEDI = new mEditorial();
            mEDI.setEdiNombre(rs.getString("ediNombre"));  
            le.AgregarEditoriales(mEDI);
            comboe.addElement(mEDI.getEdiNombre());
            System.out.println("Éxito");
        }
    } catch (SQLException ex) {
        System.out.println("No se pudo mostrar ningún dato: " + ex.getMessage());
    }
    }

   private void cargarCombom(JComboBox<String> m) {
    DefaultComboBoxModel<String> combom = new DefaultComboBoxModel<>();
    m.setModel(combom);
    Listar_materia lm = new Listar_materia();

    try {
        con = cn.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT matNombre FROM materia"); 

        while (rs.next()) {
            mMateria mMAT = new mMateria();
            mMAT.setMatNombre(rs.getString("matNombre"));  // Cambio para obtener el nombre en lugar del ID
            lm.AgregarMateria(mMAT);
            combom.addElement(mMAT.getMatNombre());  // Agregar el nombre al combo
            System.out.println("éxito");
        }

    } catch (SQLException e) {
        System.out.println("No se pudo mostrar ningún dato: " + e.getMessage());
    }
}}

