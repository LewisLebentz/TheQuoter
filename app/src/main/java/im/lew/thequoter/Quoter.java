package im.lew.thequoter;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.ArrayList;


public class Quoter extends Activity {

    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quoter);

        RelativeLayout touch = (RelativeLayout) findViewById(R.id.touch);
        final TextView quoteText = (TextView) findViewById(R.id.quote);
        final TextView personText = (TextView) findViewById(R.id.person);

        final ArrayList<Quote> quoteList = new ArrayList<>();

        Quote quote1 = new Quote("You're more of a fun vampire. You don't suck blood, you just suck.", "Troy Barnes");
        quoteList.add(quote1);

        Quote quote2 = new Quote("Cool Beans", "Rod Kimble");
        quoteList.add(quote2);

        Quote quote3 = new Quote("How can mirrors be real if our eyes aren't real", "Jaden Smith");
        quoteList.add(quote3);

        Quote quote4 = new Quote("That's like me blaming owls for how bad I suck at analogies.", "Britta Perry");
        quoteList.add(quote4);

        Quote quote5 = new Quote("I was gonna be the first person in my family to graduate from community college. Everyone else graduated from normal college", "Troy Barnes");
        quoteList.add(quote5);

        Quote quote6 = new Quote("This is my first proper app!", "Lewis Lebentz");
        quoteList.add(quote6);
        
        Quote quote7 = new Quote("I am now testing GitHub integration in Android Studio", "Lewis Lebentz");
        quoteList.add(quote7);

        Quote quote8 = new Quote("Testing author settings", "Lewis Lebentz");
        quoteList.add(quote8);
        
        Quote quote8 = new Quote("Test again", "Lewis Lebentz");
        quoteList.add(quote8);

        //Add more quotes here


        touch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (count < quoteList.size()) {

                    Quote q = quoteList.get(count);

                    quoteText.setText(q.getQuote());

                    personText.setText(q.getPerson());

                    count = count + 1;


                } else{

                    count = 0;

                }




            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_quoter, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
