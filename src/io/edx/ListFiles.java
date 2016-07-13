package io.edx;

import java.io.File;
import java.util.ArrayList;

public class ListFiles {

	final String pathFolder = "C:/json";
	final File folder = new File(pathFolder);
	
	public ArrayList<String> listFilesInFolder() {
		ArrayList<String> listfiles = new ArrayList<String>();
		for (File fileEntry : folder.listFiles()) {
			if (fileEntry.isDirectory()) {
				System.out.println("Folder: Không tìm thấy file trong folder.");
			} else {
				String patFile = pathFolder + "/" + fileEntry.getName();
				listfiles.add(patFile);
			}
		}
		return listfiles;
	}
}
