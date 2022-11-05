// import java.util.*;


class Number

{
    private double num;
    

    public Number(double d) {
        num = d;

    }

   

    public boolean isZero() {
        if (num == 0.0)
            return true;
        else
            return false;
    }

    public boolean isPositive() {
        if (num > 0.0)
            return true;
        else
            return false;
    }

    public boolean isNegative() {
        if (num < 0.0)
            return true;
        else
            return false;
    }

    public boolean isodd() {
        if (num % 2 != 0.0)
            return true;
        else
            return false;
    }

    public boolean isEven() {
        if (num % 2 == 0.0)
            return true;
        else
            return false;
    }
    public boolean isPrime() {
        int temp;

        double a;
        boolean flag;
        a = Math.sqrt(num);
        temp = (int) a;
        flag = true;
        for (int i = 2; i < temp; i++) {
            if (num != i) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }
        }
        if (flag)
            return true;
        else
            return false;
    }


   
    public boolean isArmstrong()
    {  

       
        int n = 0;
        int x=(int)num;
        while (x != 0) {
            n++;
            x = x / 10;
        }
        int temp = (int)num;
        double sum = 0;
        while (temp != 0) {
            int r = temp % 10;
            sum = sum + Math.pow(r, n);
            temp = temp / 10;
        }
 
        
        return (sum == num);
    }
   
   
    public double getFactorial() {
        double d = 1;
        for (int i = 1; i < num; i++) {
            d *= i;
        }
        
        return d;
    }

    public double getSqrt() {
        return Math.sqrt(num);
    }

    public double getSqr() {
        return num * num;
    }

    public double sumDigits() {
 
        double sum=0.0;
        String number = String.valueOf(num);
        for (char c : number.toCharArray()) {
                if(c!='.')
                    sum += Integer.parseInt(String.valueOf(c));

        }
        return sum;
    }

    public double getReverse ( )
    {
 
        String number = String.valueOf(num);
        String reversed = new StringBuffer(number).reverse().toString();
        double d = Double.parseDouble(reversed);
        return d;
    } 

    public void listFactors()
    {  
        int n=(int)num;
        for (int i=1; i<=Math.sqrt(n); i++)
        {
            if (n%i==0)
            {
                
                if (n/i == i)
                    System.out.print(" "+ i);
       
                else 
                    System.out.print(i+" " + n/i + " " );
            }
        }
    }

    public void dispBinary() {
        System.out.println("Binary Value of num :" + Long.toBinaryString(Double.doubleToRawLongBits(num)));
    }

   
}

public class ques3 {
    public static void main(String args[]) {
        double d = 20.4D;
        Number digit = new Number(d);
        
       
        System.out.println("isZero " + digit.isZero());
        System.out.println("isPositive " + digit.isPositive());
        System.out.println("isNegative " + digit.isNegative());
        System.out.println("isOdd " + digit.isodd());
        System.out.println("isEven " + digit.isEven());
        System.out.println("isPrime " + digit.isPrime());
        System.out.println("isArmstrong " + digit.isArmstrong());
        System.out.println("getFactorial " + digit.getFactorial());
        System.out.println("getSqrt " + digit.getSqrt());
        System.out.println("getSqr " + digit.getSqr());
        System.out.println("sumDigits " + digit.sumDigits());
        System.out.println("getReverse " + digit.getReverse());
        digit.listFactors();
        System.out.println();
        digit.dispBinary();
        
    }

}
