package com.example.chooselife;

public class class_FutureHelper {
    public static String tint = "intelligence";
    public static String tluck = "luck";
    public static String tcour = "courage";
    public static String tchar = "charisma";
    public static String tdev = "deviance";
    public static String tbiz = "bizarre";
    public static String tath = "athleticism";


    class_Trait[] future_trait_array(String t1, int val1, String t2, int val2){
        return new class_Trait[]{ new class_Trait(t1, val1), new class_Trait(t2, val2)};
    }
    class_Trait[] future_trait_array(String t1, int val1, String t2, int val2, String t3, int val3){
        return new class_Trait[]{ new class_Trait(t1, val1), new class_Trait(t2, val2), new class_Trait(t3, val3)};
    }

    public class_FutureQuestion make_question(int rar, int stor_num, class_Trait[] qual_trait, String qual_skill, String que, String a1, int sn1, String a2, int sn2,String a3, int sn3,String a4, int sn4)
    {
        return new class_FutureQuestion( rar,stor_num, qual_trait, qual_skill, que,
                new class_TraitAnswer(a1,sn1),
                new class_TraitAnswer(a2,sn2),
                new class_TraitAnswer(a3,sn3),
                new class_TraitAnswer(a4,sn4));
    }
    public class_FutureQuestion make_question(int rar, int stor_num, String que, String a1, int sn1, String a2, int sn2,String a3, int sn3,String a4, int sn4)
    {
        return new class_FutureQuestion(rar,stor_num, null, null, que,
                new class_TraitAnswer(a1,sn1),
                new class_TraitAnswer(a2,sn2),
                new class_TraitAnswer(a3,sn3),
                new class_TraitAnswer(a4,sn4));
    }


    public class_Future[] futureArray = {
            // TEST
            new class_Future(0, 1, "Test", null, null, null, null, null, null,
                    new class_FutureQuestion[]{
                            new class_FutureQuestion(0,0, "Test 1?",
                                    new class_TraitAnswer("2?",2),
                                    new class_TraitAnswer("2a?",2),
                                    new class_TraitAnswer("3?",3),
                                    new class_TraitAnswer("3a?",3)),
                            new class_FutureQuestion(0,2, null, null, "Test 2?",
                                    new class_TraitAnswer("4?",4),
                                    new class_TraitAnswer("4a?",4),
                                    new class_TraitAnswer("5?",5),
                                    new class_TraitAnswer("5a?",5)),
                            new class_FutureQuestion(0,3, null, null, "Test 2?",
                                    new class_TraitAnswer("4?",4),
                                    new class_TraitAnswer("4a?",4),
                                    new class_TraitAnswer("5?",5),
                                    new class_TraitAnswer("5a?",5)),
                            new class_FutureQuestion(0,4, null, null, "Test 3?",
                                    new class_TraitAnswer("6?",6),
                                    new class_TraitAnswer("6a?",6),
                                    new class_TraitAnswer("6?",6),
                                    new class_TraitAnswer("6a?",6)),
                            new class_FutureQuestion(0,5, null, null, "Test 3?",
                                    new class_TraitAnswer("6?",6),
                                    new class_TraitAnswer("6a?",6),
                                    new class_TraitAnswer("6?",6),
                                    new class_TraitAnswer("6a?",6)),
                            new class_FutureQuestion(0,6, null, null, "Test 3?",
                                    new class_TraitAnswer("You Have Passed The Test!",363),
                                    new class_TraitAnswer("You Have Passed The Test!",363),
                                    new class_TraitAnswer("You Have Passed The Test!",363),
                                    new class_TraitAnswer("6b?",363)),
                    }),
            // FIREFIGHTER
            new class_Future(0, 2, "Firefighter", future_trait_array(tdev,-2, tcour, 2), null, null, null, null, null,
                    new class_FutureQuestion[]{
                            //0
                            make_question(0,0, "AGE 22: You are a Probational Firefighter in your small town's fire station. Starting your third week you are exhausted on the night shift you find downtime away from the crew.",
                            "Sneak in a quick nap", 12,
                            "Study Street Maps",13,
                            "Video Games",14,
                            "Deadlift in the gym",11),

                            //1-1
                            new class_FutureQuestion(0, 11, null, null, "AGE 26: Fires are few and far between in this town, you keep in shape best you can but you wonder what for if there is no action, you must something to pass the time",
                                    new class_TraitAnswer("Basketball",21),
                                    new class_TraitAnswer("Rock Climbing",21),
                                    new class_TraitAnswer("Sudoku",22),
                                    new class_TraitAnswer("Frogger",22)),
                            //1-2
                            new class_FutureQuestion(0,12, null, null, "AGE 26: Fires are few and far between in this little town, your habits so far are in question, but does it really matter in east kansas nowhere",
                                    new class_TraitAnswer("Learn From Older Colleague",21),
                                    new class_TraitAnswer("Break habits on your own",22),
                                    new class_TraitAnswer("Study to be a driver",23),
                                    new class_TraitAnswer("Collect paycheck, rinse, repeat",22)),
                            //1-3
                            new class_FutureQuestion(0, 13, null, null, "AGE 26: Fires are few and far between in this town, you keep in shape best you can but you wonder what for if there is no action, you must something to pass the time",
                                    new class_TraitAnswer("Basketball",24),
                                    new class_TraitAnswer("Rock Climbing",24),
                                    new class_TraitAnswer("Sudoku",23),
                                    new class_TraitAnswer("Frogger",23)),
                            //1-4
                            new class_FutureQuestion(0,14, null, null, "AGE 26: Fires are few and far between in this little town, your habits so far are in question, but does it really matter in east kansas nowhere",
                                    new class_TraitAnswer("Learn From Older Colleague",23),
                                    new class_TraitAnswer("Break habits on your own",22),
                                    new class_TraitAnswer("Study to be a driver",23),
                                    new class_TraitAnswer("Collect paycheck, rinse, repeat",22)),
                            //2-1
                            new class_FutureQuestion(0,21, null, null, "Age 30: You have become a Rescue Firefighter, there is a town emergency. Another elderly man has fallen at the community home in town.",
                                    new class_TraitAnswer("Gently Assist the elderly man",31),
                                    new class_TraitAnswer("Call in the paramedics",31),
                                    new class_TraitAnswer("Sweep him up by his ankles",32),
                                    new class_TraitAnswer("Fireman's carry this sucker",32)),
                            //2-2
                            new class_FutureQuestion(0,22, null, null, "Age 30: I don't know how buy you have become a Rescue Firefighter, there is a town emergency. A boys kite is stuck in the tree",
                                    new class_TraitAnswer("Climb Tree",32),
                                    new class_TraitAnswer("Ladder Time",32),
                                    new class_TraitAnswer("Shoot it down with hose",32),
                                    new class_TraitAnswer("Throw boy up to get it",32)),
                            //2-3
                            new class_FutureQuestion(0,23, null, null, "Age 30: You have earned your right as a Fire Truck Driver. ",
                                    new class_TraitAnswer("Climb Tree",33),
                                    new class_TraitAnswer("Ladder Time",33),
                                    new class_TraitAnswer("Shoot it down with hose",34),
                                    new class_TraitAnswer("Throw boy up to get it",34)),
                            //2-4
                            new class_FutureQuestion(0,24, null, null, "Age 30: You have fooled someone into letting you become a Fire Truck Driver.",
                                    new class_TraitAnswer("Climb Tree",33),
                                    new class_TraitAnswer("Ladder Time",34),
                                    new class_TraitAnswer("Shoot it down with hose",34),
                                    new class_TraitAnswer("Throw boy up to get it",34)),
                            //3-1
                            new class_FutureQuestion(0,31, null, null, "Age 33: A popular cash-for-used-games business has caught fire, your first real fire since becoming a Firefighter in your early 20's. The Rescue team shows up to flames swallowing the front door.",
                                    new class_TraitAnswer("Order Water to the front door",42),
                                    new class_TraitAnswer("Ladder Time",33),
                                    new class_TraitAnswer("Shoot it down with hose",34),
                                    new class_TraitAnswer("Throw boy up to get it",34)),


                    }),


    };

}