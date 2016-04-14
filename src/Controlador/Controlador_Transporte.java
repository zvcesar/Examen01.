/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Vista.FRM_Trasnportes;
import Modelo.MetodosAutomovil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
/**
 *
 * @author zvcesar
 */
public class Controlador_Transporte implements ActionListener {
    int registro=0;
    boolean agregar=false;
    MetodosAutomovil metodos; 
    FRM_Trasnportes fRM_Trasnportes;
   public  Controlador_Transporte(FRM_Trasnportes fRM_Trasnportes)
   {
     this.fRM_Trasnportes=fRM_Trasnportes;
     metodos=new MetodosAutomovil();
   }
   public void actionPerformed(ActionEvent e)
   {
  if(e.getActionCommand().equals("Buscar"))
    {
      if(metodos.buscarAuto(fRM_Trasnportes.devolverNumeroRegistro()))
      {
       fRM_Trasnportes.mostrarInformacion(metodos.getArregloInformacion());
       JOptionPane.showMessageDialog(null, "El Automovil fue encontrado");
      }  
      else
      {
       fRM_Trasnportes.habilitarAgregar();
       JOptionPane.showMessageDialog(null, "El Automovil no fue encontrado");    
      }
    }
  
  if(e.getActionCommand().equals("Agregar"))
    {
      agregar=true;
      if(agregar)
      {
        registro++;
      }
      metodos.agregarAuto(fRM_Trasnportes.devolverInformacion());
      fRM_Trasnportes.limpiar();
      fRM_Trasnportes.habilitarOpciones();
      fRM_Trasnportes.colocarRegistro(agregar, registro);
      System.out.print("Agregar");
    }
  
  if(e.getActionCommand().equals("Modificar"))
    {
      metodos.modificarAutomovil(fRM_Trasnportes.devolverInformacion());
      JOptionPane.showMessageDialog(null, "El Automovil fue modificado");
      fRM_Trasnportes.limpiar();
      System.out.print("Modificar");
    }
  
  if(e.getActionCommand().equals("Eliminar"))
    {
      metodos.eliminarAutomovil(fRM_Trasnportes.devolverNumeroRegistro());
      fRM_Trasnportes.limpiar();
      JOptionPane.showMessageDialog(null, "El Automovil fue eliminado");
    }
   }
}
