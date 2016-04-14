/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author zvcesar
 */
public class MetodosAutomovil {
 private ArrayList <Automovil> arrayAutomovil;
 String arregloInformacionConsultada[]=new String[4];
    public MetodosAutomovil()
    {
     arrayAutomovil=new ArrayList <Automovil>();   
    }
    public void agregarAuto(String informacion[])
  {
      Automovil temporal=new Automovil(informacion[0], informacion[1],informacion[2],informacion[3]);
      arrayAutomovil.add(temporal);
      JOptionPane.showMessageDialog(null, "El Automovil se ha añadido");
  }
    public boolean buscarAuto(String numeroRegistro)
    {
        boolean encontro=false;
      for(int contador=0;contador<arrayAutomovil.size();contador++)
      {
        if(arrayAutomovil.get(contador).getNumeroRegistro().equals(numeroRegistro)) 
        {
         arregloInformacionConsultada[1]=arrayAutomovil.get(contador).getNombreDueño();
         arregloInformacionConsultada[2]=arrayAutomovil.get(contador).getCedulaDueño();
         arregloInformacionConsultada[3]=arrayAutomovil.get(contador).getPlacaAutomovil();
         encontro=true;   
         
        }
        
        
      }
      return encontro;
    }
    public String[] getArregloInformacion()
    {
        return this.arregloInformacionConsultada;
    }
    public void modificarAutomovil(String arreglo[])
   {
    for(int contador=0; contador<arrayAutomovil.size();contador++)
       {
           
             if(arrayAutomovil.get(contador).getNumeroRegistro().equals(arreglo[0]))
             {
               arrayAutomovil.get(contador).setNombreDueño(arreglo[1]);
               arrayAutomovil.get(contador).setCedulaDueño(arreglo[2]);
               arrayAutomovil.get(contador).setPlacaAutomovil(arreglo[3]);
             }
           
       }
   }
    public void eliminarAutomovil(String numeroRegistro)
    {
      for(int contador=0; contador<arrayAutomovil.size();contador++)  
      {
        if(arrayAutomovil.get(contador).getNumeroRegistro().equals(numeroRegistro))
        {
          arrayAutomovil.remove(contador);
        }
      }
    }
}
