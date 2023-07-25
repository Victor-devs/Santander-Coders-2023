import java.util.Scanner;

public class SwitchDbz {

    public static void main(String[] args) {

        Scanner lutadoresDbz = new Scanner(System.in);

        System.out.println("Qual é o seu personagem favorito de Dbz?\n" +
                "Goku\n" + "Vejeta\n" + "Gohan\n" + "Picollo\n" + "Kuririn\n"  +
                "Goten\n" + "Trunks");

        String personagem = lutadoresDbz.nextLine();
        String  resultado;

        switch(personagem) {
            case "Goku": resultado = "O seu personagem favorito de Dbz é o => " + (personagem);
            break;

            case "Vejeta": resultado = "O seu personagem favorito de Dbz é o => " + (personagem);
            break;

            case "Gohan": resultado = "O seu personagem favorito de Dbz é o => " + (personagem);
            break;

            case "Picollo": resultado = "O seu personagem favorito de Dbz é o => " + (personagem);
            break;

            case "Kuririn": resultado = "O seu personagem favorito de Dbz é o => " + (personagem);
            break;

            case "Goten": resultado = "O seu personagem favorito de Dbz é o => " + (personagem);
            break;

            case "Trunks": resultado = "O seu personagem favorito de Dbz é o => " + (personagem);
            break;

            default:
                System.out.println("Nome inválido");
            return;

        }
        System.out.println(resultado);
        lutadoresDbz.close();
    }
}

