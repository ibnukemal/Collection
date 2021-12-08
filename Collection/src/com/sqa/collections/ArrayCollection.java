package com.sqa.collections;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Collections;

public class ArrayCollection {

	public static void main(String[] args) {
			ArrayList<String> mahasiswa = new ArrayList<String>();
			mahasiswa.add("Aab");
			mahasiswa.add("Budi");
			mahasiswa.add("Cita");
//			mahasiswa.set(0, "Zaki");
			mahasiswa.add(0, "Zaki");
//			mahasiswa.remove(1);
			List<String> nilai = new ArrayList<>();
			nilai.add("90");
			nilai.add("80");
			nilai.add("92");
			nilai.add("87");
			nilai.add("94");
			nilai.add(0, "95");
//			System.out.println(mahasiswa);
//			mahasiswa.addAll(1, nilai);
//			System.out.println(nilai);
//			System.out.println(mahasiswa);
			for(String i : mahasiswa) {
				System.out.println(i);
			}		
			for(int i = 0; i < mahasiswa.size() ; i++) { 
				System.out.println(mahasiswa.get(i));
			}
			
			LinkedList<String> linkedList = new LinkedList<String>();
			linkedList.add("Data 1");
			linkedList.add("Data 2");
			linkedList.add("Data 3");
			linkedList.add("Data 4");
			linkedList.add("Data 5");
			System.out.println("Output " + linkedList+ " Ukuran" +linkedList.size());
			System.out.println(linkedList.get(4));
			linkedList.addFirst("Data 0");
			linkedList.addLast("Data 6");
			System.out.println("Output " + linkedList+ " Ukuran" +linkedList.size());
			linkedList.set(0, "Data 11");
			linkedList.set(6, "Data 12");
			System.out.println("Output " + linkedList+ " Ukuran" +linkedList.size());
			linkedList.removeFirst();
			linkedList.removeLast();
			System.out.println("Output " + linkedList+ " Ukuran" +linkedList.size());
			
			LinkedList<Integer> linkedList2 = new LinkedList<Integer>();
			linkedList2.add(88);
			linkedList2.add(89);
			System.out.println("Output " + linkedList2+ " Ukuran" +linkedList2.size());
			
			HashSet data = new HashSet();
			data.add(1);
			data.add(2);
			data.add(1);
			data.add(3);
			System.out.println(data);
			System.out.println(data.size());
			
			HashMap<String, String> negaraKota = new HashMap<String, String>();
			negaraKota.put("Inggris", "London");
			negaraKota.put("Turki", "Ankara");
			System.out.println(negaraKota);
			
			HashMap<String, Integer> orang = new HashMap<String, Integer>();
			orang.put("Aab", 22);
			orang.put("Abb", 24);
			System.out.println(orang);
			
			ArrayList<String> mhs = new ArrayList<>();
			mhs.add("Andri");
			mhs.add("Aan");
			mhs.add("Budi");
			mhs.add("Hanif");
			mhs.add("Fajar");
			mhs.add("Dinda");
			mhs.add("Hilman");
			mhs.add("Gerald");
			Collections.sort(mhs);
			System.out.println(mhs);
			int index = Collections.binarySearch(mhs,"Fajar");
			System.out.println("Index ke : " +index);
			
	}
}
