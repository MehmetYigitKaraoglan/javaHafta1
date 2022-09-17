package loopDemo;

public class Main {

	public static void main(String[] args) {
		//For döngüsü
		for(int i=1;i<10;i+=2) {
			System.out.println(i);
		}
		System.out.println("For Döngüsü Bitti");
		int i = 1;
		//While döngüsü
		while(i<10){
			System.out.println(i);
			i+=2;
		}
		System.out.println("While Döngüsü Bitti");
		//Do-While döngüsü
int j=100;
        do {
            System.out.println(j);
           j+=2;
        } while (j < 20);
        System.out.println("Do-While Döngüsü Bitti");
	}
}
