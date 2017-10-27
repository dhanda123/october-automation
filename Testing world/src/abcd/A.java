package abcd;
import org.testng.annotations.Test;
import org.testng.annotations.*;
public class A {
@Test(groups={"P1"})
public void pattern( )
{
	for(int i=1;i<=5;i++)
		{
		for(int k=1;k<i;k++)
		{
			System.out.print(" ");
		}
		for(int j=5;j>=i;j--)
		{
			System.out.print("*"+ " ");
		}
	System.out.println();
	}
}
@Test()
public void pattern2()
{
	System.out.println("hello");
}
}


