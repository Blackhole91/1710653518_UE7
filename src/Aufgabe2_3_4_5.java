import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;


public class Aufgabe2_3_4_5 {

    public static void main(String[] args) {

       try {
            boolean wahrheitsWetrt = false;
            while (!wahrheitsWetrt){
                int eingabe = Integer.parseInt(JOptionPane.showInputDialog("geben Sie bitte eine Zahl ein"));
            }
        }catch (Exception e){
            System.err.println("keine Zahl");
        }finally {

           try {
               checkMails();
           }catch (PatternSyntaxException ex){

           }
           meineException();
       }

    }

    public static void checkMails () throws PatternSyntaxException {

        try {
            Pattern pattern = Pattern.compile("[\\w|-]+@\\w[\\w|-]*\\.[a-z]{2,3}");
            String c = JOptionPane.showInputDialog("geben Sie Ihre E-mail-Adresse hier ein");
            Matcher m = pattern.matcher(c);

            System.out.println("Email-Adresse = "+m.find());

        }catch (PatternSyntaxException ex){
            throw ex;
        }
        meineException();


    }
    public static void meineException() {
        String eingabeString = JOptionPane.showInputDialog("eingabe");
        if (eingabeString.contains("Arschloch")) {
            try {
                throw new Exception("böses Wort!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
