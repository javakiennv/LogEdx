package io.edx;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadListFiles extends ListFiles{


	public ArrayList<String> readListString() {
		ArrayList<String> arrListLineJson = new ArrayList<String>();

		ArrayList<String> listFile = super.listFilesInFolder();
		for (String file : listFile) {
			try {
				File fLog = new File(file);
				FileReader reader = new FileReader(fLog);
				BufferedReader br = new BufferedReader(reader);
				String line;
				while ((line = br.readLine()) != null) {
					arrListLineJson.add(line + "\n");
				}
//				System.out.println(arrListLineJson.size());
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		// for (String json : arrListLineJson) {
		// System.out.println(json);
		// }
		return arrListLineJson;
	}
}
