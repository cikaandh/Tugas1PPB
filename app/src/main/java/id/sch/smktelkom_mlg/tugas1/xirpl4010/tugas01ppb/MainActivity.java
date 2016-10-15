package id.sch.smktelkom_mlg.tugas1.xirpl4010.tugas01ppb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNama, etTelp, etSewa, etKembali;
    RadioGroup rgJK;
    Spinner Gunung;
    CheckBox cbTenda, cbSB, cbKmpr, cbTas, cbHL;
    RadioButton rbLaki, rbPr;
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



        cbTenda = (CheckBox) findViewById(R.id.checkBoxTenda);
        cbSB = (CheckBox) findViewById(R.id.checkBoxSB);
        cbKmpr = (CheckBox) findViewById(R.id.checkBoxKmpr);
        cbTas = (CheckBox) findViewById(R.id.checkBoxTas);
        cbHL = (CheckBox) findViewById(R.id.checkBoxHL);

        Gunung = (Spinner) findViewById(R.id.Gunung);

        rbLaki = (RadioButton) findViewById(R.id.radioButtonLaki);
        rbPr = (RadioButton) findViewById(R.id.radioButtonPr);

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
        if(isValid());
        {
            String nama = etNama.getText().toString();
            String telp = etTelp.getText().toString();
            String sewa = etSewa.getText().toString();
            String kembali = etKembali.getText().toString();
            String gunung = Gunung.getSelectedItem().toString();


            String hsl2 ="Barang Yang Dipesan :\n";
            int startlen = hsl2.length();

            if (cbSB.isChecked()) hsl2 += cbSB.getText() + "\n";
            if (cbKmpr.isChecked()) hsl2 += cbKmpr.getText() + "\n";
            if (cbTas.isChecked()) hsl2 += cbTas.getText() + "\n";
            if (cbHL.isChecked()) hsl2 += cbHL.getText() + "\n";
            if (hsl2.length() == startlen) hsl2 += "Anda Belum Pernah Memilih";

            String jeniskelamin = "";
            if (rbLaki.isChecked()) jeniskelamin = "Laki-Laki";
            else if (rbPr.isChecked()) jeniskelamin = "Perempuan";
            else jeniskelamin = "";


            tvHasil.setText
                    ("Nama : \n" + nama + "\n\nNomor Telepon :\n" + telp +
                            "\n\nJenis Kelamin :\n" + jeniskelamin + "\n\n Gunung yang akan didaki :\n" + gunung + "\n\n Waktu penyewaan :\n" + sewa + "\n\nWaktu Pengembalian :\n" + kembali + "\n\n" + hsl2
                    );
        }
    }

    private boolean isValid()
    {
        boolean valid = true;

        String nama = etNama.getText().toString();
        String telp = etTelp.getText().toString();
        String sewa = etSewa.getText().toString();
        String kembali = etKembali.getText().toString();

        if(nama.isEmpty())
        {
            etNama.setError("Nama belum diisi");
            valid = false;
        }
        else if (nama.length()<3)
        {
            etNama.setError("Nama minimal 3 karakter");
            valid = false;
        }
        else
        {
            etNama.setError(null);
        }

        if(telp.isEmpty())
        {
            etTelp.setError("Nomor Telepon belum diisi");
            valid = false;
        }
        else if(telp.length()<4)
        {
            etTelp.setError("Nomor telp terdiri dari min 4 angka");
            valid = false;
        }
        else
        {
            etTelp.setError(null);
        }

        if (sewa.isEmpty()) {
            etSewa.setError("Tanggal penyewaan belum diisi");
            valid = false;
        } else if (sewa.length() > 8) {
            etSewa.setError("Format tanggal penyewaan bukan ddmmyyyy");
            valid = false;
        } else {
            etSewa.setError(null);
        }

        if (kembali.isEmpty()) {
            etKembali.setError("Tanggal pengembalian belum diisi");
            valid = false;
        } else if (kembali.length() > 8) {
            etKembali.setError("Format tanggal pengembalian bukan ddmmyyyy");
            valid = false;
        } else {
            etKembali.setError(null);
        }

        return valid;
    }


}
