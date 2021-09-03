package com.kelascoding;

import java.util.Scanner;

public class Mhs {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int i,jumlahMk;
        String nama,npm;
        String mataKuliah[]=new String[15];
        String grade[]=new String[15];
        int uts[]=new int[15];
        int uas[]=new int[15];
        double nilai[]=new double[15];
        System.out.println("==================================");
        System.out.println("   Menghitung Nilai Mahasiswa");
        System.out.println("==================================");
        System.out.print("   Masukan Jumlah Mata Kuliah: ");
        jumlahMk=input.nextInt();
        System.out.println("==================================");
        System.out.print("  Nama     : ");
        nama=input.next();
        System.out.print("  NPM      : ");
        npm=input.next();

        System.out.println("=================================="); //*
        for(i=1; i<=jumlahMk; i++){
            System.out.print("\n Mata kuliah ke-"+i+" : ");
            mataKuliah[i]=input.next();
            System.out.print(" Nilai UTS  : "); //*
            uts[i]=input.nextInt();
            System.out.print(" Nilai UAS  : "); //*
            uas[i]=input.nextInt();
            nilai[i]=((uts[i]*0.7)+(uas[i]*0.3));
            if (nilai[i]>=85) grade[i]="A";
            else if (nilai[i]>=75) grade[i]="B";
            else if (nilai[i]>=65) grade[i]="C";
            else if (nilai[i]>=50) grade[i]="D";
            else grade[i]="E";
        }
        System.out.println("\n==================================");
        System.out.println("\n\n Nama: "+nama+"            NPM: "+npm);
        System.out.println("=========================================");
        System.out.println(" Mata Kuliah             Nilai      Grade");
        System.out.println("=========================================");
        for(i=1;i<=jumlahMk;i++){
            System.out.println(" "+mataKuliah[i]+"      "+nilai[i]+"      "+grade[i]);
        }
        System.out.println("\n\n=============================================");
        System.out.println(" Terima Kasih Telah Menggunakan Program Kami");
        System.out.println("=============================================");
        System.exit(0);
}
    }
