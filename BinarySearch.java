/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.binarysearch;

import java.util.Scanner;

/**
 *
 * @author malfi
 */
public class BinarySearch {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int data[] = {11, 23, 35, 48, 55, 62, 71, 88, 90, 94, 99};
        int key, kiri, kanan, tengah;
        System.out.print("Data: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.print("\nCari: ");
        key = s.nextInt();
        kiri = 0;
        kanan = data.length - 1;
        while (kiri <= kanan) {
            tengah = (kiri + kanan) / 2;
            if (data[tengah] == key) {
                System.out.println("Data ditemukan");
                System.exit(0);
            } else if (key < data[tengah]) {
                kanan = tengah - 1; 
            } else {
                kiri = tengah + 1; 
            }
        }
        System.out.println("Data tidak ditemukan");

    }
}
