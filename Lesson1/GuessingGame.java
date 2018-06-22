import java.util.*;
public class GuessingGame{
    public static void main(String[]args){
		/*
		Угадай число программа
		Компьютер загадывает число от 0 до 100, которое ты угадываешь.
		Если попытка угадывания неудачаная, то компьюетер в SOUT дает тебе подсказку, что число меньше или больше заданного компьютером.
		Если угадал, пишешь победа.
		Игра продолжается до тех пор, пока не угадаешь число.
		*/
        Random rd = new Random();
        int guessingNumber = rd.nextInt(100);
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int numberOfPlayer = sc.nextInt();
        while(guessingNumber!=numberOfPlayer){
            if (guessingNumber<numberOfPlayer) System.out.println("Ваше число больше угадываемого.");
            else System.out.println("Ваше число меньше угадываемого.");
            System.out.println("Введите число: ");
            numberOfPlayer = sc.nextInt();
        }
        System.out.println("Поздравляю! Вы угадали число: " + numberOfPlayer);
        sc.close();
    }
}