import java.sql.SQLOutput;
import java.util.Scanner;

public class Movie_Recommendation {
    static Scanner scan = new Scanner(System.in);
    static String name;
    static String[] Categories = {"1. African Culture", "2. Racism", "3. Apartheid", "4. Slavery", "5. College Life"};
    static String movie;
    static String[] Recommendations_African_Culture = {"Beasts Of No Nation Netflix", "Prince OF Egypt Hulu"};
    static String[] Recommendations_Racism = {"Monsters & Men Hulu ", "Strong Island Netflix"};
    static String[] Apartheid = {"Skin Netflix", "Kalushi Netflix"};
    static String[] Slavery = {"Django Unchained Netflix", "Gladiator Netflix"};
    static String[] College_Life = {"Boy Erased HBO", "Hoop Dreams HBO"};
    static String[] Options = {"1. Give A Movie Recommendation", "2. Get A Movie Recommendation", "3. Exit"};
    static int Option;
    static int recommendation;
    static int categoryChoice;
    static int movieSelection;


    public static void getSelection(){
        System.out.println("Welcome to PopCorn Recommenda");
        System.out.println("What's your name");
        name = scan.next();
        System.out.println(name + " What do you want to do?\nSelection an Option" );
        for (int i=0; i<Options.length; i++) {
            System.out.println(Options[i]);
        }
       Option = scan.nextInt();
        if (Option == 1){
            giveRecommendation();
        }
        else if (Option == 2){
            getRecommendation();
        }
        else {
            System.out.println("Thank you " +name +" for contributing");
            System.exit(Option);
        }
    }

    public static void giveRecommendation(){
        System.out.println("Thank You For Choosing To " + Options[Option-1].substring(3,
                Options[Option-1].length()));
        System.out.println("Here are available Categories\n Kindly choose one to recommend a movie");
        for (int i=0; i<Categories.length; i++) {
            System.out.println(Categories[i]);
        }
        recommendation = scan.nextInt();
        if (recommendation == 1){
            RecommendAfricanCulture();
        }
        else if (recommendation == 2){
            RecommendRacism();
        }
        else if (recommendation == 3){
            RecommendApartheid();
        }
        else if (recommendation == 4){
            RecommendSlavery();
        }
        else if (recommendation == 5){
            RecommendCollegeLife();
        }
    }

    public static void RecommendAfricanCulture(){
        System.out.println("Type in the movie title and the streaming platform you saw it (eg Netflix)");
        movie = scan.next();
        Recommendations_African_Culture[Recommendations_African_Culture.length - 1] = movie;
        System.out.println("Thank you for adding to our African Culture Catalogue");
        getSelection();


    }

    public static void RecommendCollegeLife(){
        System.out.println("Type in the movie title and the streaming platform you saw it (eg Netflix)");
        movie = scan.next();
        College_Life[College_Life.length - 1] = movie;
        System.out.println("Thank you for adding to our College Life Catalogue");
        getSelection();

    }

    public static void RecommendSlavery(){
        System.out.println("Type in the movie title and the streaming platform you saw it (eg Netflix)");
        movie = scan.next();
        Slavery[Slavery.length - 1] = movie;
        System.out.println("Thank you for adding to our Slavery Catalogue");
        getSelection();

    }

    public static void RecommendApartheid(){
        System.out.println("Type in the movie title and the streaming platform you saw it (eg Netflix)");
        movie = scan.next();
        Apartheid[Slavery.length - 1] = movie;
        System.out.println("Thank you for adding to our Apartheid Catalogue");
        getSelection();

    }

    public static void RecommendRacism(){
        System.out.println("Type in the movie title and the streaming platform you saw it (eg Netflix)");
        movie = scan.next();
        Recommendations_Racism[Recommendations_Racism.length - 1] = movie;
        System.out.println("Thank you for adding to our Racism Catalogue");
        getSelection();

    }

    public static void getRecommendation(){
        System.out.println("Welcome to our community interest movie recommendation platform \n Please choose from these " +
                "available categories");
        for (int i=0; i<Categories.length; i++) {
            System.out.println(Categories[i]);
        }
        categoryChoice = scan.nextInt();
        if (categoryChoice == 1){
            System.out.println("Here are available movies you can watch next \n Kind choose one");
            movieSelection = scan.nextInt();
            System.out.println(name + ", you have selected " + Recommendations_African_Culture[movieSelection-1].substring(3,
                    Recommendations_African_Culture[movieSelection-1].length())+ " ENJOY");
        }
        else if (categoryChoice == 2){
            System.out.println("Here are available movies you can watch next \n Kind choose one");
            movieSelection = scan.nextInt();
            System.out.println(name + ", you have selected " + Recommendations_Racism[movieSelection-1].substring(3,
                    Recommendations_Racism[movieSelection-1].length())+ " ENJOY");
        }
        else if (categoryChoice == 3){
            System.out.println("Here are available movies you can watch next \n Kind choose one");
            movieSelection = scan.nextInt();
            System.out.println(name + ", you have selected " + Apartheid[movieSelection-1].substring(3,
                    Apartheid[movieSelection-1].length())+ " ENJOY");
        }
        else if (categoryChoice == 4){
            System.out.println("Here are available movies you can watch next \n Kind choose one");
            movieSelection = scan.nextInt();
            System.out.println(name + ", you have selected " + Slavery[movieSelection-1].substring(3,
                    Slavery[movieSelection-1].length()) + " ENJOY");
        }
        else if (categoryChoice == 5){
            System.out.println("Here are available movies you can watch next \n Kind choose one");
            movieSelection = scan.nextInt();
            System.out.println(name + ", you have selected " + College_Life[movieSelection-1].substring(3,
                    College_Life[movieSelection-1].length()) + " ENJOY");
            getSelection();
        }




    }

    public static void main(String[] args) {
        getSelection();
    }




}
