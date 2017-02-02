//GIVEN THE PATTERN AND IT'S N VALUE IS 3 THIS PROGRAM WORKS FOR N VALUES
class Aa
{
public static void main(String args[])
{
int i,j,k,l,m;
char ch='a';
System.out.println("ENTER THE NUMBER OF ROWS ON TOP AND THE SAME NUMBER IS REFLECTED BELOW");
int n=Integer.parseInt(System.console().readLine());
m=n;
for(i=1;i<=n;i++)   // for top rows
{
  for(j=i;j<n;j++)
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
n=m;
for(i=n-1;i>=1;i--)// for the same print in reverse order
{
  for(j=i;j<n;j++)
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
