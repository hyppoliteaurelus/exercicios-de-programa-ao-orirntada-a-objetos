package maio;

public class ArgumentoContinueencadeado {

	public static void main(String[] args) {
		
	for(int x=0;x<4;x++) {
		for(int y=0;y<4;y++) {
			if((x==3)&&(y==3)) {
				
				continue;
			}
			
			System.out.println(x+""+y);
		}
		
	}
	}

}
