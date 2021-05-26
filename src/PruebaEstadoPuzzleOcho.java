/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class PruebaEstadoPuzzleOcho {
    public static void main(String[] args) {
        int[] a = {5, 4, 0, 6, 1, 8, 7, 3, 2};
        EstadoPuzzleOcho tab01 = new EstadoPuzzleOcho(a);
        tab01.mostrarEstado();
        /*System.out.println(tab01.getEspacio());*/
        
        int[] b = {5, 0, 4, 6, 1, 8, 7, 3, 2};
        EstadoPuzzleOcho tab02 = new EstadoPuzzleOcho(b);
        EstadoPuzzleOcho tab03 = new EstadoPuzzleOcho(a);
        /*tab02.mostrarEstado();
        System.out.println(tab02.getEspacio());
        System.out.println(tab01.igual(tab02));
        System.out.println(tab01.igual(tab03));*/
        
        int[] c = {1, 2, 3, 8, 0, 4, 7, 6, 5};
        EstadoPuzzleOcho tab04 = new EstadoPuzzleOcho(c);
        /*System.out.println("\n Es meta tab01: " + tab01.esMeta());
        System.out.println("\n Es meta tab04: " + tab04.esMeta());*/
        
        tab01.generarSucesores();
    }
}
