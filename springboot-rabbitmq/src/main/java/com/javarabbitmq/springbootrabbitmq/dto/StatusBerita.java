package com.javarabbitmq.springbootrabbitmq.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StatusBerita {
	private String beritaId;
    private String status;//progress,completed
    private String message;




    public StatusBerita(Berita berita2, String string, String string2) {
		// TODO Auto-generated constructor stub
	}


	public String getBeritaId() {
		return beritaId;
	}
	

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}





	





	public void setBeritaId(String beritaId) {
		this.beritaId = beritaId;
	}
}
