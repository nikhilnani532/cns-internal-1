import java.math.BigInteger;
import java.security.MessageDigest;
class md5{
	public static void main(String[] args) {
		try{
		String input="hello world";
		MessageDigest md=MessageDigest.getInstance("MD5");
		byte[] messageDigest=md.digest(input.getBytes());
		BigInteger no=new BigInteger(1,messageDigest);
		String hashtext=no.toString(16);
		System.out.println("hashtext generated by md5 for "+ input + " : "+hashtext);
		}
		catch(Exception e){}
	}
}