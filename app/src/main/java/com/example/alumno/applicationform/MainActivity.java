package com.example.alumno.applicationform;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    private EditText usuario;
    private EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupViews();
    }

    private void setupViews() {
        usuario=(EditText)findViewById(R.id.main_user);
        password=(EditText)findViewById(R.id.main_password);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void veCondiciones(View view){
        Intent i=new Intent(this,SegundaActivity.class);
        startActivity(i);
    }

    public void validar(View view){
        if(usuario.getText().toString().length()>=8
                && password.getText().toString().length()>=8){
            Log.e("error","error");
            Toast.makeText(this, "Formulario válido", Toast.LENGTH_SHORT).show();
        }else{
            Log.e("error","error");
            Toast.makeText(this, "Formulario no válido, por favor, revise los campos", Toast.LENGTH_SHORT).show();
        }

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
