public class Cat
{

    // Задание №4

    public final static int EYE_COUNT = 2;
    public final static double MIN_WEIGHT = 1000.0;
    public final static double MAX_WEIGHT = 9000.0;

    //

    private double originWeight;
    private double weight;
    private CatColor color;

    private double minWeight;
    private double maxWeight;

    private double allEatenMass;

    boolean isAlive;
    static private int count = 0;

    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = MIN_WEIGHT;
        maxWeight = MAX_WEIGHT;
        count += 1;
        isAlive = isWeightNormal();
    }

    public Cat(Double amount) {
        this();
        this.weight = amount;
        if (weight < MIN_WEIGHT || weight > MAX_WEIGHT){
            count = count - 1;
            System.out.println("Вы создали мертвую кошку");
        }
    }

    public Cat(Cat other) {
        this.weight = other.weight;
        this.originWeight = other.originWeight;
        this.minWeight = other.minWeight;
        this.maxWeight = other.maxWeight;
        this.color = other.color;
        this.isAlive = other.isAlive;
        count = count + 1;
        if (!isAlive) {
            count = count - 1;
            System.out.println("Вы создали копию мертвой кошкой");
        }
    }

    public void meow() {
        if (isAlive) {
            weight -= 1;
            System.out.println("Meow");
            isWeightNormal();
        } else {
            System.out.println("Кошка не может мяукать, она умерла");
        }
    }

    public void feed(Double amount) {
        if (isAlive) {
            weight += amount;
            allEatenMass += amount;
            System.out.println("Кошка поела " + amount + " грамм еды");
            isWeightNormal();
        } else {
            System.out.println("Кошка не может есть, она мертва");
        }

    }

    public void drink(Double amount) {
        if (isAlive){
            weight = weight + amount;
            System.out.println("Кошка выпила воды");
            isWeightNormal();
        } else {
            System.out.println("Кошка не может пить, она мертва");
        }
    }

    public void pee() {
        if (isAlive) {
            weight -= 150;
            System.out.println("Кошка сходила в туалет");
            isWeightNormal();
        } else {
            System.out.println("Кошка не может сходить в туалет, она мертва");
        }
    }


    public boolean isWeightNormal() {
        if (weight > MIN_WEIGHT && weight < MAX_WEIGHT) {
            isAlive = true;
        }else{
            isAlive = false;
            count -= 1;
            System.out.println("Кошка умерла");
        }
        return isAlive;
    }

    public Double getWeight() {
        return weight;
    }

    public String getStatus() {
        if(weight < minWeight) {
            return "Dead";
        }
        else if(weight > maxWeight) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }

    public Double getAllEatenMass() {
        return allEatenMass;
    }


    public static int getCount() {
        return count;
    }

    public CatColor getColor() {
        return color;
    }

    public void setColor(CatColor color) {
        this.color = color;
    }
}