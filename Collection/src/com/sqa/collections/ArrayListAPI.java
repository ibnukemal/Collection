package com.sqa.collections;
import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;

class Negara {
	
	private String namaNegara;
	private int populasi;
	
	public Negara(String namaNegara, int populasi) {
		this.namaNegara = namaNegara;
		this.populasi = populasi;
	}
	
	public String getNamaNegara() {
		return namaNegara;
	}
	
	public void setNamaNegara(String namaNegara) {
		this.namaNegara = namaNegara;
	}
	public int getPopulasi() {
		return populasi;
	}
	
	public void setPopulasi(int populasi) {
		this.populasi = populasi;
	}
	
	@Override
	public String toString() {
		return "Negara{"+"Nama Negara : "+namaNegara+", populasi : "+populasi+"}";
	}		
}


public class ArrayListAPI {
	public static void main(String[] args) {
List<Negara> negara = createList();
		
		List<Negara> sorted_negara = negara.stream()
				.sorted((com1,com2)->Integer.compare(com1.getPopulasi(),
						com2.getPopulasi())).collect(Collectors.toList());
		
		System.out.println(sorted_negara);	
	}
	static List<Negara> createList() {
		List<Negara> negara = new ArrayList<>();
		negara.add(new Negara("Indonesia",250));
		negara.add(new Negara("Malaysia",50));
		negara.add(new Negara("Singapura",30));
		negara.add(new Negara("Brunei",40));
		return negara;
	}
}
