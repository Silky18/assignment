package com.glsilky.services;

public class OTPgenerator {
	public int generateOTP() {
		int otp = (int)(Math.random()*9000) + 1000;
		return otp;
	}


}
