/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teatro;

/**
 *
 * @author andresbaezrincon
 */

public class Asientos {
    String matrizAsientos[][] = new String[15][30];
    
    Asientos(){}
    
    void llenadoMatriz(){
        for(int i=0;i<15;i++){
            for(int j=0;j<30;j++){
                matrizAsientos[i][j] = "*";
            }
        }
    }
}

