public class Gryffindor extends Hogwarts {
    private int nobility;
    //благородство
    private int honor;
    //честь
    private int bravery;
    //храбрость

    public Gryffindor(String fullname, int powerOfMagic, int transgressionDistance, int nobility, int honor, int bravery) {
        super(fullname, powerOfMagic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Факультет: Гриффендор." +
                " Имя студента: " + fullname +
                ". Сила магии = " + powerOfMagic +
                ", растояние трангресии = " + transgressionDistance +
                ". Свойства характера: блогородство = " + nobility +
                ", честь = " + honor +
                ", храбрость = " + bravery + ".\n";
    }
    private int sumGetAbilities(){
        return nobility + honor + bravery;
    }
    public static void comparisonOfStudentsGryffindor(Gryffindor studentA, Gryffindor studentB) {
        //сравнение студентов Гриффиндора
        int sumStudentA = studentA.sumGetAbilities();
        int sumStudentB = studentB.sumGetAbilities();

        if (sumStudentA > sumStudentB) {
            System.out.println("Студент " + studentA.getFullName() + " превосходит студента " + studentB.getFullName() + " в способностях присущих Гриффиндорцу.");
        } else if (sumStudentA < sumStudentB) {
            System.out.println("Студент " + studentB.getFullName() + " превосходит студента " + studentA.getFullName() + " в способностях присущих Гриффиндорцу.");
        } else {
            System.out.println("Способности студентов" + studentA.getFullName() + " и " + studentB.getFullName() + " одинаковы.");
        }
    }
}
