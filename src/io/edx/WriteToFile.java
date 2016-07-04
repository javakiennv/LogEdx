package io.edx;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class WriteToFile {
	FileOutputStream out;

	public WriteToFile() throws IOException {
		// TODO Auto-generated constructor stub
		try {
			out = new FileOutputStream("C:\\Users\\Ministorm\\Desktop\\output.csv");
			ParrserJsonCreateArrRecode arrRecode = new ParrserJsonCreateArrRecode();
			ArrayList<Recode> list = arrRecode.create();
			for (Recode recode : list) {
				String getUsername = recode.getUsername();
				//Loại bỏ các username Null
				if (!getUsername.equals("")) {
					//Loại bỏ username không phải học viên theo mã CC và SE
					if (getUsername.contains("SE")||getUsername.contains("CC")) {
						out.write(recode.toString().getBytes());
					}
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (out != null) {
				out.close();
			}
		}
	}
}
