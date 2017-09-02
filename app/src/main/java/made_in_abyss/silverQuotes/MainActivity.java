package made_in_abyss.silverQuotes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView txtView;

    Random ran = new Random();

    String arr[] = {

            "Mistakes are the portals of discovery.",

            "I set out on a journey of love, seeking truth, peace and understanding. I am still learning.",

            "People can do whatever they want if they just set their heart to it," +
                    " and just never give up, and just go out there and do it.",

            "For me, I am driven by two main philosophies: know more today" +
                    " about the world than I knew yesterday and lessen the" +
                    " suffering of others. You'd be surprised how far that gets you.",

            "I do believe something magical can happen when you read a good book.",

            "It's not that I'm so smart, it's just that I stay with problems longer.",

            "Success is the sum of small efforts, repeated day in and day out.",

            "I am always doing that which I cannot do, in order that I may learn how to do it.",

            "Tell me and I forget. Teach me and I remember. Involve me and I learn.",

            "Great achievement is usually born of great sacrifice, and is never the result of selfishness.",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btn);
        txtView = (TextView) findViewById(R.id.quote);
        txtView.setText(arr[0]);


    }

    public void newQuote(View v){
        int num = ran.nextInt(arr.length);
        txtView.setText("\""+arr[num]+"\"");
    }
}
