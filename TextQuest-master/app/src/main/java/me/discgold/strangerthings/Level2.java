package me.discgold.strangerthings;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Level2 extends AppCompatActivity {
    private long backPressedTime;
    private Toast backToast;
    OneTable oneTable = new OneTable();
    Delay delay = new Delay();
    public Animation a;
    public TextView textView1;
    public TextView textView2;
    public ImageView imageView1;
    public TextView textView3;
    public TextView textView4;
    public TextView textView5;
    public Button bbuttonNextLevel;

    public int line = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level_1);
        final TextView textView1 = (TextView)findViewById(R.id.textView1);
        final TextView textView2 = (TextView)findViewById(R.id.textView2);
        final ImageView imageView1 = (ImageView) findViewById(R.id.level_one_image);
        final TextView textView3 = (TextView)findViewById(R.id.textView3);
        final TextView textView4 = (TextView)findViewById(R.id.textView4);
        final TextView textView5 = (TextView)findViewById(R.id.textView5);

        final Button buttonNextLevel = (Button)findViewById(R.id.button_next_level);

        textView1.setText(oneTable.onescenario_ru[7]);
        textView2.setText(oneTable.onescenario_ru[8]);
        textView3.setText(oneTable.onescenario_ru[9]);
        textView4.setText(oneTable.onescenario_ru[10]);
        textView5.setText(oneTable.onescenario_ru[11]);
        buttonNextLevel.setText(oneTable.onescenario_ru[12]);

        //внизу будет код, который прячет текст
        textView1.setVisibility(View.INVISIBLE);
        textView2.setVisibility(View.INVISIBLE);
        imageView1.setVisibility(View.INVISIBLE);
        textView3.setVisibility(View.INVISIBLE);
        textView4.setVisibility(View.INVISIBLE);
        buttonNextLevel.setVisibility(View.INVISIBLE);
        //конец скрытия текста

        //команда, которая запускает AsyncTask
        delay.execute();
        //конец команды, которая запускает AsyncTask
        buttonNextLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent = new Intent (Level2.this, Level3.class);
                    startActivity(intent);finish();
                } catch (Exception e) {

                }
            }
        });


        Window w =getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
    //с этого места начинается код AsyncTask
    class Delay extends AsyncTask<Void, Integer, Void>{

        @Override
            protected Void doInBackground(Void... params){
            while (line<=6){
                publishProgress(line++);
                try{
                    Thread.sleep(4000);
                    if (isCancelled()) return null;
                }catch(Exception e){}
            }
            return null;
        }

        @Override
        protected void onProgressUpdate (Integer... values){
        final TextView textView1 = (TextView)findViewById(R.id.textView1);
        final TextView textView2 = (TextView)findViewById(R.id.textView2);
        final ImageView imageView1 = (ImageView) findViewById(R.id.level_one_image);
        final TextView textView3 = (TextView)findViewById(R.id.textView3);
        final TextView textView4 = (TextView)findViewById(R.id.textView4);
        final TextView textView5 = (TextView)findViewById(R.id.textView5);
        final Button buttonNextLevel = (Button)findViewById(R.id.button_next_level);

        final Animation a = AnimationUtils.loadAnimation(Level2.this, R.anim.alpha);

            switch(line){
                case 1: textView1.setVisibility(View.VISIBLE); textView1.startAnimation(a); break;
                case 2: textView2.setVisibility(View.VISIBLE); textView2.startAnimation(a); break;
                case 3: imageView1.setVisibility(View.VISIBLE); imageView1.startAnimation(a); break;
                case 4: textView3.setVisibility(View.VISIBLE); textView3.startAnimation(a); break;
                case 5: textView4.setVisibility(View.VISIBLE); textView4.startAnimation(a); break;
                case 6: textView5.setVisibility(View.VISIBLE); textView5.startAnimation(a); break;
                case 7: buttonNextLevel.setVisibility(View.VISIBLE); buttonNextLevel.startAnimation(a); break;
                default: break;
            }
        }

    }
    //с этого места заканчивается код AsyncTask

    //системная кнопка "Назад" - начало
    @Override
    public void onBackPressed(){
        try{
            Intent intent = new Intent (Level2.this, Level1.class);
            startActivity(intent);finish();
        } catch (Exception e) {

        }
    }
    //системная кнопка "Назад" - конец
}
