/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1;

/**
 *
 * @author srava
 */
public class MyFirstClass {
    
    public static void main(String[] args){
        int[][] TwoDim=new int[4][3];
        int i;
        int j;
        int temp=10;
        
        for(i=0;i<4;i++){
            for(j=0;j<3;j++){
                TwoDim[i][j]=temp;
                temp++;
              
                System.out.print(TwoDim[i][j] + " ");
                
            }
            System.out.println();
            
              
        }
    }
}
