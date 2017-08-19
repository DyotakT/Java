import java.util.*;

public class Spiral {
	
	static int size;
	static int number=1;


	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the size of the side of the Spiral Square: ");
		size=scan.nextInt();
		
		int[][] array = new int[size][size];
		
		
		int repetation = size;
		int turn=0;
		int u=0,v=size-1,a=1,b=size-1,i=0,j=0,k=size-1,l=0;
		int d=size-2,c=0,x=size-1,y=1;
		
		do{
			if(turn%2==0) 
			{
				i=u;
				for(j=u;j<=v;j++)
				{
					array[i][j]=number;
					number++;
				}
				j--;
				for(i=a;i<=b;i++)
				{
					array[i][j]=number;
					number++;				
				}
				u++;
				v--;
				a++;
				b--;
			}
			i--;j--;
			
			
			turn++;
			
			if(turn%2!=0) 
			{
				k=x;
				for(l=d;l>=c;l--)
				{
					array[k][l]=number;
					number++;
				}
				l++;x--;
				for(k=x;k>=y;k--)
				{
					array[k][l]=number;
					number++;				
				}
				d--;
				c++;
				y++;
			}
			
			k++;l++;
			
			turn++;
			
			repetation--;
		} while(repetation!=0);
		
		System.out.print("\n\nThe Spiral Square is: \n\n");
		
		for(int g=0;g<array.length;g++)
		{
			for(int h=0;h<array.length;h++)
			{
				System.out.print(array[g][h]);
				System.out.print("       ");
			}
			System.out.print("\n\n\n\n");
		}
	}
}