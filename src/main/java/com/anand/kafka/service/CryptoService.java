package com.anand.kafka.service;

public interface CryptoService {

	public String encrypt(String password);
	
	public String decrypt(String password);
}
