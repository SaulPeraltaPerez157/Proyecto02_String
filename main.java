public class main{
	public static void main(String args[]){
		System.out.println("Esto funciona");
		String a= new String("Hola como estas");
		String b= new String(" Mi nombre es");
		String c= new String(" Adrien");
		System.out.println(a.charAt(1));
		a=a.concat(b);
		a=a.concat(c);
		System.out.println(a);
		endsWT(a,"es");
		endsWT(a,c);
		System.out.println(c.length());
		a=a.replace("Adrien","Noir");
		System.out.println(a);
	}


	public static void endsWT(String s, String b){
		if(s.endsWith(b)==true){
			System.out.println("Correcto");
		}
		else{
			System.out.println("No");
		}
	}
}

