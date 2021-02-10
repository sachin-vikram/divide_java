class Divide
{
 public static void main(String args[])
 { 
  int N;
  N=Integer.parseInt(args[1]);
  if(args[0].length%N!=0)
  {
   System.out.println("The string cannot be divided equally.");
  }
  else
  {
   String[] part= new String[N];
   int n=(args[0].length)/N;
   int temp=0;
   for(int i=0;i<args[0].length;i=i+n)
   {
    part[temp]=args[0].substring(i,i+n);
    temp++;
   }
   System.out.println("The string after pating equally are:: ");
   for(int  i=0;i<part.length;i++)
   {
    System.out.println(part[i]);
   }
  }
 }
}