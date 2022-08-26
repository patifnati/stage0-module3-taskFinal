package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
            int num1, num2, num3, num4, sum;
//4321
            num1 = number / 1000;
            num2 = number % 1000/100;
            num3 = number % 1000/10 % 10;
            num4 = number % 1000%10;
            sum = num1+num2+num3+num4;
            System.out.println(sum);
        }
    }