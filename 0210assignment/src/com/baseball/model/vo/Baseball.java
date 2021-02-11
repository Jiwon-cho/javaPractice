package com.baseball.model.vo;

import java.util.Arrays;
import java.util.Random;

public class Baseball {
	private Random r = new Random();

	public String Numb() {

		String numb = "";
		for (int i = 0; i < 4; i++) {
			String ran = String.valueOf((r.nextInt(9) + 1));

			if (!numb.contains(ran)) {
				numb += ran;
			} else {
				i -= 1;
			}
		}
		return numb;
	}

}
