public class Main {

    public static void main(String[] args) {
	    char grade = 'W';

        switch (grade) {
            case 'A':
            System.out.println("Mükkemmel Geçtiniz");
            break;
            case'B':
            case 'C':
            System.out.println("İyi Geçtiniz");
            break;
            case 'D':
            System.out.println("Fena Değil Geçtiniz");
            break;
            case 'F':
            System.out.println("Maalesef Kaldınız");
            break;
            default:
                    System.out.println("Geçersiz Not");
        }

    }
}
