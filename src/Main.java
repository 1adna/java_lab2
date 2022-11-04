import java.util.Scanner;

public class Main {

    public static boolean CheckInt(String num)
    {
        if(num != null && num.matches("[-0-9.]+"))
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
        return true;
    }
    public static int[] DoArr(int numb)
    {
        Scanner sc=new Scanner(System.in, "UTF-8");
        int [] arr= new int[numb];
        for(int i=0; i<numb; i++)
        {
            System.out.println("Введіть числo "+(i+1)+":");
            String cin= sc.nextLine();
            if(CheckInt(cin)==true)
            {
                arr[i]=Integer.parseInt(cin);
            }
        }
        FindAWG(arr, numb);
        return arr;
    }
    public static void FindAWG(int [] arr, int num)
    {
        float awgnum=0;
        int countOfNegative=0;
        for(int i=0; i<num;i++ )
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "UTF-8");
        System.out.println("Введіть кількіть елементив одномірного масиву");
        String num=sc.nextLine();
       if(CheckInt(num)==true)
       {
           DoArr(Integer.parseInt(num));
       }
    }
}


