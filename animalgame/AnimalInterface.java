

package animalgame;

/**
 * @Date: 09-07-2019
 * @Autor: Julio 
 **/

/** Interface com os métodos necessários para o funcionamento da arvore */
public interface AnimalInterface<T> {

	public void addintoAnimalTree( T e );

	public void inquire( T e );

	public T getAnimalTree();

	public void setAnimalTree( T e );
        
        public boolean isTreeEmpty( T e );

}
