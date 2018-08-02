package androidfkipuhamka.quis;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class QuizActivity extends AppCompatActivity {
    TextView pertanyaan;
    ImageView gambar;
    RadioGroup pilihan_jawaban;
    RadioButton opsi_a, opsi_b, opsi_c, opsi_d,opsi_e;
    Button submit;
    List<QuizModel> quizModelList = new ArrayList<>();
    int no = 0;
    int score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis);
        gambar = (ImageView) findViewById(R.id.gambar_pertanyaan);
        pertanyaan = (TextView) findViewById(R.id.text_pertanyaan);

        pilihan_jawaban = (RadioGroup) findViewById(R.id.pilihan_jawaban);

        opsi_a = (RadioButton) findViewById(R.id.opsi_a);
        opsi_b = (RadioButton) findViewById(R.id.opsi_b);
        opsi_c = (RadioButton) findViewById(R.id.opsi_c);
        opsi_d = (RadioButton) findViewById(R.id.opsi_d);
        opsi_e = (RadioButton) findViewById(R.id.opsi_e);

        submit= (Button) findViewById(R.id.submit);

        persiapanData();
        setDatatoView();

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (no<quizModelList.size()){
                    checkAnswer();
                    no++;
                }

                if(no<quizModelList.size()){
                    setDatatoView();
                }
                else{
                    Intent i = new Intent(QuizActivity.this, HasilActivity.class);
                    i.putExtra("SCORE", score);
                    startActivity(i);
                    finish();

                }


            }
        });



    }


    /*private void setSoal(String gambar, String pertanyaan, String opsi_a, String opsi_b, String opsi_c, String opsi_d, String opsi_e, String jawaban){
        QuizModel quizModel = new QuizModel(gambar, pertanyaan, opsi_a, opsi_b, opsi_c, opsi_d, opsi_e, jawaban);
        quizModelList.add(quizModel);

    }*/
    private void setSoal(int drawable, String pertanyaan, String opsiA, String opsiB,
                         String opsiC, String opsiD, String opsiE, String jawab) {
        //QuizModel quizModel = new QuizModel()

        QuizModel QuizModel = new QuizModel(pertanyaan, opsiA, opsiB, opsiC,
                opsiD, opsiE, jawab, drawable);
                quizModelList.add(QuizModel);
    }


    private void persiapanData(){
        //setSoal("1+1", "1","2","3","4","5","B");
        //setS
        //Drawable dra = getResources().getDrawable(R.drawable.ic_launcher_background);
        int soal1 = R.drawable.a1;
        setSoal(soal1, "", "A.", "B.", "C.", "D.", "E.", "C");
        int soal2 = R.drawable.a2;
        setSoal(soal2, "", "A.", "B.", "C.", "D.", "E.", "C");
        int soal3 = R.drawable.a3;
        setSoal(soal3, "", "A.", "B.", "C.", "D.", "E.", "C");
        int soal4 = R.drawable.a4;
        setSoal(soal4, "", "A.", "B.", "C.", "D.", "E.", "D");
        int soal5 = R.drawable.a5;
        setSoal(soal5, "", "A.", "B.", "C.", "D.", "E.", "B");
        int soal6 = R.drawable.a6;
        setSoal(soal6, "", "A.", "B.", "C.", "D.", "E.", "C");
        int soal7 = R.drawable.a7;
        setSoal(soal7, "", "A.", "B.", "C.", "D.", "E.", "D");
        int soal8 = R.drawable.a8;
        setSoal(soal8, "", "A.", "B.", "C.", "D.", "E.", "E");
        int soal9 = R.drawable.a9;
        setSoal(soal9, "", "A.", "B.", "C.", "D.", "E.", "E");
        int soal10 = R.drawable.a10;
        setSoal(soal10, "", "A.", "B.", "C.", "D.", "E.", "C");
        int soal11 = R.drawable.a11;
        setSoal(soal11, "", "A.", "B.", "C.", "D.", "E.", "A");
        int soal12 = R.drawable.a12;
        setSoal(soal12, "", "A.", "B.", "C.", "D.", "E.", "A");
        int soal13 = R.drawable.a13;
        setSoal(soal13, "", "A.", "B.", "C.", "D.", "E.", "A");
        int soal14 = R.drawable.a14;
        setSoal(soal14, "", "A.", "B.", "C.", "D.", "E.", "E");
        int soal15 = R.drawable.a15;
        setSoal(soal15, "", "A.", "B.", "C.", "D.", "E.", "E");
    }



    private void setDatatoView(){
        gambar.setImageResource(quizModelList.get(no).getDrawable());
        pertanyaan.setText(quizModelList.get(no).getPertayaan());
        opsi_a.setText(quizModelList.get(no).getOpsi_a());
        opsi_b.setText(quizModelList.get(no).getOpsi_b());
        opsi_c.setText(quizModelList.get(no).getOpsi_c());
        opsi_d.setText(quizModelList.get(no).getOpsi_d());
        opsi_e.setText(quizModelList.get(no).getOpsi_e());

    }


    private void checkAnswer(){
        int index;

        switch (quizModelList.get(no).getJawaban()){
            case "A":
                index =0;
                break;
            case "B":
                index = 1;
                break;
            case "C":
                index= 2;
                break;
            case "D":
                index= 3;
                break;
            case "E":
                index=4;
                break;
            default:
                index=0;
                break;
        }

        int index_pilihan = pilihan_jawaban.indexOfChild(findViewById(pilihan_jawaban.getCheckedRadioButtonId()));

        if(index==index_pilihan){
            score+=10;
            Toast.makeText(getApplicationContext(), "Benar SCORE :"+score, Toast.LENGTH_LONG).show();

        }
        else{
            score-=0;
            Toast.makeText(getApplicationContext(), "Salah SCORE :"+score, Toast.LENGTH_LONG).show();
        }
        pilihan_jawaban.clearCheck();

    }

    }

