package model;

/**
 *
 * @author p1623123
 */
public class DeleteColumnEffect extends Effect {
    
    @Override
    public void playEffect(int line, int column, Game game) {
        for (int i = 0; i<10;i++){
                game.getBoard().getTileIJ(i, column).setStatus(-1);
        }
    }
}
