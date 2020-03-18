package com.neofect.gts.util.auth;

import java.security.MessageDigest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Crypto {
	public static String sha256(final String string) {
		log.debug("==============sha256 Start==============");
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			byte[] hash = digest.digest(string.getBytes("UTF-8"));
			StringBuffer hexString = new StringBuffer();
			
			for(int i=0;i<hash.length;i++) {
				String hex = Integer.toHexString(0xff & hash[i]);
				if(hex.length() == 1) {
					hexString.append('0');
				}
				hexString.append(hex);
			}
		log.debug("==============sha256 End==============");	
			return hexString.toString();
		}catch (Exception e) {
			log.debug("==============sha256 Error==============");	
			// TODO: handle exception
			throw new RuntimeException(e);
		}
	}
}