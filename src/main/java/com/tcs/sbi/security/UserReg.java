package com.tcs.sbi.security;

import in.ashok.PwdSecurityService;

public class UserReg {

	public static void main(String[] args) {
	
		PwdSecurityService pss = new PwdSecurityService();
		String encode=pss.encode("ashokit");
		System.out.println(encode);
		

	}

}
