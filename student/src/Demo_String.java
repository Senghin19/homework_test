import java.io.*; 

public class Demo_String {
	public static void main(String[] args) throws IOException {
		boolean contigo = true;
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		
		//定义标记手机号码的正则表达式
		String regex = "(13\\d|15[036-9] |18[689])\\d{8}";
		String phoneNumber = "";
		while(contigo) {
			System.out.print("Please input phone number:");
			phoneNumber = buf.readLine();
			boolean match = phoneNumber.matches(regex);
			if(match) {
				System.out.println(phoneNumber + " is legal!");
				break;
			}else 
				System.out.println(phoneNumber + " is illegal!");
			
		}
	}
}
