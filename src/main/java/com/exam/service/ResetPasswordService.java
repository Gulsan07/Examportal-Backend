package com.exam.service;



public interface ResetPasswordService {
	
	public String generateOTP();
	
	public void sendOTPByEmail(String email, String otp);
	
	

}
