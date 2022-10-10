

import Methods.chainstructure.ChainStructure;
import Methods.chainstructure.ListTAD;
import Methods.chainstructure.Pilha;

public class TestaLista {
	public static void main(String[] args) {
		Pilha pilha = new Pilha();

		pilha.push(1);
		pilha.push("poggers");
		System.out.println(pilha.top());
		System.out.println(pilha.pop());
		System.out.println(pilha.top());
		System.out.println(pilha.isEmpty());
	}

}
