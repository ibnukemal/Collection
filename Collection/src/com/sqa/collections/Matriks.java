package com.sqa.collections;

import java.util.ArrayList;

public class Matriks {
	public static void main(String[] args) {
		
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
		
		System.out.println(matriksA);
		
		//Bentuk Matriks 
		for(ArrayList<Integer> list : matriksA) {
			for(Integer n : list) {
				System.out.printf("%d ", n);
			}
			System.out.println();
		}
		
		ArrayList<Integer> baris11 = new ArrayList<>();
		baris11.add(1);
		baris11.add(2);
		baris11.add(3);
		
		ArrayList<Integer> baris21 = new ArrayList<>();
		baris21.add(4);
		baris21.add(5);
		baris21.add(6);
		
		ArrayList<Integer> baris31 = new ArrayList<>();
		baris31.add(7);
		baris31.add(8);
		baris31.add(9);
		
		ArrayList<ArrayList<Integer>> matriksB = new ArrayList<>();
		matriksB.add(baris11);
		matriksB.add(baris21);
		matriksB.add(baris31);
		
		System.out.println(matriksB);
		
		//Bentuk Matriks 
		for(ArrayList<Integer> list : matriksB) {
			for(Integer n : list) {
				System.out.printf("%d ", n);
			}
			System.out.println();
		}
		
		//Penjumlahan Matriks
		System.out.println("Hasil Penjumlahannya : ");
		for(int i=0; i<matriksA.size(); i++) {
			for(int j=0; j<matriksA.get(i).size(); j++) {
				matriksA.get(i).set(j, matriksA.get(i).get(j) + matriksB.get(i).get(j));
			}
		}
		
		for(ArrayList<Integer> arrayList : matriksA) {
			for(Integer i : arrayList) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		//Pengurangan Matriks
				System.out.println("Hasil Pengurangannya : ");
				for(int i=0; i<matriksA.size(); i++) {
					for(int j=0; j<matriksA.get(i).size(); j++) {
						matriksA.get(i).set(j, matriksA.get(i).get(j) - matriksB.get(i).get(j));
					}
				}
				
				for(ArrayList<Integer> arrayList : matriksA) {
					for(Integer i : arrayList) {
						System.out.print(i+" ");
					}
					System.out.println();
				}
		
		//Perkalian Matriks
				System.out.println("Hasil Perkaliannya : ");
				for(int i=0; i<matriksA.size(); i++) {
					for(int j=0; j<matriksA.get(i).size(); j++) {
						matriksA.get(i).set(j, matriksA.get(i).get(j) * matriksB.get(i).get(j));
					}
				}
				
				for(ArrayList<Integer> arrayList : matriksA) {
					for(Integer i : arrayList) {
						System.out.print(i+" ");
					}
					System.out.println();
				}
		
	}
}
