
public class PasswordEncoder {
	public static void main(String[] args) {
		int i = 0;
		while(i < 10){
			String password = "1234567";
			String hash =  BCrypt.hashpw(password,BCrypt.gensalt());
			System.out.println(hash);
			i++;
		}
	}
}
