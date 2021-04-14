package pk_SuperBuscaMinas;

public class Utilidades {

	/**
	 * Método que imprime una matriz por pantalla
	 */
	public static void imprimeMatrizBotones(BotonMina[][] matrizBotones) {
		for (int i = 0; i < matrizBotones.length; i++) {
			System.out.print("\n(");
			for (int j = 0; j < matrizBotones[0].length; j++) {
				System.out.print( "  " + matrizBotones[i][j] + "  ");
			}
			System.out.print(")\n\n");
		}
	}

}
