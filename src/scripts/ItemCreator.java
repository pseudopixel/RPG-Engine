package scripts;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ItemCreator {
	static Scanner s = new Scanner(System.in);
	static ArrayList<String> commits = new ArrayList<String>();
	
	public static void main(String[] args) {
		String temp, name, desc;
		String buyPrice, sellPrice;
		
		while(!(temp = s.nextLine()).equals("")) {
			name = temp.split(":")[0];
			desc = temp.split(":")[1];
			buyPrice = temp.split(":")[2];
			sellPrice = temp.split(":")[3];
			
			commits.add(name);
			commits.add(desc);
			commits.add(buyPrice);
			commits.add(sellPrice);
		}
		
		try {
			save();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void save() throws IOException {
		File f = new File("C:/Users/EXE/Desktop/items.dat");
		f.createNewFile();
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		int clean = 0;
		bw.write("<items>");
		bw.newLine();
		for(int i = 0; i < commits.size(); i += 4) {
			bw.write("	<item>");
			bw.newLine();
			bw.write("		<id>" + clean + "</id>");
			bw.newLine();
			bw.write("		<name>" + commits.get(i) + "</name>");
			bw.newLine();
			bw.write("		<desc>" + commits.get(i+1) + "</desc>");
			bw.newLine();
			bw.write("		<buy>" + commits.get(i+2) + "</buy>");
			bw.newLine();
			bw.write("		<sell>" + commits.get(i+3) + "</sell>");
			bw.newLine();
			bw.write("	</item>");
			bw.newLine();
			clean++;
		}
		bw.write("</items>");
		bw.close();
		fw.close();
	}
}
