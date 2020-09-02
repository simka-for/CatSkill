public class Loader
{
    public static void main(String[] args)
    {

        // Задание №1

        /**
         * Создать 5-7 кошек и вызвать у них различные методы:
         */

        Cat vasya = new Cat();
        Cat petya = new Cat();
        Cat masha = new Cat();
        Cat dima = new Cat();
        Cat vanya = new Cat();

        /**
         * покормите 2 кошки и после этого распечатать их вес (убедитесь что вес изменился)
         * перекормите кошку
         */

        System.out.println(masha.getWeight());

        masha.feed(9000.);
        dima.feed(4000.);

        System.out.println(masha.getWeight());
        System.out.println(dima.getWeight());
        System.out.println(masha.getStatus());

        /**
         * замяукайте" кошку до смерти
         */

        while (!"Dead".equals(vanya.getStatus())){
            vanya.meow();
        }

        System.out.println(".................................");

        // Задание №2

        /**
         * Создать в классе Cat метод, который будет возвращать сумму съеденной еды текущей кошки
         * Создать в классе Cat метод “сходить в туалет” pee(), который будет уменьшать вес кошки и что-нибудь печатать.
         */

        petya.feed(150.);

        System.out.println(petya.getWeight());

        petya.pee();
        petya.pee();

        System.out.println(petya.getWeight());
        System.out.println(petya.getAllEatenMass());

        // Задание №3.
        // Во всех методах где изменяется вес реализована проверка на переменную isAlice, которая высчитывается в методе isWeightNormal

        /**
         * Создать статический метод getCount(), который будет возвращать количество кошек
         */

        System.out.println(".................................");


        System.out.println(vasya.getWeight());

        vasya.feed(500.);
        vasya.feed(50000.);
        vasya.feed(30.);

        System.out.println(Cat.getCount()); // Осталось 2 кошки - Машу и Васю перекормили, Ваню замяукали


        // Задание №4 - реализовано в Cat и CatColor

        System.out.println(".................................");

        // Задание №5

        Cat kitten = getKitten();
        System.out.println(kitten.getWeight());

        // Задание №6

        /**
         * Создать у кошки переменную в которой хранится окрас, написать геттер и сеттер для окраса.
         */

        kitten.setColor(CatColor.GRAY);

        System.out.println(kitten.getColor());

        System.out.println(".................................");

        // Задание №7

        Cat kitten2 = new Cat(kitten);

        System.out.println(kitten2.getColor());
        System.out.println(Cat.getCount());

    }

    private static Cat getKitten(){
        return new Cat(1100.);
    }

}