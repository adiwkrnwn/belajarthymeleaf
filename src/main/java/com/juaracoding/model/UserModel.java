package com.juaracoding.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {
	
	String nama;
	String gambar;
	String judul;
	String deskripsi;

}
