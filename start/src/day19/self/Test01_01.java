package day19.self;

import java.net.*;

public class Test01_01 {

	public Test01_01() {
		InetAddress inet = null;
		
		try {
			inet = InetAddress.getLocalHost();
			String ip = inet.getHostAddress();
			String name = inet.getHostName();
			System.out.println("IP  주소 : " + ip);
			System.out.println("장비이름 : " + name);
			System.out.println("#################################");
			
			
			inet = InetAddress.getByName("www.naver.com");
			String naverIp = inet.getHostAddress();
			String sysName = inet.getHostName();
			System.out.println("네이버 아이피 : " + naverIp);
			System.out.println("시스템 이  름: " + sysName);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		new Test01_01();
	}

}
