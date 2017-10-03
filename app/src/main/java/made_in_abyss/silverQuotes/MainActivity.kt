package made_in_abyss.silverQuotes

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.jetbrains.anko.toast

// Import Random library.
import java.util.Random  

/* 
    This App generate random quotes every time
    you press the "New Quote" button.

    updated : 10/2/2017.

 */

class MainActivity : AppCompatActivity() {

    // new Random object that generate random number.
    var random = Random()

    // array contain all the quotes.
    var arr = arrayOf(

            "Mistakes are the portals of discovery.",

            "I set out on a journey of love, seeking truth, peace and understanding."
            + " I am still learning.",

            "People can do whatever they want if they just set their heart to it,"
            + " and just never give up, and just go out there and do it.",

            "For me, I am driven by two main philosophies: know more today"
            + " about the world than I knew yesterday and lessen the"
            + " suffering of others. You'd be surprised how far that gets you.",

            "I do believe something magical can happen when you read a good book.",

            "It's not that I'm so smart, it's just that I stay with problems longer.",

            "Success is the sum of small efforts, repeated day in and day out.",

            "I am always doing that which I cannot do, in order that I may learn how to do it.",

            "Tell me and I forget. Teach me and I remember. Involve me and I learn.",

            "Great achievement is usually born of great sacrifice, and is never the"
            + " result of selfishness." )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Connecting the UI element with code to use it.
        var btn    =  findViewById(R.id.btn)   as  Button
        var quote  =  findViewById(R.id.quote) as  TextView


        // Saving random number into num variable.
        var num : Int = random.nextInt(arr.size)

        // Displaying a random quote in the beginning (one time use).
        quote.text = "\"${arr[num]}\""


        // when the button clicked generate new quote.
        btn.setOnClickListener {

            // Changing the value of num into new random number.
            num  =  random.nextInt(arr.size)

            // Set the varible quote into new random quote.
            quote.text = "\"${arr[num]}\""

        }

    }

}
