package com.sqa.collections;

import java.util.ArrayList;

public class ArrayListMatriks {

	public static void main(String[] args) {
		
		method1();
		System.out.println();
		method2();
		System.out.println();
		System.out.println("Penjumlahan Matirks A dan B");
		//Penjumlahan Matriks
		
	}
	
	static void method1(){
		
		ArrayList<Integer> baris1 = new ArrayList<>();
		baris1.add(10);
		baris1.add(11);
		baris1.add(12);
		
		ArrayList<Integer> baris2 = new ArrayList<>();
		baris2.add(13);
		baris2.add(14);
		baris2.add(15);
		
		ArrayList<Integer> baris3 = new ArrayList<>();
		baris3.add(16);
		baris3.add(17);
		baris3.add(18);
		
		ArrayList<ArrayList<Integer>> matriksA = new ArrayList<>();
		matriksA.add(baris1);
		matriksA.add(baris2);
		matriksA.add(baris3);
		
		//Bentuk Matriks 
		for(ArrayList<Integer> list : matriksA) {
			for(Integer n : list) {
				System.out.printf("%d ", n);
			}
			System.out.println();
		}
	}
	
	static void method2(){
		
		ArrayList<Integer> baris1 = new ArrayList<>();
		baris1.add(1);
		baris1.add(2);
		baris1.add(3);
		
		ArrayList<Integer> baris2 = new ArrayList<>();
		baris2.add(4);
		baris2.add(5);
		baris2.add(6);
		
		ArrayList<Integer> baris3 = new ArrayList<>();
		baris3.add(7);
		baris3.add(8);
		baris3.add(9);
		
		ArrayList<ArrayList<Integer>> matriksB = new ArrayList<>();
		matriksB.add(baris1);
		matriksB.add(baris2);
		matriksB.add(baris3);
		
		//Bentuk Matriks 
		for(ArrayList<Integer> list : matriksB) {
			for(Integer n : list) {
				System.out.printf("%d ", n);
			}
			System.out.println();
		}
	}
}
