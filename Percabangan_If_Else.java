/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.percabangan_if_else;

import java.util.Scanner;

/**
 *
 * @author malfi
 */
public class Percabangan_If_Else {

     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tidur, bangun, total = 0;

        System.out.println("Masukkan Jam Tidur : ");
        tidur = s.nextInt();
        System.out.println("Masukkan Jam Bangun : ");
        bangun = s.nextInt();

        if (bangun > tidur) {
            total = bangun - tidur;
        } else if (bangun < tidur) {
            total = 24 - tidur + bangun;
        }
        boolean CT = total >= 7;
        boolean TT = total <= 13;
        boolean KT = total < 7;
        boolean T = total > 13;

        if (CT && TT) {
            System.out.println("Kamu memiliki waktu tidur yang cukup dan kamu tidak terlambat.");
        } else if (KT && TT) {
            System.out.println("Kamu tidak memiliki waktu tidur yang cukup, tetapi kamu tidak terlambat.");
        } else if (CT && TT) {
            System.out.println("Kamu memiliki waktu tidur yang cukup, tetapi kamu terlambat.");
        } else if (CT && T) {
            System.out.println("Kamu memiliki waktu tidur yang cukup, tetapi kamu terlambat");
        
    }
}}
