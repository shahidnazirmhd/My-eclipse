package level1.annogenericspack;

public class GenericDemo1 {

	public static void main(String[] args) {
	PaintBrush brush=new PaintBrush();
	brush.pb=new GreenPaint();

	}

}
/*class PaintBrush{
	public void doPaint(int i) {
		if(i==1) {
			System.out.println("Red Paint...");       // ---- Bad Program
		}
		else if(i==2) {
			System.out.println("Blue Paint....");
		}
	}
	
}*/
abstract class Paint{}
class RedPaint extends Paint{}
class GreenPaint extends Paint{}
class PaintBrush{
	Paint pb;                      // -------- Not better program because brushes not only use for painting
	public void doPaint() {
		System.out.println(pb);
	}
}







