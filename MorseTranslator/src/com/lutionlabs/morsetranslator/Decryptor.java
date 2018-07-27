package com.lutionlabs.morsetranslator;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Decryptor {

	private static String mCode = "";
	private static String mCoded;

	
	public Decryptor() throws IOException {
		System.out.println("Dec Working!");
		
		MorseToString();
		
	}
	
	public static void MorseToString() throws IOException {
		
		mCoded = JOptionPane.showInputDialog("Decryptor", "Insert here a Morse code to translate");
		
		String mCod[] = mCoded.split("\\s+");
		
		for (String letter : mCod) {
			switch (letter) {
			
			case ".-":
				mCode += 'a';
				break;
			case "-...":
				mCode += 'b';
				break;
			case "-.-.":
				mCode += 'c';
				break;
			case "-..":
				mCode += 'd';
				break;
			case ".":
				mCode += 'e';
				break;
			case "..-.":
				mCode += 'f';
				break;
			case "--.":
				mCode += 'g';
				break;
			case "....":
				mCode += 'h';
				break;
			case "..":
				mCode += 'i';
				break;
			case ".---":
				mCode += 'j';
				break;
			case "-.-":
				mCode += 'k';
				break;
			case ".-..":
				mCode += 'l';
				break;
			case "--":
				mCode += 'm';
				break;
			case "-.":
				mCode += 'n';
				break;
			case "---":
				mCode += 'o';
				break;
			case ".--.":
				mCode += 'p';
				break;
			case "--.-":
				mCode += 'q';
				break;
			case ".-.":
				mCode += 'r';
				break;
			case "...":
				mCode += 's';
				break;
			case "-":
				mCode += 't';
				break;
			case "..-":
				mCode += 'u';
				break;
			case "...-":
				mCode += 'v';
				break;
			case ".--":
				mCode += 'w';
				break;
			case "-..-":
				mCode += 'x';
				break;
			case "-.--":
				mCode += 'y';
				break;
			case "--..":
				mCode += 'z';
				break;
			default:
				mCode += '?';
			}
			mCoded += "\t";
		}
	
			
		
		
		JOptionPane.showMessageDialog(null, "Code: " + mCode);
		
		FileWriter fw = new FileWriter("log.txt", true);
		fw.write("[INFO]Decryptor\nMorse: " + mCoded + "\nText: " + mCode + "\n");
		fw.flush();
		fw.close();
	}
	
}
