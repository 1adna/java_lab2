import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "UTF-8");
        System.out.println("Введіть кількіть елементив одномірного масиву");
        String num=sc.nextLine();
        if(num != null && num.matches("[0-9.]+"))
        {
            try
            {
                int numb= Integer.parseInt(num);
            }
            catch (IllegalArgumentException e)
            {
              throw new IllegalArgumentException("потрібне ціле число");
            }
        }
        else
        {
          throw new IllegalArgumentException("Ви ввели рядок");
        }
        int [] arr= new int[Integer.parseInt(num)];
        System.out.println("Введіть числа масиву");
        for(int i=0; i<Integer.parseInt(num); i++)
        {
            String cin= sc.nextLine();
            if(cin != null && cin.matches("[-0-9.]+"))
            {
                try
                {
                    int numb= Integer.parseInt(cin);
                }
                catch (IllegalArgumentException e)
                {
                    throw new IllegalArgumentException("потрібне ціле число");
                }
            }
            else
            {
                throw new IllegalArgumentException("Ви ввели рядок");
            }
            arr[i]=Integer.parseInt(cin);
        }
        float awgnum=0;
        int countOfNegative=0;
        for(int i=0; i<Integer.parseInt(num);i++)
        {
            if(arr[i]<0)
            {
                countOfNegative+=1;
                awgnum+=arr[i];
            }
            if(countOfNegative==0)
            {
                throw new IllegalArgumentException("Ви не ввели від'ємних");
            }
        }
        awgnum=awgnum/countOfNegative;
        System.out.println("середнє значення серед негативних елементів\n" +
                "одновимірного масиву="+awgnum);
    }
}


