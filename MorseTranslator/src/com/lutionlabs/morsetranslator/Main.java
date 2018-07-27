package com.lutionlabs.morsetranslator;

import java.io.File;
import java.io.IOException;

import javax.swing.*;

public class Main {

	private static String mAsk;
	
	public static void main (String[] args) throws IOException {
		
		Init();
		
		ask();
		
		FileCreator();
	}
	
	public static void Init() {
		System.out.println("MorseTranslator is loading...");
		JOptionPane.showMessageDialog(null, "Continue?", "Welcome to MorseTranslator", 3);
	}
	
	public static void ask() throws IOException {
		mAsk = JOptionPane.showInputDialog("Encrypt or Decrypt?");
		switch (mAsk) {
		case "Encrypt":
			Encryptor enc = new Encryptor();
			break;
		case "Decrypt":
			Decryptor dec = new Decryptor();
			break;
		default: 
			ask();
		}
	}
	
	public static void FileCreator() throws IOException {
		File f = new File("log.txt");
		if (!f.exists()) {
			f.createNewFile();
		}
	}
	
}
