package be.condorcet.geolocalisation;

import java.util.ArrayList;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MenuActivity extends ActionBarActivity {
	// private TextView t;
	public static final String CAT = "cat";
	ArrayList<String> c;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu);
		Intent i = getIntent();
		c = i.getStringArrayListExtra(AuthentificationActivity.CATEGORIE);
		// UserDB u = (UserDB);
		// i.getParcelableExtra(AuthentificationActivity.IDUSER);
		// String res = i.getStringExtra(AuthentificationActivity.RESULTAT);
		// t = (TextView) findViewById(R.id.infosuser);
		// t.setText(res);
		// pour liste de personnes : listePersonnes =
		// i.getParcelableArrayListExtra(MainActivity.ID_LIST)
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	public void gestionCreer(View v) {

		Intent i = new Intent(MenuActivity.this, CreerActivity.class);
		i.putExtra(CAT, c);
		startActivity(i);
	}

	public void gestionLister(View v) {

		Intent i = new Intent(MenuActivity.this, ListerActivity.class);
		startActivity(i);
	}

	public void gestionRechercher(View v) {

		Intent i = new Intent(MenuActivity.this, RechercherActivity.class);
		startActivity(i);
	}

	public void gestionConsulter(View v) {

		Intent i = new Intent(MenuActivity.this, ConsulterActivity.class);
		startActivity(i);
	}
}
