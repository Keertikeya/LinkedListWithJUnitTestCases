package com.gupta.keertikeya;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestEmptyLinkedList.class, TestMultipleNodesLinkedList.class,
		TestSingleNodeLinkedList.class })
public class AllTests {

}
