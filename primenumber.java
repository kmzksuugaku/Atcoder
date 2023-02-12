import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(true){
			if(hantei(n))break;
			n++;
		}
		System.out.println(n);
	}
	public static boolean hantei(int a){
		for(int i = 2; i * i <= a; i++){
			if(a%i == 0) return false;
		}
		return true;
	}
}  
