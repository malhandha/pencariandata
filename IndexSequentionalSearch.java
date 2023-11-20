/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.indexsequentionalsearch;

import java.util.Scanner;

/**
 *
 * @author malfi
 */
public class IndexSequentionalSearch {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int data[] = {13, 16, 17, 19, 20, 22, 27, 28, 29, 31, 33, 36, 38};
        int indeks[] = {3, 6, 9, 12}; 
        int elemen[] = {19, 25, 31, 38}; 
        System.out.println("Program Indexed Search");
        System.out.print("Isi Data: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
        System.out.print("Data yang dicari = ");
        int cari = s.nextInt();
        if (cari < data[0] || cari > data[data.length - 1]) {
            System.out.println("Data di luar jangkauan");
            System.exit(0);
        } else {
            int awal = 0, akhir, idx = 0;
            for (int i = 0; i < elemen.length; i++) {
                if (cari <= elemen[i]) {
                    idx = i;
                    break;
                }
            }
            if (idx >= 1) {
                awal = indeks[idx - 1]; 
            }
            akhir = indeks[idx];
            System.out.println("Range indeks : " + awal + "-" + akhir);
            for (int i = awal; i <= akhir; i++) {
                if (cari == data[i]) {
                    System.out.println("Data Ditemukan");
                    System.exit(0);
                }
            }
            System.out.println("Data Tidak Ada");
        }
    }
}
