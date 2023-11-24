public class main{
	public static void main(String args[]){
		System.out.println("Esto funciona");
		System.out.println("Generando un arreglo");
		String arr[] = new String[5];
		arr[0]="Julio";
		arr[1]="Lopez";
		for(int i=0; i<5; i++){
			if(arr[i]==null){
				System.out.println("Elemento nulo");
			}
			else{
				System.out.println("El elemento " + i + " del arreglo es: " + arr[i]);
			}
		}
		System.out.println("Proponiendo 3 cadenas:");
		String a= new String("Hola como estas");
		String b= new String(" Mi nombre es");
		String c= new String(" Adrien");
		System.out.println(a.charAt(1));
		System.out.println("Concatenando las cadenas");
		a=a.concat(b);
		a=a.concat(c);
		System.out.println(a);
		System.out.println("Utilizando el metodo endsWT");
		endsWT(a,"es");
		endsWT(a,c);
		System.out.println("Midiendo la longitud de la cadena Adrien:");
		System.out.println(c.length());
		System.out.println("Reemplazando Adrien por Noir:");
		a=a.replace("Adrien","Noir");
		System.out.println(a);
		System.out.println("Probando el metodo trim");
		//Se corta el espacio que hay en la cadena c.
		System.out.println((c.trim()).length());
		//Agrego comentario
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

