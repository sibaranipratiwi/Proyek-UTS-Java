package com.javarabbitmq.springbootrabbitmq.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Berita {
	
	public void setBeritaId (String string) {
		
	}
 
	public String getBeritaId() {
		return beritaId;
	}
	public String getJudul() {
		return judul;
	}
	public void setJudul(String judul) {
		this.judul = judul;
	}
	public String getPenulis() {
		return penulis;
	}
	public void setPenulis(String penulis) {
		this.penulis = penulis;
	}
	
	   private String beritaId;
	    private String judul;
	    private String penulis;
	    
   
}
