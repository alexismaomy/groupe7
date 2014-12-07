package be.condorcet.geolocalisation;

import java.sql.Connection;
import java.util.ArrayList;

import myconnections.DBConnection;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import entities.PointInteretDB;

public class CreerActivity extends ActionBarActivity {
	private Connection con = null;
	private String msgcreation, patientez, echec, champvide, ptexistedeja,
			creerpt, pascreer;
	private EditText ednom, eddescription, edlongitude, edcategorie,
			edlatitude;
	private boolean unique;
	public static final String CAT = "cat";
	ArrayList<String> c;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_creer);

		ednom = (EditText) findViewById(R.id.ednom);
		eddescription = (EditText) findViewById(R.id.eddescription);
		edlongitude = (EditText) findViewById(R.id.edlongitude);
		edlatitude = (EditText) findViewById(R.id.edlatitude);
		edcategorie = (EditText) findViewById(R.id.edcategorie);
		champvide = getResources().getString(R.string.champvide);
		pascreer = getResources().getString(R.string.pascreer);
		ptexistedeja = getResources().getString(R.string.ptexistedeja);
		creerpt = getResources().getString(R.string.creerpt);
		echec = getResources().getString(R.string.echec);
		patientez = getResources().getString(R.string.patientez);

		Intent i = getIntent();
		c = i.getStringArrayListExtra(MenuActivity.CAT);

		final Spinner list = (Spinner) findViewById(R.id.spin);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		list.setAdapter(adapter);
		final Button active = (Button) findViewById(R.id.activation);
		active.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick(View v) {
				if (active != null) {
					if ((list != null) && list.isEnabled()) {
						int i = list.getSelectedItemPosition();
						edcategorie.setText(c.get(i));
					}
					list.setEnabled(false);
					active.setText("Désactivé");
				} else {
					list.setEnabled(true);
					active.setText("Activé");
				}
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.creer, menu);
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

	@Override
	public void onDestroy() {
		super.onDestroy();
		try {
			con.close();
			con = null;
			Log.d("connexion", "deconnexion OK");
		} catch (Exception e) {
		}
		Log.d("connexion", "deconnexion OK");
	}

	class MyAccesDBPointInteret extends AsyncTask<String, Integer, Boolean> {
		private String resultat;
		private ProgressDialog pgd = null;
		private String nom, description;
		private double longitude, latitude;

		public MyAccesDBPointInteret(CreerActivity pActivity) {
			link(pActivity);
			// TODO Auto-generated constructor stub
		}

		private void link(CreerActivity pActivity) {
			// TODO Auto-generated method stub
		}

		protected void onPreExecute() {
			super.onPreExecute();
			pgd = new ProgressDialog(CreerActivity.this);
			pgd.setMessage(msgcreation);
			pgd.setProgressStyle(ProgressDialog.STYLE_SPINNER);
			pgd.setTitle(patientez);
			pgd.show();
		}

		@Override
		protected Boolean doInBackground(String... arg0) {
			if (con == null) {// premier invocation
				con = new DBConnection().getConnection();
				if (con == null) {
					resultat = echec;
					return false;
				}
				PointInteretDB.setConnection(con);
			}
			// int id=Integer.parseInt(ed.getText().toString());
			nom = ednom.getText().toString();
			description = eddescription.getText().toString();
			longitude = Double.parseDouble(edlongitude.getText().toString());
			latitude = Double.parseDouble(edlatitude.getText().toString());
			try {
				PointInteretDB p = new PointInteretDB(nom, description,
						longitude, latitude);
				p.create();
				p.read();
				unique = true;
				// resultat = u.toString();
			} catch (Exception e) {
				// resultat = e.getMessage();
				return false;
			}
			return true;
		}

		protected void onPostExecute(Boolean result) {
			super.onPostExecute(result);
			pgd.dismiss();
			// edmsg.setText(resultat);
			if (resultat == echec) {
				Toast.makeText(CreerActivity.this, echec, Toast.LENGTH_LONG)
						.show();
				return;
			}
			if (nom.trim().equals("") || description.trim().equals("")
					|| edlongitude.getText().toString().trim().equals("")
					|| edlatitude.getText().toString().trim().equals("")) {
				Toast.makeText(CreerActivity.this, champvide, Toast.LENGTH_LONG)
						.show();
				return;
			}
			if (!unique) {
				Toast.makeText(CreerActivity.this, ptexistedeja,
						Toast.LENGTH_LONG).show();
			}
		}
	}
}
