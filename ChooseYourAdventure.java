import java.util.Scanner;

public class ChooseYourAdventure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("You are at the beach");
        System.out.println("Do you want to go in the water? yes or no?");

        String choice1 = scanner.nextLine();

        if (choice1.equalsIgnoreCase("yes")) {
            System.out.println("You walk into the water, feeling the waves around you");
            System.out.println("You see something shiny under the surface");
            System.out.println("Do you pick it up? yes or no?");

            String choice2 = scanner.nextLine();

            if (choice2.equalsIgnoreCase("yes")) {
                System.out.println("You pick it up. It's a small bottle with something inside");
                System.out.println("Do you open the bottle? yes or no?");

                String choice3 = scanner.nextLine();

                if (choice3.equalsIgnoreCase("yes")) {
                    System.out.println("You open it and find a tiny map leading to a hidden spot");
                    System.out.println("Do you follow the map? yes or no?");

                    String choice4 = scanner.nextLine();

                    if (choice4.equalsIgnoreCase("yes")) {
                        System.out.println("You swim out farther than usual and discover a small, hidden cave");
                        System.out.println("Inside, you find a rusty chest");
                        System.out.println("Do you open the chest? yes or no?");

                        String choice5 = scanner.nextLine();

                        if (choice5.equalsIgnoreCase("yes")) {
                            System.out.println("Inside the chest, you find another note, leading deeper into the cave");
                            System.out.println("Do you continue deeper into the cave? yes or no?");

                            String choice6 = scanner.nextLine();

                            if (choice6.equalsIgnoreCase("yes")) {
                                System.out.println("You find a room filled with gold coins and jewels");
                                System.out.println("Do you take some and leave or keep exploring? take/explore");

                                String choice7 = scanner.nextLine();

                                if (choice7.equalsIgnoreCase("take")) {
                                    System.out.println(
                                            "You take some treasure and leave. Suddenly, you realize one of the coins is worth a million dollars!");
                                    System.out.println("Outcome: You won 1 million dollars!");
                                } else {
                                    System.out.println(
                                            "You keep exploring and realize the cave is collapsing around you");
                                    System.out.println("Outcome: You got trapped and were never seen again");
                                }
                            } else {
                                System.out.println("You decide not to go deeper and return to the beach");
                                System.out.println(
                                        "Outcome: You returned safely, but always wonder what could have been");
                            }
                        } else {
                            System.out.println("You leave the chest alone, feeling it’s too risky to open");
                            System.out.println("As you head back, a giant wave pushes you far out to sea");
                            System.out.println("Outcome: You were lost at sea and never returned");
                        }
                    } else {
                        System.out.println("You ignore the map and decide to head back to shore");
                        System.out.println("Outcome: You had a calm day, but left the beach with a feeling of mystery");
                    }
                } else {
                    System.out.println("You leave the bottle unopened and swim back to shore");
                    System.out.println("Outcome: You avoided the unknown but always wondered about that bottle");
                }

            } else {
                System.out.println("You leave the shiny thing alone and keep swimming");
                System.out.println("A dolphin appears and looks at you curiously");
                System.out.println("Do you follow the dolphin? yes or no?");

                String choice3 = scanner.nextLine();

                if (choice3.equalsIgnoreCase("yes")) {
                    System.out.println("The dolphin leads you to a colorful coral reef");
                    System.out.println("You see a strange, old key tangled in the coral");
                    System.out.println("Do you take the key? yes or no?");

                    String choice4 = scanner.nextLine();

                    if (choice4.equalsIgnoreCase("yes")) {
                        System.out.println("You take the key and the dolphin leads you back to the shore");
                        System.out.println("You find a small chest half-buried in the sand with a lock on it");
                        System.out.println("Do you use the key to open it? yes or no?");

                        String choice5 = scanner.nextLine();

                        if (choice5.equalsIgnoreCase("yes")) {
                            System.out.println(
                                    "Inside the chest, you find an old treasure map and a note that says 'Fortune Awaits'");
                            System.out.println("Do you follow the map? yes or no?");

                            String choice6 = scanner.nextLine();

                            if (choice6.equalsIgnoreCase("yes")) {
                                System.out.println("You follow the map and eventually find a buried treasure chest");
                                System.out.println("Inside is a check for a million dollars!");
                                System.out.println("Outcome: You won 1 million dollars!");
                            } else {
                                System.out.println("You decide not to follow the map and leave the beach");
                                System.out
                                        .println("Outcome: You avoided the risk, but missed the chance of a lifetime");
                            }
                        } else {
                            System.out.println("You decide not to open the chest and walk away");
                            System.out.println(
                                    "Outcome: You left the beach with a strange feeling that you missed something big");
                        }
                    } else {
                        System.out.println("You leave the key and swim back to shore");
                        System.out.println(
                                "Outcome: You enjoyed a peaceful day and returned safely, but missed an opportunity");
                    }
                } else {
                    System.out.println("You decide not to follow the dolphin and swim back to shore");
                    System.out.println("Outcome: You enjoyed a calm day in the ocean and returned safely");
                }
            }

        } else if (choice1.equalsIgnoreCase("no")) {
            System.out.println("You decide to stay on the beach and start walking along the sand");
            System.out.println("You find an old shell with strange carvings on it");
            System.out.println("Do you pick up the shell? yes or no?");

            String choice2 = scanner.nextLine();

            if (choice2.equalsIgnoreCase("yes")) {
                System.out.println("You pick up the shell and hear a faint voice, almost like it’s whispering a wish");
                System.out.println("Do you make a wish? yes or no?");

                String choice3 = scanner.nextLine();

                if (choice3.equalsIgnoreCase("yes")) {
                    System.out.println("You make a wish and suddenly feel a strange tingling sensation");
                    System.out.println("The shell glows for a moment and then fades");
                    System.out.println("Do you believe the wish will come true? yes or no?");

                    String choice4 = scanner.nextLine();

                    if (choice4.equalsIgnoreCase("yes")) {
                        System.out.println("You walk away feeling hopeful, wondering if your wish will come true");
                        System.out.println("Outcome: You feel at peace with the ocean’s magic");
                    } else {
                        System.out.println("You laugh it off, thinking it’s silly but enjoying the moment");
                        System.out.println("Outcome: You enjoyed a quiet moment with the magical shell");
                    }
                } else {
                    System.out.println("You decide not to make a wish and put the shell back");
                    System.out.println("Outcome: You leave the beach with a feeling of peace");
                }

            } else {
                System.out.println("You leave the shell and keep walking");
                System.out.println("After a while, you find a hidden cave near the rocks");
                System.out.println("Do you enter the cave? yes or no?");

                String choice3 = scanner.nextLine();

                if (choice3.equalsIgnoreCase("yes")) {
                    System.out.println("Inside, you see strange carvings on the walls and a statue in the back");
                    System.out.println("Do you touch the statue? yes or no?");

                    String choice4 = scanner.nextLine();

                    if (choice4.equalsIgnoreCase("yes")) {
                        System.out.println("The statue's eyes glow, and the cave begins to rumble");
                        System.out.println("Do you try to escape? yes or no?");

                        String choice5 = scanner.nextLine();

                        if (choice5.equalsIgnoreCase("yes")) {
                            System.out.println("You escape just in time and return to the beach, shaken but safe");
                            System.out.println("Outcome: You survived an adventure with a mysterious beach secret");
                        } else {
                            System.out.println("You stay, but the cave collapses, trapping you inside");
                            System.out.println("Outcome: You were trapped in the cave forever");
                        }
                    } else {
                        System.out.println("You decide not to touch the statue and leave the cave quietly");
                        System.out.println("Outcome: You enjoyed a peaceful adventure and returned safely");
                    }
                } else {
                    System.out.println("You decide not to enter the cave and walk back to the sand");
                    System.out.println("Outcome: You enjoyed a relaxing day without any adventure");
                }
            }
        } else {
            System.out.println("Invalid choice, please restart and choose either yes or no");
        }

        System.out.println("Thanks for playing the Beach Adventure");
        scanner.close();
    }
}