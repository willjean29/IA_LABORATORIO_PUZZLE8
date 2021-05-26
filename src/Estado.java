/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
import java.util.ArrayList;

public interface Estado {
    
    public boolean esMeta();
    
    public ArrayList<Estado> generarSucesores();
    
    public void mostrarEstado();
    
    public boolean igual(Estado e);
}
