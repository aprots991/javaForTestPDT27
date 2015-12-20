package com.example.tests;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {

  @Test
  public void testNonEmptyContactCreation() throws Exception {
	openMainPage();
	addNewPage();
	ContactData contact = new ContactData();
	contact.fname = "First name";
	contact.lname = "Last name";
	contact.address = "Moscow, Leningradsky st., 81";
	contact.hphone = "495 555 5555";
	contact.mphone = "901 555 5555";
	contact.wphone = "499 999 9999";
	contact.email = "local@localhost.ru";
	contact.email2 = "ex@ex.ru";
	contact.byear = "1980";
	contact.sgroup = "Rob";
	contact.address2 = "Moscow, Tretiakovsky st., 1";
	contact.phone2 = "112";
	contact.bday = "15";
	contact.bmonth = "September";
	fillContactForm(contact);
	submitContactCreation();
	gotoHomePage();
  }
}

