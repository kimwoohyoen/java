import java.io
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.net.*;
import java.util.*;

public class CalcClientEx{
  public static void main(string[] args) {
	BufferedReader in = null;
	BufferedWriter out = null;
	Socket socket = null;
	Scanner scanner = new Scanner(System.in);
	try {
		socker = new Socket("localhost",9999);
		in = new BufferedReader(new  inputStreamReader(socket.getinputStream()));
		out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		while (true){
		   System.out.print("계산식(빈칸으로 띄어 입력,예:24 = 42)>>");
		   string outputMessage = scanner.nextLine();
		   if (outputMessage.equasllgnoreCase("bye")) {
			   out.write(outoutMessage+"\n");
			   out.flush();
			   String inputMessage = in.readLine();
			   System.out.println("계산 결과:" + inputMessage);
		   }
	    }catch (IOException e) {
	    	System.out.println(e.getMessage());
	    }finally {
	       try {
	    	  scanner.close();
	    	  if(socket != null) socket.colse();
	       }catch (IOException e) {
	    	  System.out.println("서버와 채팅 중 오류가 발생했습니다.");
	       }
	     }
	   }
    }

