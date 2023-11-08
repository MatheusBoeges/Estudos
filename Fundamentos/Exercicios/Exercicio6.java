package Fundamentos.Exercicios;

public class Exercicio6 {
	
	public static void main(String[] args) {
	
		/* Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0) utilizando a fórmula de Bhaskara.
		 * Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta */
		
		double a = 1;
		double b = 12;
		double c = -13;
		
		double delta = Math.pow(b, 2) - 4 * a *c;
		
		double raiz1 = (- b + Math.sqrt(delta)) / 2 * a;
		double raiz2 = (- b - Math.sqrt(delta)) / 2 * a;
		
		System.out.println("As raízes da equação são: " + raiz1 + " e " + raiz2);
		
	}

}
