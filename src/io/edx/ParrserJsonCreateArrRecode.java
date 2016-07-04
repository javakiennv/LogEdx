package io.edx;

import java.util.ArrayList;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ParrserJsonCreateArrRecode {
	ArrayList<Recode> arRecodes = new ArrayList<>();

	public ParrserJsonCreateArrRecode() {
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Recode> create() {

		ReadListFiles in = new ReadListFiles();
		ArrayList<String> arrList = in.readListString();

		for (String jsonString : arrList) {
			try {
				JSONParser jsonParser = new JSONParser();
				JSONObject jsonObject = (JSONObject) jsonParser.parse(jsonString.toString());

				String username = (String) jsonObject.get("username");
				String ip = (String) jsonObject.get("ip");
				String time = (String) jsonObject.get("time");
				String referer = (String) jsonObject.get("referer");
//				String event = (String) jsonObject.get("event");

				Recode recode = new Recode(username, ip, time, referer);
				arRecodes.add(recode);
				// System.out.println(username + " " + ip + " " + time + " " + event );

			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return arRecodes;
	}
}
