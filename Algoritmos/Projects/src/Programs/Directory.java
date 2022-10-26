import java.util.*;

import Methods.binarytree.GeneralTreeLinked;
public class Directory{
    public static void main(String[] args) {
        String entry;
        Scanner in = new Scanner(System.in);
        GeneralTreeLinked tree = new GeneralTreeLinked<>();
        while(true){
            System.out.println("Entry: ");
            entry = in.nextLine();
            String[] resp = entry.split(" ");

            switch(resp[0]){
                case "md":
                    if(tree.isEmpty()) tree.setRoot(resp[1]);
                    else{
                        
                    }

                break;

                case "cd":

                break;

                case "rm":

                break;

                case "show":

                break;

                case "quit":
                    System.exit(1);
                break;
            }

        }
    }
}