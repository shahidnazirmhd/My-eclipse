package level1.annogenericspack;

import java.lang.reflect.Field;

public class GenericDemo3 {

	public static void main(String[] args) {
		BrushForPaint<CleanWater> brush=WaterContainer.getBrush();
		System.out.println(brush.getItem());
		//brush.setItem(new CleanWater());
		//brush.setItem(new PaintRed());    -- error occured in compile time    **Good programming**
		/*
		 * CleanWater neer=(CleanWater)brush.getItem(); System.out.println(neer);
		 */
		BrushForPaint<PaintToPainting> brush2=PaintContainer.getBrush();
		System.out.println(brush2.getItem());
		//brush2.setItem(new PaintRed());
		//brush2.setItem(new PaintYellow());
		//brush2.setItem(new CleanWater()); -- error occured in compile time    **Good programming**
		/*
		 * PaintToPainting paint=(PaintToPainting)brush2.getItem();
		 * System.out.println(paint);
		 */
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
	@Inject(ClassName ="level1.annogenericspack.PaintRed" )
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
		try {
		BrushForPaint<PaintToPainting> brush1=new BrushForPaint<>();
		Class C=brush1.getClass();
		Field field=C.getDeclaredField("item");
		field.setAccessible(true);
		Inject in=(Inject)field.getAnnotation(Inject.class);
		if(in!=null) {
			String classname=in.ClassName();
			PaintToPainting paint=(PaintToPainting)Class.forName(classname).newInstance();
			brush1.setItem(paint);
		}
		return brush1;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
class WaterContainer{
	public static BrushForPaint<CleanWater> getBrush() {
		try {
		BrushForPaint<CleanWater> brush2=new BrushForPaint<>();
		Class C=brush2.getClass();
		Field field=C.getDeclaredField("item");
		field.setAccessible(true);
		Inject in=(Inject)field.getAnnotation(Inject.class);
		if(in!=null) {
		brush2.setItem(new CleanWater());
		}
		return brush2;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		}
	}





