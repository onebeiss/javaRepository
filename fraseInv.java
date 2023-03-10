import java.util.Scanner;

public class fraseInv {
    
    static String tecleaFrase (Scanner e){
        System.out.print("Teclea frase: ");
        String frase = e.nextLine();
        return frase;
    }

    static String invFrase (String cad1){
        System.out.println("Invirtiendo frase...");
        String fraseInv = "";
        
        for(int i = cad1.length()-1; i>=0;i--){
            fraseInv += cad1.charAt(i);
        }
        System.out.println("Frase invertida: "+fraseInv);
        return fraseInv;
    }

    static void checkChar (String cad1, String cad2){
        char c1 = ' ', c2 = ' ';
        int [] c = {0,0,0,0};
                    // {total,letras,numeros,otros} //
        for(int i = 0; i<cad1.length(); i++){
            c1 = cad1.charAt(i);
            c2 = cad2.charAt(i);
            if(c1 == c2){
                c[0]++;
                if(Character.isLetter(c1))
                    c[1]++;
                    else
                        if(Character.isDigit(c1))
                            c[2]++;
                            else
                            c[3]++;
                        }
        } 

        System.out.println("\n\tCoincidencias");
        System.out.println("Total: "+c[0]);
        System.out.println("Letras: "+c[1]);
        System.out.println("Números: "+c[2]);
        System.out.println("Otros: "+c[3]);
    }

    public static void main(String[]args){
        Scanner e = new Scanner(System.in);
        String cad1 = null, cad2 = null;

        cad1 = tecleaFrase(e);
        cad2 = invFrase(cad1);
        checkChar(cad1, cad2);
    }
}
