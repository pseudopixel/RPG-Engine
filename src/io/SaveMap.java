package io;

import gfx.Position;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SaveMap {
	public static void save(ArrayList<Position> quads) {
		Scanner s = new Scanner(System.in);
		String file = s.nextLine() + ".xml";
		try {
			new File(file).createNewFile();
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);			
			bw.write("<map>");
			bw.newLine();
			for(Position q : quads) {
				bw.write("	<tile>");
				bw.newLine();
				bw.write("		<x>" + q.getX() + "</x>");
				bw.newLine();
				bw.write("		<y>" + q.getY() + "</y>");
				bw.newLine();
				bw.write("	</tile>");
				bw.newLine();
			}
			bw.write("</map>");

			bw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
