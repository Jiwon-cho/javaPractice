package com.exception.controller;

import java.io.EOFException;
import java.io.FileNotFoundException;

public class OverrideTest extends ThrowsTest {
	
	@Override
	public void b() throws FileNotFoundException,EOFException{//�ݴ� ��쿣 ���� /IOException <- �̰� �� ū ������ �긦 �ع����� �ȉ�{
		
	}

}
