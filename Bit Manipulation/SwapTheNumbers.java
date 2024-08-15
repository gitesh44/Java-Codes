public class SwapTheNumbers{
    public static void main(String[] args) {
         int x=3; 
         int y=6 ;
         System.out.println("Before swap: x = "+x+" and y = "+y);//swap using xorx=x^y;y=x^y;x=x^y;System.out.println("After swap: x = "+x+" and y = "+y);}}Solution3:Theexpression-~xwilladd1toanintegerx.Weknowthattogetnegativeofanumber,invertitsbitsandadd1toit(Remembernegativenumbersarestoredin2’scomplement form), i.e.,-x = ~x + 1;-~x = x + 1 (by replacing x by ~x)publicclassSolution{publicstaticvoidmain(String[]args) {intx=6;System.out.println(x+" + "+1+" is "+-~x);x= -4;System.out.println(x+" + "+1+" is "+-~x);x=0;System.out.println(x+" + "+1+" is "+-~x);}}deshmukhgitesh44@gmail.com
         x=x^y;
         y=x^y;
         x=x^y;

         System.out.println("After swap: x = "+x+" and y = "+y);//swap using xorx=x^y;y=x^y;x=x^y;System.out.println("After swap: x = "+x+" and y = "+y);}}Solution3:Theexpression-~xwilladd1toanintegerx.Weknowthattogetnegativeofanumber,invertitsbitsandadd1toit(Remembernegativenumbersarestoredin2’scomplement form), i.e.,-x = ~x + 1;-~x = x + 1 (by replacing x by ~x)publicclassSolution{publicstaticvoidmain(String[]args) {intx=6;System.out.println(x+" + "+1+" is "+-~x);x= -4;System.out.println(x+" + "+1+" is "+-~x);x=0;System.out.println(x+" + "+1+" is "+-~x);}}deshmukhgitesh44@gmail.com


    }
}