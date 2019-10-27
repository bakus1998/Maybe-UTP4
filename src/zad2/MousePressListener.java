package zad2;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public interface MousePressListener extends MouseListener {
    @Override
    default void mouseClicked(MouseEvent e) {
        //System.out.println("Clicked");
    }

/*    @Override
    default void mousePressed(MouseEvent e) {
        //System.out.println("Pressed");
    }*/

    @Override
    default void mouseReleased(MouseEvent e) {
        //System.out.println("Released");
    }

    @Override
    default void mouseEntered(MouseEvent e) {
        //System.out.println("Entered");
    }


    @Override
    default void mouseExited(MouseEvent e) {
        //System.out.println("Exited");
    }
}
