//TO  PRINT PATTERN 
class Abcpattern1
{
public static void main(String args[])
{
int i,j,k,l;
char ch='a';
for(i=1;i<=3;i++)   // for top rows
{
  for(j=i;j<3;j++)
     {
        System.out.print(" ");// to print empty space
     }
 for(k=1;k<i;k++)
   {
    System.out.print(ch);//to print alphabets in ascending order
    ch++;
   }
   
  for(l=1;l<i;l++)
  { 
    System.out.print(ch);// to print alphabets in descending order
    ch--;
   }
System.out.println(ch);
}
for(i=3-1;i>=1;i--)// for the same print in reverse order
{
  for(j=i;j<3;j++)
     {
        System.out.print(" ");//to print empty space
     }
 for(k=1;k<i;k++)
   {
    System.out.print(ch);//to print alphabets in ascending order
    ch++;
   }
for(l=1;l<i;l++)
   {
   System.out.print(ch);//to print alphabets in descending order
   ch--;
    }
    System.out.println(ch);
}
}
}
