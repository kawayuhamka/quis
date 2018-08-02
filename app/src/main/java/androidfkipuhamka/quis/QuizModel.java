package androidfkipuhamka.quis;

import android.graphics.drawable.Drawable;

public class QuizModel {
    String pertayaan, opsi_a, opsi_b, opsi_c, opsi_d, opsi_e, jawaban;
    int drawable;

    public QuizModel() {
    }

    public QuizModel(String pertayaan, String opsi_a, String opsi_b, String opsi_c, String opsi_d, String opsi_e, String jawaban, int drawable) {
        this.pertayaan = pertayaan;
        this.opsi_a = opsi_a;
        this.opsi_b = opsi_b;
        this.opsi_c = opsi_c;
        this.opsi_d = opsi_d;
        this.opsi_e = opsi_e;
        this.jawaban = jawaban;
        this.drawable = drawable;
    }

    public int getDrawable() {
        return drawable;
    }

    public void setDrawable(int drawable) {
        this.drawable = drawable;
    }

    public String getPertayaan() {
        return pertayaan;
    }

    public void setPertayaan(String pertayaan) {
        this.pertayaan = pertayaan;
    }

    public String getOpsi_a() {
        return opsi_a;
    }

    public void setOpsi_a(String opsi_a) {
        this.opsi_a = opsi_a;
    }

    public String getOpsi_b() {
        return opsi_b;
    }

    public void setOpsi_b(String opsi_b) {
        this.opsi_b = opsi_b;
    }

    public String getOpsi_c() {
        return opsi_c;
    }

    public void setOpsi_c(String opsi_c) {
        this.opsi_c = opsi_c;
    }

    public String getOpsi_d() {
        return opsi_d;
    }

    public void setOpsi_d(String opsi_d) {
        this.opsi_d = opsi_d;
    }

    public String getOpsi_e() {
        return opsi_e;
    }

    public void setOpsi_e(String opsi_e) {
        this.opsi_e = opsi_e;
    }

    public String getJawaban() {
        return jawaban;
    }

    public void setJawaban(String jawaban) {
        this.jawaban = jawaban;
    }
}