package by.itstep;

import java.util.Scanner;

public class ArraysUtil
{

    public static int minMax(int arraa[])
    {
        int buff;
        for(int i=0;i<arraa.length;i++)
        {
            for(int j=i+1;j< arraa.length;j++)
            {
                if(arraa[i]>arraa[j])
                {
                    buff=arraa[i];
                    arraa[i]=arraa[j];
                    arraa[j]=buff;
                }
            }

        }

            System.out.println("Максимальный элемент массива 2: "+arraa[arraa.length-1]+", минимальный элемент: "+arraa[0]);

        return arraa[arraa.length-1];
    }
    public static int rando()
    {

        System.out.println("Введите размерность массива:");
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();
        int mass[]=new int[size];
        System.out.println("Введите нижнюю границу для нашего рандомайзера:");
        int m= sc.nextInt();
        System.out.println("Введите верхнюю границу для нашего рандомайзера:");
        int h= sc.nextInt();
        for(int i=0;i<size;i++)
        {
            mass[i]=(int)(Math.random()*h+m);
        }
        for(int i=0;i<size;i++) {
            System.out.println("Готовый массив: "+mass[i]);
        }
        return mass[size-1];

    }



    public static void printer(int [] arra)
    {
        for(int i=0;i< arra.length;i++)
        {
            System.out.println("Array ["+i+"]: "+arra[i]);
        }
    }
    public static void inLine(int [] arra)
    {
        System.out.print("Array {");
        for(int i=0;i< arra.length;i++)
        {
            if(i== arra.length-1)
            {
                System.out.print(arra[i]);

            }
            else {
                System.out.print(arra[i] + ", ");
            }
        }
        System.out.println("}");
    }

    public static void main(String[] args)
    {
        //arrays declaration

        //single dimension
        int arr[];
        int [] arr2;

        //double dimension
        int [][] arr3;

        //multiple dimension
        int [][] arr6[];//cube
        //arrays initialisation
        arr=new int[]{17,2};
        //          0  1 2 3 4
        //          {0,0,0,0,0}
        int arr11[]=new int[5];

//        int arr10[]={2,1,3};
//        int buff;
//
//        for(int i=0;i<arr10.length;i++)
//        {
//            for(int j=i+1;j< arr10.length;j++)
//            {
//                if(arr10[i]>arr10[j])
//                {
//                    buff=arr10[i];
//                    arr10[i]=arr10[j];
//                    arr10[j]=buff;
//                }
//            }
//
//        }
//        for(int i=0;i<arr10.length;i++)
//        {
//            System.out.println(arr10[i]);
//        }


        //size <=> length;
        int arr11Size=arr11.length;
        System.out.println("Number of elements is: "+arr11Size);

        //GET ELEMENT FROM ARRAY
        int val=arr[1];
        System.out.println(val);

        int val2=arr11[1];
        System.out.println(val2);

        // index
        int array[]={12,34,56,77,-123, Integer.MAX_VALUE};
        int index=0;
        System.out.println(array[index]);
        int lastIndex=array.length-1;
        System.out.println("Last element: "+array[lastIndex]);

        char[] chars={'h','e','l','l','o'};
        System.out.println(chars[chars.length-1]);

        //SET ELEMENT TO ARRAY
        int arr1000[]=new int[100];
        arr1000[0]=-100;

        int a[]=new int [5];
        a[0]=22;a[1]=123;a[2]=10;a[3]=-99;a[4]=0;

        int aCopy[]=new int [a.length+3];
        aCopy[0]=a[0];aCopy[1]=a[1];aCopy[2]=a[2];aCopy[3]=a[3];aCopy[4]=a[4];aCopy[5]=a[0]+a[1]+a[2]+a[3]+a[4];aCopy[6]=a[0]*100;
        System.out.println(aCopy[5]);


        int arka[]=new int[]{1,50,-3,65,5};
//        printer(arka);
        inLine(arka);
        minMax(arka);
        rando();

    }
}
