import java.util.*;
public class GuessingGame{
    public static void main(String[]args){
		/*
		������ ����� ���������
		��������� ���������� ����� �� 0 �� 100, ������� �� ����������.
		���� ������� ���������� ����������, �� ���������� � SOUT ���� ���� ���������, ��� ����� ������ ��� ������ ��������� �����������.
		���� ������, ������ ������.
		���� ������������ �� ��� ���, ���� �� �������� �����.
		*/
        Random rd = new Random();
        int guessingNumber = rd.nextInt(100);
        Scanner sc = new Scanner(System.in);
        System.out.println("������� �����: ");
        int numberOfPlayer = sc.nextInt();
        while(guessingNumber!=numberOfPlayer){
            if (guessingNumber<numberOfPlayer) System.out.println("���� ����� ������ ������������.");
            else System.out.println("���� ����� ������ ������������.");
            System.out.println("������� �����: ");
            numberOfPlayer = sc.nextInt();
        }
        System.out.println("����������! �� ������� �����: " + numberOfPlayer);
        sc.close();
    }
}