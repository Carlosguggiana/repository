package progma_web;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


public class Contador {

private static int contagem; 
static ArrayList<String> datas = new ArrayList<>();

public static void novoAcesso() {

contagem += 1;

}

public static int getQuantidadeAcessos() { 
	return contagem;

}

public static Object getDataInicial() {

return datas.get(0);

}
public static String getDateTime() {
	DateFormat dateFormat= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
	Date date= new Date();

	datas.add(dateFormat.format(date)); 
	return dateFormat.format(date);

}
String date =  request.getParameter("Data");{
	
	
	
}



public static String getParameter(String string) {
		// TODO Auto-generated method stub
		return null;
}
}


	