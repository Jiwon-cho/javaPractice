package com.network.controller;

import java.awt.Desktop;
import java.net.InetAddress;
import java.net.URI;

public class NetworkTest {

	public static void main(String[] args) throws Exception{//UnknownHostException{
		// TODO Auto-generated method stub
		InetAddress localIp=InetAddress.getLocalHost();
		//현재 내 컴퓨너의 network 정보를 가져오는 것
		System.out.println(localIp.getHostAddress());
		String a=InetAddress.getLocalHost().getHostAddress();
		System.out.println(a);
		InetAddress naver=InetAddress.getByName("www.naver.com");
		System.out.println(naver.getHostAddress());
		Desktop.getDesktop().browse(new URI("www.naver.com"));
	}

}
