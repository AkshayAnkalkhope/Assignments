class leapyear{
public void yearcheck( int year)
{

int year;
if(((year%4==0) && year%100==0)) || (year%100)==0)
{
System.out.println("year is leap year");
}

else
{
System.out.println("year is not leap year");
}

}

public static void main(String[]args)
{
leapyear l1=new leapyear();
l1.yearcheck(2014);

}


}