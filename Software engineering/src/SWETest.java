
public class SWETest {
	public int n;
	public int [] A;
	public void Sort() {
		int i,j;
		//bubble sort
		for (i=1; i<n;i++) {
			for (j=0;j<n;j++){ //swap
				temp=A[i];
				A[i]=A[i+1];
				A[i+1]=temp;
				
			}
		}
	}
     for (i=0;i<n;i++){
    	 system.out.println("" + A[i] );
     }
     system.out.println
}
