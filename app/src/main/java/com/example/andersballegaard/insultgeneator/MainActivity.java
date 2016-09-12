package com.example.andersballegaard.insultgeneator;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btnClickEvent;
    private String[] insults;

    /* renamed from: com.example.andersballegaard.insultgeneator.MainActivity.1 */
    class C01801 implements OnClickListener {
        C01801() {
        }

        public void onClick(View v) {
            ((TextView) MainActivity.this.findViewById(R.id.insult_lab)).setText(MainActivity.this.insults[new Random().nextInt(MainActivity.this.insults.length)]);
        }
    }

    /* renamed from: com.example.andersballegaard.insultgeneator.MainActivity.2 */
    class C01812 implements OnClickListener {
        C01812() {
        }

        public void onClick(View v) {
            MainActivity.this.sf();
        }
    }

    /* renamed from: com.example.andersballegaard.insultgeneator.MainActivity.3 */
    class C01823 implements OnItemClickListener {
        final /* synthetic */ ListView val$listView;

        C01823(ListView listView) {
            this.val$listView = listView;
        }

        public void onItemClick(AdapterView<?> adapterView, View arg1, int position, long arg3) {
            MainActivity.this.shareIt(this.val$listView.getItemAtPosition(position).toString());
        }
    }

    public MainActivity() {
        String[] strArr = new String[R.styleable.AppCompatTheme_buttonStyle];
        strArr[0] = "My gran could do better! And she is dead";
        strArr[1] = "you are an fucking idiot sandwich";
        strArr[2] = "I wich you jump in the fucking oven! That would make my life alot easier";
        strArr[3] = "You fucking donkey";
        strArr[4] = "Hey panini head, are you listening to me?";
        strArr[5] = "FUCK OFF! FUCK OFF! FUCK OFF! FUCK OFF! FUCK OFF! FUCK OFF! ";
        strArr[6] = "You can't count to fucking two";
        strArr[7] = "Now fuck off you fat useless sack of fucking yankee doodle shite";
        strArr[8] = "Fuck off will ya";
        strArr[9] = "You deserve a kick in the nuts";
        strArr[10] = "You've now just  confirmed my mind you're not trustworthy. So fuck you";
        strArr[11] = "you look like you're 5 years away from loseing your virginity";
        strArr[12] = "YOU'RE A FUCKING DISGRACE";
        strArr[13] = "Shut up, you'll never be the man your mother is.";
        strArr[14] = "You're a failed abortion whose birth certificate is an apology from the condom factory.";
        strArr[15] = "You must have been born on a highway, because that's where most accidents happen.";
        strArr[16] = "Your family tree is a cactus, because everybody on it is a prick.";
        strArr[17] = "It looks like your face caught on fire and someone tried to put it out with a fork.";
        strArr[18] = "You're so ugly Hello Kitty said goodbye to you.";
        strArr[19] = "You are so ugly that when your mama dropped you off at school she got a fine for littering.";
        strArr[20] = "If you were twice as smart, you'd still be stupid.";
        strArr[21] = "Do you have to leave so soon? I was just about to poison the tea.";
        strArr[22] = "Your so ugly when you popped out the doctor said aww what a treasure and your mom said yeah lets bury it";
        strArr[23] = "Dumbass.";
        strArr[24] = "We all sprang from apes, but you didn't spring far enough.";
        strArr[25] = "I hear when you were a child your mother wanted to hire somebody to take care of you, but the mafia wanted too much.";
        strArr[26] = "fucking retard.";
        strArr[27] = "Out of 100,000 sperm, you were the fastest?";
        strArr[28] = "I would ask how old you are, but I know you can't count that high.";
        strArr[29] = "Is your ass jealous of the amount of shit that just came out of your mouth?";
        strArr[30] = "I'd like to see things from your point of view but I can't seem to get my head that far up my ass.";
        strArr[31] = "Two wrongs don't make a right, take your parents as an example.";
        strArr[32] = "If I wanted to kill myself I'd climb your ego and jump to your IQ.";
        strArr[33] = "So, a thought crossed your mind? Must have been a long and lonely journey.";
        strArr[34] = "You do realize makeup isn't going to fix your stupidity?";
        strArr[35] = "Whats the difference between your girlfriend and a walrus? One has a moustache and smells of fish and the other is a walrus.";
        strArr[36] = "Ordinarily people live and learn. You just live.";
        strArr[37] = "As an outsider, what do you think of the human race?";
        strArr[38] = "It looks like your face caught on fire and someone tried to put it out with a hammer.";
        strArr[39] = "You are so ugly when you looked in the mirror your reflection walked away.";
        strArr[40] = "Do you wanna lose ten pounds of ugly fat? Cut off your head.";
        strArr[41] = "If bullshit could float...you'd be the Admiral of the fleet! ";
        strArr[42] = "I don't think you are stupid. You just have a bad luck when thinking.";
        strArr[43] = "Karma takes too long, I'd rather beat the shit out of you just now.";
        strArr[44] = "If laughter is the best medicine, your face must be curing the world.";
        strArr[45] = "I could eat a bowl of alphabet soup and shit out a smarter statement than that.";
        strArr[46] = "You're the reason they invented double doors!";
        strArr[47] = "There's only one problem with your face, I can see it.";
        strArr[48] = "I don't exactly hate you, but if you were on fire and I had water, I'd drink it.";
        strArr[49] = "I have neither the time nor the crayons to explain this to you.";
        strArr[50] = "It's better to let someone think you are an Idiot than to open your mouth and prove it.";
        strArr[51] = "Somewhere out there is a tree, tirelessly producing oxygen so you can breathe. I think you owe it an apology. ";
        strArr[52] = "The only way you'll ever get laid is if you crawl up a chicken's ass and wait.";
        strArr[53] = "Roses are red violets are blue, God made me pretty, what happened to you?";
        strArr[54] = "I'd slap you, but shit stains.";
        strArr[55] = "What are you going to do for a face when the baboon wants his butt back?";
        strArr[56] = "If you really want to know about mistakes, you should ask your parents.";
        strArr[57] = "How many times do I have to flush to get rid of you?";
        strArr[58] = "You have two brains cells, one is lost and the other is out looking for it.";
        strArr[59] = "I may love to shop but I'm not buying your bullshit.";
        strArr[60] = "You're so fat the only letters of the alphabet you know are KFC.";
        strArr[61] = "If I gave you a penny for your thoughts, I'd get change.";
        strArr[62] = "You're the reason the gene pool needs a lifeguard.";
        strArr[63] = "Well I could agree with you, but then we'd both be wrong.";
        strArr[64] = "Do you know how long it takes for your mother to take a crap? Nine months.";
        strArr[65] = "Oh my God, look at you. Was anyone else hurt in the accident?";
        strArr[66] = "You're not funny, but your life, now that's a joke.";
        strArr[67] = "Don't feel sad, don't feel blue, Frankenstein was ugly too.";
        strArr[68] = "What are you doing here? Did someone leave your cage open?";
        strArr[69] = "The last time I saw a face like yours I fed it a banana.";
        strArr[70] = "Do you still love nature, despite what it did to you?";
        strArr[71] = "You are proof that God has a sense of humor.";
        strArr[72] = "I'd like to kick you in the teeth, but that would be an improvement!";
        strArr[73] = "You're so fat, you could sell shade.";
        strArr[74] = "I'll never forget the first time we met, although I'll keep trying.";
        strArr[75] = "Why don't you check eBay and see if they have a life for sale.";
        strArr[76] = "You're so ugly, when you got robbed, the robbers made you wear their masks.";
        strArr[77] = "You're so ugly, the only dates you get are on a calendar. ";
        strArr[78] = "You're so fat you need cheat codes to play Wii Fit";
        strArr[79] = "If you spoke your mind, you'd be speechless.";
        strArr[80] = "You didn't fall out of the stupid tree. You were dragged through dumbass forest.";
        strArr[81] = "You're as useless as a knitted condom.";
        strArr[82] = "You're so ugly, you scared the crap out of the toilet.";
        strArr[83] = "So you've changed your mind, does this one work any better?";
        strArr[84] = "Shock me, say something intelligent.";
        strArr[85] = "You look like something I'd draw with my left hand.";
        strArr[86] = "If I wanted to hear from an asshole, I'd fart.";
        strArr[87] = "It's kinda sad watching you attempt to fit your entire vocabulary into a sentence.";
        strArr[88] = "You're as bright as a black hole, and twice as dense.";
        strArr[89] = "If your brain was made of chocolate, it wouldn't fill an M&M.";
        strArr[90] = "You are proof that evolution CAN go in reverse.";
        strArr[91] = "you bloody wanker";
        strArr[92] = "Fucking bellend";
        strArr[93] = "Fucking cunt";
        strArr[94] = "You're so ugly, you scared the crap out of the toilet.";
        strArr[95] = "I fart to make you smell better.";
        strArr[96] = "I thought you were attractive, but then you opened your mouth.";
        strArr[97] = "Learn from your parents' mistakes - use birth control!";
        strArr[98] = "You're a person of rare intelligence. It's rare when you show any.";
        strArr[99] = "I love what you've done with your hair. How do you get it to come out of the nostrils like that?";
        strArr[100] = "Your parents hated you so much your bath toys were an iron and a toaster";
        strArr[R.styleable.AppCompatTheme_autoCompleteTextViewStyle] = "You're so fat, when you wear a yellow rain coat people scream ''taxi''.";
        this.insults = strArr;
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main);
        ((TextView) findViewById(R.id.insult_lab)).setText(BuildConfig.FLAVOR);
        ((Button) findViewById(R.id.button)).setOnClickListener(new C01801());
        ((Button) findViewById(R.id.button2)).setOnClickListener(new C01812());
        ListView listView = (ListView) findViewById(R.id.listView2);
        listView.setAdapter(new ArrayAdapter(this, R.layout.activity_listview, this.insults));
        listView.setOnItemClickListener(new C01823(listView));
    }

    public void sf() {
        if (new Random().nextInt(20) == 7) {
            MediaPlayer.create(getApplicationContext(), R.raw.screaming_goat).start();
        } else {
            MediaPlayer.create(getApplicationContext(), R.raw.sf).start();
        }
    }

    private void shareIt(String text) {
        Intent sharingIntent = new Intent("android.intent.action.SEND");
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra("android.intent.extra.SUBJECT", "here is an insult for you");
        sharingIntent.putExtra("android.intent.extra.TEXT", text);
        startActivity(Intent.createChooser(sharingIntent, "Share via"));
    }
}
