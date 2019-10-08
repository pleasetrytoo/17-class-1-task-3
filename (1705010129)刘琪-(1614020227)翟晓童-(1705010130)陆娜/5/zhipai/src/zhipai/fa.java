package zhipai;

import java.util.Random; 

public class fa {
	public static void main(String[] args) {
		Random r=new Random(1);
		
		for(int j=0;j<Pub.ci;j++) {
			for(int ii=0;ii<5;ii++) {
			for(int jj=0;jj<20;jj++)
				Pub.a[ii][jj]=0;
		}
			
		for(int i=0;i<6;i++) {
			int x,y;
			int ran1=r.nextInt(52);
			x=ran1/13;
			y=ran1%13;
			if(Pub.a[x][y]==1) {
				i--;
			}
			else {
				Pub.a[x][y]=1;
				Pub.b[j][i]=ran1;
			}
		}
		}
		System.out.println(Pub.ci);
		for(int i=0;i<Pub.ci;i++) {
			for(int j=0;j<6;j++) {
				System.out.print(Pub.b[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		} 
	}
}
