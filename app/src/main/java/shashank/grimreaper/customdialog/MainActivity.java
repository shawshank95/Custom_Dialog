package shashank.grimreaper.customdialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // Our custom dialog for provider
    AlertDialog.Builder builder;
    AlertDialog alert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        builder = new AlertDialog.Builder(this);
        builder.setView(R.layout.dialogbutton);
        builder.setCancelable(true);
        alert = builder.create();
        setFinishOnTouchOutside(true);
        alert.show();
    }
    public void accept(View v){
        Toast.makeText(this,"Accepted",Toast.LENGTH_LONG).show();
        alert.cancel();
    }
    public void decline(View v){
        Toast.makeText(this,"Declined",Toast.LENGTH_LONG).show();
        alert.cancel();
    }
}
