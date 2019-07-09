package animalgame;

import javax.swing.JOptionPane;


/**
 * @Date: 09-07-2019
 * @Autor: Julio 
 **/

public class AnimalGame  {

    public static int index = 1;
    public static AnimalTree raiz;


    public static void main(String[] args) {
        Animals main = new Animals();

        int sair,resposta;
        String opt[] = {"OK"}; //Opção para o JOptionPane inicial

        // Permanece no laço enquanto não optar por fechar a janela inicial.
        sair = JOptionPane.showOptionDialog( null, "Pense em um Animal", "Jogo dos Animais", 
                        JOptionPane.OK_OPTION, JOptionPane.PLAIN_MESSAGE, null, opt, opt[0] );

        while ( sair != JOptionPane.CLOSED_OPTION ) {
            // Pergunta inicial

            resposta = JOptionPane.showConfirmDialog(null, "O animal que você pensou " + main.getAnimalTree().value  + "?",
                                "Confirme", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE );

            if ( resposta == JOptionPane.YES_OPTION ) {
                main.inquire(main.getAnimalTree().right);
            } else {
                main.inquire(main.getAnimalTree().left);
            }
            sair = JOptionPane.showOptionDialog( null, "Pense em um Animal", "Jogo dos Animais", 
                        JOptionPane.OK_OPTION, JOptionPane.PLAIN_MESSAGE, null, opt, opt[0] );

        } 

    }

}