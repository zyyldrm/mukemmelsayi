
package mukemmelsay;
import java.util.Scanner;
public class Mukemmelsay {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       int toplam = 0;
       System.out.print("Bir sayı giriniz: ");
		int sayi = scanner.nextInt();
                
                for(int i = 1; i < sayi; i++){
                    if (sayi % i == 0){
				toplam += i;
			}
		}
		if (toplam==sayi) {
			System.out.println(sayi + " Mükemmel sayıdır.");
		}else {
			System.out.println(sayi + " Mükemmel sayı değildir.");
		}
    }
    
}
