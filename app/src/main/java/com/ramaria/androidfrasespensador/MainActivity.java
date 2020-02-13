package com.ramaria.androidfrasespensador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){
        String[] frases = {
                "A arte de viver é simplesmente a arte de conviver... simplesmente, disse eu? Mas como é difícil!\n" +
                        "\n" +
                        "- Mario Quintana",
                "A poesia não se entrega a quem a define.\n" +
                        "\n" +
                        "- Mario Quintana",
                "E um dia os homens descobrirão que esses discos voadores estavam apenas estudando a vida dos insetos...\n" +
                        "\n" +
                        "- Mario Quintana\n",
                "Maravilhas nunca faltaram ao mundo; o que sempre falta é a capacidade de senti-las e admirá-las.\n" +
                        "\n" +
                        "- Mario Quintana",
                "O grande consolo das velhas anedotas são os recém-nascidos...\n" +
                        "\n" +
                        "- Mario Quintana",
        };

        int num = new Random().nextInt(5);
        TextView text = findViewById(R.id.textResult); // Localizando o elemento e setando na variavel
        text.setText(frases[num]);

    }
}
