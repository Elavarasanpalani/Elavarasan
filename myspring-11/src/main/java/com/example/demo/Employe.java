package com.example.demo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Employe {
	

	private String  kname;
	private String kpassword;
	public String getKname() {
		return kname;
	}
	public void setKname(String kname) {
		this.kname = kname;
	}
	public String getKpassword() {
		return kpassword;
	}
	public void setKpassword(String kpassword) {
		this.kpassword = kpassword;
	}
	public String getKcity() {
		return kcity;
	}
	public void setKcity(String kcity) {
		this.kcity = kcity;
	}
	public int getKid() {
		return kid;
	}
	public void setKid(int kid) {
		this.kid = kid;
	}
	public long getKmobilenumber() {
		return kmobilenumber;
	}
	public void setKmobilenumber(long kmobilenumber) {
		this.kmobilenumber = kmobilenumber;
	}
	public int getKage() {
		return kage;
	}
	public void setKage(int kage) {
		this.kage = kage;
	}
	public int getKflag() {
		return kflag;
	}
	public void setKflag(int kflag) {
		this.kflag = kflag;
	}
	public String getKimage() {
		return kimage;
	}
	public void setKimage(String kimage) {
		this.kimage = kimage;
	}
	public String getKaddress() {
		return kaddress;
	}
	public void setKaddress(String kaddress) {
		this.kaddress = kaddress;
	}
	private String kcity;
	
    @Id
	private int kid;
	private long kmobilenumber;
	private int  kage;
	private int kflag;
	private String kimage;
	private String kaddress;
	
}
