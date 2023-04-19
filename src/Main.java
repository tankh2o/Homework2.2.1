public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Гарри Поттер", 82, 39,84, 99, 79);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона Грейнджер", 85,47, 79, 60,90);
        Gryffindor ronWeasley = new Gryffindor("Рон Уизли", 72, 41, 76, 79,64);
        Hufflepuff zachariahSmith = new Hufflepuff("Захария Смит",63,48,99,41,88);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик Диггори", 35, 50,91,51,62);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин Финч-Флетчли", 97,36,77,97,39);
        Ravenclaw zhouChang = new Ravenclaw("Чжоу Чанг",63,44,45,59,71,59);
        Ravenclaw padmaPatil = new Ravenclaw("Падма Патил",61,48,76,59,82,55);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус Белби",70,90,53,31,51,99);
        Slytherin dracoMalfoy = new Slytherin("Драко Малфой",82, 56,87, 42,75,75,76);
        Slytherin grahamMontague = new Slytherin("Грэхэм Монтегю",97,25,75,62,45,61,79);
        Slytherin gregoryGoyle = new Slytherin("Грегори Гойл",69,56,76,64,62,59,61);

        System.out.println(harryPotter + "" + hermioneGranger + "" + ronWeasley);
        System.out.println(zachariahSmith + "" + cedricDiggory + "" + justinFinchFletchley);
        System.out.println(zhouChang + "" + padmaPatil + "" + marcusBelby);
        System.out.println(dracoMalfoy + "" + grahamMontague + "" + gregoryGoyle);

        Gryffindor.comparisonOfStudentsGryffindor(harryPotter, hermioneGranger);
        Hufflepuff.comparisonOfStudentsHufflepuff(cedricDiggory, justinFinchFletchley);
        Ravenclaw.comparisonOfStudentsRavenclaw(padmaPatil, marcusBelby);
        Slytherin.comparisonOfStudentsSlytherin(grahamMontague, gregoryGoyle);

        System.out.println("");

        Hogwarts.comparisonOfStudentsMagicalAbilities(justinFinchFletchley, marcusBelby);
        Hogwarts.comparisonOfStudentsMagicalAbilities(harryPotter, dracoMalfoy);
        Hogwarts.comparisonOfStudentsMagicalAbilities(hermioneGranger, ronWeasley);
    }


}