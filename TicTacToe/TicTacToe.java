import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe {
    
    
        public void run() {
            Scanner in = new Scanner(System.in);
            board b = new board();
            board.turn = "X";
            String winner = null;
    
    
            //Start of loop
            System.out.println("Welcome to TicTacToe!");
            System.out.println(b.toString());
            System.out.println("X will play first. Please select a number to make a move!");
    
    
            while(winner==null) 
            {
                int input;
                
                //number 1-9
                try {
                    input = in.nextInt();
                    if(input<1 || input > 9){
                        System.out.println("Invalid input, enter a number from 1-9.");
                        continue;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input, enter a number from 1-9.");
                    continue;
                }
                if(board.spaces[input-1].equals(String.valueOf(input))) 
                {
                    board.spaces[input-1] = board.turn;
                    if(board.turn.equals("X")) board.turn = "O";
                    else board.turn = "X";

                    System.out.println(b.toString());
                    winner = board.checkWin();
            }
            else {
                System.out.println("Slot already taken! Choose a new number.");
            }
        }

        if(winner.equalsIgnoreCase("draw")){
            System.out.println("It's a draw! To play again, enter 1! To quit, put 2.");
        } else {
            System.out.println("Congratulations! "+winner+"'s have won! To play again, enter 1! To quit, put 2.");
        }
        int input = in.nextInt();
        if(input == 1){
            run();
        } else {
            in.close();
        }
        
    }
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.run();
    }
}