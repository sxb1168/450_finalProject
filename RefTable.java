package mts;
public class RefTable 
{
	public static String arr[][];
	public RefTable()
	{
		int r=12,c=12;
		String k=null;
		
		int id=0;
		int plus=1;
		
		arr = new String[r][c];		
		
		arr[0][0]="S5";
		arr[0][3]="S4";
		arr[0][6]="1";
		arr[0][7]="2";
		arr[0][8]="3";
		
		arr[1][1]="S6";
		arr[1][5]="accept";
		
		arr[2][1]="R2";
		arr[2][2]="S7";
		arr[2][4]="R2";
		arr[2][5]="R2";
		
		arr[3][1]="R4";
		arr[3][2]="R4";
		arr[3][4]="R4";
		arr[3][5]="R4";
		
		arr[4][0]="S5";
		arr[4][3]="S4";
		arr[4][6]="8";
		arr[4][7]="2";
		arr[4][8]="3";
		
		arr[5][1]="R6";
		arr[5][2]="R6";
		arr[5][4]="R6";
		arr[5][5]="R6";
		
		arr[6][0]="S5";
		arr[6][3]="S4";
		arr[6][7]="9";
		arr[6][8]="3";
		
		arr[7][0]="S5";
		arr[7][3]="S4";
		arr[7][8]="10";
		
		arr[8][1]="S6";
		arr[8][4]="S11";
		
		arr[9][1]="R1";
		arr[9][2]="S7";
		arr[9][4]="R1";
		arr[9][5]="R1";
		
		arr[10][1]="R3";
		arr[10][2]="R3";
		arr[10][4]="R3";
		arr[10][5]="R3";
		
		arr[11][1]="R5";
		arr[11][2]="R5";
		arr[11][4]="R5";
		arr[11][5]="R5";
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(arr[i][j] == null)
					 k="-";
				else
					k=arr[i][j];
				
				//System.out.print(k+"\t");
			}
			//System.out.println();
		}
		
		//System.out.println(arr[1][plus]);
	}
}
