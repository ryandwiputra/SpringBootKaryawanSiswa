package com.dihardmg.kayrawanapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Siswa {
	/*
	 * @ManyToOne
	 * 
	 * @NotNull
	 * 
	 * @JoinColumn(name = "id_karyawan")
	 */
	@Id
	@Column(name = "NIS")
	private String nis;

	@Column(name = "nama")
	private String nama;

	@Column(name = "Tempat_Lahir")
	private String Tempat_Lahir;

	@Column(name = "Tanggal_Lahir")
	private String Tanggal_Lahir;

	@Column(name = "Jenis_Kelamin")
	private String Jenis_Kelamin;

	@Column(name = "Agama")
	private String Agama;

	@Column(name = "Anak_Ke")
	private String Anak_Ke;

	@Column(name = "Saudara")
	private String Saudara;

	@Column(name = "Asal_Sekolah")
	private String Asal_Sekolah;

	@Column(name = "Alamat_Siswa")
	private String Alamat_Siswa;

	@Column(name = "Nama_Ayah")
	private String Nama_Ayah;
	@Column(name = "Tempat_lahir_Ayah")
	private String Tempat_lahir_Ayah;
	@Column(name = "Tanggal_Lahir_Ayah")
	private String Tanggal_Lahir_Ayah;
	@Column(name = "Pendidikan_Ayah")
	private String Pendidikan_Ayah;
	@Column(name = "Pekerjaan_Ayah")
	private String Pekerjaan_Ayah;
	@Column(name = "Telephone_Ayah")
	private String Telephone_Ayah;
	@Column(name = "Alamat_Ayah")
	private String Alamat_Ayah;
	@Column(name = "Nama_Ibu")
	private String Nama_Ibu;
	@Column(name = "Tempat_Lahir_Ibu")
	private String Tempat_Lahir_Ibu;
	@Column(name = "Tanggal_Lahir_Ibu")
	private String Tanggal_Lahir_Ibu;
	@Column(name = "Pendidikan_Ibu")
	private String Pendidikan_Ibu;
	public String getNama_Ayah() {
		return Nama_Ayah;
	}

	public void setNama_Ayah(String nama_Ayah) {
		Nama_Ayah = nama_Ayah;
	}

	public String getTempat_lahir_Ayah() {
		return Tempat_lahir_Ayah;
	}

	public void setTempat_lahir_Ayah(String tempat_lahir_Ayah) {
		Tempat_lahir_Ayah = tempat_lahir_Ayah;
	}

	public String getTanggal_Lahir_Ayah() {
		return Tanggal_Lahir_Ayah;
	}

	public void setTanggal_Lahir_Ayah(String tanggal_Lahir_Ayah) {
		Tanggal_Lahir_Ayah = tanggal_Lahir_Ayah;
	}

	public String getPendidikan_Ayah() {
		return Pendidikan_Ayah;
	}

	public void setPendidikan_Ayah(String pendidikan_Ayah) {
		Pendidikan_Ayah = pendidikan_Ayah;
	}

	public String getPekerjaan_Ayah() {
		return Pekerjaan_Ayah;
	}

	public void setPekerjaan_Ayah(String pekerjaan_Ayah) {
		Pekerjaan_Ayah = pekerjaan_Ayah;
	}

	public String getTelephone_Ayah() {
		return Telephone_Ayah;
	}

	public void setTelephone_Ayah(String telephone_Ayah) {
		Telephone_Ayah = telephone_Ayah;
	}

	public String getAlamat_Ayah() {
		return Alamat_Ayah;
	}

	public void setAlamat_Ayah(String alamat_Ayah) {
		Alamat_Ayah = alamat_Ayah;
	}

	public String getNama_Ibu() {
		return Nama_Ibu;
	}

	public void setNama_Ibu(String nama_Ibu) {
		Nama_Ibu = nama_Ibu;
	}

	public String getTempat_Lahir_Ibu() {
		return Tempat_Lahir_Ibu;
	}

	public void setTempat_Lahir_Ibu(String tempat_Lahir_Ibu) {
		Tempat_Lahir_Ibu = tempat_Lahir_Ibu;
	}

	public String getTanggal_Lahir_Ibu() {
		return Tanggal_Lahir_Ibu;
	}

	public void setTanggal_Lahir_Ibu(String tanggal_Lahir_Ibu) {
		Tanggal_Lahir_Ibu = tanggal_Lahir_Ibu;
	}

	public String getPendidikan_Ibu() {
		return Pendidikan_Ibu;
	}

	public void setPendidikan_Ibu(String pendidikan_Ibu) {
		Pendidikan_Ibu = pendidikan_Ibu;
	}

	public String getPekerjaan_Ibu() {
		return Pekerjaan_Ibu;
	}

	public void setPekerjaan_Ibu(String pekerjaan_Ibu) {
		Pekerjaan_Ibu = pekerjaan_Ibu;
	}

	public String getTelephone_Ibu() {
		return Telephone_Ibu;
	}

	public void setTelephone_Ibu(String telephone_Ibu) {
		Telephone_Ibu = telephone_Ibu;
	}

	public String getAlamat_Ibu() {
		return Alamat_Ibu;
	}

	public void setAlamat_Ibu(String alamat_Ibu) {
		Alamat_Ibu = alamat_Ibu;
	}

	@Column(name = "Pekerjaan_Ibu")
	private String Pekerjaan_Ibu;
	@Column(name = "Telephone_Ibu")
	private String Telephone_Ibu;
	@Column(name = "Alamat_Ibu")
	private String Alamat_Ibu;
	/*
	 * Nama_Wali, Tempat_Lahir_Wali, Tanggal_Lahir_Wali, Pendidikan_Wali,
	 * Pekerjaan_Wali, Telephone_Wali, Alamat_Wali;
	 */

	public String getNis() {
		return nis;
	}

	public void setNis(String nis) {
		this.nis = nis;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getTempat_Lahir() {
		return Tempat_Lahir;
	}

	public void setTempat_Lahir(String tempat_Lahir) {
		Tempat_Lahir = tempat_Lahir;
	}

	public String getTanggal_Lahir() {
		return Tanggal_Lahir;
	}

	public void setTanggal_Lahir(String tanggal_Lahir) {
		Tanggal_Lahir = tanggal_Lahir;
	}

	public String getJenis_Kelamin() {
		return Jenis_Kelamin;
	}

	public void setJenis_Kelamin(String jenis_Kelamin) {
		Jenis_Kelamin = jenis_Kelamin;
	}

	public String getAgama() {
		return Agama;
	}

	public void setAgama(String agama) {
		Agama = agama;
	}

	public String getAnak_Ke() {
		return Anak_Ke;
	}

	public void setAnak_Ke(String anak_Ke) {
		Anak_Ke = anak_Ke;
	}

	public String getSaudara() {
		return Saudara;
	}

	public void setSaudara(String saudara) {
		Saudara = saudara;
	}

	public String getAsal_Sekolah() {
		return Asal_Sekolah;
	}

	public void setAsal_Sekolah(String asal_Sekolah) {
		Asal_Sekolah = asal_Sekolah;
	}

	public String getAlamat_Siswa() {
		return Alamat_Siswa;
	}

	public void setAlamat_Siswa(String alamat_Siswa) {
		Alamat_Siswa = alamat_Siswa;
	}

}
