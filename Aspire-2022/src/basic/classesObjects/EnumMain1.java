package basic.classesObjects;
enum RainbowColors {                 // Enum Operation
	RED,ORANGE,YELLOW,GREEN,BLUE,INDIGO,VIOLET
}

public class EnumMain1 {

	public static void main(String[] args) {
		RainbowColors fvconst =RainbowColors.VIOLET;
		RainbowColors myconst =RainbowColors.BLUE;
		System.out.println(fvconst);
		for(RainbowColors allconst : RainbowColors.values()) {
			System.out.print(allconst+"\t");
		}
		System.out.println("\n");
		switch (myconst) {
		case RED:System.out.println("RED First Color");
			break;
		case ORANGE:System.out.println("ORANGE Second Color");
		break;
		case YELLOW:System.out.println("YELLOW Third Color");
		break;
		case GREEN:System.out.println("GREEN Fourth Color");
		break;
		case BLUE:System.out.println("BLUE Fifth Color");
		break;
		case INDIGO:System.out.println("INDIGO Sixth Color");
		break;
		case VIOLET:System.out.println("VIOLET Seventh Color");
		break;
        default:System.out.println("This color is not in Rainbow");
	    break;
		}

	}

}
