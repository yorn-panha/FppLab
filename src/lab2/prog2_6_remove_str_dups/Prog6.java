package lab2.prog2_6_remove_str_dups;

public class Prog6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArray={"horse", "dog", "cat", "horse","dog"};
		String[] noDupStr=removeDups(strArray);
		for(String str:noDupStr)
			System.out.print(str+" ");
	}
	static String[] removeDups(String[] strArray){
		String[] noDupStr = new String[strArray.length];
		int index=0;
		boolean flag=false;
		noDupStr[index]=strArray[0];
		for(int i=1;i<strArray.length;i++){
			flag=false;
			for(int j=0;j<=index;j++){
				if(noDupStr[j].equals(strArray[i])){
					flag=true;
					break;
				}
			}
			if(flag==false){
				index++;
				noDupStr[index]=strArray[i];
			}
		}
		String[] result=new String[index+1];
		for(int i=0;i<result.length;i++){
			result[i]=noDupStr[i];
		}
		return result;
	}
}
