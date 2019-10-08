package zhipai;

public class Panduan {
	public static void main(String[] args) {
		int x=pan(Pub.b[Pub.k][0],Pub.b[Pub.k][1],Pub.b[Pub.k][2]);
		int y=pan(Pub.b[Pub.k][3],Pub.b[Pub.k][4],Pub.b[Pub.k][5]);
		if(x<y)
		{
			Pub.flag=1;
			Pub.Last[x]+=1;
		}else if(x==y) {
			Pub.Last[x]+=1;
			int l=ji(Pub.b[Pub.k][0],Pub.b[Pub.k][1],Pub.b[Pub.k][2]);
			int ll=ji(Pub.b[Pub.k][3],Pub.b[Pub.k][4],Pub.b[Pub.k][5]);
			if(l>ll) {
				Pub.flag=1;
			}else if(l==ll) {
				Pub.flag=0;
			}
			else if(l<ll) {
				Pub.flag=2;
			}
		}else if(x>y) {
			Pub.Last[y]+=1;
			Pub.flag=2;
		}
		System.out.print(Pub.k+"  ");
			System.out.print(x+"  ");
			System.out.println(y);
	}
	public static int pan(int x,int y,int z) {
		if(x/13==y/13&&x/13==z/13) {
			return 1;
		}
		else if((Math.abs(x%13-y%13)==1&&Math.abs(y%13-z%13)==1)&&(Math.abs(x%13-z%13)==1&&Math.abs(z%13-y%13)==1)||(Math.abs(x%13-y%13)==1&&Math.abs(x%13-z%13)==1)) {
			return 2;
		}
		else if(x%13+1==y%13+1&&y%13+1==z%13+1){
			return 3;
		}
		else if((x%13+1==y%13+1&&x%13+1!=z%13+1)||(x%13+1==z%13+1&&x%13+1!=y%13+1)||(y%13+1==z%13+1&&y%13+1!=x%13+1)) {
			return 4;
		}
		else {
			return 5;
		}
	}
	public static int ji(int x,int y,int z) {
		int l=x%13+1;
		int ll=y%13+1;
		int lll=z%13+1;
		if(l==1) {
			l=14;
		}
		if(ll==1) {
			ll=14;
		}
		if(lll==1) {
			lll=14;
		}
		int sum=l+ll+lll;
		return sum;
	}
}
