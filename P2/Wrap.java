package P2;
public class Wrap {
	public static void main(String[] args) {
		if(args.length!=4)
		{
			System.out.println("invalid input");
		}
		else
		{
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int c=Integer.parseInt(args[2]);
			int d=Integer.parseInt(args[3]);
			//greatest of 4 numbers
			if((a>b)&&(a>c)&&(a>d))
			{
				System.out.println("greater value is : "+a);
			}
			else if ((b>c)&&(b>d))
			{
				System.out.println("greater value is :"+b);
			}
			else if (c>d)
			{
				System.out.println("greater value is :"+c);
			}
			else 
			{
				System.out.println("greater value is :"+d);
			}
			//minimum 
			if((a<b)&&(a<c)&&(a<d))
			{
				System.out.println("least value is : "+a);
			}
			else if ((b<c)&&(b<d))
			{
				System.out.println("least value is : "+b);
			}
			else if (c<d)
			{
				System.out.println("least value is : "+c);
			}
			else 
			{
				System.out.println("least value is : "+d);
			}
			int sum=a+b+c+d;
			System.out.println("4 విలువల మొత్తం"+sum);
			float avg=sum/4;
			System.out.println("సగటు 4 సంఖ్యలు"+avg);
		}
	}
		

	}
