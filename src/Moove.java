public class Moove {
    String name;
    int yearOfRelease;
    boolean includedInThePlan;
    double sumOfAssessment;
    int totalOfReviews;
    int durationInMinutes;

    void displaysTechnicalSheet(){
        System.out.println("Name of moove: " + name);
        System.out.println("Yaear of release: " + yearOfRelease);
    }

    void assessment(double grade){
        sumOfAssessment += grade;
        totalOfReviews++;
    }

    double sumOfMedia(){
        return sumOfAssessment / totalOfReviews;

    }
}

