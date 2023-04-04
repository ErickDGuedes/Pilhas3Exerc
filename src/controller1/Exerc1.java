package controller1;

import br.edu.fateczl.pilhaint.Pilha;

public class Exerc1 {
	
	public Exerc1() {
		super();
	}
	
	public void PilhaDin() throws Exception {
		Pilha p = new Pilha();
		Pilha p2 = new Pilha();
		int[] vetor = {0,5,7,-4,3,5,-2,-1,10,4,-6,2,-9,1,-5};
		if(p.isEmpty()) {
			for(int i: vetor) {
				p.push(i);
			}
			while(!p.isEmpty()) {
				int verifica = p.top();
				if(verifica >= 0) {
					int tira = p.pop();
					p2.push(tira);
					System.out.println(p2.top());
				}else {
					int v1 = p.pop();
					int v2 = p.pop();
					int soma = v1 + v2;
					if(v1 < 0 && v2 < 0) {
						p2.push(v1);
						System.out.println(p2.top());
						p2.push(v2);
						System.out.println(p2.top());
						p2.push(soma);
						System.out.println(p2.top());
					}else if(v1 < 0) {
						p2.push(v1);
						System.out.println(p2.top());
						p2.push(soma);
						System.out.println(p2.top());
					}else if(v2 < 0) {
						p2.push(v2);
						System.out.println(p2.top());
						p2.push(soma);
						System.out.println(p2.top());
					}
				}	
			}
			System.out.println("Tamanho da Pilha ==> "+p2.size());
		}
	}
}
