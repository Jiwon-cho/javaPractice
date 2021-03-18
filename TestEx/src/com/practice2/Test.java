package com.practice2;

import java.util.logging.Logger;

public class Test {
	private static MainEntry2 mt=new MainEntry2();
	
	public static void main(String[] args) {
		Logger Log=mt.test();
		Log.info("test");
	}

}
