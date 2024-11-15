import javax.swing.JFrame;

public class App {
    public static void main(String[] args) {
        int rowCount = 21;
        int columnCount = 19;
        int tileSize = 32;
        int boardWidth = columnCount * tileSize;
        int boardHeight = rowCount * tileSize;

        JFrame frame = new JFrame("Pac-Man");
        //frame.setVisible(true);     //makes screen visible to user, not yet however, only visible once you have all componets
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);      //makes screen appear at centre of screen
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PacMan pacmanGame = new PacMan();
        frame.add(pacmanGame);
        frame.pack();   //get full size within window
        pacmanGame.requestFocus();
        frame.setVisible(true);     //now we make it visible


    }
}