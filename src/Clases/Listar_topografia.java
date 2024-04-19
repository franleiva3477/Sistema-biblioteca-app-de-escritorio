/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import java.util.ArrayList;

public class Listar_topografia {
    ArrayList<mTopografia>lista;
    
    public Listar_topografia(){//permite agregar objetos de la clase
        lista=new ArrayList();
    }
    public void AgregarTopografia(mTopografia c){//Toma un objeto y lo agrega al final de la lista.
        lista.add(c);
    }
    
}
