

package animalgame;


/**
 * @Date: 09-07-2019
 * @Autor: Julio 
 **/

public class AnimalTree {

	public int key;
	public AnimalTree left;
	public AnimalTree right;
	public String value;

	/** Construtor que seta os valores da arvore */
	public AnimalTree(int key, String valor) {

		this.key = key;
		this.value = valor;
	}

	public AnimalTree() {

	}

}
