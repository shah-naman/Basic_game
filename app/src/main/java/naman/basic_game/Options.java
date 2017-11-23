package naman.basic_game;

/**
 * Created by naman on 09-10-2017.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Options extends Activity {

    Button btnhard,btnintermediate,btnsimple,btntime,btnuntime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.optionsmenu);

        btnhard = (Button) findViewById(R.id.btnhard);
        btnsimple = (Button) findViewById(R.id.btnsimple);
        btnintermediate = (Button) findViewById(R.id.btnintermediate);
        btntime = (Button) findViewById(R.id.btntime);
        btnuntime = (Button) findViewById(R.id.btnuntime);

        btntime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Options.this,
                        QuestionActivity.class);
                startActivity(intent);
                finish();
            }
        });
        btnuntime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Options.this,
                        QuestionActivity1.class);
                startActivity(intent);
                finish();
            }
        });
        btnhard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Options.this,
                        QuestionActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btnsimple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Options.this,
                        QuestionActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btnintermediate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Options.this,
                        QuestionActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

}