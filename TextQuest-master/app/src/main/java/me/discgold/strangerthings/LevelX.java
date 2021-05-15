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

public class LevelX extends AppCompatActivity {
    private long backPressedTime;
    private Toast backToast;
    OneTable oneTable = new OneTable();
    Delay delay = new Delay();
    public Animation a;
    public TextView textView0;
    public TextView textView1;
    public TextView textView2;
    public TextView textView3;
    public TextView textView4;
    public TextView textView5;
    public TextView textView6;
    public TextView textView7;
    public TextView textView8;
    public Button button_yes;
    public Button button_no;
    public TextView textView10;
    public TextView textView11;
    public TextView textView12;
    public TextView textView13;
    public TextView textView14;
    public Button button_yes_2;
    public Button button_no_2;
    public TextView textView16;
    public ImageView imageView2;
    public TextView textView18;
    public TextView textView19;
    public ImageView imageView3;
    public TextView textView21;
    public Button button_next_level;
    public int line = -1;
    public int counterFirstLine = 0;
    public int counterSecondLine = 0;
    public int secondYes = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level_2);
        final TextView textView0 = (TextView)findViewById(R.id.textView0);
        final TextView textView1 = (TextView)findViewById(R.id.textView1);
        final TextView textView2 = (TextView)findViewById(R.id.textView2);
        final TextView textView3 = (TextView)findViewById(R.id.textView3);
        final TextView textView4 = (TextView)findViewById(R.id.textView4);
        final TextView textView5 = (TextView)findViewById(R.id.textView5);
        final TextView textView6 = (TextView)findViewById(R.id.textView6);
        final TextView textView7 = (TextView)findViewById(R.id.textView7);
        final TextView textView8 = (TextView)findViewById(R.id.textView8);
        final Button button_yes = (Button)findViewById(R.id.button_Yes);
        final Button button_no = (Button)findViewById(R.id.button_No);
        final TextView textView10 = (TextView)findViewById(R.id.textView10);
        final TextView textView11 = (TextView)findViewById(R.id.textView11);
        final TextView textView12 = (TextView)findViewById(R.id.textView12);
        final TextView textView13 = (TextView)findViewById(R.id.textView13);
        final TextView textView14 = (TextView)findViewById(R.id.textView14);
        final Button button_yes_2 = (Button)findViewById(R.id.button_Yes_2);
        final Button button_no_2 = (Button)findViewById(R.id.button_No_2);
        final TextView textView16 = (TextView)findViewById(R.id.textView16);
        final ImageView imageView2 = (ImageView) findViewById(R.id.level_two_image);
        final TextView textView18 = (TextView)findViewById(R.id.textView18);
        final TextView textView19 = (TextView)findViewById(R.id.textView19);
        final ImageView imageView3 = (ImageView) findViewById(R.id.level_three_image);
        final TextView textView21 = (TextView)findViewById(R.id.textView21);
        final Button button_next_level = (Button)findViewById(R.id.button_next_level);

        textView0.setText(oneTable.onescenario_ru[35]);
        textView1.setText(oneTable.onescenario_ru[36]);
        textView2.setText(oneTable.onescenario_ru[37]);
        textView3.setText(oneTable.onescenario_ru[38]);
        textView4.setText(oneTable.onescenario_ru[39]);
        textView5.setText(oneTable.onescenario_ru[40]);
        textView6.setText(oneTable.onescenario_ru[41]);
        textView7.setText(oneTable.onescenario_ru[42]);
        textView8.setText(oneTable.onescenario_ru[43]);
        button_yes.setText(oneTable.onescenario_ru[44]);
        button_no.setText(oneTable.onescenario_ru[45]);
        textView10.setText(oneTable.onescenario_ru[46]);
        textView11.setText(oneTable.onescenario_ru[47]);
        textView12.setText(oneTable.onescenario_ru[48]);
        textView13.setText(oneTable.onescenario_ru[49]);
        textView14.setText(oneTable.onescenario_ru[50]);
        button_yes_2.setText(oneTable.onescenario_ru[52]);
        button_no_2.setText(oneTable.onescenario_ru[53]);
        textView16.setText(oneTable.onescenario_ru[54]);
        textView18.setText(oneTable.onescenario_ru[55]);
        textView19.setText(oneTable.onescenario_ru[56]);
        textView21.setText(oneTable.onescenario_ru[57]);
        button_next_level.setText(oneTable.onescenario_ru[58]);

        //внизу будет код, который прячет текст
        textView0.setVisibility(View.INVISIBLE);
        textView1.setVisibility(View.INVISIBLE);
        textView2.setVisibility(View.INVISIBLE);
        textView3.setVisibility(View.INVISIBLE);
        textView4.setVisibility(View.INVISIBLE);
        textView5.setVisibility(View.INVISIBLE);
        textView6.setVisibility(View.INVISIBLE);
        textView7.setVisibility(View.INVISIBLE);
        textView8.setVisibility(View.INVISIBLE);
        button_yes.setVisibility(View.INVISIBLE);
        button_no.setVisibility(View.INVISIBLE);
        textView10.setVisibility(View.INVISIBLE);
        textView11.setVisibility(View.INVISIBLE);
        textView12.setVisibility(View.INVISIBLE);
        textView13.setVisibility(View.INVISIBLE);
        textView14.setVisibility(View.INVISIBLE);
        button_yes_2.setVisibility(View.INVISIBLE);
        button_no_2.setVisibility(View.INVISIBLE);
        textView16.setVisibility(View.INVISIBLE);
        imageView2.setVisibility(View.INVISIBLE);
        textView18.setVisibility(View.INVISIBLE);
        textView19.setVisibility(View.GONE);
        imageView3.setVisibility(View.GONE);
        textView21.setVisibility(View.GONE);
        button_next_level.setVisibility(View.INVISIBLE);
        //конец скрытия текста

        //команда, которая запускает AsyncTask
        delay.execute();
        //конец команды, которая запускает AsyncTask

        button_next_level.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent = new Intent (LevelX.this, LevelX.class);
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
            while (line<=21){
                if(counterFirstLine==0 & line==9){
                    line = 9;
                    if(isCancelled()) return null;
                }else{
                    if(counterSecondLine==0 & line==15) {
                        line=15;
                        if(isCancelled()) return null;
                    }else{
                        if(secondYes==1 & line==18){
                            line=21;
                        }
                publishProgress(line++);
                try{
                    Thread.sleep(4000);
                    if (isCancelled()) return null;
                }catch(Exception e){}
            }}}
            return null;
        }

        @Override
        protected void onProgressUpdate (Integer... values){
            final TextView textView0 = (TextView)findViewById(R.id.textView0);
            final TextView textView1 = (TextView)findViewById(R.id.textView1);
            final TextView textView2 = (TextView)findViewById(R.id.textView2);
            final TextView textView3 = (TextView)findViewById(R.id.textView3);
            final TextView textView4 = (TextView)findViewById(R.id.textView4);
            final TextView textView5 = (TextView)findViewById(R.id.textView5);
            final TextView textView6 = (TextView)findViewById(R.id.textView6);
            final TextView textView7 = (TextView)findViewById(R.id.textView7);
            final TextView textView8 = (TextView)findViewById(R.id.textView8);
            final Button button_yes = (Button)findViewById(R.id.button_Yes);
            final Button button_no = (Button)findViewById(R.id.button_No);
            final TextView textView10 = (TextView)findViewById(R.id.textView10);
            final TextView textView11 = (TextView)findViewById(R.id.textView11);
            final TextView textView12 = (TextView)findViewById(R.id.textView12);
            final TextView textView13 = (TextView)findViewById(R.id.textView13);
            final TextView textView14 = (TextView)findViewById(R.id.textView14);
            final Button button_yes_2 = (Button)findViewById(R.id.button_Yes_2);
            final Button button_no_2 = (Button)findViewById(R.id.button_No_2);
            final TextView textView16 = (TextView)findViewById(R.id.textView16);
            final ImageView imageView2 = (ImageView) findViewById(R.id.level_two_image);
            final TextView textView18 = (TextView)findViewById(R.id.textView18);
            final TextView textView19 = (TextView)findViewById(R.id.textView19);
            final ImageView imageView3 = (ImageView) findViewById(R.id.level_three_image);
            final TextView textView21 = (TextView)findViewById(R.id.textView21);
            final Button button_next_level = (Button)findViewById(R.id.button_next_level);

            final Animation a = AnimationUtils.loadAnimation(LevelX.this, R.anim.alpha);

            switch(line){
                case 0: textView0.setVisibility(View.VISIBLE); textView0.startAnimation(a); break;
                case 1: textView1.setVisibility(View.VISIBLE); textView1.startAnimation(a); break;
                case 2: textView2.setVisibility(View.VISIBLE); textView2.startAnimation(a); break;
                case 3: textView3.setVisibility(View.VISIBLE); textView3.startAnimation(a); break;
                case 4: textView4.setVisibility(View.VISIBLE); textView4.startAnimation(a); break;
                case 5: textView5.setVisibility(View.VISIBLE); textView5.startAnimation(a); break;
                case 6: textView6.setVisibility(View.VISIBLE); textView6.startAnimation(a); break;
                case 7: textView7.setVisibility(View.VISIBLE); textView7.startAnimation(a); break;
                case 8: textView8.setVisibility(View.VISIBLE); textView8.startAnimation(a); break;
                case 9: button_yes.setVisibility(View.VISIBLE); button_yes.startAnimation(a);
                    button_yes.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try{
                                if(counterFirstLine==0) {
//                                    Intent intent = new Intent(LevelX.this, LevelX.class);
//                                    startActivity(intent); finish();
                                    counterFirstLine = 1;
                                }
                            } catch (Exception e) {

                            }
                        }
                    });
                    button_no.setVisibility(View.VISIBLE); button_no.startAnimation(a);
                    button_no.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try{
                                if(counterFirstLine==0) {
//                                Intent intent = new Intent (LevelX.this, LevelX.class);
//                                startActivity(intent);finish();
                                    counterFirstLine = 1;
                                    textView10.setVisibility(View.GONE);
                                    line = line + 1;
                                }
                            } catch (Exception e) {

                            }
                        }
                    });break;
                case 10: textView10.setVisibility(View.VISIBLE); textView10.startAnimation(a);
                        textView11.setVisibility(View.GONE); line=line+1; break;
                case 11: textView11.setVisibility(View.VISIBLE); textView11.startAnimation(a); break;
                case 12: textView12.setVisibility(View.VISIBLE); textView12.startAnimation(a); break;
                case 13: textView13.setVisibility(View.VISIBLE); textView13.startAnimation(a); break;
                case 14: textView14.setVisibility(View.VISIBLE); textView14.startAnimation(a); break;
                case 15: button_yes_2.setVisibility(View.VISIBLE); button_yes_2.startAnimation(a);
                    button_yes_2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try{
//                                Intent intent = new Intent (LevelX.this, LevelX.class);
//                                startActivity(intent);finish();
                                if(counterSecondLine==0){
                                counterSecondLine=1;
                                textView19.setVisibility(View.GONE);
                                imageView3.setVisibility(View.GONE);
                                textView21.setVisibility(View.GONE);
                                secondYes=1;
                                }
                            } catch (Exception e) {

                            }
                        }
                    });
                    button_no_2.setVisibility(View.VISIBLE); button_no_2.startAnimation(a);
                button_no_2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        try{
//                            Intent intent = new Intent (LevelX.this, LevelX.class);
//                            startActivity(intent);finish();
                            if(counterSecondLine==0) {
                                counterSecondLine = 1;
                                textView16.setVisibility(View.GONE);
                                imageView2.setVisibility(View.GONE);
                                textView18.setVisibility(View.GONE);
                                line = line + 3;
                                textView19.setVisibility(View.INVISIBLE);
                                imageView3.setVisibility(View.INVISIBLE);
                                textView21.setVisibility(View.INVISIBLE);
                            }
                        } catch (Exception e) {

                        }
                    }
                });break;
                case 16: textView16.setVisibility(View.VISIBLE); textView16.startAnimation(a); break;
                case 17: imageView2.setVisibility(View.VISIBLE); imageView2.startAnimation(a); break;
                case 18: textView18.setVisibility(View.VISIBLE); textView18.startAnimation(a); break;
                case 19: textView19.setVisibility(View.VISIBLE); textView19.startAnimation(a); break;
                case 20: imageView3.setVisibility(View.VISIBLE); imageView3.startAnimation(a); break;
                case 21: textView21.setVisibility(View.VISIBLE); textView21.startAnimation(a); break;
                case 22: button_next_level.setVisibility(View.VISIBLE); button_next_level.startAnimation(a);
                    button_next_level.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try{
                                Intent intent = new Intent (LevelX.this, LevelX.class);
                                startActivity(intent);finish();
                            } catch (Exception e) {

                            }
                        }
                    });

                default: break;
            }
        }

    }
    //с этого места заканчивается код AsyncTask

    //системная кнопка "Назад" - начало
    @Override
    public void onBackPressed(){
        delay.cancel(true);
        delay=null;
        try{
            Intent intent = new Intent (LevelX.this, MainActivity.class);
            startActivity(intent);finish();
        } catch (Exception e) {

        }
    }
    //системная кнопка "Назад" - конец
}
