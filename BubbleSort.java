/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bubblesort;

/**
 *
 * @author user
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int ar[] = {36 , 6 , 37 , 68, 43};
		int temp = 0;
		int i =0 ;
		int n= ar.length;
		for(i=0 ; i<n ; i++ ){
				for(int j=0 ; j<n-i-1 ; j++){
				 if(ar[j] > ar[j+1]){
					 temp = ar[j];
					 ar[j] = ar[j+1];
					 ar[j+1] = temp;  
			 }
				}
			System.out.println(ar[i]);
		
	}
    }
    
}
