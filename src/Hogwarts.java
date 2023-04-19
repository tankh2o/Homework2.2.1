public class Hogwarts {
    protected String fullname;
    protected int powerOfMagic;
    protected int transgressionDistance;

    public Hogwarts (String fullname, int powerOfMagic, int transgressionDistance) {
        this.fullname = fullname;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }

    public String getFullName() {
        return fullname;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }
    public static void comparisonOfStudentsMagicalAbilities(Hogwarts studentA, Hogwarts studentB) {
        int powerOfMagicStudentA = studentA.getPowerOfMagic();
        int powerOfMagicStudentB = studentB.getPowerOfMagic();
        int transgressionDistanceStudentA = studentA.getTransgressionDistance();
        int transgressionDistanceStudentB = studentB.getTransgressionDistance();

        if (powerOfMagicStudentA > powerOfMagicStudentB && transgressionDistanceStudentA > transgressionDistanceStudentB) {
            System.out.println("Студент " + studentA.getFullName() + " превосходит студента " + studentB.getFullName() + " в мощи магии и в дальности трангрессии.");
        } else if (powerOfMagicStudentA < powerOfMagicStudentB && transgressionDistanceStudentA > transgressionDistanceStudentB) {
            System.out.println("Сила магии студента " + studentB.getFullName() + " превосходит силу магии студента " + studentA.getFullName() + ", но трангрессирует он на меньшее растояние.");
        } else if (powerOfMagicStudentA > powerOfMagicStudentB && transgressionDistanceStudentA < transgressionDistanceStudentB) {
            System.out.println("Студент " + studentA.getFullName() + " превосходит студента " + studentB.getFullName() + " в мощи магии, но трангрессирует он на меньшее растояние.");
        } else if (powerOfMagicStudentA < powerOfMagicStudentB && transgressionDistanceStudentA < transgressionDistanceStudentB) {
            System.out.println("Студент " + studentB.getFullName() + " превосходит студента " + studentA.getFullName() + " в мощи магии и в дальности трангрессии.");
        } else if (powerOfMagicStudentA == powerOfMagicStudentB && transgressionDistanceStudentA > transgressionDistanceStudentB) {
            System.out.println("Сила магии у студента " + studentA.getFullName() + " и у студента " + studentB.getFullName() + " равна, но " + studentA.getFullName() + " трангрессирует на большее растояние.");
        } else if (powerOfMagicStudentA == powerOfMagicStudentB && transgressionDistanceStudentA < transgressionDistanceStudentB) {
            System.out.println("Сила магии у студента " + studentA.getFullName() + " и у студента " + studentB.getFullName() + " равна, но " + studentA.getFullName() + " трангрессирует на меньшее растояние.");


        } else if (powerOfMagicStudentA > powerOfMagicStudentB && transgressionDistanceStudentA == transgressionDistanceStudentB) {
            System.out.println("Сила магии студента " + studentA.getFullName() + " мощнее магии студента " + studentB.getFullName() + ", но трангрессируют они на одинаковое растояние.");


        } else if (powerOfMagicStudentA < powerOfMagicStudentB && transgressionDistanceStudentA == transgressionDistanceStudentB) {
            System.out.println("Сила магии студента " + studentB.getFullName() + " мощнее магии студента " + studentA.getFullName() + ", но трангрессируют они на одинаковое растояние.");
        } else {
            System.out.println("Сила магии и растояние трангрессии у студента " + studentA.getFullName() + " и у студента " + studentB.getFullName() + " одинаково равны.");
        }
    }
}
