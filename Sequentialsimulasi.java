/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.sequentialsimulasi;

import java.util.Scanner;

/**
 *
 * @author malfi
 */
public class Sequentialsimulasi {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int data[] = {10, 13, 14, 18, 22, 25, 29, 31, 36, 39};
        int cari;
        boolean ketemu = false;
        System.out.println("Simulasi Seq Search");
        System.out.print("Data: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
        System.out.print("Cari = ");
        cari = s.nextInt();
        for (int i = 0; i < data.length; i++) {
            System.out.print("Apakah " + data[i] + "=" + cari + "? ");
            if (data[i] == cari) {
                System.out.println("Benar");
                ketemu = true;
                break; //hentikan perulangan
            } else {
                System.out.println("Salah");
            }
        }
        if (ketemu == true) {
            System.out.println("Data ditemukan");
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
}
