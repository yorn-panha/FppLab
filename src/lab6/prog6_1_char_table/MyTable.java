package lab6.prog6_1_char_table;


public class MyTable {
	Entry[] entries = new Entry[26];
	
	public void add(char c, String s){
		//inserts the entry (c, s) into the table
		//by computing proper array index for c
		Entry en=new Entry(c, s);
		int correspondIndex=(int)c-97;
		entries[correspondIndex]= en;
	}
	public String get(char c){
		//returns the string in Entry table whose index
		//corresponds to the char c
		int correspondIndex=(int)c-97;
		return entries[correspondIndex].toString();
	}
	
	public String toString() {
		String str="";
		for(int i=0;i<26;i++){
			if(entries[i]==null)
				continue;
			str+=entries[i].toString()+"\n";
		}
		return str;
	}
	

	public static void main(String[] args){
		MyTable t = new MyTable();
		t.add('a', "Andrew");
		t.add('b',"Billy");
		t.add('w',"Willie");
		//System.out.println(t.get('b'));
		System.out.println(t);
		
	}
	class Entry {
		
		char c;
		String s;
		public Entry(char c, String s) {
			super();
			this.c = c;
			this.s = s;
		}

		//implement
		public String toString() {
			return c+"->"+s;
		}
		
	}
	

}
