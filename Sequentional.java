/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sequentional;
import java.util.Scanner;
/**
 *
 * @author malfi
 */
public class Sequentional {

    public static void main(String[] args) {
        int [] Data = {21, 4, 94, 14, 1, 9, 2};
        int key = 14;
        int i ;
        boolean temukan = false;
       
        for (i = 0; i < Data.length; i++) {
           if (key == Data[i] ){
               temukan = true;
               break;
      }
    }
        if (temukan){
            System.out.println("Data : " + key );
            System.out.println("Ada");
        }
        else {
            System.out.println("Tidak Ada");
        }
    }
}
