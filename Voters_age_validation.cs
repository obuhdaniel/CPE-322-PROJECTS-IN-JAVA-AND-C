using System;

namespace exam;

class Program
{
    
}
class Program2
    {

        static void Main1()
        {
        Console.WriteLine("Equality checker");

        int[] mynum = {10,30,50,56};

        Console.WriteLine("enter youur first input and second input \n \nfollowed by an enter key");//

        int num1 = Convert.ToInt32(Console.ReadLine());
        int num2 = Convert.ToInt32(Console.ReadLine());
        
        if(num1 ==num2){
            Console.WriteLine("Your first input" + num1 + "is equal to your Second input" + num2);//

        }else{
            Console.WriteLine("Your first input is NOT equal to your Second input");//

        }

        }
        static void method2(){
             Console.Write("Program to check voters age eligibility \nEnter your age: ");
            int voters_age = Convert.ToInt32(Console.Read());

            if (voters_age >= 18){
                Console.WriteLine("Voter is eligible to vote");
            }else{
                Console.WriteLine("Grow up more to be able to vote");
            }
        }
        static void Main(string[] args){
           Main1();
           method2();

        }
        
    }
