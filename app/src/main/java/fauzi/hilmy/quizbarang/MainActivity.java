package fauzi.hilmy.quizbarang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etKode, etNama, etJumlah, etHarga;
    Button btnBeli;
    TextView lblTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etKode = (EditText)findViewById(R.id.editText);
        etNama = (EditText)findViewById(R.id.editText2);
        etJumlah = (EditText)findViewById(R.id.editText3);
        etHarga = (EditText)findViewById(R.id.editText4);
        btnBeli = (Button)findViewById(R.id.button);
        lblTotal = (TextView)findViewById(R.id.textView);

        btnBeli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String JumlahBarang = etJumlah.getText().toString();
                String HargaBarang = etHarga.getText().toString();

                int Jumlah = Integer.parseInt(JumlahBarang);
                int Harga = Integer.parseInt(HargaBarang);
                int Total = Jumlah * Harga;

                switch (Total) {
                    case 500000 :
                        lblTotal.setText("Total = Rp." + Total + " dan kamu mendapatkan PAYUNG");
                        break;
                    case 750000 :
                        lblTotal.setText("Total = Rp." + Total + " dan kamu mendapatkan SEPEDA");
                        break;
                    default:
                        lblTotal.setText("Total = Rp." + Total + " and you didn't get anything");

                }

            }
        });
    }
}
