

package midtermexam_versiona_extensioncode;
import java.util.Scanner;
/**
 *
 * @author jtrue
 */
public class TestUserProfile {

        public static void main(String [] args) {
        
            Scanner input = new Scanner(System.in);
            
            System.out.print("Enter your name: ");
            String name = input.nextLine();
            System.out.print("Which of these movie genres is your favourite?\n"
                    + "Comedy, Drama, Action, Mystery: ");
            String genre = input.nextLine();
            
            UserProfile josh = new UserProfile(name, genre);
            System.out.print("Your user profile has been created.\n");
            
            
        }
}
