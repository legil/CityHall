//
//package weeksix;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.LinkedHashMap;
//import java.util.Map.Entry;
//
//public class SBA4 { // don't forget to add comments public static void
//	public static main(String[] args) { compress("alaaasass"); }
//
//	public static String compress(String str) { LinkedHashMap<Character, Integer>
//  lhm = new LinkedHashMap<Character, Integer>(); String cStr = ""; //
//  compressed String int count = 0;
//  
//  for (int i = 0; i < str.length(); i++) { char c = str.charAt(i);
//  
//  if (!lhm.containsKey(c)) { lhm.put(c, 1); count = 0;
//  
//  } else if (lhm.containsKey(c)) { count++; lhm.put(c, count); }
//  
//  cStr = cStr + c + lhm.get(c); System.out.println(lhm);
//  
//  } System.out.println(cStr);
//  
//  
//  String newStr = ""; //int maxVal = 0;
//  
//  for(int i = 0; i < cStr.length(); i++) { if(i%2 != 0 && cStr.charAt(i)==1) {
//  newStr = newStr + cStr.charAt(i); }
//  
//  
//  // System.out.println(newStr);
//  
//  return cStr; } }
//
//	class SBA4Problem2 {
//
//		public static HashMap<String, Integer> r = new HashMap<String, Integer>();
//
//		public static void main(String[] args) {
//
//			register("alex");
//			register("xylos");
//			register("alex");
//			register("alan");
//			register("alex");
//			register("alex");
//		}
//
//		public static void register(String name) {
//			if (r.containsKey(fname)) {
//				for (Entry<String, Integer> x : r.entrySet()) {
//					if (x.getValue() == 0) {
//						System.out.println(x.getKey());
//					} else {
//						System.out.println(x.getKey() + x.getValue());
//					}
//				}
//
//				r.put(name, r.get(name) + 1);
//			} else {
//				r.put(name, 0);
//			}
//		}
//	}
//
//	class SBA4Problem2 { public static ArrayList<String> al = new
//  ArrayList<String>();
//  
//  public static void main(String[] args) {
//  
//  register("alex"); register("xylos"); register("alex"); register("alan");
//  register("alex"); register("alex");
//  
//  System.out.println(al);
//  
//  for (int i = 0; i < al.size(); i++) { System.out.println(al.get(i)); } }
//  
//  public static void register(String name) { int num = 0; if
//  (al.contains(name)) { for (int i = 1; i < al.size(); i++) { if
//  ((al.get(i).substring(0, name.length())) == name && (al.get(i) != name)) {
//  num = Integer.valueOf(al.get(i).substring(name.length() - 1, name.length()));
//  num++; } }
//  
//  al.add(name + num);
//  
//  } else { al.add(name); } } }
