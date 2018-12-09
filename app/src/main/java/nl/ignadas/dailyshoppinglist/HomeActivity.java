package nl.ignadas.dailyshoppinglist;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.SearchView;
import android.widget.Toast;



public class HomeActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        toolbar= findViewById(R.id.homeToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Shopping List");


        Intent intent = getIntent();
        String string = intent.getStringExtra("message");
    }


    /**
     * Menu
     */

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mainmenu, menu);

        SearchView sv = (SearchView) menu.findItem(R.id.search_shopping_item).getActionView();
        SearchManager sm = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        sv.setSearchableInfo(sm.getSearchableInfo(getComponentName()));
        sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                Toast.makeText(getApplicationContext(), query, Toast.LENGTH_LONG).show();
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {

            case R.id.home:
                Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.add:
                //showHelp();
                Toast.makeText(this, "Add", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.search_shopping_item:
                //newGame();
                Toast.makeText(this, "Search Shopping Item", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.barcode:
                //newGame();
                Toast.makeText(this, "Barcode Scanner", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.settings:
                //newGame();
                Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.faq:
                //newGame();
                Toast.makeText(this, "FAQ", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.sign_out:
                Toast.makeText(this, "Sign Out", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}