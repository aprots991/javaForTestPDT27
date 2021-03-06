package com.example.tests;

import static org.testng.Assert.assertEquals;

import java.util.Collections;
import java.util.List;
// import java.util.Random;

import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase {

//	@Test(dataProvider = "randomValidGroupGenerator")
	@Test
	//	public void modifySomeGroup(GroupData group) {
	public void modifySomeGroup() {
		app.getNavigationHelper().openMainPage();
		app.getNavigationHelper().gotoGroupsPage();
		
		// save old state 
		List<GroupData> oldList =app.getGroupHelper().getGroups();
		
//		Random rnd = new Random();
//		int index = rnd.nextInt(oldList.size()-1);
		
		
		// actions
		app.getGroupHelper().initGroupModification(0);
//		app.getGroupHelper().initGroupModification(index);		
		GroupData group = new GroupData(); //nd
		group.name = "new name"; // nd

		app.getGroupHelper().fillGroupForm(group);
		app.getGroupHelper().submitGroupModification();
		app.getGroupHelper().returnToGroupsPage();
		
		// save new state
		List<GroupData> newList =app.getGroupHelper().getGroups();
		
		
		// compare states
		oldList.remove(0);
		//oldList.remove(index);
		oldList.add(group);
		Collections.sort(oldList);
		assertEquals(newList, oldList);
	}

}
