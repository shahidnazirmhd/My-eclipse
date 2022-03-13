package basic;

public class Array2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int ournum[]= {1,2,3,4,5,6};
		 System.out.println(ournum.length);
     int mynum[][]= {{11,12,13,14,15,16,17},{21,22,23,24,25}};
     int x= mynum[1][1];
     System.out.println(x);
     System.out.println(mynum.length);
    System.out.println("\r");
    for(int i=0;i<mynum.length;++i)
    { 
    	for(int j=0;j<mynum[i].length;++j) {
    		System.out.print("\t"+mynum[i][j]);
    	}
    }
	}

}
