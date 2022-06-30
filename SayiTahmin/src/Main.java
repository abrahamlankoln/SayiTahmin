import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int right = 5;
		int num;
		Random randomnumber = new Random();
		int number = randomnumber.nextInt(100);
		Scanner deger = new Scanner(System.in);
		System.out.println(number);
		while (right > 0) {
			System.out.print("lutfen bir sayi giriniz: ");
			num = deger.nextInt();
			if (num < 0 || num > 99) {
				System.out.println("lutfen 0-100 arasında bir sayi giriniz.");
				continue;
			}
			if (num == number) {
				System.out.print("sayiyi bildiniz sayiniz: " + number);
				break;
			} else {
				right--;
				System.out.println("hatali bir sayi girdiniz");
				System.out.println("kalan hakkiniz " + right);
				if (num > number) {
					System.out.println("girdiginiz sayi random sayidan buyuktur");
				} else {
					System.out.println("girdiginiz sayi random sayidan kucuktur");
				}
			}
		}
	}

}
