public class Hufflepuff extends Hogwarts {
    private int hardworking;
    //трудолюбивы
    private int loyal;
    //верные
    private int honest;
    //честные

    public Hufflepuff(String fullname, int powerOfMagic, int transgressionDistance, int hardworking, int loyal, int honest) {
        super(fullname, powerOfMagic, transgressionDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }
    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    @Override
    public String toString() {
        return "Факультет: Пуффендуй." +
                " Имя студента: " + fullname +
                ". Сила магии = " + powerOfMagic +
                ", растояние трангресии = " + transgressionDistance +
                ". Свойства характера: трудолюбие = " + hardworking +
                ", верность = " + loyal +
                ", честность = " + honest + ".\n";
    }
    private int sumGetAbilities(){
        return hardworking + loyal + honest;
    }
    public static void comparisonOfStudentsHufflepuff(Hufflepuff studentA, Hufflepuff studentB) {
        int sumStudentA = studentA.sumGetAbilities();
        int sumStudentB = studentB.sumGetAbilities();

        if (sumStudentA > sumStudentB) {
            System.out.println("Студент " + studentA.getFullName() + " превосходит студента " + studentB.getFullName() + " в способностях присущих Пуффендуйцу.");
        } else if (sumStudentA < sumStudentB) {
            System.out.println("Студент " + studentB.getFullName() + " превосходит студента " + studentA.getFullName() + " в способностях присущих Пуффендуйцу.");
        } else {
            System.out.println("Способности студентов " + studentA.getFullName() + " и " + studentB.getFullName() + " одинаковы.");
        }
    }
}
