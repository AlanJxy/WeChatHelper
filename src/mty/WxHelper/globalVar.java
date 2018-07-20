package mty.WxHelper;

import com.google.gson.Gson;
import mty.pojo.Flock;

import java.util.ArrayList;
import java.util.List;


public class globalVar {

	public static Integer mUin;
	public static Gson gson = new Gson(); 
	
	private static String _houTaiAddress ="http://192.168.58.253:8080/SpecialHelper/";
	private static String _houTaiAddress2="http://192.168.58.167:8080/SpecialHelper/";
	public static List<Flock> listFlock=new ArrayList<Flock>();
	
	public static String getHouTaiAddress() {
		return globalVar._houTaiAddress;
	}
	
	public static String getHouTaiAddress2() {
		return globalVar._houTaiAddress2;
	}
	
}
