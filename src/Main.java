public class Main {
    public static void main(String[] args) {
        Moove myMoove = new Moove();
        myMoove.name = "The Flash";
        myMoove.yearOfRelease = 2008;
        myMoove.durationInMinutes = 180;

        myMoove.displaysTechnicalSheet();
        myMoove.assessment(8);
        myMoove.assessment(9);
        myMoove.assessment(5);
        System.out.println(myMoove.sumOfAssessment);
        System.out.println(myMoove.yearOfRelease);
        System.out.println(myMoove.sumOfMedia());

    }
}
