import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class Testing {
	//@Test
//@RepeatedTest(10)
@Disabled
void sum() {
	int a=10;
	int b=20;
	System.out.println(a+b);
}
int square(int x) {
	return x*x;
}
int countA(String word) {
	int count=0;
	for(int i=0;i<word.length();i++) {
		if(word.charAt(i)=='a' || word.charAt(i)=='A') {
			count++;
		}
	}
	return count;	
}


}
