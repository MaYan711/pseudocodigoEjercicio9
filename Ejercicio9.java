import java.util.*;

public class Ejercicio9 {

	public static void main(String[] args){
		Scanner scanner =  new Scanner(System.in);
		int prom1 = 0, prom2 = 0, temtot1 = 0, temtot2 = 0, ctem = 0;
		boolean ciclo = true;
		do{
			int tem1, tem2;
			System.out.println("Ingrese temperatura 1");
			tem1 = scanner.nextInt();
			System.out.println("Ingrese temperatura 2");
			tem2 = scanner.nextInt();
			temtot1 += tem1;
			temtot2 += tem2;
			ctem++;

			if(tem1 == 0){
				ciclo = false;
			}
		}
		while(ciclo != false);
		prom1 = temtot1 / ctem;
		prom2 = temtot2 / ctem;
		System.out.println("La temperatura 1 tiene un promedio de:" + prom1);
		System.out.println("La temperatura 2 tiene un promedio de:" + prom2);
	}
}