
package arbolfinal;

import java.awt.*;
import javax.swing.*;


public class ArbolPanel extends javax.swing.JFrame {
    
    private SimuladorMetodos simulador = new SimuladorMetodos();
   
    public ArbolPanel() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        Insertar = new javax.swing.JButton();
        Ordenacion = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        imprecion = new javax.swing.JTextArea();
        Acciones = new javax.swing.JComboBox<>();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 895, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 531, Short.MAX_VALUE)
        );

        Insertar.setText("Insertar");
        Insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarActionPerformed(evt);
            }
        });

        Ordenacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Recorridos", "InOrden", "PosOrden", "PreOrden", " " }));
        Ordenacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdenacionActionPerformed(evt);
            }
        });

        imprecion.setColumns(20);
        imprecion.setRows(5);
        jScrollPane1.setViewportView(imprecion);

        Acciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acciones..", "Altura del arbol", "Arbol lleno?", "Numero de hojas", "Arbol perfecto?", "Arbol inperfecto?", "Borrar", " " }));
        Acciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Insertar)
                .addGap(18, 18, 18)
                .addComponent(Acciones, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Ordenacion, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Insertar)
                    .addComponent(Acciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ordenacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccionesActionPerformed
        Object opcion = this.Acciones.getSelectedItem();
        String accion = null;
        if (opcion.equals("Altura del Arbol")) {
           
        }
        if (opcion.equals("Arbol lleno?")) {
           
        }
        if (opcion.equals("Numero de hojas")) {
           
        }
        if (opcion.equals("Arbol perfecto?")) {
           
        }
        if (opcion.equals("Arbol imperfecto?")) {
           
        }
        if (opcion.equals("Borrar")) {
           
        }
          
        this.imprecion.setText("");
        this.imprecion.setText(accion);        
        
    }//GEN-LAST:event_AccionesActionPerformed

    private void OrdenacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdenacionActionPerformed
        Object opcion = this.Ordenacion.getSelectedItem();
        String recorrido = null;
        if (opcion.equals("InOrden")) {
           
        }
        if (opcion.equals("PreOrden")) {
           
        }
        if (opcion.equals("PosOrden")) {
           
        }

        
        this.imprecion.setText("");
        this.imprecion.setText(recorrido);
    }//GEN-LAST:event_OrdenacionActionPerformed

    private void InsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarActionPerformed
        
        try {
            String dato = null;
           JOptionPane.showInputDialog("Digite dato para insertar:");
            if (this.simulador.add(dato)) {
                JOptionPane.showMessageDialog(null, "El dato fue insertado correctamente", " ...", 1);                              
              
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo insertar el dato", "Intenta de nuevo...", 0);

        }
        
        
    }//GEN-LAST:event_InsertarActionPerformed

   
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ArbolPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Acciones;
    private javax.swing.JButton Insertar;
    private javax.swing.JComboBox<String> Ordenacion;
    private javax.swing.JTextArea imprecion;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
