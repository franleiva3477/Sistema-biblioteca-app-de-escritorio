/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;


public class mTopografia {
    private int idSigTopografica;
    private String topNombre;
    
    public mTopografia() {
    }
    
    public mTopografia(int idSigTopografica, String topNombre){
    
    this.idSigTopografica=idSigTopografica;
    this.topNombre=topNombre;
    
}

    

    public int getIdSigTopografica() {
        return idSigTopografica;
    }

    public void setIdSigTopografica(int idSigTopografica) {
        this.idSigTopografica = idSigTopografica;
    }

    public String getTopNombre() {
        return topNombre;
    }

    public void setTopNombre(String topNombre) {
        this.topNombre = topNombre;
    }
    
    
}
