import java.rmi.*;
import java.rmi.server.*;

public class ServerConvert extends UnicastRemoteObject implements InterConvert
{
public ServerConvert() throws Exception { }
public String convertDigit(String no) throws Exception
{
String str = "";
for(int i = 0; i < no.length(); i++)
{
int p = no.charAt(i); if( p == 48)
str += "zero "; else if( p == 49) str += "one "; else if( p == 50) str += "two "; else if( p == 51) str += "three ";
else if( p == 52) str += "four "; else if( p == 53) str += "five "; else if( p == 54)
str += "six "; else if( p == 55)
str += "seven "; else if( p == 56)
str += "eight "; else if( p == 57)
str += "nine ";
}
return str;
}
public static void main(String args[]) throws Exception
{
ServerConvert s1 = new ServerConvert(); Naming.bind("Wrd",s1); System.out.println("Object registered	");
}
}
 
