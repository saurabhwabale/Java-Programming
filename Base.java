class Base1
{
    public:
        int i,j;
        void fun()
        {
            System.out.println("Inside Base fun \n");
        }
        void gun()
        {
            System.out.println("Inside Base gun \n");
        }
        virtual void sun()
        {
            System.out.println("Inside Base sun \n");
        }
        virtual void bun()
        {
            System.out.println("Inside Base bun \n");
        }
}

class Derived extends Base1
{
    public int x;

        void gun()
        {
             System.out.println("Inside Base fun \n");
        }
        void sun()
        {
               System.out.println("Inside Base sun \n");
        }
        void run()
        {
               System.out.println("Inside Base run :\n");
        }
        virtual void mun()
        {
               System.out.println("Inside Base mun: \n");
        }
}
public class Base

{
    public static void main(String Arf[])

    Base1 bobj = new Base1();        //no casting
    Derived dobj = new Derived();  // no casting
    Base1 bdobj = new Derived(); // up casting
  //  Derived dobj = new Base();
    
    System.out.println(sizeof )
    System.out.println

    bp2.fun();
    bp2.gun();
    bp2.sun();
  //  bp2.run();
    //bp2.mun();
    bp2.bun();
    
}