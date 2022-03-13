package basic.methods;

public class MethodRec2 {
 static int addbtwnum(int start,int end)
 {
	 if(end>start)
	 {
		 return end+addbtwnum(start, end-1);
	 }
	 else 
		 return end;
 }
 public static void main(String[] args) {
	int abn= addbtwnum(5, 10);
	System.out.println(abn);
}
}
