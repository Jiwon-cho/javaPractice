package com.exception.controller;

import java.io.EOFException;
import java.io.FileNotFoundException;

public class OverrideTest extends ThrowsTest {
	
	@Override
	public void b() throws FileNotFoundException,EOFException{//반대 경우엔 가능 /IOException <- 이건 더 큰 범위라 얘를 해버리면 안됌{
		
	}

}
