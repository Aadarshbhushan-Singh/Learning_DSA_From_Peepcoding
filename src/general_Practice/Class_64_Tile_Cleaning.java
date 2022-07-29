package general_Practice;

public class Class_64_Tile_Cleaning {
	public static void main(String[] args) {
		System.out.println(tileCleaning(4,3));
	}
	static int tileCleaning(int n, int k) {
        int mid = n / 2;
        int ans = 0;
        if(k <= mid){
            ans = k - 1 + n - 1;
        }else{
            ans = n - k + n - 1;
        }
        
        return ans;
    }
}
