/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Controlador.Controlador_Transporte;
import Vista.GUI_Botones;
/**
 *
 * @author zvcesar
 */
public class FRM_Trasnportes extends javax.swing.JFrame {
 boolean agregar=false;
 int registro;
Controlador_Transporte controlador;
    /**
     * Creates new form FRM_Trasnportes
     */
    public FRM_Trasnportes() {
        initComponents();
        controlador=new Controlador_Transporte(this);
        gUI_Botones1.agregarEventos(controlador);
        colocarRegistro(agregar, registro);
        estadoInicial();
    }
    public String devolverNumeroRegistro()
    {
      return gUI_InformacionAuto1.getJtNumeroRegistro();
    }
    public String[] devolverInformacion()
    {
        return gUI_InformacionAuto1.devolverInformacion();
    }
    public void mostrarInformacion(String arreglo[])
    {
      gUI_InformacionAuto1.mostrarInformacion(arreglo);
    }
    public void limpiar()
    {
      gUI_InformacionAuto1.limpiar();
    }
    public void estadoInicial()
    {
        gUI_InformacionAuto1.estadoInicial();
        gUI_Botones1.estadoInicial();
    }
    public void habilitarAgregar()
    {
        gUI_Botones1.habilitarAgregar();
        gUI_InformacionAuto1.habilitarAgregar();
    }
    public void habilitarOpciones()
    {
        gUI_Botones1.habilitarOpciones();
    }
    public void colocarRegistro(boolean agregar, int registro)
    {
        gUI_InformacionAuto1.colocarRegistro(agregar, registro);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gUI_InformacionAuto1 = new Vista.GUI_InformacionAuto();
        gUI_Botones1 = new Vista.GUI_Botones();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gUI_InformacionAuto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(gUI_Botones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gUI_InformacionAuto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gUI_Botones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FRM_Trasnportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_Trasnportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_Trasnportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_Trasnportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_Trasnportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Vista.GUI_Botones gUI_Botones1;
    private Vista.GUI_InformacionAuto gUI_InformacionAuto1;
    // End of variables declaration//GEN-END:variables
}
