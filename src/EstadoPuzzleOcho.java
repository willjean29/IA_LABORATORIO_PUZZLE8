
import java.util.ArrayList;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class EstadoPuzzleOcho implements Estado {
    private final int TAM_PUZZLE = 9;
    private final int[] META = {1,2,3,8,0,4,7,6,5};
    private int[] tableroActual;
    
    public EstadoPuzzleOcho(int[] tablero) {
        this.tableroActual = tablero;
    }
    
    public int[] getTableroActual(){
        return tableroActual;
    }
    
    public int getEspacio() {
        int indiceEspacio = -1;
        
        for(int i=0; i < TAM_PUZZLE; i++){
            if(tableroActual[i] == 0) {
                indiceEspacio = i;
            }
        }
        
        return indiceEspacio;
    }
    
    @Override
    public boolean esMeta() {
        return Arrays.equals(tableroActual, META);
    }
    
    @Override
    public boolean igual(Estado e) {
        return Arrays.equals(tableroActual, ((EstadoPuzzleOcho)e).getTableroActual());
    }
    
    @Override
    public void mostrarEstado(){
        System.out.println(tableroActual[0] + " | " + tableroActual[1] + " | " + tableroActual[2]);
        System.out.println(tableroActual[3] + " | " + tableroActual[4] + " | " + tableroActual[5]);
        System.out.println(tableroActual[6] + " | " + tableroActual[7] + " | " + tableroActual[8]);
    }
    
    @Override
    public ArrayList<Estado> generarSucesores(){
        ArrayList<Estado> sucesores = new ArrayList<Estado>();
        
        int espacio = getEspacio();
        
        // Operadores: acciones que vamos a tomar 
        // #01: Mover espacio a la izquierda
        if(espacio >= 0 && espacio != 3 && espacio != 6) {
            int[] temp01 = tableroActual.clone();
            temp01[espacio] = temp01[espacio-1];
            temp01[espacio-1] = 0;
            EstadoPuzzleOcho tabTemp01 = new EstadoPuzzleOcho(temp01);
            System.out.println("\n Opcion #01 - Mover espacio a la izquierda: ");
            tabTemp01.mostrarEstado();
            sucesores.add(tabTemp01);
        }
        
        // #02: Mover espacio a la derecha
        if(espacio <= 8 && espacio != 2 && espacio != 5 && espacio != 8) {
            int[] temp02 = tableroActual.clone();
            temp02[espacio] = temp02[espacio+1];
            temp02[espacio+1] = 0;
            EstadoPuzzleOcho tabTemp02 = new EstadoPuzzleOcho(temp02);
            System.out.println("\n Opcion #02 - Mover espacio a la derecha: ");
            tabTemp02.mostrarEstado();
            sucesores.add(tabTemp02);
        }
        
        // #03: Mover espacio arriba
        if(espacio - 3 >= 0) {
            int[] temp03 = tableroActual.clone();
            temp03[espacio] = temp03[espacio-3];
            temp03[espacio-3] = 0;
            EstadoPuzzleOcho tabTemp03 = new EstadoPuzzleOcho(temp03);
            System.out.println("\n Opcion #03 - Mover espacio arriba: ");
            tabTemp03.mostrarEstado();
            sucesores.add(tabTemp03);
        }
        
        // #04: Mover espacio abajo
        if(espacio + 3 <= 8) {
            int[] temp04 = tableroActual.clone();
            temp04[espacio] = temp04[espacio+3];
            temp04[espacio+3] = 0;
            EstadoPuzzleOcho tabTemp04 = new EstadoPuzzleOcho(temp04);
            System.out.println("\n Opcion #04 - Mover espacio abajo: ");
            tabTemp04.mostrarEstado();
            sucesores.add(tabTemp04);
        }
      
        return sucesores;
    }
}
