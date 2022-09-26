package chapter1;

public class PopulationProjection {
    public static void main(String[] args) {
        double CURRENT_POPULATION = 312032486.0;
        // give population of each in the next 5 year
        double SECONDS_IN_YEAR = 31536000.0;

        double NUM_OF_BIRTHS = SECONDS_IN_YEAR / 7 ;
        double NUM_OF_DEATH = SECONDS_IN_YEAR / 13;
        double NUM_OF_IMMIGRANTS = SECONDS_IN_YEAR / 45;

        NUM_OF_BIRTHS = CURRENT_POPULATION + NUM_OF_BIRTHS;
        NUM_OF_DEATH = CURRENT_POPULATION + NUM_OF_DEATH;
        NUM_OF_IMMIGRANTS = CURRENT_POPULATION + NUM_OF_IMMIGRANTS;

        System.out.println(NUM_OF_BIRTHS);
        System.out.println(NUM_OF_DEATH);
        System.out.println(NUM_OF_IMMIGRANTS);

    }
}
