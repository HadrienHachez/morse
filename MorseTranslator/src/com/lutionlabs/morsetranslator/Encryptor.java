package com.lutionlabs.morsetranslator;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Encryptor {

	private static String mCode;
	private static String mCoded;
	
	public Encryptor() throws IOException {
		System.out.println("Enc Working!");
		StringToMorse();
	}
	
	public static void StringToMorse() throws IOException {
		
		mCoded = "";
		
		mCode = JOptionPane.showInputDialog("Encryptor", "Insert here a sentence to convert into Morse");
		
		mCode = mCode.toLowerCase();
		
		for (int i = 0; i<=mCode.length()-1 ; i++) {
			
			switch (mCode.charAt(i)) {
			
			case 'a':
				mCoded += ".- ";
				break;
			case 'b':
				mCoded += "-... ";
				break;
			case 'c':
				mCoded += "-.-. ";
				break;
			case 'd':
				mCoded += "-.. ";
				break;
			case 'e':
				mCoded += ". ";
			    break;
			case 'f':
				mCoded += "..-. ";
				break;
			case 'g':
				mCoded += "--. ";
				break;
			case 'h':
				mCoded += ".... ";
				break;
			case 'i':
				mCoded += ".. ";
				break;
			case 'j':
				mCoded += ".--- ";
				break;
			case 'k':
				mCoded += "-.- ";
				break;
			case 'l':
				mCoded += ".-.. ";
				break;
			case 'm':
				mCoded += "-- ";
				break;
			case 'n':
				mCoded += "-. ";
				break;
			case 'o':
				mCoded += "--- ";
				break;
			case 'p':
				mCoded += ".--. ";
				break;
			case 'q':
				mCoded += "--.- ";
				break;
			case 'r':
				mCoded += ".-. ";
				break;
			case 's':
				mCoded += "... ";
				break;
			case 't':
				mCoded += "- ";
				break;
			case 'u':
				mCoded += "..- ";
				break;
			case 'v':
				mCoded += "...- ";
				break;
			case 'w':
				mCoded += ".-- ";
				break;
			case 'x':
				mCoded += "-..- ";
				break;
			case 'y':
				mCoded += "-.-- ";
				break;
			case 'z':
				mCoded += "--.. ";
				break;
			case ' ':
				mCoded += "  ";
				break;
			default:
				mCoded += "? ";

			}
			
			
		}
		
		JOptionPane.showMessageDialog(null, "Coded: " + mCoded);
		
		FileWriter fw = new FileWriter("log.txt", true);
		
		fw.write("[INFO]Encrypt\nText: " + mCode + "\nMorse: " + mCoded + "\n");
		fw.flush();
		fw.close();
	
	}
	
}
