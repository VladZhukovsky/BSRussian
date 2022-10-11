import java.util.Arrays;
/* Английская песня о 99-ти бутылках пива на русском языке
с правильным спряжением чисел и слов.
Автор: Владислав Жуковский
vladislav.zhukovsky@gmail.com
 */
public class BeerSongRussian {
		public static void main(String[] args) {
		int BeerNum = 99;
		String[] LastDigitFirst_Array = new String[]{"0", "5", "6", "7", "8", "9"};
		String[] LastDigitSecond_Array = new String[]{"2", "3", "4"};
		String[] LastDigitIs1 = new String[]{"1"};

		while(BeerNum >0)	{
			int LastDigit = Math.abs(BeerNum % 10); // оператор % - деление по модулю; возвращает остаток от деления первого числа на второе
			String LastDigitStr = Integer.toString(LastDigit);

			if (BeerNum >= 11 && BeerNum <= 14) {
				System.out.println(BeerNum + " бутылок пива на полке.");
			} else if (Arrays.asList(LastDigitFirst_Array).contains(LastDigitStr)) {
				System.out.println(BeerNum + " бутылок пива на полке.");
			} else if (Arrays.asList(LastDigitSecond_Array).contains(LastDigitStr)) {
				System.out.println(BeerNum + " бутылки пива на полке.");
			} else if (Arrays.asList(LastDigitIs1).contains(LastDigitStr)) {
				System.out.println(BeerNum + " бутылка пива на полке.");
			} else if (BeerNum == 1) {
				System.out.println(BeerNum + " бутылка пива на полке.");
			}

			System.out.println("Возьми одну.");
			System.out.println("Пусти по кругу.");
			BeerNum = BeerNum - 1;

			if (BeerNum > 0) {
				System.out.println(); // Добавляем пустую строку перед следующим распитием
			} else {
				System.out.println();
				System.out.println("Не осталось бутылок пива на полке.");
			}
		} // Конец цикла while
	}
} // Конец класса BeerSongRussian