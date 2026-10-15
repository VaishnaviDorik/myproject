package innerouterclass;

/**
 *
 * @author IMRD
 */
class InnerOuterClass {

    /**
     * @param args the command line arguments
     */
     int outer_x=100;
        void test()
        {
         Inner i=new Inner();
         i.display();
        }
        static int count=0;
        Outer()
        {
            count++;
            System.out.println(count);
        }
        class Inner
        {
            void display()
            {
                System.out.println("display:outer_x"+outer_x);
            }
        }
}
        public class InnerOuterclass{
            
        
        public static void main(String[] args){
        // TODO code application logic here
            Outer o=new Outer();
            o.test();
            Outer o1=new Outer();
            Outer o2=new Outer();
            Outer o3=new Outer();
        
       
    }
    
}
