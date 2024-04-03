package devandroid.moreira.applistavip.View;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


import devandroid.moreira.applistavip.Model.Pessoa;
import devandroid.moreira.applistavip.R;

public class  MainActivity extends AppCompatActivity {

     Pessoa pessoa;
     EditText editPrimeiroNome;
     EditText editSobrenome;
     EditText editCursoDesejado;
     EditText editTelefonedeContato;
     Button btnlimpar;
     Button btnsalvar;
     Button btnFinalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();
        pessoa.setPrimeiroNome("Mateus");
        pessoa.setSobreNome("Moreira");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelefoneContato("13988752495");

        editPrimeiroNome = findViewById(R.id.editPrimeiroNome);
        editSobrenome = findViewById(R.id.editSobrenome);
        editCursoDesejado = findViewById(R.id.editCursoDesejado);
        editTelefonedeContato = findViewById(R.id.editTelefonedeContato);

        editPrimeiroNome.setText(pessoa.getPrimeiroNome());
        editSobrenome.setText(pessoa.getSobreNome());
        editCursoDesejado.setText(pessoa.getCursoDesejado());
        editTelefonedeContato.setText(pessoa.getTelefoneContato());

        btnlimpar = findViewById(R.id.btnlimpar);
        btnsalvar = findViewById(R.id.btnsalvar);
        btnFinalizar = findViewById(R.id.btnFinalizar);





    }
}