package util;

public class CLogger {
	public static void log(Object obj, String message) {
		System.out.println("[" + obj.getClass().getSimpleName() + "] " + message);
	}
	
	public static void logn(Object obj, String message) {
		System.out.print("[" + obj.getClass().getSimpleName() + "] " + message);
	}
	
	public static void glog(String message) {
		System.out.println("[General] " + message);
	}
	
	public static void glogn(String message) {
		System.out.print("[General] " + message);
	}
}
