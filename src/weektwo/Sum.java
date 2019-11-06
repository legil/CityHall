package weektwo;

public class Sum {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 0; sum <= 5789; sum+=i) { //can switch increment and i++
			System.out.println(sum + " + "+ i + " = " + (sum+ i));
			i++;
		}	
	}
}
	

class ProbB{
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		while(sum <= 5789) {
			i++;
			sum += i;
			System.out.println(sum + " + "+ i + " = " + (sum+ i));
			
			
		}
	}
}

//increment i first before sum to avoid getting the larger (incorrect) num

/*int i;
int result = 0;

for(i = 0 ; result < 5500; result += i) {
	i+=100;
}

System.out.println("Value of I:  " + i);
System.out.println("Value of result: " + result);
*/