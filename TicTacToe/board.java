import java.util.*

public class board
{
    static String[] spaces;
    static String turn;

    public board() 
    {
        spaces = new String[9];
        turn = "X";
        for (int i = 0; i < 9; i++) {
            spaces[i] = String.valueOf(i + 1);
        }
    }

    static void toString()
    {
        System.out.println("|   |   |   |");
        System.out.println("| "+spaces[0]+" | "
        +spaces[1]+" | "+spaces[2]+" |");
        System.out.println("|-----------|");
        System.out.println("| "+spaces[3]+" | "
        +spaces[4]+" | "+spaces[5]+" |");
        System.out.println("|-----------|");
        System.out.println("| "+spaces[6]+" | "
        +spaces[7]+" | "+spaces[8]+" |");
        System.out.println("|---|---|---|");
    }
    
    static String checkWin()
    {
        for (int a = 0; a < 8; a++) {
            String line = null;
            switch (a) {
                case 0:
                    line = spaces[0] + spaces[1] + spaces[2];
                    break;
                case 1:
                    line = spaces[3] + spaces[4] + spaces[5];
                    break;
                case 2:
                    line = spaces[6] + spaces[7] + spaces[8];
                    break;
                case 3:
                    line = spaces[0] + spaces[3] + spaces[6];
                    break;
                case 4:
                    line = spaces[1] + spaces[4] + spaces[7];
                    break;
                case 5:
                    line = spaces[2] + spaces[5] + spaces[8];
                    break;
                case 6:
                    line = spaces[0] + spaces[4] + spaces[8];
                    break;
                case 7:
                    line = spaces[2] + spaces[4] + spaces[6];
                    break;
            } //X winner
            if (line.equals("XXX")) {
                return "X";
            } //O winner
            else if (line.equals("OOO")) {
                return "O";
            }
        }
        
        for(int a = 0; a<9; a++)
        {
            if (Arrays.asList(spaces).contains(String.valueOf(a+1))) {
                break;
            }
            else if (a == 8) return "draw";
        }
    }
    // To enter X or O at the desired location on board
    System.out.println(
        turn + "'s turn; enter a slot number to place " + turn + " in:");
    return null;
}