package sec03.exam01;


import java.util.Random;

public class Rock {
	public static void main(String[] args) {

		Random rand = new Random();
		
		
		int dice_Num1, dice_Num2, dice_Num3, sum;
		
		dice_Num1 = rand.nextInt(6);
		System.out.println(dice_Num1);
		
		dice_Num2 = rand.nextInt(6);
		System.out.println(dice_Num2);
		
		dice_Num3 = rand.nextInt(6);
		System.out.println(dice_Num3);
		
		if((dice_Num1 == dice_Num2)&&(dice_Num2 == dice_Num3)&&(dice_Num1 == dice_Num3)) {
			sum = 10000+(dice_Num1*1000);
			System.out.println("상금은" + sum);
		}
		else if(dice_Num1 == dice_Num2) {
			sum = 1000+(dice_Num1 * 100);
			System.out.println("상금은" + sum);
		}
		else if(dice_Num2 == dice_Num3) {
			sum = 1000+(dice_Num2 * 100);
			System.out.println("상금은" + sum);
		}
		else if(dice_Num1 == dice_Num3) {
			sum = 1000+(dice_Num1 * 100);
			System.out.println("상금은" + sum);
		}
		else {
			int max1;
			max1 = Math.max(dice_Num1, dice_Num2);
			max1 = Math.max(max1, dice_Num2);
			System.out.println("상금은" + max1*100);
		}
	
	}
}

