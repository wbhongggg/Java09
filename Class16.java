package Java09;
class CCircle
{
   private static double pi=3.14;
   private double radius;
   public CCircle(double r)
   {
      radius=r;
   }
   public static String show(CCircle c[])
   {
      String a=" ";
      for(int i=0;i<c.length;i++)
      {
           a+=c[i].radius*c[i].radius*pi+",";
      }
      a=a.substring(0, a.length()-1);
      return a;
   }
}
public class Class16
{
   public static void main(String args[])
   {
      CCircle cir[];
      cir=new CCircle[5];
      for(int i=0;i<=5;i++)
      {
    	  cir[i]=new CCircle(i);
      }
      System.out.println("area ="+CCircle.show(cir));
   }
}