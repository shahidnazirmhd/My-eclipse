package level1.annogenericspack;

public class GenericDemo3 {

	public static void main(String[] args) {
		BrushForPaint<CleanWater> brush=WaterContainer.getBrush();
		brush.setItem(new CleanWater());
		//brush.setItem(new PaintRed());    -- error occured in compile time    **Good programming**
		CleanWater neer=(CleanWater)brush.getItem();
		System.out.println(neer);
		BrushForPaint<PaintToPainting> brush2=PaintContainer.getBrush();
		brush2.setItem(new PaintRed());
		//brush2.setItem(new CleanWater()); -- error occured in compile time    **Good programming**
		PaintToPainting paint=(PaintToPainting)brush2.getItem();
		System.out.println(paint);
	}

}

abstract class PaintToPainting{}
class PaintRed extends PaintToPainting{}
class PaintYellow extends PaintToPainting{}
class CleanWater{}
class DryInAir{}

/*class BrushForPaint{
	Object item;

	public Object getItem() {            // ---- wrong program, error not checked in compile time
		return item;
	}

	public void setItem(Object item) {
		this.item = item;
	}
}*/
class BrushForPaint<T>{
	T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
}
class PaintContainer{
	public static BrushForPaint<PaintToPainting> getBrush() {
		BrushForPaint<PaintToPainting> brush1=new BrushForPaint<>();
		brush1.setItem(new PaintYellow());
		return brush1;
	}
}
class WaterContainer{
	public static BrushForPaint<CleanWater> getBrush() {
		BrushForPaint<CleanWater> brush2=new BrushForPaint<>();
		brush2.setItem(new CleanWater());
		return brush2;
	}
}




