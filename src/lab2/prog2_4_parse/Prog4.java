package lab2.prog2_4_parse;

public class Prog4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myString = Data.records;
		String[] splitRow=myString.split(":");
		for(String str:splitRow){
//			System.out.println(str);
			String[] splitColumn = str.split(",");
			System.out.println(splitColumn[0]);
		}
			
	}

}
