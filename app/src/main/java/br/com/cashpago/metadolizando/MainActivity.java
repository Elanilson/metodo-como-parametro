package br.com.cashpago.metadolizando;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Pagamentos pagamento = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pagamento = () -> {
            toast();
        };
    }
    public void chamar1(View view){
        pagamento.executar();
    }
    private void toast(){
        Toast.makeText(this, "Primeiro metodo chamado", Toast.LENGTH_SHORT).show();
    }
    private interface Pagamentos {
        void executar();
    }


    public void chamar2(View view){
       executarMetodo(()-> toast2("Segundo teste ok"));
    }

    private void toast2(String mensagem){
        Toast.makeText(this, mensagem, Toast.LENGTH_SHORT).show();
    }

    private void executarMetodo(Runnable metodo){
        metodo.run();//CHAMA O METODO PASSADO POR PARAMETRO
    }
}