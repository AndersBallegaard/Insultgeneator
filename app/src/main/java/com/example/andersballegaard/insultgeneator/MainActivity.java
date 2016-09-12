package com.example.andersballegaard.insultgeneator;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.ListView;
import android.widget.TextView;

import java.io.File;
import java.lang.String;
import java.util.Random;

public class MainActivity extends AppCompatActivity {



    Button btnClickEvent;




    private String[] insults = {
                    "My gran could do better! And she is dead",
                    "you are an fucking idiot sandwich",
                    "I wich you jump in the fucking oven! That would make my life alot easier",
                    "You fucking donkey",
                    "Hey panini head, are you listening to me?",
                    "FUCK OFF! FUCK OFF! FUCK OFF! FUCK OFF! FUCK OFF! FUCK OFF! ",
                    "You can't count to fucking two",
                    "Now fuck off you fat useless sack of fucking yankee doodle shite",
                    "Fuck off will ya",
                    "You deserve a kick in the nuts",
                    "You've now just  confirmed my mind you're not trustworthy. So fuck you",
                    "you look like you're 5 years away from loseing your virginity",
                    "YOU'RE A FUCKING DISGRACE",
                    "Shut up, you'll never be the man your mother is.",
                    "You're a failed abortion whose birth certificate is an apology from the condom factory.",
                    "You must have been born on a highway, because that's where most accidents happen.",
                    "Your family tree is a cactus, because everybody on it is a prick.",
                    "It looks like your face caught on fire and someone tried to put it out with a fork.",
                    "You're so ugly Hello Kitty said goodbye to you.",
                    "You are so ugly that when your mama dropped you off at school she got a fine for littering.",
                    "If you were twice as smart, you'd still be stupid.",
                    "Do you have to leave so soon? I was just about to poison the tea.",
                    "Your so ugly when you popped out the doctor said aww what a treasure and your mom said yeah lets bury it",
                    "Dumbass.",
                    "We all sprang from apes, but you didn't spring far enough.",
                    "I hear when you were a child your mother wanted to hire somebody to take care of you, but the mafia wanted too much.",
                    "fucking retard.",
                    "Out of 100,000 sperm, you were the fastest?",
                    "I would ask how old you are, but I know you can't count that high.",
                    "Is your ass jealous of the amount of shit that just came out of your mouth?",
                    "I'd like to see things from your point of view but I can't seem to get my head that far up my ass.",
                    "Two wrongs don't make a right, take your parents as an example.",
                    "If I wanted to kill myself I'd climb your ego and jump to your IQ.",
                    "So, a thought crossed your mind? Must have been a long and lonely journey.",
                    "You do realize makeup isn't going to fix your stupidity?",
                    "Whats the difference between your girlfriend and a walrus? One has a moustache and smells of fish and the other is a walrus.",
                    "Ordinarily people live and learn. You just live.",
                    "As an outsider, what do you think of the human race?",
                    "It looks like your face caught on fire and someone tried to put it out with a hammer.",
                    "You are so ugly when you looked in the mirror your reflection walked away.",
                    "Do you wanna lose ten pounds of ugly fat? Cut off your head.",
                    "If bullshit could float...you'd be the Admiral of the fleet! ",
                    "I don't think you are stupid. You just have a bad luck when thinking.",
                    "Karma takes too long, I'd rather beat the shit out of you just now.",
                    "If laughter is the best medicine, your face must be curing the world.",
                    "I could eat a bowl of alphabet soup and shit out a smarter statement than that.",
                    "You're the reason they invented double doors!",
                    "There's only one problem with your face, I can see it.",
                    "I don't exactly hate you, but if you were on fire and I had water, I'd drink it.",
                    "I have neither the time nor the crayons to explain this to you.",
                    "It's better to let someone think you are an Idiot than to open your mouth and prove it.",
                    "Somewhere out there is a tree, tirelessly producing oxygen so you can breathe. I think you owe it an apology. ",
                    "The only way you'll ever get laid is if you crawl up a chicken's ass and wait.",
                    "Roses are red violets are blue, God made me pretty, what happened to you?",
                    "I'd slap you, but shit stains.",
                    "What are you going to do for a face when the baboon wants his butt back?",
                    "If you really want to know about mistakes, you should ask your parents.",
                    "How many times do I have to flush to get rid of you?",
                    "You have two brains cells, one is lost and the other is out looking for it.",
                    "I may love to shop but I'm not buying your bullshit.",
                    "You're so fat the only letters of the alphabet you know are KFC.",
                    "If I gave you a penny for your thoughts, I'd get change.",
                    "You're the reason the gene pool needs a lifeguard.",
                    "Well I could agree with you, but then we'd both be wrong.",
                    "Do you know how long it takes for your mother to take a crap? Nine months.",
                    "Oh my God, look at you. Was anyone else hurt in the accident?",
                    "You're not funny, but your life, now that's a joke.",
                    "Don't feel sad, don't feel blue, Frankenstein was ugly too.",
                    "What are you doing here? Did someone leave your cage open?",
                    "The last time I saw a face like yours I fed it a banana.",
                    "Do you still love nature, despite what it did to you?",
                    "You are proof that God has a sense of humor.",
                    "I'd like to kick you in the teeth, but that would be an improvement!",
                    "You're so fat, you could sell shade.",
                    "I'll never forget the first time we met, although I'll keep trying.",
                    "Why don't you check eBay and see if they have a life for sale.",
                    "You're so ugly, when you got robbed, the robbers made you wear their masks.",
                    "You're so ugly, the only dates you get are on a calendar. ",
                    "You're so fat you need cheat codes to play Wii Fit",
                    "If you spoke your mind, you'd be speechless.",
                    "You didn't fall out of the stupid tree. You were dragged through dumbass forest.",
                    "You're as useless as a knitted condom.",
                    "You're so ugly, you scared the crap out of the toilet.",
                    "So you've changed your mind, does this one work any better?",
                    "Shock me, say something intelligent.",
                    "You look like something I'd draw with my left hand.",
                    "If I wanted to hear from an asshole, I'd fart.",
                    "It's kinda sad watching you attempt to fit your entire vocabulary into a sentence.",
                    "You're as bright as a black hole, and twice as dense.",
                    "If your brain was made of chocolate, it wouldn't fill an M&M.",
                    "You are proof that evolution CAN go in reverse.",
                    "you bloody wanker",
                    "Fucking bellend",
                    "Fucking cunt",
                    "You're so ugly, you scared the crap out of the toilet.",
                    "I fart to make you smell better.",
                    "I thought you were attractive, but then you opened your mouth.",
                    "Learn from your parents' mistakes - use birth control!",
                    "You're a person of rare intelligence. It's rare when you show any.",
                    "I love what you've done with your hair. How do you get it to come out of the nostrils like that?",
                    "Your parents hated you so much your bath toys were an iron and a toaster",
                    "You're so fat, when you wear a yellow rain coat people scream ''taxi''.",
            };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tw = (TextView)findViewById(R.id.insult_lab);
        tw.setText("");
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int idx = new Random().nextInt(insults.length);
                String random = (insults[idx]);
                TextView tw = (TextView)findViewById(R.id.insult_lab);
                tw.setText(random);
            }
        });


        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sf();
            }
        });

        ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.activity_listview,insults);
        ListView listView = (ListView) findViewById(R.id.listView2);
        listView.setAdapter(adapter);
    }

public void sf(){
    MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.sf);
    mp.start();
}


}
