package com.common;

import java.util.Comparator;

//����Ʈ�� �ִ� �� ��ü�� ������ ���ϴ� ��ü
public class IntegerOrderAsc implements Comparator<Integer>{

	@Override
	public int compare(Integer i, Integer i2) {
		return i-i2;// �������� ���� -> + �� �ٲ�
//	if(i>i2) {
//		return +1;
//	}else if(i<i2) {
//		return -1;
//		
//	}else {
//		return 0;
//	}
	}
}
