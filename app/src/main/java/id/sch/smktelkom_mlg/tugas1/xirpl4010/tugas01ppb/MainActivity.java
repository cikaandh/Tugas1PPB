package id.sch.smktelkom_mlg.tugas1.xirpl4010.tugas01ppb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNama, etTelp, etSewa, etKembali, etTenda, etSB, etKmpr, etTas, etHL;
    Spinner spGunung;
    CheckBox cbTenda, cbSB, cbKmpr, cbTas, cbHL;
    RadioButton rbSL, rbDL;
    Button bSewa;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.editTextNama);
        etTelp = (EditText) findViewById(R.id.editTextTelp);
        etSewa = (EditText) findViewById(R.id.editTextSewa);
        etKembali = (EditText) findViewById(R.id.editTextKembali);
        etTenda = (EditText) findViewById(R.id.editTextTenda);
        etSB = (EditText) findViewById(R.id.editTextSB);
        etKmpr = (EditText) findViewById(R.id.editTextKmpr);
        etTas = (EditText) findViewById(R.id.editTextTas);
        etHL = (EditText) findViewById(R.id.editTextHL);

        spGunung = (Spinner) findViewById(R.id.spinnerGunung);

        cbTenda = (CheckBox) findViewById(R.id.checkBoxTenda);
        cbSB = (CheckBox) findViewById(R.id.checkBoxSB);
        cbKmpr = (CheckBox) findViewById(R.id.checkBoxKmpr);
        cbTas = (CheckBox) findViewById(R.id.checkBoxTas);
        cbHL = (CheckBox) findViewById(R.id.checkBoxHL);

        rbSL = (RadioButton) findViewById(R.id.radioButtonSL);
        rbDL = (RadioButton) findViewById(R.id.radioButtonDL);

        bSewa = (Button) findViewById(R.id.buttonSewa);

        tvHasil = (TextView) findViewById(R.id.textViewHasil);

        bSewa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doProcess();
            }
        });

    }

    private void doProcess() {
        String nama = etNama.getText().toString();
        String telp = etTelp.getText().toString();
        String sewa = etSewa.getText().toString();
        String kembali = etKembali.getText().toString();
        String tenda = etTenda.getText().toString();
        String sb = etSB.getText().toString();
        String kompor = etKmpr.getText().toString();
        tvHasil.setText
                ("Nama                          :" + nama + "\n" +
                        "Nomor Telepon              :" + telp + "\n" +
                        "Waktu penyewaan            :" + sewa + "\n" +
                        "Waktu Pengembalian     :" + kembali + "\n" +
                        "Jumlah tenda       :" + tenda + "\n" +
                        "Jumlah Sleeping bag:" + sb + "\n" +
                        "Jumlah Kompor      :" + kompor + "\n"
                );

    }


}
