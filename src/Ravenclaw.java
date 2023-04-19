public class Ravenclaw extends Hogwarts{
    private int smart;
    //умны
    private int wise;
    //мудры
    private int witty;
    //остроумны
    private int creativity;
    //творческие
    public Ravenclaw(String fullname, int powerOfMagic, int transgressionDistance, int smart, int wise, int witty, int creativity) {
        super(fullname, powerOfMagic, transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }
    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Факультет: Когтевран." +
                " Имя студента: " + fullname +
                ". Сила магии = " + powerOfMagic +
                ", растояние трангресии = " + transgressionDistance +
                ". Свойства характера: сообразительность = " + smart +
                ", мудрость = " + wise +
                ", остроумие = " + witty +
                ", креативность = " + creativity + ".\n";
    }
    private int sumGetAbilities(){
        return smart + wise + witty + creativity;
    }
    public static void comparisonOfStudentsRavenclaw(Ravenclaw studentA, Ravenclaw studentB) {
        int sumStudentA = studentA.sumGetAbilities();
        int sumStudentB = studentB.sumGetAbilities();

        if (sumStudentA > sumStudentB) {
            System.out.println("Студент " + studentA.getFullName() + " превосходит студента " + studentB.getFullName() + " в способностях присущих Когтевранцу.");
        } else if (sumStudentA < sumStudentB) {
            System.out.println("Студент " + studentB.getFullName() + " превосходит студента " + studentA.getFullName() + " в способностях присущих Когтевранцу.");
        } else {
            System.out.println("Способности студентов" + studentA.getFullName() + "и" + studentB.getFullName() + " одинаковы.");
        }
    }

}
