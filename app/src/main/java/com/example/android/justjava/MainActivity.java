/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/

package com.example.android.justjava;



import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    private int abc;
    private int numberToAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        abc++;
        display(abc);
    }


    public void reset(View view) {
        abc=0;
        display(abc);
        String priceMessage="free";
        displayMessage(priceMessage);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    private void display2(int number) {
        TextView quantityTextView2 = (TextView) findViewById(R.id.number_to_add);
        quantityTextView2.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }

    //number_to_add

    public void add1(View view) {
        numberToAdd=(numberToAdd*10)+1;
        display2(numberToAdd);
    }


    public void add2(View view) {
        numberToAdd=(numberToAdd*10)+2;
        display2(numberToAdd);
    }
    public void add3(View view) {
        numberToAdd=(numberToAdd*10)+3;
        display2(numberToAdd);
    }

    public void add4(View view) {
        numberToAdd=(numberToAdd*10)+4;
        display2(numberToAdd);
    }

    public void add5(View view) {
        numberToAdd=(numberToAdd*10)+5;
        display2(numberToAdd);
    }

    public void add6(View view) {
        numberToAdd=(numberToAdd*10)+6;
        display2(numberToAdd);
    }

    public void add7(View view) {
        numberToAdd=(numberToAdd*10)+7;
        display2(numberToAdd);
    }

    public void add8(View view) {
        numberToAdd=(numberToAdd*10)+8;
        display2(numberToAdd);
    }

    public void add9(View view) {
        numberToAdd=(numberToAdd*10)+9;
        display2(numberToAdd);
    }


    public void add0(View view) {
        numberToAdd=(numberToAdd*10);
        display2(numberToAdd);
    }

    public void addIt(View view) {
        abc+=numberToAdd;
        numberToAdd=0;
        display2(numberToAdd);
        display(abc);
    }

}
