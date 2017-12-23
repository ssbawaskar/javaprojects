package edu.swarupa;
 class p1
{
     p1()
     {
         System.out.println("IN a constructor of base class!!\n");
     }
}
class p2 extends p1
{
     p2()
    {
        System.out.println("in a first class constructor !!\n");
    }
}
public class PoolPuzzle
        {
            public static void main (String[] args)
            {
                p2 p= new p2();
            }
        }

