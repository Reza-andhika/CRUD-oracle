/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logickali;

/**
 *
 * @author Reza
 */
public class Logickali {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println(kali(2,5));
    }
    
    public static int kali(int a,int b){
        int i=0;
        
        if(a<0 && b<0){
            for (int j = -1; j <= b; j--) {
            i+=a;
            }
        }
         else {
            if (a<b) {
                for (int j = 1; j <= b; j++) {
                i+=a;
                }
            }
            else {
                for (int j = 1; j <= a; j++) {
                i+=b;
                }
            }
        }
        return i;
    }
   
}

