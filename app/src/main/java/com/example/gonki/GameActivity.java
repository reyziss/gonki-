package com.example.gonki;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import android.os.CountDownTimer;
import android.widget.Toast;
import  android.graphics.Color;

public class GameActivity extends AppCompatActivity {

    private ImageView iv_pccar, iv_usercar, tv_finishline;
    private TextView tv_timer, iv_semafor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        iv_pccar = (ImageView) FindViewById(R.id.iv_pccar)
        iv_usercar = (ImageView) FindViewById(R.id.iv_usercar)
        iv_finishline = (ImageView) FindViewById(R.id.iv_finichline)
        iv_timer = (ImageView) FindViewById(R.id.iv_timer)
        iv_tsemafor = (ImageView) FindViewById(R.id.iv_semafore)

                public void startGameAction(View view) {
            timerGame();
            timerPC();
        }

        public class GameActivity extends AppCompatActivity {

            private ImageView iv_pccar, iv_usercar, iv_finishline;
            private TextView tv_timer, tv_semafor;
            Timer timerGame = new Timer();
            Timer timerPC = new Timer();
            int state = 0;
        }

        public void driveCarAction(View view) {
            if (state == 2) {
                iv_isercar.setX(iv_usercar.getX() + 30);
            }
            if (state == 1) {
                iv_isercar.setX(iv_usercar.getX() - 30);
            }
            if (iv_usercar.getx( >= iv_finishline.getX())) {
                timerPC.cancel();
                timerGame.cansel();
                Toast.makeTextApplicationContext(), text: "YOU WIN", Toast.LENGTH_LONG).show();
            }
        }


        public void timerGame() {
            TimerTask timerTask - new TimerTask () {

                @Override
                public void run() {
                    runUiThred(new Runnable() {

                        @Override
                        public void run() {
                            state += 1;
                            if (state > 2)
                                state = 1;
                            switch (state) {
                                case 1:
                                    tv_semafor.setText("RED");
                                    tv_semafor.setTextColor(Color.RED);
                                    break;
                                case 2:
                                    tv_semafor.setText("GREEN");
                                    tv_semafor.setTextColor(Color.GREEN);
                                    break;

                            }
                        }

                        });
                }
            };
            timerGame.scheduleAtFixedRate(timerTask, delay: 0, period: 3000);
        }

        public void timerPC() {
            TimerTask timerTask = new TimerTask() {
                @Override
                piblic void run() {
                    runUiThred(new Runnable() {

                        @Override
                        public void run() {
                            if (state == 2) {
                                iv_pccar.setX(iv_pccar.getX() + 300);
                                }
                            if (iv_pccar.getX( >= iv_finishline.getX())) {
                                timerPC.cancel();
                                timerGame.cancel();
                                Toast.makeText(getApplicationContext(), text: "YOU LOSE!", Tosat.LENGTH_LONG).show();
                            }
                        }

                    });
                }
            };
        }
        timerGame.scheduleAtFixedRate(timerTask, delay: 0, period: 1000);

    }
}