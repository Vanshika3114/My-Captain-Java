
	public class MatrixAdditionandMultipication{
		public static void main(String args[]){
		
		int a[][]={{2,3,4},{2,4,3},{3,4,5}};  
		int b[][]={{5,3,4},{2,2,3},{1,2,4}};  
		  
		
		int c[][]=new int[3][3];  
		  
		//adding of 2 matrices  
		for(int i=0;i<3;i++){  
		for(int j=0;j<3;j++){  
		c[i][j]=a[i][j]+b[i][j];  

		System.out.print(c[i][j]+" ");  
		}  
		System.out.println();//new line  
		 
		} 
		System.out.println();//new line  
		int d[][]={{1,1,1},{2,1,2},{2,3,1}};  
		int e[][]={{2,1,1},{2,2,2},{1,1,1}};  
		  
		// the multiplication of two matrices  
		int f[][]=new int[3][3];  
		  
		for(int i=0;i<3;i++){  
		for(int j=0;j<3;j++){  
		f[i][j]=0;    
		for(int k=0;k<3;k++)    
		{    
		f[i][j]+=d[i][k]*e[k][j];    
		}
		System.out.print(f[i][j]+" ");  
		}
		System.out.println(); 
		}  
		
		}}