package level1.annogenericspack;

public class GenericDemo2 {

	public static void main(String[] args) {
		PaintBrushes brush=new PaintBrushes();
	//brush.pb=new GreenPaints();
		brush.setItem(new Dry());
		brush.setItem(new Water());
		brush.setItem(new RedPaints());
		Water neer=(Water)brush.getItem();
		System.out.println(neer);
		
	}

}

abstract class Paints{}
class RedPaints extends Paints{}
class GreenPaints extends Paints{}
class Water{}
class Dry{}
/*class PaintBrushes{
	Paints pb;                      // -------- Not better program
	public void doPaint() {
		System.out.println(pb);
	}
}*/
class PaintBrushes{
	Object item;

	public Object getItem() {            // ---- wrong program, error not checked in compile time
		return item;
	}

	public void setItem(Object item) {
		this.item = item;
	}
}






