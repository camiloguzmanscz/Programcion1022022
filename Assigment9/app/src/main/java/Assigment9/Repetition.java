/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assigment9;

/**
 *
 * @author fundacion
 */

public class Repetition{
    
   
        


    public String[] Repeated(String phrase){
        String[] wordsarray = phrase.toLowerCase().split(" ");
        int arrNumber[] = new int[wordsarray.length];
        
       
        for (int j=0; j<arrNumber.length;j++){
                for (int k= 0; k< arrNumber.length;k++){
                    if (wordsarray[j].equals(wordsarray[k])){
                        arrNumber[j] += 1;
                        
                    }
                }
        }
        int max = GetNumbig(arrNumber);
        int indx =0;
        for (int i= 0; i<arrNumber.length;i++){
            if (max==arrNumber[i]){
                indx = i;
                break;
            }
        }
        String mostrepe =(max +"");
        String response[] = { wordsarray[indx], mostrepe};
        return response;
    }
    
    
    
    
    
    public int GetNumbig(int... numberArray){
        int maxinum = numberArray[0];
        for (int i= 0; i<numberArray.length;i++){
            if(numberArray[i]> maxinum){
                maxinum = numberArray[i];
            }
        }
        return maxinum;
    }
}
