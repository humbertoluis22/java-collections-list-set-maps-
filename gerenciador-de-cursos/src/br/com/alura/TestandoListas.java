package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
	public static void main(String[] args) {
		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelabndo a classe de aula";
		String aula3 = "Trabalhando com Cursos e Sets";

		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		System.out.println(aulas);

		aulas.remove(0);

		System.out.println(aulas);

		for (String aula : aulas) {
			System.out.println("aula: " + aula);
		}
		System.out.println("------------------");

		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula é: " + primeiraAula);

		System.out.println("-------------------");

		for (int i = 0; i < aulas.size(); i++) {
			System.out.println("aulas: " + aulas.get(i));
		}

		aulas.forEach(aula -> {
			System.out.println("percorrendo: " + aula);
		});
		
		
		
		System.out.println("*****************");
		aulas.add("Aumentando nosso conhecimento");
		System.out.println(aulas);
		
		Collections.sort(aulas);
		System.out.println("depois de ordenado:");
		System.out.println(aulas);
	}

}
