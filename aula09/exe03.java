package aula09;

public class exe03 {
    static public void main(String[] args) {
        String st = args[0];
        if (args.length < 1) {
            System.out.println("Digite um String...");
        }
        else {
        for (int i = st.length()-1; i >= 0; i--) {
            System.out.printf("%c",st.charAt(i));
        }
        System.out.printf("%n");
        }
    }
}
