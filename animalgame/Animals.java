

package animalgame;

import javax.swing.JOptionPane;


/**
 * @Date: 09-07-2019
 * @Autor: Julio 
 **/

public class Animals implements AnimalInterface<AnimalTree> {

    public static int index = 1;
    public static AnimalTree root;

    
    
    public Animals(){
        
        if ( isTreeEmpty( this.root ) ) {
            this.root = new AnimalTree( index, "vive na agua" );
            this.root.left = new AnimalTree( ++index, "Macaco" );
            this.root.right = new AnimalTree( ++index, "Tubarao" );
        }
    }
    
    // Testa a existência de uma subarvore
    @Override
    public boolean isTreeEmpty( AnimalTree tree ){
        
        return  tree == null;
    }    
    
    /**
     * Retorna a subarvore atual
     */
    
    @Override
    public AnimalTree getAnimalTree() {
            return this.root;
    }

    /**
     * atualiza a subarvore atual
     */
    @Override
    public void setAnimalTree(AnimalTree tree) {
            this.root = tree;
    }

    /**
     *insere uma nova subarvore na subarvore atual
     */
    @Override
    public void addintoAnimalTree( AnimalTree node ) {

            String animal = JOptionPane.showInputDialog( null, "Qual o animal que você pensou?", "Desisto", JOptionPane.PLAIN_MESSAGE);
 
            String attribute = JOptionPane.showInputDialog( null, "Um(a) " + animal + "______ mas um(a) " + node.value + " não.", 
                    "Complete", JOptionPane.PLAIN_MESSAGE );
            
           if( animal == null ){
               animal = "";
           }else if(attribute == null){
               attribute = "";
           }
           
           String tmp = node.value;
           node.value = attribute;
           node.right = new AnimalTree(++index, animal);
           node.left = new AnimalTree(++index, tmp);
    }

    /**
     * decide se inclui nova subarvore ou se encontrou a respota na subarvore atual.
     */
    @Override
    public void inquire( AnimalTree node ) {
            // Faz a pergunta pra ver se o animal está correto
            int pergunta = JOptionPane.showConfirmDialog(null, "O animal que você pensou " + node.value + "?", "Confirme",
                            JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE );

            if ( pergunta == JOptionPane.YES_OPTION ) {
                    // Se a resposta estiver correta
                    if ( isTreeEmpty(node.right) )
                        JOptionPane.showMessageDialog( null, "Acertei de novo!","jogo dos Animais", JOptionPane.PLAIN_MESSAGE );
                    else {
                        inquire(node.right);
                    }
            } else {
                    if ( isTreeEmpty( node.left ) )
                        addintoAnimalTree(node);
                    else {
                        inquire(node.left);
                    }
            }
    } 
    
}
