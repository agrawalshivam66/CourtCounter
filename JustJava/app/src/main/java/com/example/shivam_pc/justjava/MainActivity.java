package com.example.shivam_pc.justjava;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.shivam_pc.justjava.R.id.price_text_view;
import static com.example.shivam_pc.justjava.R.id.quantity_text_view;

public class MainActivity extends AppCompatActivity {
int n=1,p=5;
    String name,ordersummary,wc,cc;
    boolean whippedhaschecked;
    boolean choclatehaschecked;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void increment(View view) {
        if(n<99) {
            n++;
        }
        display((n));
        }
    public void decrement(View view) {
        if(n>0) {
            n--;
        }
        display((n));
    }
    /**
     * This method is called when the order button is clicked.
     */

    public void submitOrder(View view) {
        EditText txtname = (EditText)findViewById(R.id.nametext);
       name=  txtname.getText().toString();
    CheckBox whippedcream=(CheckBox) findViewById(R.id.whippedcheckBox);
       whippedhaschecked = whippedcream.isChecked();


        CheckBox choclatecream=(CheckBox) findViewById(R.id.choclatecheckBox);
        choclatehaschecked = choclatecream.isChecked();
        if(choclatehaschecked==true&&whippedhaschecked==false)
        {
            p=7;
            cc="yes";
            wc="no";
        }

        else if(whippedhaschecked==true&&choclatehaschecked==false)
        {
            p=6;
            cc="no";
            wc="yes";
        }
else if(whippedhaschecked==true&&choclatehaschecked==true)
{
    p=8;
    cc="yes";
    wc="yes";
}
else{
            p=5;
            cc="no";
            wc="no";
        }
        ordersummary="Order Summary \nName- "+name+ "\nAdd Whipped Cream? "+wc+"\nAdd Choclate Cream? "+cc+"\nQuantity = "+n + "\nTotal= Rs."+ (n*p) + "\nThank you";


        displayprice(n*p);

            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, "justjava order for "+name);
        intent.putExtra(Intent.EXTRA_TEXT,ordersummary );
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }
        }

    public int calculateprice()
    {

        return (n*p);
    }

    /**
     * This method displays the given text on the screen.
     */

        /**
         * This method displays the given quantity value on the screen.
         */
        public void displayprice(int number) {
            TextView price = (TextView) findViewById(
                    price_text_view);

            price.setText("Rs." + number);
        }

   public void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                quantity_text_view);

        quantityTextView.setText("" + number);
    }


    }





