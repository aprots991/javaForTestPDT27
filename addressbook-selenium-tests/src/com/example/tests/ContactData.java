package com.example.tests;

public class ContactData implements Comparable<ContactData> {

	public String fname;
	public String lname;
	public String address;
	public String hphone;
	public String mphone;
	public String wphone;
	public String email;
	public String email2;
	public String byear;
	public String sgroup;
	public String address2;
	public String phone2;
	public String bday;
	public String bmonth;

	public ContactData() {
	}

	public ContactData(String fname, String lname, String address, String hphone, String mphone, String wphone,
			String email, String email2, String byear, String sgroup, String address2, String phone2, String bday,
			String bmonth) {
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.hphone = hphone;
		this.mphone = mphone;
		this.wphone = wphone;
		this.email = email;
		this.email2 = email2;
		this.byear = byear;
		this.sgroup = sgroup;
		this.address2 = address2;
		this.phone2 = phone2;
		this.bday = bday;
		this.bmonth = bmonth;
		
	}

	@Override
	public String toString() {
		return "ContactData [fname=" + fname + ", lname=" + lname + ", hphone=" + hphone + ", email=" + email + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
//		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((fname == null) ? 0 : fname.hashCode());
//		result = prime * result + ((hphone == null) ? 0 : hphone.hashCode());
//		result = prime * result + ((lname == null) ? 0 : lname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContactData other = (ContactData) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (fname == null) {
			if (other.fname != null)
				return false;
		} else if (!fname.equals(other.fname))
			return false;
/*		if (hphone == null) {
			if (other.hphone != null)
				return false;
		} else if (!hphone.equals(other.hphone))
			return false; 
			viewed without spaces*/
		if (lname == null) {
			if (other.lname != null)
				return false;
		} else if (!lname.equals(other.lname))
			return false;
		return true;
	}

	@Override
	public int compareTo(ContactData other) {
		return this.fname.toLowerCase().compareTo(other.fname.toLowerCase());
	}
	
}