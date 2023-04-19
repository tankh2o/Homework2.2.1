public class Slytherin extends Hogwarts{
    private int cunning;
    //хитрые
    private int determination;
    //решительные
    private int ambition;
    //амбициозные
    private int resourcefulness;
    //находчивые
    private int lustForPower;
    //жажда власти

    public Slytherin(String fullname, int powerOfMagic, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(fullname, powerOfMagic, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }
    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return "Факультет: Слизерин." +
                " Имя студента: " + fullname +
                ". Сила магии = " + powerOfMagic +
                ", растояние трангресии = " + transgressionDistance +
                ". Свойства характера: хитрость = " + cunning +
                ", решительность = " + determination +
                ", абмициозность = " + ambition +
                ", находчивость = " + resourcefulness +
                ", властолюбие = " + lustForPower + ".\n";
    }
    private int sumGetAbilities(){
        return cunning + determination + ambition + resourcefulness + lustForPower;
    }
    public static void comparisonOfStudentsSlytherin(Slytherin studentA, Slytherin studentB) {
        int sumStudentA = studentA.sumGetAbilities();
        int sumStudentB = studentB.sumGetAbilities();

        if (sumStudentA > sumStudentB) {
            System.out.println("Студент " + studentA.getFullName() + " превосходит студента " + studentB.getFullName() + " в способностях присущих Слизеринцу." + "(" + studentA.sumGetAbilities() + " и " + studentB.sumGetAbilities() + ")");
        } else if (sumStudentA < sumStudentB) {
            System.out.println("Студент " + studentB.getFullName() + " превосходит студента " + studentA.getFullName() + " в способностях присущих Слизеринцу." + "(" + studentA.sumGetAbilities() + " и " + studentB.sumGetAbilities() + ")");
        } else {
            System.out.println("Способности студентов " + studentA.getFullName() + " и " + studentB.getFullName() + " одинаковы." + "(" + studentA.sumGetAbilities() + " и " + studentB.sumGetAbilities() + ")");
        }
    }
}