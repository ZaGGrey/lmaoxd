import java.util.Scanner;
//////////////////////////////////////////Лучшая программа \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
//////////////////////////////////////////Лучшая программа \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
//////////////////////////////////////////Лучшая программа \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
//////////////////////////////////////////Лучшая программа \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
//////////////////////////////////////////Лучшая программа \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
public class Main {
    public static void main(String[] args){
        String enterData = "Введите ваш возраст: ";
        System.out.println(enterData);
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();



        if(age<12){
            System.out.println("Высунь соску изо рта!");
        } else if(age<18) {
            System.out.println("Тебе нельзя еще сюда, пиздуй уроки делай!");
        } else if (age>=18){
            System.out.println("Ого, ты уже дядька взрослый, заходи. ");
            System.out.println("Есть много порно выбирай : \n Большие сиськи \n Инцест \n Милфы \n Анал");
            Scanner scanner = new Scanner(System.in);
            String categoryPorno = scanner.nextLine();
            switch (categoryPorno){
                case "Большие сиськи":
                    System.out.println("Вот что я смог найти : ссылка\nссылка\nссылка\nссылка\nссылка\nМне лень добавлять сечас порно" );
                    break;
                case "Инцест":
                    System.out.println("Вот что я смог найти : ссылка\nссылка\nссылка\nссылка\nссылка\n мне лень добавлять сечас порно" );
                    break;
                case "Милфы":
                    System.out.println("Вот что я смог найти : ссылка\nссылка\nссылка\nссылка\nссылка\n мне лень добавлять сечас порно" );
                    break;
                case "Анал":
                    System.out.println("Вот что я смог найти : ссылка\nссылка\nссылка\nссылка\nссылка\n мне лень добавлять сечас порно" );
                    break;
            }



        } else {
            System.out.println("Ты че-то не то выбрал пацанчик.");
        }



    }
}
