package by.academy.lesson3;

public class Main {

	public static void main(String[] args) {
		int s = 370_000;
		int sec;
		int m;
		int h;
		int min;
		int day;
		int weak;
		sec = s%60;
		min = (s % 3600 - sec) / 60 ;
		
		h = (int)(s / 3600) % 24;
		day = s / 86_400;
		weak = day / 7;
		System.out.println("недель "+ weak + "\nдней "+ day + "\nчасов "+ h +
						"\nминут " + min + "\nсекунд "+ sec) ;

	}

}
