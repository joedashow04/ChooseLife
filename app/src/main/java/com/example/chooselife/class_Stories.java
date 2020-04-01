package com.example.chooselife;

public class class_Stories {
    private static String tint = "intelligence";
    public static String tluck = "luck";
    public static String tcour = "courage";
    public static String tchar = "charisma";
    public static String tmor = "morality";
    public static String tbiz = "bizarre";
    public static String tath = "athleticism";

    public String[] str_arr(String s1, String s2) {
        String[] str_arr = {s1, s2};
        return str_arr;
    }

    public String[] str_arr(String s1) {
        String[] str_arr = {s1};
        return str_arr;
    }

    class_Trait[] future_trait_array(String t1, int val1) {
        return new class_Trait[]{new class_Trait(t1, val1)};
    }

    class_Trait[] future_trait_array(String t1, int val1, String t2, int val2) {
        return new class_Trait[]{new class_Trait(t1, val1), new class_Trait(t2, val2)};
    }

    public class_Future[] get_futureArray() {
        // Test - Done
        class_Future[] future_array = {
            new class_Future(88, "Test", null, null, null, null, null,
                new class_FutureQuestion[]{
                    new class_FutureQuestion(0, 0, null, null, "Test 1?",
                        new class_TraitAnswer("2?", 2),
                        new class_TraitAnswer("2a?", 2),
                        new class_TraitAnswer("3?", 3),
                        new class_TraitAnswer("3a?", 3)),
                    new class_FutureQuestion(0, 2, null, null, "Test 2?",
                        new class_TraitAnswer("4?", 4),
                        new class_TraitAnswer("4a?", 4),
                        new class_TraitAnswer("5?", 5),
                        new class_TraitAnswer("5a?", 5)),
                    new class_FutureQuestion(0, 3, null, null, "Test 2?",
                        new class_TraitAnswer("4?", 4),
                        new class_TraitAnswer("4a?", 4),
                        new class_TraitAnswer("5?", 5),
                        new class_TraitAnswer("5a?", 5)),
                    new class_FutureQuestion(0, 4, null, null, "Test 3?",
                        new class_TraitAnswer("6?", 6),
                        new class_TraitAnswer("6a?", 6),
                        new class_TraitAnswer("6?", 6),
                        new class_TraitAnswer("6a?", 6)),
                    new class_FutureQuestion(0, 5, null, null, "Test 3?",
                        new class_TraitAnswer("6?", 6),
                        new class_TraitAnswer("6a?", 6),
                        null,
                        null),
                    new class_FutureQuestion(0, 6, null, null, "Test 3?",
                        new class_TraitAnswer("You Have Passed The Test!", 999, "Dev Tester1 (Rare)"),
                        new class_TraitAnswer("You Have Passed The Test!", 999, "Dev Tester2 (Rare)"),
                        new class_TraitAnswer("You Have Passed The Test!", 999, "Dev Tester3 (Rare)"),
                        new class_TraitAnswer("tracert 192.168.1.1", 999, "Welcome Neo (Rarest)"))
                }
            ),
            // 1 Archaeologist - Done
            new class_Future(0, "Archaeologist", null, null, str_arr("college"), null, null,
                new class_FutureQuestion[]{
                    new class_FutureQuestion(0, 0, null, null, "Years of study and field work have made you a renowned archaeologist. You have finally tracked down the ancient artifact that you have spent your career searching for \"Piedra de Tigre\".",
                        new class_TraitAnswer("Enter Temple", 1),
                        new class_TraitAnswer("Survey Area", 999, "Archaeologist: Dead on Arrival"),
                        null,
                        new class_TraitAnswer("", 1)),
                    new class_FutureQuestion(0, 1, null, null, "You enter the Temple and arrive at a large circular room with four thin hallways, each containing a deep fear of yours. Which do you take?",
                        new class_TraitAnswer("Path of Insects", 2),
                        new class_TraitAnswer("Path of Darkness", 999, "Another Archaeologist Lost"),
                        new class_TraitAnswer("Path of Spikes", 3),
                        new class_TraitAnswer("Patch of Snakes", 2)),
                    new class_FutureQuestion(0, 2, null, null, "You enter the dim lit hallway carefully placing every step not to disturb the creatures around you. With only feet left something falls on your back with a large thud. You are panicked.",
                        new class_TraitAnswer("Sprint out", 4),
                        new class_TraitAnswer("Brush it off", 999, "Another Archaeologist Lost"),
                        null,
                        null),
                    new class_FutureQuestion(0, 3, null, null, "You enter the path of spikes carefully moving your body around each point, you arrive at the middle point where a large wooden lever is placed.",
                        new class_TraitAnswer("Leave it", 4),
                        new class_TraitAnswer("Pull it", 999, "Archaeologist Skewered"),
                        null,
                        null),
                    new class_FutureQuestion(0, 4, null, null, "Bursting out of the hallway you struggle to catch your breath, bent over you look up and see it, \"Piedra de Tigre\" sitting on a stone pedestal.",
                        new class_TraitAnswer("Leave it, too dangerous", 5),
                        new class_TraitAnswer("Remove it and Place Stone", 999, "Archaeologist seen too many movies"),
                        new class_TraitAnswer("Grab and Run", 6),
                        new class_TraitAnswer("Careful Grab", 999, "Archaeologist Died Carefully")),
                    new class_FutureQuestion(0, 5, null, null, "Moving past the pedestal slowly you are careful not to disturb the artifact. Stepping to the side you loose balance and fall. For a moment, nothing. Then the wall buckles and the roof begins to collapse.",
                        new class_TraitAnswer("Leap to Safety", 8),
                        new class_TraitAnswer("Slide to Safety", 8),
                        null,
                        null),
                    new class_FutureQuestion(0, 6, null, null, "You grab the relic and make a run for it, the pedestal falls over with a crash you look back to see that the walls and roof are caving in.",
                        new class_TraitAnswer("Leap to Safety", 999, "Archaeologist Crushed"),
                        new class_TraitAnswer("Slide to Safety", 7),
                        null,
                        null),
                    new class_FutureQuestion(0, 7, null, null, "Dust fills the air, you stumble forward barely able to see through it. A beam of light shines through and you can see an exit just on the other side of a long hallway with the floor tiles cut into different shapes. What shapes shall you choose to step on?",
                        new class_TraitAnswer("Circle", 999, "Archaeologist Died in the End"),
                        new class_TraitAnswer("Square", 999, "Archaeologist Died in the End"),
                        new class_TraitAnswer("Diamond", 999, "Esteemed Archaeologist: Success (Rare)"),
                        new class_TraitAnswer("Triangle", 999, "Archaeologist Died in the End")),
                    new class_FutureQuestion(0, 8, null, null, "Dust fills the air, you stumble forward barely able to see through it. A beam of light shines through and you can see an exit just on the other side of a long hallway with the floor tiles cut into different shapes. What shapes shall you choose to step on?",
                        new class_TraitAnswer("Circle", 999, "Archaeologist Died in the End"),
                        new class_TraitAnswer("Square", 999, "Archaeologist Died in the End"),
                        new class_TraitAnswer("Diamond", 999, "Archaeologist Survived (Rare)"),
                        new class_TraitAnswer("Triangle", 999, "Archaeologist Died in the End")),
                }
            ),
            // 2 Police
            new class_Future(0, "Police", null, null, str_arr("work", "trade"), null, null,
                new class_FutureQuestion[]{
                    new class_FutureQuestion(0, 0, null, null, "",
                        new class_TraitAnswer("Turn Back", 2),
                        new class_TraitAnswer("", 2),
                        new class_TraitAnswer("", 3),
                        new class_TraitAnswer("", 3)),
                }
            ),

            // 3 Criminal
            new class_Future(0, "Criminal", null, null, null, null, "yes",
                new class_FutureQuestion[]{
                    new class_FutureQuestion(0, 0, null, null, "You live a life of crime and you're good at it or maybe you're lucky. Either way you are leaving your apartment for the day, what do you grab?",
                        new class_TraitAnswer("Turn Back", 2),
                        new class_TraitAnswer("", 2),
                        new class_TraitAnswer("", 3),
                        new class_TraitAnswer("", 3)),
                }
            ),

            // 4 Boxer
            new class_Future(0, "Professional Boxer", future_trait_array(tath, 3), null, null, null, null,
                new class_FutureQuestion[]{
                    new class_FutureQuestion(0, 0, null, null, "Aging and punched out you find yourself in the middle of a boxing match competing against a much younger and better opponent. You are dead tired at the start of the 3rd round but you may have an opening to finish.",
                        new class_TraitAnswer("Save Energy", 1),
                        new class_TraitAnswer("Final Burst", 999, "Boxer: Down in the Third"),
                        null,
                        new class_TraitAnswer("", 3)),
                    new class_FutureQuestion(0, 1, null, null, "You manage to gain some energy back and notice your opponent dropping their guard after jabbing twice. If you time the right combo it will land big.",
                        new class_TraitAnswer("Jab, Jab, Hook", 2),
                        new class_TraitAnswer("Jab, Hook, Jab", 2),
                        new class_TraitAnswer("Hook, Uppercut, Jab", 3),
                        new class_TraitAnswer("Uppercut, Uppercut", 4)),
                    new class_FutureQuestion(0, 1, null, null, "You manage to gain some energy back and notice your opponent dropping their guard after jabbing twice. If you time the right combo it will land big.",
                        new class_TraitAnswer("Jab, Jab, Hook", 2),
                        new class_TraitAnswer("Jab, Hook, Jab", 2),
                        new class_TraitAnswer("Hook, Uppercut, Jab", 3),
                        new class_TraitAnswer("Uppercut, Uppercut", 4)),
                    new class_FutureQuestion(0, 1, null, null, "You manage to gain some energy back and notice your opponent dropping their guard after jabbing twice. If you time the right combo it will land big.",
                        new class_TraitAnswer("Jab, Jab, Hook", 2),
                        new class_TraitAnswer("Jab, Hook, Jab", 2),
                        new class_TraitAnswer("Hook, Uppercut, Jab", 3),
                        new class_TraitAnswer("Uppercut, Uppercut", 4)),
                }
            ),

            // 5 Plumber - Done
            new class_Future(0, "Plumber", null, null, str_arr("trade"), null, null,
                new class_FutureQuestion[]{
                    new class_FutureQuestion(0, 0, null, null, "Portrait of a man hard at work, your hands move quickly and effortlessly due to years of service, age 51 and after 4 hours of labor at a previous house you are exhausted.",
                        new class_TraitAnswer("Rest your head on the sink cabinet", 2),
                        new class_TraitAnswer("Work but shut your eyes", 2),
                        new class_TraitAnswer("Work through it", 4),
                        new class_TraitAnswer("Shake your head to wake up", 4)),
                    new class_FutureQuestion(0, 2, null, null, "The client walks in  just as you do and yells \"Wow, really?! Wake up you're fired!",
                        new class_TraitAnswer("Apologise, ask for second chance", 999, "Polite Plumber"),
                        new class_TraitAnswer("Insult client", 999, "Plumber Justice"),
                        new class_TraitAnswer("Tell them you understand", 999, "Polite Plumber"),
                        new class_TraitAnswer("Lie and say you understand", 3)),
                    new class_FutureQuestion(0, 3, null, null, "You pack up your tools slowly looking around the bathroom, plotting your revenge.",
                        new class_TraitAnswer("Clog Drain", 999, "Plumber Justice"),
                        new class_TraitAnswer("Break the Flush valve", 999, "Plumber Justice"),
                        new class_TraitAnswer("Connect the electrical outlet to the pipe under the sink", 999, "Plumber in Jail"),
                        new class_TraitAnswer("Steal fancy towels", 999, "Plumber and a Thief (Rare)")),
                    new class_FutureQuestion(0, 4, null, null, "As you work through exhaustion the client returns time and again calling you the wrong name and reminding you not to steal something.",
                        new class_TraitAnswer("Ask for water", 5),
                        new class_TraitAnswer("Insult client", 6),
                        new class_TraitAnswer("Ask for privacy", 5),
                        new class_TraitAnswer("Continue work", 7)),
                    new class_FutureQuestion(0, 5, null, null, "The client spits on the bathroom floor, yelling \"This is my house. I do not answer to you.\"",
                        new class_TraitAnswer("Smack client and leave", 999, "Plumber Justice"),
                        new class_TraitAnswer("Stand and leave", 999, "Polite Plumber"),
                        //TODO: Make a boxing future have this as option to win
                        new class_TraitAnswer("Left uppercut, right hook", 999, "Plumber KO (Rare)"),
                        new class_TraitAnswer("Continue work", 7)),
                    new class_FutureQuestion(0, 6, null, null, "You tell the client not to worry. \"I only steal from nice houses\". Wink. The client kicks your toolbox over spilling your tools to the ground.",
                        new class_TraitAnswer("Quit in Spite", 3),
                        new class_TraitAnswer("Quit in Peace", 999, "Polite Plumber"),
                        new class_TraitAnswer("Break sink tile", 999, "Plumber Justice"),
                        new class_TraitAnswer("Continue work", 7)),
                    new class_FutureQuestion(0, 7, null, null, "After working into overtime, you free the blockage and have finished your work. As your packing up the client accuses you of breaking a tile above the sink",
                        new class_TraitAnswer("Insist you didn't and leave.", 999, "Plumber with a bad review (Rare)"),
                        new class_TraitAnswer("Double charge client", 999, "Plumber Justice"),
                        new class_TraitAnswer("Calmly explain you did not", 999, "Polite Plumber"),
                        new class_TraitAnswer("Attack and kidnap client", 999, "Plumber in Jail"))
                }
            ),

            // 6 Homeless - Done
            new class_Future(0, "Homeless", null, null, str_arr("nothing"), null, null,
                new class_FutureQuestion[]{
                    new class_FutureQuestion(0, "You are homeless and alone. Though your luck is down you are healthy and today feels good.",
                        new class_TraitAnswer("Get Motivated", 2),
                        new class_TraitAnswer("Stay in bed.", 1),
                        null,
                        null),
                    //  Stay in Bed - Taffy
                    new class_FutureQuestion(1, 84, "You awake to a man dressed in orange standing over you, he offers to reward you with his taffy empire if you can pass his test.",
                        new class_TraitAnswer("Take the test", 301),
                        new class_TraitAnswer("Stay in bed", 999, "Homeless ticket refused (Rare)"),
                        null,
                        null),
                    new class_FutureQuestion(301, "The workshop that he takes you in has lots to offer but be careful danger is present in every corner. What will you choose?",
                        new class_TraitAnswer("Grapefruit Gum", 999, "Homeless: Taffy Failure"),
                        new class_TraitAnswer("Taffy Waterfall", 999, "Homeless: Taffy Failure"),
                        new class_TraitAnswer("Weightless Rootbeer", 999, "Homeless: Candy Emperor (Rarest)"),
                        new class_TraitAnswer("Pet Rabbits", 999, "Homeless: Taffy Failure")),
                    // Stay in Bed
                    new class_FutureQuestion(1, "A person in an orange sweater wakes you and tells you that you need to move.",
                        new class_TraitAnswer("Move", 101),
                        new class_TraitAnswer("Sleep", 999, "Homeless: Ouch", "You go back to sleep ignoring the orange wizard. A few hours later an iron bar falls from the highway above you and lands on you ending your future."),
                        null,
                        null),
                    new class_FutureQuestion(101, "You move only a few feet and return to sleep. A few hours later an iron bar falls from the highway above you and lands on your knee.",
                        new class_TraitAnswer("Go to Hospital", 102),
                        new class_TraitAnswer("Sleep it off", 103),
                        null,
                        null),
                    new class_FutureQuestion(102, "The hospital wraps your knee and kicks you out. You will need time to heal before you can get around normally. What is your long term goal?",
                        new class_TraitAnswer("Heal and Recirculate", 0),
                        new class_TraitAnswer("Sleep, Sleep, Sleep", 999, "Homeless End of Circle"),
                        null,
                        null),
                    new class_FutureQuestion(103, "You move another few feet in pain and fall back asleep. You awake, uncertain of your future you make a long term goal.",
                        new class_TraitAnswer("Heal and Recirculate", 0),
                        new class_TraitAnswer("Sleep, Heal, Move", 999, "Homeless: Sleep and Move"),
                        null,
                        null),
                    // Motivated
                    new class_FutureQuestion(2, "It is a good start to your day as you find a 5 dollar bill on your way to the bus. But where to spend it?",
                        new class_TraitAnswer("Wardrobe", 201),
                        new class_TraitAnswer("Haircut/Shave", 201),
                        new class_TraitAnswer("Cigarettes", 999, "Homeless End of Circle"),
                        new class_TraitAnswer("Food", 201)),
                    new class_FutureQuestion(201, "Now prepared to take on you first challenge. What do you want to pursue?",
                        new class_TraitAnswer("A Job", 202),
                        new class_TraitAnswer("Alcohol. No Beer.", 999, "Homeless End of Circle"),
                        new class_TraitAnswer("Happiness", 0),
                        new class_TraitAnswer("A Loan", 203)),
                    new class_FutureQuestion(202, "You crush your interview and are given a sign spinning job that starts tomorrow. You should get to bed early. How will you get back to your bed?",
                        new class_TraitAnswer("Walk", 204),
                        new class_TraitAnswer("Bus", 204),
                        null,
                        null),
                    new class_FutureQuestion(203, "You were denied the bank loan and instead offered a one time job. Moving filing cabinets down a few floors to their new storage room. You should get to bed early. How will you get back to your bed?",
                        new class_TraitAnswer("Walk", 204),
                        new class_TraitAnswer("Bus", 204),
                        null,
                        null),
                    new class_FutureQuestion(204, "You are almost back to your bed when a two door pickup truck jumps the curb and hits you. The truck speeds away leaving you badly injured. You will not be able to make it to your new job tomorrow. What is your long term goal?",
                        new class_TraitAnswer("Heal and Recirculate", 0),
                        new class_TraitAnswer("Sleep, Heal, Sleep", 999, "Homeless End of Circle"),
                        null,
                        null),
                }
            ),

            // 7 Lawyer
            new class_Future(0, "Lawyer", future_trait_array(tint, 3), null, str_arr("college"), null, null,
                new class_FutureQuestion[]{
                    new class_FutureQuestion(0, "Committed to holding up equality and justice you have worked hard to become a lawyer. Your first assignment: Defend the Guilty or Prosecute the Innocent?",
                        new class_TraitAnswer("Defend the Guilty", 1),
                        new class_TraitAnswer("Prosecute the Innocent", 101),
                        null,
                        null),
                    new class_FutureQuestion(1, "Your job is to Defend the Guilty but what effort will you give?",
                        new class_TraitAnswer("100%", 2),
                        new class_TraitAnswer("enough", 3),
                        null,
                        null),
                    new class_FutureQuestion(2, "Game face on! You are ready to free this fraudulent man of all his guilt.",
                        new class_TraitAnswer("Call Witness", 4),
                        new class_TraitAnswer("Present Evidence", 3),
                        new class_TraitAnswer("Challenge Evidence", 3),
                        new class_TraitAnswer("Cross-examine", 4)),

                    // Success
                    new class_FutureQuestion(3, "Success! You have created doubt in the jury. You have proven that the incriminating shoe could not have belonged to the defendant, as he could not fit it on to his large foot. And he tried, like really hard",
                        new class_TraitAnswer("Closing Argument", 5),
                        new class_TraitAnswer("Call Witness", 5),
                        null,
                        null),
                    // Fail
                    new class_FutureQuestion(4, "Failure. The witness was less than cooperative and eventually cursed your defendant.",
                        new class_TraitAnswer("Closing Arguments", 6),
                        new class_TraitAnswer("Present Evidence", 6),
                        null,
                        null),


                    new class_FutureQuestion(101, "Your job is to Prosecute the Innocent but what effort will you give?",
                        new class_TraitAnswer("100%", 102),
                        new class_TraitAnswer("enough", 103),
                        null,
                        null),
                    new class_FutureQuestion(102, "I love the smell of innocence rotting in jail, it smells like victory!",
                        new class_TraitAnswer("Opening Statement", 103),
                        new class_TraitAnswer("Call Witness", 104),
                        new class_TraitAnswer("Present Evidence", 103),
                        new class_TraitAnswer("Cross-examine", 104)),

                    // Success
                    new class_FutureQuestion(103, "Success! You have created doubt in the jury. You have proven that the incriminating shoe could not have belonged to the defendant, as he could not fit it on to his large foot. And he tried, like really hard",
                        new class_TraitAnswer("Closing Argument", 5),
                        new class_TraitAnswer("Call Witness", 5),
                        null,
                        null),
                    // Fail
                    new class_FutureQuestion(104, "Failure. The witness was less than cooperative and eventually cursed your defendant.",
                        new class_TraitAnswer("Closing Arguments", 6),
                        new class_TraitAnswer("Present Evidence", 6),
                        null,
                        null),

                }
            ),


            // 8 Family Vacation - Done
            new class_Future(0, "Family Vacation", null, "yes", null, "yes", null,
                new class_FutureQuestion[]{
                    new class_FutureQuestion(0, 0, null, null, "You have achieved the pinnacle of success as a parent, you are taking your family to the amusement park Wickey World. Choose your travel style.",
                        new class_TraitAnswer("Fly", 1),
                        new class_TraitAnswer("Drive", 2),
                        null,
                        null),
                    new class_FutureQuestion(0, 1, null, null, "Buying tickets for your flight you can sit with your family, or save $50 and sit alone. Which do you choose?",
                        new class_TraitAnswer("With family", 3),
                        new class_TraitAnswer("Alone", 4),
                        null,
                        null),
                    new class_FutureQuestion(0, 2, null, null, "Choosing the classic road trip to Wickey World the drive will take about 18 hours. You can save money and drive through the night or stop and rest.",
                        new class_TraitAnswer("Drive through", 4),
                        new class_TraitAnswer("Stop and rest", 3),
                        null,
                        null),
                    // Healthy: D1
                    new class_FutureQuestion(0, 3, null, null, "Your choice has \"paid\" off as your family arrives safe and healthy to the resort. You are prepared to take on all that Wickey World has to offer. You start at Adventure Park, what area do you explore?",
                        new class_TraitAnswer("Wild West", 5),
                        new class_TraitAnswer("Dinosaur Island", 5),
                        new class_TraitAnswer("Kiddie Coasters", 7),
                        new class_TraitAnswer("Animal Park", 5)),
                    // Sick: D1
                    new class_FutureQuestion(0, 4, null, null, "Your choice to save money has back-fired, exhausted and now sick your first day at Wickey World is spent inside the hotel sweating and sleeping. How will you remedy your illness?",
                        new class_TraitAnswer("Medicine", 6),
                        new class_TraitAnswer("Rest", 6),
                        new class_TraitAnswer("Internet Remedy", 8),
                        new class_TraitAnswer("Water, lots of it", 6)),

                    // Healthy2Healthy: D2
                    new class_FutureQuestion(0, 5, null, null, "After an exciting day in Adventure Park your family is ready for Day 2: The Water Park. What attraction will you enjoy?",
                        new class_TraitAnswer("PlaySea", 11),
                        new class_TraitAnswer("Sun Bathe", 9),
                        new class_TraitAnswer("Wave Pool", 11),
                        new class_TraitAnswer("Water Slide", 9)),
                    // Sick to Healthy: D2
                    new class_FutureQuestion(0, 6, null, null, "After a long day of fever and pain you are back on your feet. Just in time to join your family at the Water Park. What attraction will you enjoy?",
                        new class_TraitAnswer("Playground", 11),
                        new class_TraitAnswer("Sun Bathe", 14),
                        new class_TraitAnswer("Wave Pool", 11),
                        new class_TraitAnswer("Water Slide", 14)),
                    // Healthy to Sick: D2
                    new class_FutureQuestion(0, 7, null, null, "You have fallen ill. The Kiddie Coaster is a sponge for germs and disease, who would have thought. You will be spending day 2 in bed, how will you recover?",
                        new class_TraitAnswer("Sweat it out", 13),
                        new class_TraitAnswer("Rest", 10),
                        new class_TraitAnswer("Water", 10),
                        new class_TraitAnswer("Internet Remedy 2", 12)),
                    // Sick2Sick: D2
                    new class_FutureQuestion(0, 8, null, null, "Surprisingly the cold shower and coffee remedy you got from the internet has made your condition worse. You are down again for day 2, time to try something different.",
                        new class_TraitAnswer("Sweat it Out", 16),
                        new class_TraitAnswer("Rest", 10),
                        new class_TraitAnswer("Water", 10),
                        new class_TraitAnswer("Internet Remedy 2", 15)),

                    // H-H-H: D3
                    new class_FutureQuestion(0, 9, null, null, "You were ruler of the Water Park with sun bathing and sliding all at your leisure. You are tired but excited for Day 3 in Space Cavern, which amusement ride interest you the most?",
                        new class_TraitAnswer("Milky Way Whirl", 999, "Family Vacation: Home Sick"),
                        new class_TraitAnswer("Comet Coaster", 999, "Best Vacation Ever (Rare)"),
                        new class_TraitAnswer("Solar System Sickness", 999, "Family Vacation: Home Sick"),
                        new class_TraitAnswer("Dark Matter Drop", 999, "Best Vacation Ever (Rare)")),
                    // Sick to Healthy: D3
                    new class_FutureQuestion(0, 10, null, null, "You have made a full recovery and are excited to rejoin the family at Space Cavern. Which amusement ride interest you the most?",
                        new class_TraitAnswer("Milky Way Whirl", 999, "Family Vacation: Sickish"),
                        new class_TraitAnswer("Comet Coaster", 999, "Family Vacation: Sickish"),
                        new class_TraitAnswer("Solar System Sickness", 999, "Family Vacation: Sickish"),
                        new class_TraitAnswer("Dark Matter Drop", 999, "Family Vacation: Sickish")),
                    // H-H-S: D3
                    new class_FutureQuestion(0, 11, null, null, "In a surprise to all the water quality of the Park turned out to be poor, the lack of chlorine and large quantity of urine seemed to react harshly to your body. You are down with a skin rash for Day 3, how will you cope?",
                        new class_TraitAnswer("Aloe", 999, "Family Vacation: Sickish"),
                        new class_TraitAnswer("Vinegar Bath", 999, "Family Vacation: Sick Ending"),
                        new class_TraitAnswer("Scratch Everything", 999, "Family Vacation: Sick Ending"),
                        new class_TraitAnswer("Oatmeal Bath", 999, "Family Vacation: Sickish")),
                    // H2S: D3 - Internet
                    new class_FutureQuestion(0, 12, null, null, "The internet remedy of applying vapor rub and toothpaste to your sternum has failed. Even worse it has left you with a skin rash for Day 3, how will you cope?",
                        new class_TraitAnswer("Aloe", 999, "Family Vacation: Healthy Finish"),
                        new class_TraitAnswer("Vinegar Bath", 999, "Family Vacation: Sickish"),
                        new class_TraitAnswer("Scratch Everything", 999, "Family Vacation: Sickish"),
                        new class_TraitAnswer("Oatmeal Bath", 999, "Family Vacation: Healthy Finish")),
                    // H2S: D3 - Blanket
                    new class_FutureQuestion(0, 13, null, null, "The blanket you grabbed from the hotel closet to warm-up in had bed bugs, but it looked cleaned except for that stain. As a result you have a skin rash for Day 3, how will you cope?",
                        new class_TraitAnswer("Aloe", 999, "Family Vacation: Healthy Finish"),
                        new class_TraitAnswer("Vinegar Bath", 999, "Family Vacation: Sickish"),
                        new class_TraitAnswer("Scratch Everything", 999, "Family Vacation: Sickish"),
                        new class_TraitAnswer("Oatmeal Bath", 999, "Family Vacation: Healthy Finish")),
                    // S2H2H: D3
                    new class_FutureQuestion(0, 14, null, null, "You were ruler of the Water Park with sun bathing and sliding all at your leisure. You are tired but excited for Day 3 in Space Cavern, which amusement ride interest you the most?",
                        new class_TraitAnswer("Milky Way Whirl", 999, "Family Vacation: In and Out"),
                        new class_TraitAnswer("Comet Coaster", 999, "Family Vacation: Healthy Finish"),
                        new class_TraitAnswer("Solar System Sickness", 999, "Family Vacation: In and Out"),
                        new class_TraitAnswer("Dark Matter Drop", 999, "Family Vacation: Healthy Finish")),
                    // S2S2S: D3 - Internet
                    new class_FutureQuestion(0, 15, null, null, "The internet remedy of applying vapor rub and toothpaste to your sternum has failed. Even worse it has left you with a skin rash for Day 3, how will you cope?",
                        new class_TraitAnswer("Aloe", 999, "Family Vacation: Healthy Finish"),
                        new class_TraitAnswer("Vinegar Bath", 999, "Sick Vacation Bro (Rare)"),
                        new class_TraitAnswer("Scratch Everything", 999, "Sick Vacation Bro (Rare)"),
                        new class_TraitAnswer("Oatmeal Bath", 999, "Family Vacation: Healthy Finish")),
                    // S2S2S: D3 - Blanket
                    new class_FutureQuestion(0, 16, null, null, "The blanket you grabbed from the hotel closet to warmup in had bed bugs, but it looked cleaned except for that stain. As a result you have a skin rash for Day 3, how will you cope?",
                        new class_TraitAnswer("Aloe", 999, "Family Vacation: Healthy Finish"),
                        new class_TraitAnswer("Vinegar Bath", 999, "Sick Vacation Bro (Rare)"),
                        new class_TraitAnswer("Scratch Everything", 999, "Sick Vacation Bro (Rare)"),
                        new class_TraitAnswer("Oatmeal Bath", 999, "Family Vacation: Healthy Finish"))
                }

            ),

            // 9 Camp Counselor - Done
            new class_Future(0, "Summer Camp Counselor", future_trait_array(tchar, 2, tmor, 2), null, str_arr("trade", "job"), "0", null,
                new class_FutureQuestion[]{
                    new class_FutureQuestion(0, 0, null, null, "The summer sun is out and the birds are chirping as the summer camp counselors arrive at Camp Clear Spring. The usual cast of characters is abound, which are you?",
                        new class_TraitAnswer("Geek", 1),
                        new class_TraitAnswer("Jock", 1),
                        new class_TraitAnswer("Hippie", 1),
                        new class_TraitAnswer("Local", 1)),

                    new class_FutureQuestion(0, 1, null, null, "Preparing for the children to arrive you have finished your task of arranging your cabin, how will you spend your evening?",
                        new class_TraitAnswer("Swim in the Lake", 4),
                        new class_TraitAnswer("Hike Alone", 3),
                        new class_TraitAnswer("Drink with Peers", 4),
                        new class_TraitAnswer("Sit by Fire", 4)),

                    new class_FutureQuestion(0, 3, null, null, "You are following the hiking trail. As the sun begins to set you hear the snapping of a tree branch just feet from you.",
                        new class_TraitAnswer("Turn to see", 999, "1st Counselor Dead"),
                        new class_TraitAnswer("Hide in bushes", 5),
                        new class_TraitAnswer("Run for it", 999, "1st Counselor Dead"),
                        new class_TraitAnswer("Play Dead", 999, "1st Counselor Dead")),

                    new class_FutureQuestion(0, 4, null, null, "The music is loud and counselors are happy, when a terrible shriek comes from surrounding woods.",
                        new class_TraitAnswer("Walk to Staff Lodge", 5),
                        new class_TraitAnswer("Run to investigate", 999, "2nd Counselor Dead"),
                        new class_TraitAnswer("Run to Staff Lodge", 5),
                        new class_TraitAnswer("Stay put", 999, "2nd Counselor Dead")),

                    new class_FutureQuestion(0, 5, null, null, "You arrive at the Staff Lodge confused and afraid, the other counselors shovel you through the door and lock it behind you. There has been an attack at the camp and you must devise an escape!",
                        new class_TraitAnswer("Phone for help", 6),
                        new class_TraitAnswer("Escape on foot", 999, "Counselor that got everyone killed"),
                        new class_TraitAnswer("Fix the bus", 9),
                        new class_TraitAnswer("Take the row boats", 15)),

                    new class_FutureQuestion(0, 6, null, null, "The best plan is often the easiest, you walk to the kitchen to use the phone. Lifting the phone from the receiver you hear no dial tone, the phone is dead.",
                        new class_TraitAnswer("Investigate Cut Wire", 999, "Curiosity killed the Counselor"),
                        new class_TraitAnswer("Send Kevin to Investigate", 7),
                        new class_TraitAnswer("Send Sara to Investigate", 7),
                        new class_TraitAnswer("Check next cabin's phone", 999, "2nd Counselor Dead")),

                    new class_FutureQuestion(0, 7, null, null, "Waiting...seconds...minutes, suddenly the phone clicks and comes to life. A celebratory moment is had in the lodge as you call for help. Though you notice the counselor you sent has not returned. The cops are on their way, you are almost saved! Creeeeek, you turn to see an open door and The Attacker standing.",
                        new class_TraitAnswer("Help Jess escape", 999, "Counselor Died a Hero"),
                        new class_TraitAnswer("Defend Jim", 999, "Counselor Died a Hero"),
                        new class_TraitAnswer("Run past Jim", 8),
                        new class_TraitAnswer("Push aside Jess", 8)),

                    new class_FutureQuestion(0, 8, null, null, "Straight to your feet and out the back door, you look back and see the J named counselor snatched by The Attacker. A loud crash is heard as you escape through the backyard. Where to now?",
                        new class_TraitAnswer("Swim to safety", 999, "Counselor Drowned"),
                        new class_TraitAnswer("Hide in bush", 999, "Counselor Survived: Phone (Rare)"),
                        new class_TraitAnswer("Run to highway", 999, "Counselor Survived: Phone (Rare)"),
                        new class_TraitAnswer("Hide in next lodge", 999, "Last Counselor Dead")),

                    new class_FutureQuestion(0, 9, null, null, "The bus needs a new battery, located in the garage, and the keys, located in the maintenance cabin, in order to start.",
                        new class_TraitAnswer("Send Kevin for the keys", 10),
                        new class_TraitAnswer("Go for the keys", 12),
                        new class_TraitAnswer("Go for the battery", 11),
                        new class_TraitAnswer("Send Kayla for battery", 10)),

                    new class_FutureQuestion(0, 10, null, null, "Too afraid to go yourself you send your fellow counselor to save the day. Huddled together waiting nervously for help to arrive the door opens and the K letter counselor walks through. Oddly their walk is staggered and then boom. They fall flat and you can see The Attacker's Knife in their back.",
                        new class_TraitAnswer("Run", 999, "3rd Counselor Dead"),
                        new class_TraitAnswer("Fight", 999, "3rd Counselor Dead"),
                        new class_TraitAnswer("Hide", 999, "3rd Counselor Dead"),
                        new class_TraitAnswer("Cry", 999, "3rd Counselor Dead")),

                    new class_FutureQuestion(0, 11, null, null, "You put on a brave face and leave the Staff Cabin. Running quickly to the trail you hear glass breaking and another terrible shriek from the Staff Cabin. Out of breath you retrieve the battery, now where to go?",
                        new class_TraitAnswer("Staff Lodge", 999, "Curiosity killed the Counselor"),
                        new class_TraitAnswer("Go to bus", 13),
                        new class_TraitAnswer("Catch breath", 999, ""),
                        new class_TraitAnswer("Get the Keys", 13)),

                    new class_FutureQuestion(0, 12, null, null, "You put on a brave face and leave the Staff Cabin. Running quickly to the trail you hear glass breaking and another terrible shriek from the Staff Cabin. Out of breath you retrieve the keys, now where to go?",
                        new class_TraitAnswer("Staff Lodge", 999, "Curiosity killed the Counselor"),
                        new class_TraitAnswer("Go to bus", 13),
                        new class_TraitAnswer("Catch breath", 999, "Counselor Dying to Rest (Rare"),
                        new class_TraitAnswer("Get the battery", 13)),

                    new class_FutureQuestion(0, 13, null, null, "Back on the trails and not much is visible but you do here a rustling in the woods as you walk. You increase your pace but so does the rustling, it is getting closer, catching up. Out from the bushes colliding with you comes a counselor holding the missing part.",
                        new class_TraitAnswer("Go to Bus Together", 14),
                        new class_TraitAnswer("Split Up", 999, "Last Counselor Dead"),
                        null,
                        null),

                    new class_FutureQuestion(0, 14, null, null, "At the bus you finish installing the battery, you toss the keys to your coworker at the driver door. Keys floating in the air when...The Attacker swipes the keys with his right hand and then your coworker with his left.",
                        new class_TraitAnswer("Run", 999, "Last Counselor Dead"),
                        new class_TraitAnswer("Grab Coworker", 999, "Counselor Died a Hero"),
                        new class_TraitAnswer("Grab Keys", 999, "Counselor Survived: Bus (Rare)"),
                        new class_TraitAnswer("Hot-wire and go", 999, "Counselor Survived: Bus (Rare)")),

                    new class_FutureQuestion(0, 15, null, null, "You lead everyone to the Boat House, well almost everyone, as you look around you notice that one of the counselors is missing.",
                        new class_TraitAnswer("Tell the group", 16),
                        new class_TraitAnswer("Keep it Secret", 17),
                        null,
                        null),

                    new class_FutureQuestion(0, 16, null, null, "The group begins to panic, you attempt to calm the group when Kyle storms out of the boat house in look for his friend.",
                        new class_TraitAnswer("Run after Kyle", 999, "Screw You Kyle! (Rare)"),
                        new class_TraitAnswer("Send Kelly", 17),
                        new class_TraitAnswer("Calm group", 17),
                        new class_TraitAnswer("Join in Panic", 999, "Counselor that got everyone killed")),

                    new class_FutureQuestion(0, 17, null, null, "Your group is calm and collected, whats left of them, as you plan your escape. The row boats need paddles and the counselors need life vests but time is running out!",
                        new class_TraitAnswer("Take boats as is", 999, "Counselor Died Floating"),
                        new class_TraitAnswer("Search for supplies", 18),
                        null,
                        null),

                    new class_FutureQuestion(0, 18, null, null, "You make a run for the nearest cabin to look for paddles. Just as you open the door you hear a scream coming from the Boat House, you must hurry. After a long period of searching through storage you find the paddles.",
                        new class_TraitAnswer("Return to Boat House", 19),
                        new class_TraitAnswer("Look for vests", 20),
                        null,
                        null),

                    new class_FutureQuestion(0, 20, null, null, "You make a run for the next nearest cabin to look for life vests. Just as you open the door you hear another scream coming from the Dock, you must hurry, where do you search?",
                        new class_TraitAnswer("Closet", 21),
                        new class_TraitAnswer("Shelves", 22),
                        new class_TraitAnswer("Footlocker", 21),
                        new class_TraitAnswer("Restroom", 21)),

                    new class_FutureQuestion(0, 21, null, null, "You search the area but have no luck. Walking away you see the orange straps like that of a life vests sticking out from behind the footlocker.",
                        new class_TraitAnswer("Return to Boat House", 23),
                        new class_TraitAnswer("Sneak to Dock", 999, "Counselor Selfish Survived: Boat (Rare)"),
                        null,
                        null),

                    new class_FutureQuestion(0, 22, null, null, "You search the shelves but find nothing. You think you hear a noise outside of your cabin but you can't be sure.",
                        new class_TraitAnswer("Keep Searching", 26),
                        new class_TraitAnswer("Run to Boat House", 19),
                        null,
                        null),

                    new class_FutureQuestion(0, 23, null, null, "You return to the boat house to find that only two other members are present. How will you fill the boats?",
                        new class_TraitAnswer("All together", 24),
                        new class_TraitAnswer("All separate", 999, "Counselor Survived: Boat"),
                        new class_TraitAnswer("Go alone", 999, "Counselor Survived: Boat"),
                        new class_TraitAnswer("Kenny goes alone", 999, "Counselor Survived: Killed Kenny")),

                    new class_FutureQuestion(0, 24, null, null, "You all pile into the boat and make your way across the lake. Paddling intensely a ripple in the water begins to chase the boat. The Attacker rises from the water capsizing the boat, you all are brought to the surface by your life vest.",
                        new class_TraitAnswer("Swim to Safety", 999, "Counselor Survived: Boat"),
                        new class_TraitAnswer("Help Kenny", 999, "Counselor Survived: Saved Kenny"),
                        new class_TraitAnswer("Get on Boat", 999, "Counselor Died with the Ship (Rare)"),
                        new class_TraitAnswer("Help Both", 999, "Counselor Died a Hero")),

                    // NO LIFE VEST
                    new class_FutureQuestion(0, 19, null, null, "You return to the Boat House to find that only two other members are present. How will you fill the boats?",
                        new class_TraitAnswer("All together", 25),
                        new class_TraitAnswer("All separate", 999, "Counselor Survived: Boat"),
                        new class_TraitAnswer("Go alone", 999, "Counselor Survived: Boat"),
                        new class_TraitAnswer("Kenny goes alone", 999, "Counselor Survived: Killed Kenny")),

                    new class_FutureQuestion(0, 25, null, null, "You all pile into the boat and make your way across the lake. Paddling intensely a ripple in the water begins to chase the boat. The Attacker rises from the water capsizing the boat, you sink to the bottom.",
                        new class_TraitAnswer("Sink", 999, "Last Counselor Dead"),
                        new class_TraitAnswer("Swim", 999, "Last Counselor Dead"),
                        new class_TraitAnswer("Fight", 999, "Last Counselor Dead"),
                        new class_TraitAnswer("Push off Kenny", 999, "Counselor Survived: Killed Kenny")),

                    // Keep Searching
                    new class_FutureQuestion(0, 26, null, null, "You finally find the life vests behind the footlocker. You return to the Boat House to find that only two other members are present. How will you fill the boats?",
                        new class_TraitAnswer("All together", 24),
                        new class_TraitAnswer("All separate", 27),
                        new class_TraitAnswer("Go Alone", 27),
                        new class_TraitAnswer("Kenny goes alone", 999, "Counselor Survived: Killed Kenny")),

                    new class_FutureQuestion(0, 27, null, null, "While taking your time deciding who will take which boat The Attacker storms through the Boat House doors sledgehammer in hand",
                        new class_TraitAnswer("Hurry to Boat", 25),
                        new class_TraitAnswer("Push Attacker", 28),
                        new class_TraitAnswer("Run", 999, "Last Counselor Dead"),
                        new class_TraitAnswer("Grab life vests", 999, "Counselor Died for a Life Preserver")),

                    new class_FutureQuestion(0, 28, null, null, "You push the Attacker causing him to stumble into an assortment of hanging chains and boat anchors.",
                        new class_TraitAnswer("Sweep the Leg", 29),
                        new class_TraitAnswer("Run", 999, "Counselor Survived: Chained Up (Rare)"),
                        null,
                        new class_TraitAnswer("3a?", 3)),

                    new class_FutureQuestion(0, 29, null, null, "You sweep the leg sending The Attacker high into the air and then down bouncing out of the bay door and onto the dock.",
                        new class_TraitAnswer("Slide Kick", 999, "Counselor Survived: Defeat The Attacker", "Sliding across the dock planks your foot connects with The Attackers chest. With a heavy grunt The Attacker skids across then falls off the dock, chains dragging him deeper and deeper into the dark depths of the lake."),
                        new class_TraitAnswer("Celebrate Victory", 999, "Counselor Survived: Missing Attacker", "Turning your back you swing your fist in the air with a triumphant fist pump, when you look back the body is gone"),
                        null,
                        null),
                }),
        };
        return future_array;
    }

} //Class

/*
            // 10 - Doctor
            // On a plane
            // medical mystery

            //  11. UFOlogist

            // Ghost Hunter

            // Researcher

            // FIREFIGHTER
            new class_Future(0, 2, "Firefighter", future_trait_array(tmor, 2, tcour, 2), null, null, null, null, null,
                    new class_FutureQuestion[]{
                            //0
                            new class_FutureQuestion(0,0,  "You are a Probational Firefighter in a small town. Starting your third week you are exhausted working ",
                                    new class_TraitAnswer("Sneak in a quick nap", 12),
                                    new class_TraitAnswer("Study Street Maps",13),
                                    new class_TraitAnswer("Video Games",14),
                                    new class_TraitAnswer("Deadlift in the gym",11)),
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
                            //3-1
                            new class_FutureQuestion(0,31, "Age 33: A popular cash-for-used-games business has caught fire, your first real fire since becoming a Firefighter in your early 20's. The Rescue team shows up to flames swallowing the front door.",
                                    new class_TraitAnswer("Order Water to the front door",42),
                                    new class_TraitAnswer("Ladder Time",33),
                                    new class_TraitAnswer("Shoot it down with hose",34),
                                    new class_TraitAnswer("Throw boy up to get it",34)),


                    }),
*/