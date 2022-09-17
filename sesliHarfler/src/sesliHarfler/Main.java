package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf = 'A';
		
		switch(harf) {
		case 'A' :
		case 'I' :
		case 'O' :
		case 'U' :
		case 'a' :
		case 'ı' :
		case 'o' :
		case 'u' :
			System.out.println("Kalın sesli harf.");
			break;
		case 'E' :
		case 'İ' :
		case 'Ö' :
		case 'Ü' :
		case 'e' :
		case 'i' :
		case 'ö' :
		case 'ü' :
			System.out.println("İnce sesli harf.");
			break;
			default:
				System.out.println("Sesli harf değil.");
		}
	}
}