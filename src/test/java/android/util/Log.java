package android.util;

import java.util.logging.Logger;

public class Log {
	public static int DEBUG = 2;
	public static boolean isLoggable(String s, int i) {
		return true;
	}

	public static int d (String tag, String msg) {
		Logger.getLogger(tag).fine(msg);
		return DEBUG;
	}

}
