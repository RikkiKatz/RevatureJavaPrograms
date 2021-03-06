package com.rikki.multilang;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class International {

	public static void main(String[] args) {
	
		Locale.setDefault(new Locale("es", "MX"));
		
		//bundle of messages.. uses Locale class
		/*
		 * basename --> name of properties file for messages
		 * messages.properties (default)
		 * messages_en.properties (default for English)
		 * messages_en_US.properties (default for US English)
		 * messages_es_MX.properties
		 */

		ResourceBundle bundle = ResourceBundle.getBundle("messages");
		System.out.println(bundle.getString("enter"));
		
		// NumberFormat
		System.out.println(NumberFormat.getCurrencyInstance().format(25.999));
	}
	
}
