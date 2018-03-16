import java.util.ArrayList;

/** * 
	 * @Clase Matematica
	 * Creamos el Arraylist de tipo integer sumas.
	 */
	public class Matematica {
		
	private ArrayList<Integer> sumas = new ArrayList<Integer>(); 

	/**
	 * Ejercicio 1 Parte 1.  Devuelve una suma y el resultado lo añade al ArrayList
		* @param a Es un numero de tipo int
		* @param b Es un numero de tipo int
		* @return El return devuelve la suma entre los dos numeros, un resultado de tipo int
		*/
	
	
	public int sumaNum(int a,int b){ 
		
	int suma = a + b;
	sumas.add(suma);
	return suma;
		}
	
	/**
	 * Ejercicio 1 Parte 2. Creamos un booleano para el result, si a es mayor que b, nos devuelve true, si es al contrario, false.
	 * @param a Es un numero de tipo int
	 * @param b Es un numero de tipo int
	 * @return Esta vez el return será un boolean, es decir, true o false.
	 */
	public boolean comparacionNumeros(int a,int b){
		
	if (a > b){
	return true;
		
	}else if (a == b){
	return false;
		 
	}else{
	return false;
		
	}
	}
	
	/**
	 * Ejercicio 1 Parte 3. Este metodo nos devolverá el ArrayList junto a todas las sumas que hemos realizado.
	 * @return sumas de tipo ArrayList
	 */
	
		
	public ArrayList<Integer> getSumas() {
	return null;
	}
	
	
	
}
