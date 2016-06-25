package net.sandi.exercise3.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import net.sandi.exercise3.R;
import net.sandi.exercise3.fragments.Joke2Fragment;
import net.sandi.exercise3.fragments.Joke3Fragment;
import net.sandi.exercise3.fragments.Joke1Fragment;

public class MainActivity extends AppCompatActivity {


    private static String currentFragment ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        Joke1Fragment fragment1 = new Joke1Fragment();
        currentFragment = "fragment1";
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fl_container,fragment1)
                .commit();

        Button btnNext = (Button)findViewById(R.id.btn_next);
        Button btnPrevious = (Button)findViewById(R.id.btn_previous);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(currentFragment.equals("fragment1")){
                    Joke2Fragment fragment2 = new Joke2Fragment();
                    currentFragment = "fragment2";
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.fl_container, fragment2)
                            .commit();

                }
                else if(currentFragment.equals("fragment2")){
                    Joke3Fragment fragment3 = new Joke3Fragment();
                    currentFragment = "fragment3";
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.fl_container, fragment3)
                            .commit();

                }
                else
                {
                    Toast.makeText(getApplicationContext(),"There is no more news",Toast.LENGTH_SHORT).show();
                }


            }
        });
        btnPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(currentFragment.equals("fragment3")){
                    Joke2Fragment fragment2 = new Joke2Fragment();
                    currentFragment = "fragment2";
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.fl_container, fragment2)
                            .commit();

                }
                else if(currentFragment.equals("fragment2")){
                    Joke1Fragment fragment1 = new Joke1Fragment();
                    currentFragment = "fragment1";
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.fl_container, fragment1)
                            .commit();

                }

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
