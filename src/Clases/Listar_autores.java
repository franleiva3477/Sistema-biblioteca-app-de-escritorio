/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import java.util.ArrayList;

/**
 *
 * @author Francisco Leiva
 */
public class Listar_autores {
    ArrayList<mAutor>lista1;
    
    public Listar_autores(){
        lista1=new ArrayList();
    }
    public void AgregarAutores(mAutor a){
        lista1.add(a);
    }
   
}
