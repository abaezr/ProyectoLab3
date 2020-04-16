/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teatro;

import java.util.ArrayList;

/**
 *
 * @author andresbaezrincon
 */

public class Asientos {
    String matrizAsientos[][] = new String[15][30];
    ArrayList<String> listaAsientosOcupados = new ArrayList<String>();
    ArrayList<Float> listaPrecios = new ArrayList<Float>();
    ArrayList<Float> registroPrecios = new ArrayList<Float>();
    Asientos(){}
    void llenadoMatriz(){
        for(int i=0;i<15;i++){
            for(int j=0;j<30;j++){
                matrizAsientos[i][j] = "%";
            }
        }
    }
    void compraAsiento(char fila, int columna){
        String asiento = fila+String.valueOf(columna+1);
        listaAsientosOcupados.add(asiento);
        matrizAsientos[((int)fila)-65][columna] = "#";
    }
    void preciosPersonalizados(float prec){
        listaPrecios.add(prec);
    }
    void preciosAutomaticos(float prec,float incremento){
        int x=0;
        for(int i=0;i<15;i++){
            listaPrecios.add(prec+(x*incremento));
            x++;
        }
    }
    void ventas(int fila){
        registroPrecios.add(listaPrecios.get(fila));
    }
    float ventaTotal(){
        float suma=0;
        for(int i=0;i<registroPrecios.size();i++){
            suma+=registroPrecios.get(i);
        }
        return suma;
    }
    void cambioLista(ArrayList<Float> lista){
        this.listaPrecios = lista;
    }
}

