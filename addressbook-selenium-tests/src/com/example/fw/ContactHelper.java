package com.example.fw;

import org.openqa.selenium.By;

import com.example.tests.ContactData;

public class ContactHelper extends HelperBase {

	public ContactHelper(ApplicationManager manager) {
		super(manager);
	}

	public void initContactCreation() {
		click(By.linkText("add new"));
	}

	public void fillContactForm(ContactData contact) {
	    type(By.name("firstname"), contact.fname);
	    type(By.name("lastname"), contact.lname);
	    type(By.name("address"), contact.address);
	    type(By.name("home"), contact.hphone);
	    type(By.name("mobile"), contact.mphone);
	    type(By.name("work"), contact.wphone);
	    type(By.name("email"), contact.email);
	    type(By.name("email2"), contact.email2);
	    selectByText(By.name("bday"), contact.bday);
	    selectByText(By.name("bmonth"), contact.bmonth);
		type(By.name("byear"), contact.byear);
	    // selectByText(By.name("new_group"), contact.sgroup);
		type(By.name("address2"), contact.address2);
	    type(By.name("phone2"), contact.phone2);
	}

	public void submitContactCreation() {
		click(By.name("submit"));
	}

	public void returnToHomePage() {
		click(By.linkText("home page"));
	}

}